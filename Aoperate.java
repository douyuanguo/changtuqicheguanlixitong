package ctqcgl;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
public class Aoperate extends JFrame implements ActionListener
{
	 JTextField text=new JTextField("管理员选择操作：");
     JLabel label1=new JLabel("查询操作:");
     JButton button1=new JButton("汽车查询");
     JButton button2=new JButton("线路查询");
     JButton button3=new JButton("车票查询");
     JLabel label2=new JLabel("删除操作：");
     JButton button4=new JButton("汽车删除");
     JButton button5=new JButton("线路删除");
     JLabel label3=new JLabel("添加操作：");
     JButton button6=new JButton("班次增加");
     JButton button7=new JButton("路线增加");
     JLabel label4=new JLabel("更新操作：");
     JButton button8=new JButton("汽车更新");
     JButton button9=new JButton("线路更新");
     JButton button10=new JButton("返回");
     JButton button11=new JButton("退出");
     JPanel panel=new JPanel();
     public Aoperate()
     {
    	this.setSize(600,500);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	this.validate();
    	this.setTitle("管理员操作界面");
    	this.setLayout(null);
    	this.add(panel);
    	this.add(text);
    	this.add(label1);
    	this.add(label2);
    	this.add(label3);
    	this.add(label4);
    	this.add(button1);
    	this.add(button2);
    	this.add(button3);
    	this.add(button4);
    	this.add(button5);
    	this.add(button6);
    	this.add(button7);
    	this.add(button8);
    	this.add(button9);
    	this.add(button10);
    	this.add(button11);
    	text.setBounds(200,10,100,30);
    	label1.setBounds(50,80,100,30);
    	button1.setBounds(150,80,100, 30);
    	button2.setBounds(250,80,100, 30);
    	button3.setBounds(350,80,100, 30);
    	label2.setBounds(50,160,100,30);
    	button4.setBounds(150,160,100, 30);
    	button5.setBounds(250,160,100, 30);
    	label3.setBounds(50,240,100,30);
    	button6.setBounds(150,240,100, 30);
    	button7.setBounds(250,240,100, 30);
    	label4.setBounds(50,320,100,30);
    	button8.setBounds(150,320,100, 30);
    	button9.setBounds(250,320,100, 30);
    	button10.setBounds(150,420,100,30);
    	button11.setBounds(350,420,100,30);
    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button3.addActionListener(this);
    	button4.addActionListener(this);
    	button5.addActionListener(this);
    	button6.addActionListener(this);
    	button7.addActionListener(this);
    	button8.addActionListener(this);
    	button9.addActionListener(this);
    	button10.addActionListener(this);
    	button11.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e)
	{
		Object object=e.getSource();
		if(object.equals(button1))
		{
			
		}
		if(object.equals(button2))
		{
			
		}
		if(object.equals(button3))
		{
			
		}
		if(object.equals(button4))
		{
			
		}
		if(object.equals(button5))
		{
			
		}
		if(object.equals(button6))
		{
			
		}
		if(object.equals(button7))
		{
			
		}
		if(object.equals(button8))
		{
			
		}
		if(object.equals(button9))
		{
			
		}
		if(object.equals(button10))
		{
			//返回到登陆界面
			Login login=new Login();
			dispose();
		}
		if(object.equals(button11))
		{
			int j=JOptionPane.showConfirmDialog(null,"确定要退出吗?","退出",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);     
			if(j==JOptionPane.YES_NO_OPTION)
			{
			   System.exit(0);
			}
		}
	}
	public static void main(String args[])
	{
	   Aoperate operate=new Aoperate();
	}
}
