package practicalFile;

import java.applet.*;
import java.net.URL;
import java.awt.*;

//public class ImageAudio extends Applet {
//	AudioClip aud_clip;
//
//	public void init() {
//		aud_clip = getAudioClip(getDocumentBase(), "magic.au");
//	}
//
//	public void start() {
//		aud_clip.play();
//	}
//}

/* <applet code=ImageDemo.class width=700 height=700></applet> */
public class ImageAudio extends Applet {
	Image image;

	public void init() {
// Obtain Image object to be pained or Loads the image
		image = getImage(getDocumentBase(), "bulbon.gif");
	}

	public void paint(Graphics g) {
// Draw image- drawImage(Image img,int x,int y,int width, int height, ImageObserver observer)
		g.drawImage(image, 0, 0, image.getWidth(this), image.getHeight(this), this);
		g.drawImage(image, 0, 200, 70, 90, this);
	}
}