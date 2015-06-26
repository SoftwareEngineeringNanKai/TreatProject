package com.nankai.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

import cn.edu.nankai.medicalproject.data.Data;
import cn.edu.nankai.medicalproject.data.Item;
import cn.edu.nankai.medicalproject.main.DataHandler;
import cn.edu.nankai.translateexceltoclass.main.GetAll;
import static cn.edu.nankai.medicalproject.data.GlobalInfo.*;

public class GetInput {
	Data data;
	JFrame jf = new JFrame("输入信息");
	// 创建一个Tab页面的标签放在左边，采用换行布局策略的JTabbedPane
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT,
			JTabbedPane.WRAP_TAB_LAYOUT);
	JButton btn = new JButton("确定");
	JButton btnback = new JButton("返回");
	List<String> info = new ArrayList<String>();
	Map<Integer, String> map = new HashMap<Integer, String>();

	public void init() {
		data = GetAll.getInfo();
		// info.add(name0);
		int sum = 0;
		int number = 0;
		String module;
		// System.out.print(((String[])info.get(0))[0]);
		for (int i = 0; i < 23; i++) {

			module = data.getItems().get(sum).getModule();
			info.add(module);
			JPanel p = new JPanel();
			p.setName(module);
			/*
			 * System.out.println("M"+module); System.out.println("SU"+sum);
			 */
			for (Item item : data.getItems()) {
				if (module == item.getModule()) {
					number = number + 1;

				} else
					continue;

			}
			// System.out.println("NUM "+number);
			// int numb = num[i];
			p.setLayout(new GridLayout(number + 1, 4));
			JLabel label[] = new JLabel[number];
			// final JTextField content[] = new JTextField[number];
			p.add(new Label("检验项"));
			p.add(new Label("输入"));
			p.add(new Label("下限"));
			p.add(new Label("上限"));
			for (int j = 0; j < number; j++) {

				label[j] = new JLabel(data.getItems().get(sum + j).getTitle());
				p.add(label[j]);
				String value;
				if ((data.getItems().get(sum + j).getMaleRange().getStart() == 0)
						&& (data.getItems().get(sum + j).getMaleRange()
								.getEnd() == 0)) {
					JComboBox box = new JComboBox();
					box.addItem("阴性");
					box.addItem("阳性");
					box.setName(data.getItems().get(sum + j).getTitle());
					p.add(box);
					JTextField txt1 = new JTextField("0");
					JTextField txt2 = new JTextField("0");
					txt1.setVisible(false);
					txt1.setName("Start"
							+ data.getItems().get(sum + j).getTitle());
					txt2.setVisible(false);
					txt2.setName("End"
							+ data.getItems().get(sum + j).getTitle());
					p.add(txt1);
					p.add(txt2);
				} else {
					// content[j] = new JTextField();
					// p.add(content[j]);
					final JTextField content1 = new JTextField();
					final JTextField content2 = new JTextField(data.getItems()
							.get(sum + j).getMaleRange().getStart()
							+ "");
					final JTextField content3 = new JTextField(data.getItems()
							.get(sum + j).getMaleRange().getEnd()
							+ "");

					content1.setName(data.getItems().get(sum + j).getTitle());
					content2.setName("Start"
							+ data.getItems().get(sum + j).getTitle());
					content3.setName("End"
							+ data.getItems().get(sum + j).getTitle());
					p.add(content1);
					p.add(content2);
					p.add(content3);
					Document dt = content1.getDocument();
					dt.addDocumentListener(new DocumentListener() {

						@Override
						public void removeUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub

						}

						@Override
						public void insertUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub
							// System.out.println("TEXT:"+content1.getText().toString());
							String s = content1.getText().toString();

							try {
								Double.parseDouble(s);
							} catch (Exception ex) {
								JOptionPane
										.showMessageDialog(null, "输入范围应该为数字");
							}
							/*
							 * if (s != null &&
							 * s.matches("(?i)[^a-z]*[a-z]+[^a-z]*")) {
							 * JOptionPane
							 * .showMessageDialog(GetInput.this,"输入范围必须为数字！");
							 * 
							 * }
							 */
							// data.getItems().get(sum+j).setInput(content1.getText().toString());
						}

						@Override
						public void changedUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub

						}
					});
					Document dt1 = content2.getDocument();
					dt1.addDocumentListener(new DocumentListener() {

						@Override
						public void removeUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub
							/*if (content2.getText() == null
									|| content2.getText().equals("")) {
								System.out.println("CONTENT@"
										+ content2.getText().toString());
								JOptionPane.showMessageDialog(null, "请输入有效范围");
							}*/
						}

						@Override
						public void insertUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub
							// System.out.println("2222:" + content2.getText());
							String s = content2.getText().toString();

							try {
								Double.parseDouble(s);
							} catch (Exception ex) {
								JOptionPane
										.showMessageDialog(null, "输入范围应该为数字");
							}
						}

						@Override
						public void changedUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub

						}
					});
					Document dt2 = content3.getDocument();
					dt2.addDocumentListener(new DocumentListener() {

						@Override
						public void removeUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub
							/*if (content3.getText().toString() == null
									|| content3.getText().toString().equals("")) {
								JOptionPane.showMessageDialog(null, "请输入有效范围");
							}*/
						}

						@Override
						public void insertUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub
							String s = content3.getText().toString();

							try {
								Double.parseDouble(s);
							} catch (Exception ex) {
								JOptionPane
										.showMessageDialog(null, "输入范围应该为数字");
							}

						}

						@Override
						public void changedUpdate(DocumentEvent e) {
							// TODO Auto-generated method stub

						}
					});
				}
				// map.put(sum+j, value);
			}
			sum = sum + number;
			number = 0;
			// System.out.println("SUM "+sum);
			tabbedPane.addTab(module, p);
		}

		final JComboBox btype = new JComboBox();
		for (String type : info) {
			btype.addItem(type);
		}
		jf.add(tabbedPane, BorderLayout.CENTER);
		// 为JTabbedPane添加事件监听器
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				String text = tabbedPane.getSelectedComponent().getName();
				// System.out.println("TAB:"+text);
				btype.setSelectedItem(text);
				// 如果被选择的组件依然是空
				if (tabbedPane.getSelectedComponent() == null) {
					// 获取所选标签页
					int n = tabbedPane.getSelectedIndex();
					// 为指定标前页加载内容
					tabbedPane.setSelectedIndex(n);
					// loadTab(n);
				}
			}
		});
		// 系统默认选择第一页，加载第一页内容
		// loadTab(0);
		tabbedPane.setSelectedIndex(0);
		// tabbedPane.setPreferredSize(new
		// Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

		// 增加控制标签布局、标签位置的单选按钮
		/*
		 * JPanel buttonPanel = new JPanel(); ChangeAction action = new
		 * ChangeAction(); buttonPanel.add(new ButtonPanel(action , "选择标签布局策略" ,
		 * layouts)); buttonPanel.add (new ButtonPanel(action , "选择标签位置" ,
		 * positions)); jf.add(buttonPanel, BorderLayout.SOUTH);
		 */
		JPanel pchoose = new JPanel();

		pchoose.add(btype);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(btype.getSelectedItem().toString());
				// System.out.println(jf.getComponentCount());
				// if(!btype.getSelectedItem().toString().equals(((JPanel)c).getName()))
				// JPAn

				System.out.println(tabbedPane.getComponentCount());
				for (Component c : tabbedPane.getComponents()) {
					if (((JPanel) c).getName().equals(
							btype.getSelectedItem().toString())) {
						moduleName = ((JPanel) c).getName();
						for (Component component : ((JPanel) c).getComponents()) {
							// System.out.println(component.getName());
							if (component instanceof JTextField) {
								String str = ((JTextField) component).getText();
								String name = ((JTextField) component)
										.getName();
								// System.out.println("STR: " + str);
								if (name.startsWith("Start")) {
									// System.out.println("Start: " + str);
									starts.add((str.equals("") ? -1.0 : Double
											.parseDouble(str)));
								} else if (name.startsWith("End")) {
									// System.out.println("End: " + str);
									ends.add((str.equals("") ? -1.0 : Double
											.parseDouble(str)));
								} else {
									// System.out.println("Item add");
									item.add(str.equals("") ? -1 : Double
											.parseDouble(str));
								}

							} else if (component instanceof JComboBox) {
								// System.out.println("JCombox");
								if (((JComboBox) component).getSelectedItem()
										.toString().equals("阳性"))
									item.add(-2.0);
								else
									item.add(0.0);
								// starts.add(0.0);
								// ends.add(0.0);
								// System.out.println(((JComboBox)component).getSelectedItem().toString());
							}
						}
					}
				}
				DataHandler.handleData();
				new Third().init();
				jf.setVisible(false);
			}
		});
		btnback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Choose("选择输入类型");
				jf.setVisible(false);
			}
		});

		pchoose.add(btn, BorderLayout.SOUTH);

		pchoose.add(btnback);
		jf.add(pchoose, BorderLayout.SOUTH);

		// jf.setPreferredSize(new
		// Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		jf.setExtendedState(Frame.MAXIMIZED_BOTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	// 为指定标签页加载内容
	/*
	 * private void loadTab(int n) { String title = tabbedPane.getTitleAt(n); //
	 * 根据标签页的标题获取对应图书封面 ImageIcon bookImage = new ImageIcon("ico/" +
	 * books.get(title)); tabbedPane.setComponentAt(n , new JLabel(bookImage));
	 * // 改变标签页的图标 tabbedPane.setIconAt(n, new ImageIcon("ico/open.gif")); }
	 */
	// 定义改变标签页的布局策略，放置位置的监听器
	/*
	 * class ChangeAction implements ActionListener { public void
	 * actionPerformed(ActionEvent event) { JRadioButton source =
	 * (JRadioButton)event.getSource(); String selection =
	 * source.getActionCommand(); // 设置标签页的标题的布局策略 if
	 * (selection.equals(layouts[0])) { tabbedPane.setTabLayoutPolicy(
	 * JTabbedPane.WRAP_TAB_LAYOUT); } else if (selection.equals(layouts[1])) {
	 * tabbedPane.setTabLayoutPolicy( JTabbedPane.SCROLL_TAB_LAYOUT); } //
	 * 设置标签页上的标题的放置位置 else if (selection.equals(positions[0])) {
	 * tabbedPane.setTabPlacement(JTabbedPane.LEFT); } else if
	 * (selection.equals(positions[1])) {
	 * tabbedPane.setTabPlacement(JTabbedPane.TOP); } else if
	 * (selection.equals(positions[2])) {
	 * tabbedPane.setTabPlacement(JTabbedPane.RIGHT); } else if
	 * (selection.equals(positions[3])) {
	 * tabbedPane.setTabPlacement(JTabbedPane.BOTTOM); } } }
	 */
	/*
	 * public static void main(String[] args) { new GetInput().init(); }
	 */

}
// 定义一个JPanel类扩展类，该类的对象包含多个纵向排列的JRadioButton控件
// 且JPanel扩展类可以指定一个字符串作为TitledBorder
/*
 * class ButtonPanel extends JPanel { private ButtonGroup group; public
 * ButtonPanel(GetInput.ChangeAction action , String title, String[] labels) {
 * setBorder(BorderFactory.createTitledBorder(BorderFactory
 * .createEtchedBorder(), title)); setLayout(new BoxLayout(this,
 * BoxLayout.X_AXIS)); group = new ButtonGroup(); for (int i = 0; labels!= null
 * && i < labels.length; i++) { JRadioButton b = new JRadioButton(labels[i]);
 * b.setActionCommand(labels[i]); add(b); // 添加事件监听器
 * b.addActionListener(action); group.add(b); b.setSelected(i == 0); } } }
 */
