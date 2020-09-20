package frame;

import java.awt.EventQueue;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import kit.Unit;
import entity.*;
import daoimpl.*;


import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Coupon_Query {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JButton button;
	private DefaultTableModel DTM;
	private String tableTitle[]={"工资卡卡号", "原本工资"};

	private Couponimpl couponmysql=new Couponimpl();
	/**
	 * Create the application.
	 */
	public Coupon_Query() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 310, 337);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "工资查询", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 274, 278);
		frame.getContentPane().add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 251, 182);
		panel.add(scrollPane);
		
		table = new JTable();
		DTM=new DefaultTableModel(null,tableTitle)
		{
			public boolean isCellEditable(int rowindex,int colindex)
			{
					return false;
			}
		};
		table.setModel(DTM);
		refreshTable();
		scrollPane.setViewportView(table);
		
		JLabel lblid = new JLabel("请输入工资卡卡号：");
		lblid.setBounds(10, 216, 117, 15);
		panel.add(lblid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(106, 214, 66, 18);
		panel.add(textField);
		
		button = new JButton("查询");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(textField.getText().equals(""))
				{
					refreshTable();
					JOptionPane.showMessageDialog(null,"查询成功！","消息提示", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					try
					{
						Coupon temp=couponmysql.getById(textField.getText());
						Object tableText[][]={{temp.getId(),temp.getPrices()}};
						DTM.setDataVector(tableText,tableTitle);
						JOptionPane.showMessageDialog(null,"查询成功！","消息提示", JOptionPane.INFORMATION_MESSAGE);
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"无此ID！","消息提示", JOptionPane.INFORMATION_MESSAGE);
					}
				}	
			}
		});
		button.setBounds(182, 212, 79, 23);
		panel.add(button);
		
		JButton btnNewButton = new JButton("删除选定");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int row = table.getSelectedRow();
				int column = 0;
				System.out.println(row+" "+column);
				String id = (String)table.getValueAt(row,column);
				
				try
				{
					couponmysql.delete(couponmysql.getById(id));
					JOptionPane.showMessageDialog(null,"成功删除指定数据","提示信息", JOptionPane.INFORMATION_MESSAGE);
					Unit.logmysql.Coupon_Add(Unit.log.setLog(id));
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
					System.err.println("操作失败！");
				}
				refreshTable();
			}
		});
		btnNewButton.setBounds(10, 241, 251, 23);
		panel.add(btnNewButton);
		
		if(Unit.nowUser.getAdmin().equals("员工"))
		{
			btnNewButton.setEnabled(false);
		}
	}
	
	private void refreshTable()
	{
		List list = couponmysql.getAll();
		Object tableText[][] = new Object[list.size()][];
		for(int i=0;i<list.size();i++)
		{
			HashMap hm = (HashMap) list.get(i);
			Object temp[]=new Object[2];
			for(Object key:hm.keySet())
			{
				if(key.equals("id"))
				{
					temp[0]=hm.get(key);
				}
				if(key.equals("prices"))
				{
					temp[1]=hm.get(key);
				}
			}
			tableText[i]=temp;
		}
		DTM.setDataVector(tableText,tableTitle);	
	}
}
