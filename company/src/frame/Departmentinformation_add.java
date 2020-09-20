package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import kit.Unit;
import entity.*;
import daoimpl.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Departmentinformation_add implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnenter;

	private departmentinformationimpl itemmysql = new departmentinformationimpl();
	/** 创建窗口并初始化 **/
	public Departmentinformation_add() 
	{
		initialize();
		frame.setVisible(true);
	}

	/** 窗口初始化信息 **/
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 259, 270);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "添加部门", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 225, 211);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblid = new JLabel("部门号：");
		lblid.setBounds(10, 23, 59, 15);
		panel.add(lblid);
		
		textField = new JTextField();
		textField.setBounds(81, 20, 132, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 48, 132, 21);
		panel.add(textField_1);
		
		JLabel label = new JLabel("部门名称：");
		label.setBounds(10, 51, 72, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("部门职位：");
		label_1.setBounds(10, 82, 72, 15);
		panel.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(81, 79, 132, 21);
		panel.add(textField_2);
		
		JLabel label_2 = new JLabel("初始人数：");
		label_2.setBounds(10, 110, 72, 15);
		panel.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(81, 107, 132, 21);
		panel.add(textField_3);
		
		JLabel label_3 = new JLabel("部长备注：");
		label_3.setBounds(10, 138, 72, 15);
		panel.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setBounds(81, 135, 132, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		btnenter = new JButton("添加(Enter)");
		btnenter.registerKeyboardAction(this, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),JComponent.WHEN_IN_FOCUSED_WINDOW);
		btnenter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(textField.getText().equals("")||textField_1.getText().equals("")
					||textField_2.getText().equals("")||textField_3.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"请将信息填写完整","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					Departmentinformation item = new Departmentinformation();
					try
					{
						itemmysql.add(item);
						JOptionPane.showMessageDialog(null,"添加成功！","提示信息", JOptionPane.INFORMATION_MESSAGE);
						Unit.logmysql.Item_Add(Unit.log.setLog(item.getId(),item.getCount(),"正常添加"));
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"添加失败，请检查数据类型是否匹配！","提示信息", JOptionPane.INFORMATION_MESSAGE);
						System.err.println("添加错误");
					}	
				}
			}
		});
		btnenter.setBounds(10, 163, 203, 38);
		panel.add(btnenter);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnenter)
		{
			if(textField.getText().equals("")||textField_1.getText().equals("")
					||textField_2.getText().equals("")||textField_3.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"请将信息填写完整","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					Departmentinformation item = new Departmentinformation();
					try
					{
						itemmysql.add(item);
						JOptionPane.showMessageDialog(null,"添加成功！","提示信息", JOptionPane.INFORMATION_MESSAGE);
						Unit.logmysql.Item_Add(Unit.log.setLog(item.getId(),item.getCount(),"正常添加"));
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"添加失败，请检查数据类型是否匹配！","提示信息", JOptionPane.INFORMATION_MESSAGE);
						System.err.println("添加错误");
					}	
				}
		}
	}
}
