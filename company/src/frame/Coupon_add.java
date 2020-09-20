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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Coupon_add implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;

	private Couponimpl couponmysql=new Couponimpl();
	/**
	 * Create the application.
	 */
	public Coupon_add() 
	{
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 257, 168);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "添加工资卡", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 225, 113);
		frame.getContentPane().add(panel);
		
		JLabel lblid = new JLabel("工资卡卡号：");
		lblid.setBounds(10, 23, 72, 15);
		panel.add(lblid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(91, 20, 122, 21);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 48, 122, 21);
		panel.add(textField_1);
		
		JLabel label_1 = new JLabel("原本工资：");
		label_1.setBounds(10, 51, 83, 15);
		panel.add(label_1);
		
		button = new JButton("添加");
		button.registerKeyboardAction(this, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),JComponent.WHEN_IN_FOCUSED_WINDOW);
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(textField.getText().equals("")||textField_1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"请将信息填写完整！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					Coupon coupon = new Coupon();
					coupon.setId(textField.getText());
					coupon.setPrices(Integer.valueOf(textField_1.getText()));
					couponmysql.add(coupon);
					JOptionPane.showMessageDialog(null,"工资卡添加成功！","提示信息", JOptionPane.INFORMATION_MESSAGE);
					Unit.logmysql.Coupon_Add(Unit.log.setLog(coupon.getId(),coupon.getPrices(),""));
					frame.dispose();
				}
			}
		});
		button.setBounds(10, 79, 203, 23);
		panel.add(button);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==button)
		{
			if(textField.getText().equals("")||textField_1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"请将信息填写完整！","提示信息", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				if(isNumeric(textField_1.getText()))
				{
					JOptionPane.showMessageDialog(null,"工资卡只能为数字！","提示信息", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				Coupon coupon = new Coupon();
				coupon.setId(textField.getText());
				coupon.setPrices(Integer.valueOf(textField_1.getText()));
				couponmysql.add(coupon);
				JOptionPane.showMessageDialog(null,"工资卡添加成功！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				Unit.logmysql.Coupon_Add(Unit.log.setLog(coupon.getId(),coupon.getPrices(),""));
				frame.dispose();
			}
		}
	}
	
	public static boolean isNumeric(String str)
	{
		for (int i = str.length();--i>=0;)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
}
