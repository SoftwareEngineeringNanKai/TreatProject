package com.nankai.project;

import static cn.edu.nankai.medicalproject.data.GlobalInfo.isMale;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.SOUTH;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import cn.edu.nankai.medicalproject.biz.impl.UserBizImpl;

public class Login extends JFrame
{
	//FirstFrame f = new FirstFrame("欢迎使用");
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
    JPanel pic = new JPanel(){public void paintComponent(Graphics g) {
        //ImageIcon icon = new ImageIcon(getClass().getResource("1.png"));
    	ImageIcon icon = new ImageIcon();
        java.awt.Image img = null;
        String path = "1.png";
        InputStream input = Choose.class.getClassLoader().getResourceAsStream("" + path);
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
    	
    
	JButton bt = new JButton("登录");
	JLabel namelabel = new JLabel("账号:",JLabel.CENTER);
	JLabel pwdlable = new JLabel("密码:",JLabel.CENTER);
	JTextField nametx = new JTextField();
	JPasswordField pwdtx = new JPasswordField();
	
	Choice genderc = new Choice();
	Patient patient = new Patient();
   

	public Login(String title){
		
		setTitle(title);
		
		setSize(400, 400);
		setLocationRelativeTo(null);  
		p1.setLayout(gb);
		/*Panel p1 = new ImagePanel(Toolkit.getDefaultToolkit().createImage("1.jpg"));
		p1.setBounds(0, 0, 400, 80);
		this.add(p1,WEST);*/
		p.setLayout(new GridLayout(2, 2,20,5));
		p.add(namelabel);
		p.add(nametx);
		p.add(pwdlable);
		p.add(pwdtx);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				boolean isFalse = false;
				if(nametx.getText().equals(""))
				{

					JOptionPane.showMessageDialog(Login.this,"请输入账号");
				}else if(pwdtx.getText().equals(""))
				{

					JOptionPane.showMessageDialog(Login.this,"请输入密码");
				}/*else if(LoginValidate(nametx.getText().toString(), pwdtx.getText().toString()))
				{
					patient=GetFirstInfo();
					
					new Choose("选择输入类型");
					setVisible(false);
				}*/
				else if(nametx.getText().toString().equals("admin")&&pwdtx.getText().toString().equals("test"))
				{
					patient=GetFirstInfo();
					
					new Choose("选择输入类型");
					setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this,"用户名或密码错误");
				}
			}
		});
		p2.add(new Label());
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 10;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		gbc.anchor = GridBagConstraints.CENTER;
		pic.setSize(509, 230);
		gb.setConstraints(pic, gbc);
		p1.add(pic);
		gbc.weightx = 0;
		gbc.weighty = 2;
		gb.setConstraints(p2, gbc);
		p1.add(p2);
		gbc.weighty = 0;
		gbc.weightx = 0.5;
		gbc.anchor = GridBagConstraints.SOUTH;
		/*gbc.gridwidth = 3;
		gbc.gridheight = 2;*/
		gb.setConstraints(p, gbc);
		p1.add(p);
		gbc.weightx = 0;
		gbc.weighty = 1;
		gb.setConstraints(p3, gbc);
		p1.add(p3);
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
		//int age = Integer.parseInt(nametx.getText());
		//boolean gender = genderc.getSelectedItem().equals("男")?true:false;
		int age = 8;
		boolean gender = true;
		isMale = gender;
		patient.setAge(age);
		patient.setMale(gender);
		isMale=gender;
		return patient;
	}
	
	public boolean LoginValidate(String name,String password)
	{
		UserBizImpl userBiz = new UserBizImpl();
		return userBiz.isLogin(name, password);
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