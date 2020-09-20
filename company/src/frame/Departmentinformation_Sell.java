package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import kit.Unit;
import entity.*;
import daoimpl.*;

import daoimpl.Couponimpl;
import daoimpl.Userimpl;
import daoimpl.departmentinformationimpl;
import daoimpl.employeeinformationimpl;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Departmentinformation_Sell 
{
	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button;
	private JButton button_0;
	private JButton button_1;
	private JButton button_2;
	private JComboBox comboBox;
	private DefaultTableModel DTM;
	private String tableTitle[]={"部门", "负责项目","负责人数","加班时长","合计"};
	private JLabel lblNewLabel;
	private JTextField textField_3;
	private JLabel label_4;
	private JLabel label_2;

	private departmentinformationimpl itemmysql = new departmentinformationimpl();
	private employeeinformationimpl	vipmysql = new employeeinformationimpl();
	private Couponimpl	couponmysql = new Couponimpl();
	private Userimpl	usermysql = new Userimpl();
	
	private Object shoppingList[][] = new Object[100][];
	private int shoppingListNow=0;
	
	private double listTotal=0;
	private double listTotalVip=0;
	private double listTotalVipCoupon=0;
	private double listTotalCoupon=0;
	private boolean isCoupon=false;
	private boolean isVIP=false;
	private double couponPrices=0;
	
	private JButton button_3;
	private JTextField textField_4;

	private double shiShou;
	private double zhaoLing;
	public Departmentinformation_Sell() 
	{
		initialize();
		frame.setVisible(true);
	}

	void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 601);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "员工工作", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 666, 543);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("负责项目：");
		label.setBounds(10, 28, 71, 15);
		panel.add(label);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				departmentinformationimpl item = itemmysql.getByName((String)comboBox.getSelectedItem());
				textField_3.setText(item.getId());
			}
		});
		comboBox.setBounds(78, 25, 125, 20);
		panel.add(comboBox);
		
		JLabel label_1 = new JLabel("加班时长：");
		label_1.setBounds(364, 28, 71, 15);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(423, 25, 71, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 646, 399);
		panel.add(scrollPane);
		
		table = new JTable();
		DTM=new DefaultTableModel(shoppingList,tableTitle);
		table.setModel(DTM);
		scrollPane.setViewportView(table);
		
		JLabel lblid = new JLabel("员工ID：");
		lblid.setBounds(10, 462, 71, 15);
		panel.add(lblid);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 459, 110, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		button_0 = new JButton("确定");
		button_0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Unit.putDebug("点击确定，确定员工ID是否存在");
				employeeinformation vip = vipmysql.getById(textField_1.getText());
				if(vip==null)
				{
					JOptionPane.showMessageDialog(null,"员工不存在！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					button.setEnabled(false);
					button_3.setEnabled(false);
					button_0.setEnabled(false);
					isVIP=true;
					JOptionPane.showMessageDialog(null,"ok！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button_0.setBounds(198, 458, 100, 23);
		panel.add(button_0);
		
		JLabel label_3 = new JLabel("工资卡：");
		label_3.setBounds(339, 462, 71, 15);
		panel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(436, 459, 110, 20);
		panel.add(textField_2);
		
		button_1 = new JButton("确定");
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Coupon coupon = couponmysql.getById(textField_2.getText());
				if(coupon==null)
				{
					JOptionPane.showMessageDialog(null,"sorry！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					button_1.setEnabled(false);
					isCoupon=true;
					couponPrices=coupon.getPrices();
					reTotal();
					JOptionPane.showMessageDialog(null,"ok！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button_1.setBounds(556, 456, 100, 23);
		panel.add(button_1);
		
		button_2 = new JButton("打印工资卡");
		button_2.setEnabled(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				button.setEnabled(false);
				button_3.setEnabled(false);
				button_0.setEnabled(false);
				button_1.setEnabled(false);
				for(int i=0;i<shoppingListNow;i++)
				{
					itemmysql.subCount((int)shoppingList[i][3], itemmysql.getById((String)shoppingList[i][0]));
					Unit.logmysql.Item_Sell(Unit.log.setLog((String)shoppingList[i][0],(int)shoppingList[i][3],"正常"));
				}
				
				if(isVIP)
				{
					vipmysql.addCount(vipmysql.getById(textField_1.getText()),(int) listTotal);
					Unit.logmysql.VIP_Count(Unit.log.setLog("职位积分",(int) listTotal,textField_1.getText()));
				}
				
				if(isCoupon)
				{
					Coupon coupon = couponmysql.getById(textField_2.getText());
					couponmysql.delete(couponmysql.getById(textField_2.getText()));
					Unit.logmysql.Coupon_Used(Unit.log.setLog(coupon.getId(),coupon.getPrices(),"无"));
				}
				
				usermysql.addSum(Unit.nowUser,(int)listTotal);
				Unit.nowUser=usermysql.getByUser(Unit.nowUser.getUser());
				new Item_List(createList());
				frame.dispose();
			}
		});
		button_2.setBounds(556, 483, 100, 50);
		panel.add(button_2);
		
		label_4 = new JLabel("工作量合计：");
		label_4.setBounds(10, 515, 296, 15);
		panel.add(label_4);
		
		lblNewLabel = new JLabel("部门：");
		lblNewLabel.setBounds(220, 28, 71, 15);
		panel.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(288, 25, 66, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		button = new JButton("添加");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(textField_3.getText().equals("")||textField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"sorry","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					if(!isNumeric(textField.getText()))
					{
						JOptionPane.showMessageDialog(null,"ok","提示信息", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					else
					{
						employeeinformation item = itemmysql.getById(textField_3.getText());
						if(item==null)
						{
							JOptionPane.showMessageDialog(null,"没有此信息！","提示信息", JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							
							int oldCount=0;
							for(int i=0;i<shoppingListNow;i++)
							{
								if(shoppingList[i][0].equals(item.getId()))
								{
									oldCount=(int)shoppingList[i][3];
									break;
								}
							}
							if((Integer.valueOf(textField.getText())+oldCount)>item.getCount())
							{
								JOptionPane.showMessageDialog(null,"sorry！","提示信息", JOptionPane.INFORMATION_MESSAGE);
							}
							else
							{
								double sum = Integer.valueOf(textField.getText())*item.getPrices();
								shoppingList[shoppingListNow]=new Object[] {item.getId(),item.getName(),item.getPrices(),Integer.valueOf(textField.getText()),sum};	
								DTM.setDataVector(shoppingList,tableTitle);
								shoppingListNow++;
								reTotal();
								reCheck();
							}
						}
					}
				}
			}
		});
		button.setBounds(585, 26, 71, 23);
		panel.add(button);
		
		button_3 = new JButton("删除");
		button_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int row = table.getSelectedRow();
				int column = 0;
				if(row!=-1)
				{			
					
					System.out.println(row+" "+column);
					for(int i=row;i<shoppingListNow-1;i++)
					{
						shoppingList[i]=shoppingList[i+1];
					}
					shoppingList[shoppingListNow-1]=null;
					shoppingListNow--;
					
					DTM.setDataVector(shoppingList,tableTitle);
					reTotal();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"当前没有选中任何商品！","提示信息", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button_3.setBounds(504, 25, 71, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("结算");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_4.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"ok！","提示信息", JOptionPane.INFORMATION_MESSAGE);					
					return;
				}
				if(isNumeric(textField_4.getText()))
				{
					shiShou = Double.valueOf(textField_4.getText());
					if(isCoupon&&!isVIP)
					{
						//listTotalVipCoupon
						zhaoLing=shiShou-listTotalCoupon;
					}
					else if(isCoupon&&isVIP)
					{
						zhaoLing=shiShou-listTotalVipCoupon;						
					}
					else if(!isCoupon&&isVIP)
					{
						zhaoLing=shiShou-listTotalVip;
					}
					else
					{
						zhaoLing=shiShou-listTotal;
					}
					if(zhaoLing<0)
					{
						JOptionPane.showMessageDialog(null,"sorry!","提示信息", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					JOptionPane.showMessageDialog(null,"nice！总工资："+shiShou+"   分红："+zhaoLing,"提示信息", JOptionPane.INFORMATION_MESSAGE);
					label_2.setText("分红："+zhaoLing);
					button.setEnabled(false);
					button_0.setEnabled(false);
					button_1.setEnabled(false);
					button_3.setEnabled(false);
					button_4.setEnabled(false);
					button_2.setEnabled(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"sorry！","提示信息", JOptionPane.INFORMATION_MESSAGE);					
				}
			}
		});
		button_4.setBounds(436, 483, 110, 50);
		panel.add(button_4);
		
		label_2 = new JLabel("分红：");
		label_2.setBounds(339, 515, 96, 15);
		panel.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("总工资：");
		lblNewLabel_1.setBounds(10, 490, 71, 15);
		panel.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(78, 487, 348, 20);
		panel.add(textField_4);
		
		List<HashMap> itemList = itemmysql.getAll();
		for(int i=0;i<itemList.size();i++)
		{
			comboBox.addItem((String)itemList.get(i).get("name"));
		}
	}
	
	private String createList()
	{
		SimpleDateFormat simpleDate = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String list = "-------------------工作量合计-------------------\n";
		list=list+"部门"+new Date().getTime()+"\n";
		list=list+"时间"+simpleDate.format(new Date())+"\n";
		list=list+"-------------------工作量结算-------------------\n";
		for(int i=0;i<shoppingListNow;i++)
		{
			for(int j=0;j<DTM.getColumnCount();j++)
			{
				if(j==2)
				{
					list=list+"量："+DTM.getValueAt(i, j)+"";
				}
				else if(j==3)
				{
					list=list+"*"+DTM.getValueAt(i, j);
				}
				else if(j==4)
				{
					list=list+"="+DTM.getValueAt(i, j)+"件";
				}
				else
				{
					list=list+DTM.getValueAt(i, j)+"  ";
				}
				
			}
			list=list+"\n";
		}
		list=list+"-------------------工资卡信息-------------------\n";
		if(isVIP)
		{
			list=list+"1："+(int)(listTotal-listTotalVip)+"件\n";			
		}
		else
		{
			list=list+"2：0件\n";
		}
		if(isCoupon)
		{
			list=list+"3："+couponPrices+"件\n";	
		}
		else
		{
			list=list+"4：0件\n";	
		}
		list=list+"总计："+shiShou+"\n";
		list=list+"分红："+zhaoLing+"\n";
		list=list+"-----------------员工信息-------------------\n";
		list=list+"员工："+Unit.nowUser.getName();
		Unit.putDebug(list);
		return list;
	}
	
	private void reTotal()
	{
		listTotal=0;
		for(int i=0;i<shoppingListNow;i++)
		{
			listTotal=listTotal+(double)shoppingList[i][4];
		}
		listTotalVip=listTotal*Unit.vip;
		listTotalCoupon=listTotal-couponPrices;
		listTotalVipCoupon=listTotalVip-couponPrices;
		if(listTotal-couponPrices<0)
		{
			if(isCoupon)
			{
				label_4.setText("合计：0      1：0");
			}
			else
			{
				label_4.setText("合计：0      1：0");
			}
			return;
		}
		
		if(isCoupon)
		{
			label_4.setText("合计："+listTotalCoupon+"1："+String.format("%.2f", listTotalVipCoupon));
		}
		else
		{
			label_4.setText("合计："+listTotal+" 1："+String.format("%.2f", listTotalVip));
		}
	}
	
	private void reCheck()
	{
		if(shoppingListNow==1)
		{
			return;
		}
		for(int i=0;i<shoppingListNow-1;i++)
		{
			if(shoppingList[i][0].equals(shoppingList[shoppingListNow-1][0]))
			{
				shoppingList[i][3]=(int)shoppingList[i][3]+(int)shoppingList[shoppingListNow-1][3];
				shoppingList[i][4]=(double)shoppingList[i][4]+(double)shoppingList[shoppingListNow-1][4];
				shoppingList[shoppingListNow-1]=null;
				shoppingListNow--;
				DTM.setDataVector(shoppingList,tableTitle);
				reTotal();
				break;
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
