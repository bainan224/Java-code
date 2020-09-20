package frame;

import java.awt.EventQueue;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.table.DefaultTableModel;

import kit.Unit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame 
{
	private JFrame frame;
	private JTable table;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private DefaultTableModel DTM;
	private String tableTitle[]={"�û�ID", "�û��˻�","����","�Ա�","����","��ϵ��ʽ"};
	public JLabel label_3;
	private JLabel lbltueMay;
	
	public MainFrame()
	{
		initialize();
		frame.setVisible(true);
	}

	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "���¹���", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 31, 519, 394);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("��ǰ�û�Ȩ�ޣ�");
		label_1.setBounds(20, 293, 141, 15);
		panel.add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 499, 244);
		panel.add(scrollPane);
		
		table = new JTable();
		Object info[][]={{Unit.nowUser.getId(),Unit.nowUser.getUser(),Unit.nowUser.getName(),Unit.nowUser.getSex(),Unit.nowUser.getAge(),Unit.nowUser.getTelephone()}};
		DTM=new DefaultTableModel(info,tableTitle)
		{
			public boolean isCellEditable(int rowindex,int colindex)
			{
					return false;
			}
		};
		table.setModel(DTM);
		scrollPane.setViewportView(table);
		
		JLabel label_2 = new JLabel("��ǰ�û���Ϣ��");
		label_2.setBounds(10, 19, 125, 15);
		panel.add(label_2);
		
		label_3 = new JLabel("��ǰԱ�����۶"+Unit.nowUser.getSum());
		label_3.setBounds(10, 145, 394, 15);
		panel.add(label_3);
		
		button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Departmentinformation_Sell();
			}
		});
		button.setBounds(10, 318, 344, 66);
		panel.add(button);
		
		button_1 = new JButton("���Ź���");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Departmentinformation_mange();
			}
		});
		button_1.setBounds(364, 356, 145, 28);
		panel.add(button_1);
		
		button_2 = new JButton("�������");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Departmentinformation_add();
			}
		});
		button_2.setBounds(364, 318, 145, 28);
		panel.add(button_2);
		
		lbltueMay = new JLabel();
		lbltueMay.setBounds(171, 204, 275, 15);
		panel.add(lbltueMay);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 539, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnVip = new JMenu("Ա������");
		menuBar.add(mnVip);
		
		JMenuItem menuItem = new JMenuItem("���Ա��");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Employeeinformation_add();
			}
		});
		mnVip.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("����Ա��");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new VIP_Mange();
			}
		});
		mnVip.add(menuItem_1);
		
		JMenuItem menuItem_4 = new JMenuItem("Ա����ѯ");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new VIP_Query();
			}
		});
		mnVip.add(menuItem_4);
		
		JMenu menu = new JMenu("���ʿ�����");
		menuBar.add(menu);
		
		JMenuItem menuItem_2 = new JMenuItem("��ӹ��ʿ�");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Coupon_add();
			}
		});
		menu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("�鿴���ʿ�");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Coupon_Query();
			}
		});
		menu.add(menuItem_3);
		
		JMenu menu_1 = new JMenu("��־��ѯ");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_5 = new JMenuItem("��ѯ��־");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Log_Query();
			}
		});
		menu_1.add(menuItem_5);
		
		System.out.println(Unit.nowUser.getAdmin());
		if(Unit.nowUser.getAdmin().equals("Ա��"))
		{
			button_1.setEnabled(false);
			button_2.setEnabled(false);
			menuItem.setEnabled(false);
			menuItem_1.setEnabled(false);
			menuItem_2.setEnabled(false);
			menuItem_5.setEnabled(false);
			label_1.setText("��ǰ�û�Ȩ�ޣ�Ա��");
		}
		else if(Unit.nowUser.getAdmin().equals("����Ա"))
		{
			label_1.setText("��ǰ�û�Ȩ�ޣ�����Ա");
		}
		updateUserCount();
	}
	/**���߳�ˢ�½�����������ʾ**/
	public void updateUserCount()
	{
		new Thread()
		{
			public void run()
			{
				while(true)
				{
					label_3.setText("��ǰԱ�����۶"+Unit.nowUser.getSum());
					String date = "��ǰʱ�䣺"+new Date().toString();
					lbltueMay.setText(date);
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
