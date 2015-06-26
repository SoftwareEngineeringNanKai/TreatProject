package com.nankai.project;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;

import static java.awt.BorderLayout.*;

public class FirstFrame extends JFrame
{
	//FirstFrame f = new FirstFrame("欢迎使用");
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
    JPanel pic = new JPanel(){public void paintComponent(Graphics g) {
        //ImageIcon icon = new ImageIcon(getClass().getResource("1.png"));
    	ImageIcon icon = new ImageIcon();
        java.awt.Image img = null;
        String path = "1.png";
        InputStream input = FirstFrame.class.getClassLoader().getResourceAsStream("" + path);
       // System.out.println(FirstFrame.class.getClassLoader().getResource("1.png"));
        try {
            img = javax.imageio.ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //icon.setImage(img);
        icon.setImage(img.getScaledInstance(200,150,Image.SCALE_DEFAULT));
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(),this.getHeight(), this);
    }};
    	
    
	JButton bt = new JButton("下一步");
	JLabel agelabel = new JLabel("年龄:");
	JLabel genderlb = new JLabel("性别:");
	JTextField agetx = new JTextField();
	JTextField gendertx = new JTextField();
	Choice genderc = new Choice();
	Patient patient = new Patient();
   

	public FirstFrame(String title){
		
		setTitle(title);
		
		setSize(400, 400);
		setLocationRelativeTo(null);  
		p1.setLayout(new GridLayout(2, 1, 15, 5));
		/*Panel p1 = new ImagePanel(Toolkit.getDefaultToolkit().createImage("1.jpg"));
		p1.setBounds(0, 0, 400, 80);
		this.add(p1,WEST);*/
		p.setLayout(new GridLayout(2, 2,20,5));
		p.add(agelabel);
		p.add(agetx);
		p.add(genderlb);
		genderc.add("男");
		genderc.add("女");
		p.add(genderc);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				boolean isFalse = false;
				try {  
					Integer.parseInt(agetx.getText());   } 
				catch (NumberFormatException e) {   
					isFalse = true;
					}
				if(agetx.getText().equals(""))
				{

					JOptionPane.showMessageDialog(FirstFrame.this,"请输入年龄信息");
				}else if(isFalse)
				{

					JOptionPane.showMessageDialog(FirstFrame.this,"请输入正确年龄信息");
				}else
				{
					patient=GetFirstInfo();
					
					new Second().init();
					setVisible(false);
				}
			}
		});
		p1.add(pic);
		p1.add(p);
		this.add(p1,CENTER);
		/*this.add(pic,CENTER);
		this.add(p, CENTER);*/
		this.add(bt,SOUTH);
		
		/*this.add(pic);
		this.add(p);
		this.add(bt);*/
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//pack();
		
		setVisible(true);
	}
	

			
	public Patient GetFirstInfo()
	{
		int age = Integer.parseInt(agetx.getText());
		boolean gender = genderc.getSelectedItem().equals("男")?true:false;
		isMale = gender;
		patient.setAge(age);
		patient.setMale(gender);
		isMale=gender;
		return patient;
	}
	/*public static void main(String[] args) 
	{
		new First().init();
	}*/
	
/*	public static void main(String[] args) {
		FirstFrame frame = new FirstFrame("欢迎使用");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //使窗体可见，不用show()过时了。
	}*/
}
