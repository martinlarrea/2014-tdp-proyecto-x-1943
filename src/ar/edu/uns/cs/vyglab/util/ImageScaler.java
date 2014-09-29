package ar.edu.uns.cs.vyglab.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class ImageScaler {
	/**
     * Convenience method that returns a scaled instance of the
     * provided {@code BufferedImage}.
     *
     * @param img the original image to be scaled
     * @param targetWidth the desired width of the scaled instance,
     *    in pixels
     * @param targetHeight the desired height of the scaled instance,
     *    in pixels
     * @param hint one of the rendering hints that corresponds to
     *    {@code RenderingHints.KEY_INTERPOLATION} (e.g.
     *    {@code RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR},
     *    {@code RenderingHints.VALUE_INTERPOLATION_BILINEAR},
     *    {@code RenderingHints.VALUE_INTERPOLATION_BICUBIC})
     * @param higherQuality if true, this method will use a multi-step
     *    scaling technique that provides higher quality than the usual
     *    one-step technique (only useful in downscaling cases, where
     *    {@code targetWidth} or {@code targetHeight} is
     *    smaller than the original dimensions, and generally only when
     *    the {@code BILINEAR} hint is specified)
     * @return a scaled version of the original {@code BufferedImage}
     */
	public static Image getScaledInstance(BufferedImage img,
            int targetWidth,
            int targetHeight)
	{
		// REMIND: This only works for opaque images...
		// Use multi-step technique: start with original size, then
		// 	scale down in multiple passes with drawImage()
		// until the target size is reached
			int iw = img.getWidth();
			int ih = img.getHeight();

			Object hint = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
			int type = (img.getTransparency() == Transparency.OPAQUE) ?
					BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;

			//		First get down to no more than 2x in W & H
			while (iw > targetWidth*2 || ih > targetHeight*2) {
				iw = (iw > targetWidth*2) ? iw/2 : iw;
				ih = (ih > targetHeight*2) ? ih/2 : ih;
				img = scaleImage(img, type, hint, iw, ih);
			}

			// REMIND: Conservative approach:
			// first get W right, then worry about H

			// If still too wide - do a horizontal trilinear blend
			// of img and a half-width img
			if (iw > targetWidth) {
				int iw2 = iw/2;
				BufferedImage img2 = scaleImage(img, type, hint, iw2, ih);
				if (iw2 < targetWidth) {
					img = scaleImage(img, type, hint, targetWidth, ih);
					img2 = scaleImage(img2, type, hint, targetWidth, ih);
					interp(img2, img, iw-targetWidth, targetWidth-iw2);
				}
				img = img2;
				iw = targetWidth;
			}
			// iw should now be targetWidth or smaller
			// If still too tall - do a vertical trilinear blend
			// of img and a half-height img
			if (ih > targetHeight) {
				int ih2 = ih/2;
				BufferedImage img2 = scaleImage(img, type, hint, iw, ih2);
				if (ih2 < targetHeight) {
					img = scaleImage(img, type, hint, iw, targetHeight);
					img2 = scaleImage(img2, type, hint, iw, targetHeight);
					interp(img2, img, ih-targetHeight, targetHeight-ih2);
				}
				img = img2;
				ih = targetHeight;
			}
			// ih should now be targetHeight or smaller
			// If we are too small, then it was probably because one of
			// 	the dimensions was too small from the start.
			if (iw < targetWidth && ih < targetHeight) {
				img = scaleImage(img, type, hint, targetWidth, targetHeight);
			}

			return img;	
	}

	public static BufferedImage scaleImage(BufferedImage orig,
            int type,
            Object hint,
            int w, int h)
	{
		BufferedImage tmp = new BufferedImage(w, h, type);
		Graphics2D g2 = tmp.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, hint);
		g2.drawImage(orig, 0, 0, w, h, null);
		g2.dispose();
		return tmp;
	}
	
	 public static void interp(BufferedImage img1,
             BufferedImage img2,
             int weight1,
             int weight2)
	 {
		 float alpha = weight1;
		 alpha /= (weight1 + weight2);
		 Graphics2D g2 = img1.createGraphics();
		 g2.setComposite(
				 AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
		 g2.drawImage(img2, 0, 0, null);
		 g2.dispose();
	 }
}
