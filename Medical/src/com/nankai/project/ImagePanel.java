package com.nankai.project;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Panel;

public class ImagePanel extends Panel {
		Image img;	
		public ImagePanel(Image img){		
			this.img = img;	
			}		
		@Override	
		public void paint(Graphics g) {		
			super.paint(g);		
			g.drawImage(img, 20,20,400,80, this);//其中第二到第五个参数分别为x,y,width,height	}}
		}

}
