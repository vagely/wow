package com.igeek;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JPanel;

public class Person implements ActionListener,WindowStateListener,MouseListener{
	JPanel jpanel;
	
	public Person(JPanel jPanel) {
		super();
		this.jpanel=jPanel;
	}
	public static void main(String[] args) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if("ºÚÉ«".equals(str)) {
			jpanel.setBackground(Color.BLACK);
		}else if("éÙÉ«".equals(str)){
			jpanel.setBackground(Color.ORANGE);
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+","+e.getY());
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowStateChanged(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
