package com.nankai.project;

import javax.swing.*;

import java.awt.Choice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;

import static java.awt.BorderLayout.*;

public class Choose extends JFrame {
	// FirstFrame f = new FirstFrame("欢迎使用");
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();

	JButton btn1 = new JButton("手动输入");
	JButton btn2 = new JButton("OCR(功能开发中，请点击手动输入)");
	JLabel agelabel = new JLabel("年龄:");
	JLabel genderlb = new JLabel("性别:");
	JTextField agetx = new JTextField();
	JTextField gendertx = new JTextField();
	Choice genderc = new Choice();
	Patient patient = new Patient();

	public Choose(String title) {

		setTitle(title);
		setSize(400, 400);
		setLocationRelativeTo(null);
		p1.setLayout(new GridLayout(2, 1, 15, 5));
		/*
		 * Panel p1 = new
		 * ImagePanel(Toolkit.getDefaultToolkit().createImage("1.jpg"));
		 * p1.setBounds(0, 0, 400, 80); this.add(p1,WEST);
		 */
		btn1.setFont(new java.awt.Font("微软雅黑", 1, 20)); 
		btn2.setFont(new java.awt.Font("微软雅黑", 1, 20)); 
		p1.add(btn1);
		p1.add(btn2);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				

				new GetInput().init();
				setVisible(false);
			}

		});

		this.add(p1, CENTER);
		/*
		 * this.add(pic,CENTER); this.add(p, CENTER);
		 */

		/*
		 * this.add(pic); this.add(p); this.add(bt);
		 */
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		// pack();

		setVisible(true);
	}

	/*
	 * public static void main(String[] args) { new First().init(); }
	 */

	/*
	 * public static void main(String[] args) { FirstFrame frame = new
	 * FirstFrame("欢迎使用");
	 * 
	 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * frame.setVisible(true); //使窗体可见，不用show()过时了。 }
	 */
}
