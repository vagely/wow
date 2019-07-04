package com.ijeek;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Myball extends JFrame implements KeyListener{
	//成员属性
	int x = 40;
	int y =40;
	int speed = 10;
	//成员函数
	public Myball() throws HeadlessException{
		super();
		setVisible(true);
		setSize(500,500);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawOval(x,y,100,100);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			y+=speed;
		}else if(e.getKeyCode()==KeyEvent.VK_UP){
			y-=speed;
			
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x-=speed;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x+=speed;
		}
		repaint();
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
