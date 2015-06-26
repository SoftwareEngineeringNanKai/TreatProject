package com.nankai.project;


import javax.swing.JFrame;

import com.nankai.project.Choose;

public class Test {
	public static void main(String[] args) 
	{
		Login login = new Login("欢迎使用");

		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setVisible(true); //使窗体可见，不用show()过时了。
	}

}
