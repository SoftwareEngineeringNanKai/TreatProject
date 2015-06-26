package com.nankai.project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;

import cn.edu.nankai.medicalproject.data.Data;
import cn.edu.nankai.medicalproject.main.DataHandler;
import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;
public class Third {
	JFrame frame = new JFrame();
	//Frame f = new Frame();
	PieChart pieChart = new PieChart(resultsForPhysiological,"生理因素");
	ChartPanel chartpanel = pieChart.getChartPanel();
	PieChart pieChart2 = new PieChart(resultsForPsychologica,"病理因素");
	ChartPanel chartpanel2 = pieChart2.getChartPanel();
	JPanel panel = new JPanel();
	
	JButton btnBack = new JButton("返回");
	public void init(){
		panel.setLayout(new GridLayout(2, 1));
		/*panel.add(chartpanel);
		panel2.add(chartpanel2);*/
		panel.add(chartpanel);
		panel.add(chartpanel2);
		frame.add(panel);
		/*panel1.setVisible(true);
		panel2.setVisible(true);*/
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new GetInput().init();
				frame.setVisible(false);
				DataHandler.clearArrayList(item,inputs,starts,ends);
				for(int i = 0;i < Data.getInstance().getItems().size();i++){
					System.out.println(Data.getInstance().getItems().get(i));
				}
			}
		});
		frame.add(btnBack,BorderLayout.SOUTH);
		frame.pack();
		frame.setExtendedState( Frame.MAXIMIZED_VERT);
		  frame.setVisible(true);

		  frame.setLocationRelativeTo(null);
		
	}



}
