package com.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Honglvdeng extends JFrame{
	boolean flag = true;
	public Honglvdeng() throws InterruptedException{
		this.setLayout(null);
		this.setBounds(300, 300, 500, 500);
		this.setVisible(true);
		
		//��ư�ť
		JButton jButton1 = new JButton();
		jButton1.setBounds(100, 50, 100, 50);
		this.add(jButton1);
		//��ʾ�ɲ����ѹ�
		JLabel jLabel1 = new JLabel();
		jLabel1.setBounds(110, 100, 100, 30);
		this.add(jLabel1);
		
		//�Ƶư�ť
		JButton jButton3 = new JButton();
		jButton3.setBounds(200, 50, 100, 50);
		this.add(jButton3);
		//��ʾ�ɲ����ѹ�
		JLabel jLabel3 = new JLabel();
		jLabel3.setBounds(210, 100, 100, 30);
		this.add(jLabel3);
		
		//�̵ư�ť
		JButton jButton2 = new JButton();
		jButton2.setBounds(300, 50, 100, 50);
		this.add(jButton2);
		//��ʾ�ɲ����ѹ�
		JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(310, 100, 100, 30);
		this.add(jLabel2);
		
		//��ʼ��ť
		JButton jButton = new JButton();
		jButton.setText("��ʼ");
		jButton.setBackground(Color.black);
		jButton.setForeground(Color.white);
		jButton.setBounds(200, 300, 100, 50);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					public void run() {
						while(flag){
							try{
								jButton1.setBackground(Color.RED);
								jLabel1.setText("������ͨ��");
								Thread.sleep(4000);
								jButton3.setBackground(Color.YELLOW);
								jLabel3.setText("��һ��");
								Thread.sleep(2000);
								jButton2.setBackground(Color.GREEN);
								jLabel2.setText("����ͨ��");
								Thread.sleep(4000);
							}catch(Exception e){
								e.getMessage();
							}	
						}
					}
				}).start();	
			}
		});
		this.add(jButton);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Honglvdeng();
	}

}
