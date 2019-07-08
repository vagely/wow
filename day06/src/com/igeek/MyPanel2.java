package com.igeek;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MyPanel2 extends JPanel{
	//paint绘制组件外观
	public void paint(Graphics g) {
		//
		super.paint(g);
		Image image=Toolkit.getDefaultToolkit().getImage(
				MyPanel2.class.getResource("img1.jpg"));
	       g.drawImage(image, 150,100,this);
	}

}
