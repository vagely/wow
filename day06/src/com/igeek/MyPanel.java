package com.igeek;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		//��Բ
		g.drawOval(10, 10, 30, 30);
		
		
		//��ֱ��
	    g.setColor(Color.GREEN);
	    g.drawLine(80, 10, 120, 10);
		
	    //����
	    g.setColor(Color.orange);
	    g.fillRect(10, 150, 70, 70);
	    g.fillOval(10, 10,30, 30);
	}

	
	

}
