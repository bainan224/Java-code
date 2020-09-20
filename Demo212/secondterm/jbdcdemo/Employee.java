package jbdcdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {
    JLabel jId = new JLabel(" 编号：");
    JLabel jName = new JLabel("姓名:");
    JLabel jAge = new JLabel("年龄:");
    JLabel jSalary = new JLabel("工资:");

    JTextField jtfId = new JTextField("1", 20);
    JTextField jtfName = new JTextField("张三", 20);
    JTextField jtfAge = new JTextField("30", 20);
    JTextField jtfSalary = new JTextField("5000", 20);

    JButton jButtonInsert = new JButton("Insert");
    JButton jButtonUpdate = new JButton("Update");
    JButton jButtonDelete = new JButton("Delete");

    public Frame(String title) {
        super(title);
        Container container = this.getContentPane();

        container.setLayout(null);
        jId.setBounds(10, 20, 40, 30);
        jtfId.setBounds(60, 20, 100, 30);

        jName.setBounds(10, 60, 40, 30);
        jtfName.setBounds(60, 60, 100, 30);

        jAge.setBounds(10, 100, 40, 30);
        jtfAge.setBounds(60, 100, 100, 30);

        jSalary .setBounds(10, 140, 40, 30);
        jtfSalary.setBounds(60, 140, 100, 30);

        jButtonInsert.setBounds(10, 200, 80, 30);
        jButtonUpdate.setBounds(100, 200, 80, 30);
        jButtonDelete.setBounds(190, 200, 80, 30);

        container.add(jId);
        container.add(jtfId);

        container.add(jName);
        container.add(jtfName);

        container.add(jAge);
        container.add(jtfAge);

        container.add(jSalary);
        container.add(jtfSalary);

        container.add(jButtonInsert);
        container.add(jButtonUpdate);
        container.add(jButtonDelete);
        jButtonInsert.addActionListener(this);
        jButtonUpdate.addActionListener(this);
        jButtonDelete.addActionListener(this);

        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if ("Insert".equals(e.getActionCommand())) {
            String sql = "insert into employee (id,name,age,salary) values(?,?,?,?)";
            Integer id = Integer.parseInt(jtfId.getText());
            String name = jtfName.getText();
            Integer age = Integer.parseInt(jtfAge.getText());
            Integer salary = Integer.parseInt(jtfSalary.getText());

            int code = DBUtils.update(sql, id, name, age, salary);
            System.out.println(code );
            

        } else if ("Delete".equals(e.getActionCommand())) {
            String sql = "delete from employee where id=?";

            int code = DBUtils.update(sql, new Integer(4));
            System.out.println(code );
            

        } else if ("Update".equals(e.getActionCommand())) {
            String sql = "Update employee set salary=salary*1.1 where id=2";
            Integer id = Integer.parseInt(jtfId.getText());

            int code = DBUtils.update(sql);
            System.out.println(code );
            
        }
    }
}

    public class Employee {
    public static void main(String[] args) {
        new Frame("企业管理");
       
    }
}
