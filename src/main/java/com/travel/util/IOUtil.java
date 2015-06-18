package com.travel.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class IOUtil {

	public static byte[] bufferedImage2byte(BufferedImage buffImg){
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(buffImg, "jpg", baos);
			return baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static InputStream bufferedImage2InputStream(BufferedImage buffImg){
		return new ByteArrayInputStream(bufferedImage2byte(buffImg));
	}
}
