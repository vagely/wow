package com.igeek;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel3 extends JPanel {
	//paint绘制组件外观
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("hello Roxi", 10, 10);
		
	}

}
