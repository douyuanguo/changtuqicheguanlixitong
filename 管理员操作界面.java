package ��;��������ϵͳ;
//import java.awt.FlowLayout
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.sql.*;

public class ����Ա�������� extends JFrame implements ActionListener
{
	private static final long serialVersionUID = -6307624427471656520L;
	JLabel la1; 
    JLabel la2;
    JLabel la3;
	JButton btn1;
	JButton btn2;
	JButton btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	Panel p,p1,p2,p3;
	JTabbedPane jtb;
	//���µ�boolean�Ͷ�����������9�����ڲ������
	boolean bb1=false,bb2=false,bb3=false,bb4=false,bb5=false,bb6=false,bb7=false,bb8=false,bb9=false;
	boolean bn,bn1,bn2;      //������������� ���޸�ʱ��д��Ҫ�޸ĵ���һ�������Ƿ���ȷ��ȷΪfalse
	JInternalFrame jfr,jfr1,jfr2,jfr3,jfr4,jfr5,jfr6,jfr7,jfr8;    //������9���ڲ��������
	JTextField txt1,txt2,txt3;//����������·�������3���ı���
	JButton jbn;         // ����������·�������ȷ����ť
	JTextField txta1,txta2;//�������ɾ��·�������2���ı���
	JButton jbn1;         // �������ɾ��·�������ȷ����ť
	JTextField txtb0,txtb1,txtb2,txtb3;//��������޸�·�������4���ı���
	JButton jbn2;         // ��������޸�·�������ȷ����ť
	
	JTextField txt11,txt12,txt13,txt14,txt15;//�������������������5���ı���
	JButton jbna;         // �������������������ȷ����ť
	JTextField txta11,txta12;//�������ɾ�����������2���ı���
	JButton jbna1;         // �������������������ȷ����ť
	JTextField txtb10,txtb11,txtb12,txtb13,txtb14,txtb15;//��������޸����������5���ı���
	JButton jbna2;         // ��������޸����������ȷ����ť
	
	JTextField txt21,txt22,txt23;//�������������������3���ı���
	JButton jbnb;         // �������������������ȷ����ť
	JTextField txta21,txta22;//�������ɾ�����������2���ı���
	JButton jbnb1;         // �������������������ȷ����ť
	JTextField txtb21,txtb22,txtb23,txtb20;//��������޸����������2���ı���
	JButton jbnb2;         // ��������޸����������ȷ����ť
	
	
	����Ա��������()
	{
		setSize(960,720);
		int b=this.getSize().height;
		int a=this.getSize().width;
		setVisible(true);
		setTitle("��;��������ϵͳ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 int windowWidth = this.getWidth(); //��ô��ڿ�
		 int windowHeight = this.getHeight(); //��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); //���幤�߰�
		Dimension screenSize = kit.getScreenSize(); //��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�
		 int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
		this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//���ô��ھ�����ʾ
		setLayout(null);//new FlowLayout());
		jtb=new JTabbedPane();
		jtb.setBounds(0, 0, a, b);
		p=new Panel();
		p1=new Panel();
	    p1.setBounds(0, 0, a, b);
	    p1.setLayout(null);         //�����趨��������ڲ��Ľ��沼��Ϊ�ղſ����Լ�������һ���ؼ���λ�úʹ�С
		p2=new Panel();
		p2.setBounds(0,0, a, b);
		 p2.setLayout(null);
		p3=new Panel();
		p3.setBounds(0, 0, a, b);
		 p3.setLayout(null);
		btn1=new JButton("���");
		btn1.setBounds(a/7, b-100, 100, 30);
		btn2=new JButton("ɾ��");
		btn2.setBounds(a/2-50, b-100, 100, 30);
		btn3=new JButton("�޸�");
		btn3.setBounds(a-150, b-100, 100, 30);
		btn4=new JButton("���");
		btn4.setBounds(a/7, b-100, 100, 30);
		btn5=new JButton("ɾ��");
		btn5.setBounds(a/2-50, b-100, 100, 30);
		btn6=new JButton("�޸�");
		btn6.setBounds(a-150, b-100, 100, 30);
		btn7=new JButton("���");
		btn7.setBounds(a/7, b-100, 100, 30);
		btn8=new JButton("ɾ��");
		btn8.setBounds(a/2-50, b-100, 100, 30);
		btn9=new JButton("�޸�");
		btn9.setBounds(a-150, b-100, 100, 30);
		jtb.addTab("·��Ŀ¼", p1);
		jtb.addTab("����Ŀ¼", p2);
		jtb.addTab("��Ʊ���", p3);
	    this.getContentPane().add(jtb);
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p3.add(btn7);
		p3.add(btn8);
		p3.add(btn9);
		validate();
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)  //��ť�Ļص�����
	{
		if(e.getSource()==btn1)     //�����·
		{
		  if(!bb1)
			{
			  bb1=true;
			  if(bb2)
			  {
				  
			  jfr1.dispose();
			  }
			  if(bb3)
			  {
			  jfr2.dispose();
			  }
			  bb2=false;
			  bb3=false;
			  
			  
			//JOptionPane.showMessageDialog(null,"�����·�Ĵ��ڳ����ˣ�");
			 jfr=new JInternalFrame("�����·",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr.setSize(800, 600);
			jfr.setVisible(true);
			jfr.setLayout(null);
			jfr.setBounds(50, 50, 800, 500);
			jfr.add(pp);
			p1.add(jfr);
			JLabel jlb=new JLabel("��������㣨Ĭ��Ϊ����վ��������:");
			jlb.setBounds(50, 10, 250, 30);
			 txt1=new JTextField(20);
			txt1.setBounds(50, 50, 200, 30);
			pp.add(txt1);
			pp.add(jlb);
			JLabel jlb1=new JLabel("�������յ㣨������:");
			jlb1.setBounds(50, 80, 200, 30);
			 txt2=new JTextField(20);
			txt2.setBounds(50, 120, 200, 30);
			pp.add(txt2);
			pp.add(jlb1);
			JLabel jlb3=new JLabel("�������ʱ����1����Сʱ����1.5��:");
			jlb3.setBounds(50, 160, 250, 30);
			 txt3=new JTextField(20);
			txt3.setBounds(50, 200, 200, 30);
			pp.add(txt3);
			pp.add(jlb3);
			jbn=new JButton("ȷ�����");
			jbn.setBounds(270, 30, 100, 30);
			pp.add(jbn);
			jbn.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr.validate();
			
			}
		  
		  else
		  {
			  
			  jfr.dispose();
			  bb1=false;
			  
			  
		  }
		  
		  
		  
		  
			
		}
		if(e.getSource()==btn2)      //ɾ����·
		{
			if(!bb2)
			{
				  if(bb1)
				  {
					  
				  jfr.dispose();
				  }
				  if(bb3)
				  {
				  jfr2.dispose();
				  }
			  bb1=false;
			  bb2=true;
			  bb3=false;
			//JOptionPane.showMessageDialog(null,"ɾ����·�Ĵ��ڳ����ˣ�");
			 jfr1=new JInternalFrame("ɾ����·",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr1.setSize(800, 600);
			jfr1.setVisible(true);
			jfr1.setLayout(null);
			jfr1.setBounds(50, 50, 800, 500);
			jfr1.add(pp);
			p1.add(jfr1);
			JLabel jlb=new JLabel("��������㣨Ĭ��Ϊ����վ��������:");
			jlb.setBounds(50, 10, 250, 30);
			 txta1=new JTextField(20);
			txta1.setBounds(50, 50, 200, 30);
			pp.add(txta1);
			pp.add(jlb);
			//JOptionPane.showMessageDialog(null,"ִ�е�������1��");
			JLabel jlb1=new JLabel("�������յ㣨������:");
			jlb1.setBounds(50, 80, 200, 30);
			pp.add(jlb1);
			 txta2=new JTextField(20);
			txta2.setBounds(50, 120, 200, 30);
			pp.add(txta2);
			//pp.add(jlb1);
			//JOptionPane.showMessageDialog(null,"ִ�е�������2��");
			jbn1=new JButton("ȷ��ɾ��");
			jbn1.setBounds(270, 30, 100, 30);
			pp.add(jbn1);
			jbn1.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr1.validate();
			}
		  else
		  {
			  jfr1.dispose();
			  bb2=false;
		  }
			
		}
		if(e.getSource()==btn3)        //�޸���·
		{
			if(!bb3)
			{
				  if(bb1)
				  {jfr.dispose();}
				  if(bb2)
				  {jfr1.dispose();}
			  bb1=false;bb2=false;bb3=true;
			//JOptionPane.showMessageDialog(null,"�޸���·�Ĵ��ڳ����ˣ�");
			 jfr2=new JInternalFrame("�޸���·",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr2.setSize(800, 600);
			jfr2.setVisible(true);
			jfr2.setLayout(null);
			jfr2.setBounds(50, 50, 800, 500);
			jfr2.add(pp);
			p1.add(jfr2);
			
			JTextArea tx1=new JTextArea(7,20);
			tx1.setBounds(5, 5, 380, 100);
			pp.add(tx1);
			JLabel jlb=new JLabel("���:");
			jlb.setBounds(5, 145, 100, 30);
			 txtb1=new JTextField(20);
			txtb1.setBounds(115, 145, 100, 30);
			pp.add(txtb1);
			pp.add(jlb);
			//JOptionPane.showMessageDialog(null,"ִ�е�������1��");
			JLabel jlb1=new JLabel("�յ�:");
			jlb1.setBounds(5, 180, 100, 30);
			pp.add(jlb1);
			 txtb2=new JTextField(20);
			txtb2.setBounds(115, 180, 100, 30);
			pp.add(txtb2);
			JLabel jlb3=new JLabel("�������ʱ����1����Сʱ����1.5��:");
			jlb3.setBounds(5, 220, 100, 30);
			 txtb3=new JTextField(20);
			txtb3.setBounds(115, 220, 100, 30);
			pp.add(txtb3);
			pp.add(jlb3);
			
			//pp.add(jlb1);
			//JOptionPane.showMessageDialog(null,"ִ�е�������2��");
			jbn2=new JButton("ȷ���޸�");
			jbn2.setBounds(220, 220, 100, 30);
			pp.add(jbn2);
			jbn2.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr2.validate();
			
			//���濪ʼ�������ݿ�ķ�����
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				Statement s=con.createStatement();
				String str3="select * from ·�߱�";
				//PreparedStatement ps=con.prepareStatement(str3);
				ResultSet rs=s.executeQuery(str3);
				while(rs.next())
				{
					String ss1=rs.getString("·�߱��").trim()+rs.getString("���").trim()+rs.getString("�յ�").trim()+rs.getString("��ʱ").trim();
					//JOptionPane.showMessageDialog(null,"��������û����û�����"+ss1+str);
					tx1.append(ss1+"\n");
					
					
				}
				
			   
			
			
			JLabel jlb0=new JLabel("������Ҫ�޸ĵ�·�ߺ�:");
			jlb0.setBounds(5, 105, 150, 30);
			pp.add(jlb0);
			txtb0=new JTextField(20);
			txtb0.setBounds(160, 105, 30, 30);
			pp.add(txtb0);
			bn=false;
			
			
			
			    s.close();
			    con.close();      //�ر������ݿ���ص�����
			 }
		    catch(SQLException e2)
		    {
		    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
		    }
			}
		  
		  else
		  {
			  jfr2.dispose();
			  bb3=false;
		  }
		}
		
		if(e.getSource()==btn4)     //��Ӱ��
		{
			if(!bb4)
			{
			  bb4=true;
			  if(bb5)
			  {
				  
			  jfr4.dispose();
			  }
			  if(bb6)
			  {
			  jfr5.dispose();
			  }
			  bb5=false;
			  bb6=false;
			//JOptionPane.showMessageDialog(null,"���������Ĵ��ڳ����ˣ�");
			 jfr3=new JInternalFrame("�������",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr3.setSize(800, 600);
			jfr3.setVisible(true);
			jfr3.setLayout(null);
			jfr3.setBounds(50, 50, 800, 500);
			jfr3.add(pp);
			p2.add(jfr3);
			JLabel jlb=new JLabel("������·�߱�ţ��ο�·�߱�:");
			jlb.setBounds(50, 10, 250, 30);
			 txt11=new JTextField(20);
			txt11.setBounds(50, 50, 200, 30);
			pp.add(txt11);
			pp.add(jlb);
			JLabel jlb1=new JLabel("�����뷢��ʱ�䣨7�������7.5:��:");
			jlb1.setBounds(50, 80, 200, 30);
			 txt12=new JTextField(20);
			txt12.setBounds(50, 120, 200, 30);
			pp.add(txt12);
			pp.add(jlb1);
			JLabel jlb3=new JLabel("����������������ؿ���:");
			jlb3.setBounds(50, 160, 250, 30);
			 txt13=new JTextField(20);
			txt13.setBounds(50, 200, 200, 30);
			pp.add(txt13);
			pp.add(jlb3);
			JLabel jlb4=new JLabel("�����������ĵ�ǰ�ؿ���:");
			jlb4.setBounds(50, 240, 250, 30);
			 txt14=new JTextField(20);
			txt14.setBounds(50, 280, 200, 30);
			pp.add(txt14);
			pp.add(jlb4);
			JLabel jlb5=new JLabel("������������Ʊ��:");
			jlb5.setBounds(50, 320, 250, 30);
			 txt15=new JTextField(20);
			txt15.setBounds(50, 360, 200, 30);
			pp.add(txt15);
			pp.add(jlb5);
			
			
			
			jbna=new JButton("ȷ�����");
			jbna.setBounds(400, 100, 100, 30);
			pp.add(jbna);
			jbna.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr3.validate();
			}
		  else
		  {
			  jfr3.dispose();
			  bb4=false;
		  }
		  
		}
		if(e.getSource()==btn5)      //ɾ�����
		{
			if(!bb5)
			{
				  if(bb4)
				  {
					  
				  jfr3.dispose();
				  }
				  if(bb6)
				  {
				  jfr5.dispose();
				  }
			  bb4=false;
			  bb5=true;
			  bb6=false;
			//JOptionPane.showMessageDialog(null,"ɾ��������Ĵ��ڳ����ˣ�");
			 jfr4=new JInternalFrame("ɾ��������",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr4.setSize(800, 600);
			jfr4.setVisible(true);
			jfr4.setLayout(null);
			jfr4.setBounds(50, 50, 800, 500);
			jfr4.add(pp);
			p2.add(jfr4);
			JLabel jlb=new JLabel("�������������:");
			jlb.setBounds(50, 10, 250, 30);
			 txta11=new JTextField(20);
			txta11.setBounds(50, 50, 200, 30);
			pp.add(txta11);
			pp.add(jlb);
			jbna1=new JButton("ȷ��ɾ��");
			jbna1.setBounds(100, 100, 100, 30);
			pp.add(jbna1);
			jbna1.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr4.validate();
			}
		  else
		  {
			  jfr4.dispose();
			  bb5=false;
		  }
			
		}
		if(e.getSource()==btn6)        //�޸�������
		{
			if(!bb6)
			{
				  if(bb4)
				  {jfr3.dispose();}
				  if(bb5)
				  {jfr4.dispose();}
			  bb4=false;bb5=false;bb6=true;
			//JOptionPane.showMessageDialog(null,"�޸�������Ĵ��ڳ����ˣ�");
			 jfr5=new JInternalFrame("�޸�������",true,true,true,true);
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr5.setSize(800, 600);
			jfr5.setVisible(true);
			jfr5.setLayout(null);
			jfr5.setBounds(50, 50, 800, 500);
			jfr5.add(pp);
			p2.add(jfr5);
			
			JTextArea tx1=new JTextArea(7,20);
			tx1.setBounds(5, 5, 500, 100);
			pp.add(tx1);
			JLabel jlb=new JLabel("·�߱��:");
			jlb.setBounds(5, 145, 100, 30);
			 txtb11=new JTextField(20);
			txtb11.setBounds(115, 145, 100, 30);
			pp.add(txtb11);
			pp.add(jlb);
			JLabel jlb1=new JLabel("����ʱ��:");
			jlb1.setBounds(5, 180, 100, 30);
			pp.add(jlb1);
			 txtb12=new JTextField(20);
			txtb12.setBounds(115, 180, 100, 30);
			pp.add(txtb12);
			JLabel jlb3=new JLabel("���������:");
			jlb3.setBounds(5, 220, 100, 30);
			 txtb13=new JTextField(20);
			txtb13.setBounds(115, 220, 100, 30);
			pp.add(txtb13);
			pp.add(jlb3);
			
			JLabel jlb4=new JLabel("��ǰ������:");
			jlb4.setBounds(5, 260, 100, 30);
			 txtb14=new JTextField(20);
			txtb14.setBounds(115, 260, 100, 30);
			pp.add(txtb14);
			pp.add(jlb4);
			JLabel jlb5=new JLabel("�۸�:");
			jlb5.setBounds(5, 300, 100, 30);
			 txtb15=new JTextField(20);
			txtb15.setBounds(115, 300, 100, 30);
			pp.add(txtb15);
			pp.add(jlb5);
			
			//pp.add(jlb1);
			//JOptionPane.showMessageDialog(null,"ִ�е�������2��");
			jbna2=new JButton("ȷ���޸�");
			jbna2.setBounds(220, 220, 100, 30);
			pp.add(jbna2);
			jbna2.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr5.validate();
			
			//���濪ʼ�������ݿ�ķ�����
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				Statement s=con.createStatement();
				String str3="select * from ������";
				//PreparedStatement ps=con.prepareStatement(str3);
				ResultSet rs=s.executeQuery(str3);
				String ss0="�������     "+"·�߱��     "+"����ʱ��     "+"�������     "+"ʣ������     "+"�۸�";
				tx1.append(ss0+"\n");
				while(rs.next())
				{
					String ss1=rs.getString("�������").trim()+"     "+rs.getString("·�߱��").trim()+"     "+rs.getString("����ʱ��").trim()+"     "+rs.getString("�������").trim()+"     "+rs.getString("ʣ������").trim()+"     "+rs.getString("�۸�").trim();
					//JOptionPane.showMessageDialog(null,"��������û����û�����"+ss1+str);
					tx1.append(ss1+"\n");
				}
			JLabel jlb0=new JLabel("������Ҫ�޸ĵ��������:");
			jlb0.setBounds(5, 105, 150, 30);
			pp.add(jlb0);
			txtb10=new JTextField(20);
			txtb10.setBounds(160, 105, 30, 30);
			pp.add(txtb10);
			bn1=false;
			    s.close();
			    con.close();      //�ر������ݿ���ص�����
			 }
		    catch(SQLException e2)
		    {
		    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
		    }
			}
		  
		  else
		  {
			  jfr5.dispose();
			  bb6=false;
		  }
		}
		
		if(e.getSource()==btn7)     //��Ӷ�Ʊ
		{
			if(!bb7)
			{
			  bb7=true;
			  if(bb8)
			  {
				  
			  jfr7.dispose();
			  }
			  if(bb9)
			  {
			  jfr8.dispose();
			  }
			  bb8=false;
			  bb9=false;
			//JOptionPane.showMessageDialog(null,"��Ӷ�Ʊ��Ϣ�Ĵ��ڳ����ˣ�");
			 jfr6=new JInternalFrame("�����·",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr6.setSize(800, 600);
			jfr6.setVisible(true);
			jfr6.setLayout(null);
			jfr6.setBounds(50, 50, 800, 500);
			jfr6.add(pp);
			p3.add(jfr6);
			JLabel jlb=new JLabel("������������ţ��ο�������:");
			jlb.setBounds(50, 10, 250, 30);
			 txt21=new JTextField(20);
			txt21.setBounds(50, 50, 200, 30);
			pp.add(txt21);
			pp.add(jlb);
			JLabel jlb1=new JLabel("�������û���:");
			jlb1.setBounds(50, 80, 200, 30);
			 txt22=new JTextField(20);
			txt22.setBounds(50, 120, 200, 30);
			pp.add(txt22);
			pp.add(jlb1);
			JLabel jlb3=new JLabel("�������Ƿ���Ʊ���ǻ��:");
			jlb3.setBounds(50, 160, 250, 30);
			 txt23=new JTextField(20);
			txt23.setBounds(50, 200, 200, 30);
			pp.add(txt23);
			pp.add(jlb3);
			jbnb=new JButton("ȷ�����");
			jbnb.setBounds(270, 30, 100, 30);
			pp.add(jbnb);
			jbnb.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr6.validate();
			
			}
		  
		  else
		  {
			  
			  jfr.dispose();
			  bb1=false;
			  
			  
		  }
		  
			
			
			
		}
		if(e.getSource()==btn8)      //ɾ����Ʊ
		{
			if(!bb8)
			{
				  if(bb7)
				  {
					  
				  jfr6.dispose();
				  }
				  if(bb9)
				  {
				  jfr8.dispose();
				  }
			  bb7=false;
			  bb8=true;
			  bb9=false;
			//JOptionPane.showMessageDialog(null,"ɾ����Ʊ�Ĵ��ڳ����ˣ�");
			 jfr7=new JInternalFrame("ɾ����Ʊ",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr7.setSize(800, 600);
			jfr7.setVisible(true);
			jfr7.setLayout(null);
			jfr7.setBounds(50, 50, 800, 500);
			jfr7.add(pp);
			p3.add(jfr7);
			JLabel jlb=new JLabel("�����붩����:");
			jlb.setBounds(50, 10, 250, 30);
			 txta21=new JTextField(20);
			txta21.setBounds(50, 50, 200, 30);
			pp.add(txta21);
			pp.add(jlb);
			jbnb1=new JButton("ȷ��ɾ��");
			jbnb1.setBounds(270, 30, 100, 30);
			pp.add(jbnb1);
			jbnb1.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr7.validate();
			}
		  else
		  {
			  jfr7.dispose();
			  bb8=false;
		  }
			
			
		}
		if(e.getSource()==btn9)        //�޸�����
		{
			if(!bb9)
			{
				  if(bb7)
				  {jfr6.dispose();}
				  if(bb8)
				  {jfr7.dispose();}
			  bb7=false;bb8=false;bb9=true;
			//JOptionPane.showMessageDialog(null,"�޸���·�Ĵ��ڳ����ˣ�");
			 jfr8=new JInternalFrame("�޸���·",true,true,true,true);
			//JFrame jfr=new JFrame("�����·");
			JPanel pp=new JPanel();
			pp.setBounds(0, 0, 800, 600);
			pp.setLayout(null);
			jfr8.setSize(800, 600);
			jfr8.setVisible(true);
			jfr8.setLayout(null);
			jfr8.setBounds(50, 50, 800, 500);
			jfr8.add(pp);
			p3.add(jfr8);
			JTextArea tx1=new JTextArea(7,20);
			tx1.setBounds(5, 5, 600, 100);
			pp.add(tx1);
			JLabel jlb0=new JLabel("������Ҫ�޸ĵĶ�����:");
			jlb0.setBounds(5, 105, 150, 30);
			pp.add(jlb0);
			txtb20=new JTextField(20);
			txtb20.setBounds(160, 105, 30, 30);
			pp.add(txtb20);
			JLabel jlb=new JLabel("�������:");
			jlb.setBounds(5, 145, 100, 30);
			 txtb21=new JTextField(20);
			txtb21.setBounds(115, 145, 100, 30);
			pp.add(txtb21);
			pp.add(jlb);
			//JOptionPane.showMessageDialog(null,"ִ�е�������1��");
			JLabel jlb1=new JLabel("�û���:");
			jlb1.setBounds(5, 180, 100, 30);
			pp.add(jlb1);
			 txtb22=new JTextField(20);
			txtb22.setBounds(115, 180, 100, 30);
			pp.add(txtb22);
			JLabel jlb3=new JLabel("�Ƿ���Ʊ:");
			jlb3.setBounds(5, 220, 100, 30);
			 txtb23=new JTextField(20);
			txtb23.setBounds(115, 220, 100, 30);
			pp.add(txtb23);
			pp.add(jlb3);
			
			
			jbnb2=new JButton("ȷ���޸�");
			jbnb2.setBounds(220, 220, 100, 30);
			pp.add(jbnb2);
			jbnb2.addActionListener(this);
			//jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jfr8.validate();
			
			//���濪ʼ�������ݿ�ķ�����
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				Statement s=con.createStatement();
				String str3="select * from ��Ʊ��";
				//PreparedStatement ps=con.prepareStatement(str3);
				ResultSet rs=s.executeQuery(str3);
				String ss0="������     "+"�������     "+"�û���     "+"�Ƿ���Ʊ";
				tx1.append(ss0+"\n");
				while(rs.next())
				{
					String ss1=rs.getString("������").trim()+"     "+rs.getString("�������").trim()+"     "+rs.getString("�û���").trim()+"     "+rs.getString("�Ƿ���Ʊ").trim();
					tx1.append(ss1+"\n");
				}
			
			bn2=false;
			    s.close();
			    con.close();      //�ر������ݿ���ص�����
			 }
		    catch(SQLException e2)
		    {
		    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
		    }
			}
		  
		  else
		  {
			  jfr8.dispose();
			  bb9=false;
		  }
		}
		if(e.getSource()==jbn)        //ȷ�������·
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy=txt1.getText().trim();
				String yy1=txt2.getText().trim();
				String sdd="select * from ·�߱�";
				ResultSet rs=s.executeQuery(sdd);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				int ad=0;
				boolean bh1=false;      //������֤����������յ������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				while(rs.next())
				{
					ad=Integer.parseInt(rs.getString("·�߱��"));
					if(yy.equals(rs.getString("���")))
					{
						if(yy1.equals(rs.getString("�յ�")))
						{
							bh1=true;
						}
					}
				}
				ad++;      //����ǰ������ż�1
				if(!bh1)
				{
				//JOptionPane.showMessageDialog(null,"����������е�Ԫ�ظ���Ϊ��"+ad);
				String st1="'"+String.valueOf(ad)+"'";
				String st2="'"+txt1.getText().trim()+"'";
				String st3="'"+txt2.getText().trim()+"'";
				String st4="'"+txt3.getText().trim()+"'";
				//float aas=Float.valueOf(txt3.getText()).floatValue();
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼд�����ݿ⣺"+st1);
				//String stt="insert into �û���(�û���,����) values("+strr+","+str1r+")";
				String stt="insert into ·�߱�(·�߱��,���,�յ�,��ʱ) values("+st1+","+st2+","+st3+
						","+st4+
						")";
				//PreparedStatement ps=con.prepareStatement(str3);
				s.executeUpdate(stt);
				//boolean b1=false;       //�����ж��Ƿ��û��������붼��ȷ
				//JOptionPane.showMessageDialog(null,"��ӳɹ���");
				//JOptionPane.showMessageDialog(null,"�û�����"+str);
				
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				 }
				    else
				    {
					  JOptionPane.showMessageDialog(null,"�������·���Ѿ����ڣ����������룡");
					  txt1.setText(null);
					  txt2.setText(null);
					  txt3.setText(null);
				    }
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    
			    
			    }
				
			
			
			
		}
		if(e.getSource()==jbn1)        //ȷ��ɾ����·
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy=txta1.getText().trim();
				String yy1=txta2.getText().trim();
				String sdd="select * from ·�߱�";
				ResultSet rs=s.executeQuery(sdd);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				String ad = null;                 //�������·�ߺ�
				boolean bh1=false;      //������֤����������յ������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				while(rs.next())
				{
					//ad++;
					if(yy.equals(rs.getString("���").trim()))
					{
					//	JOptionPane.showMessageDialog(null,"dangqian"+rs.getString("���").trim());

						if(yy1.equals(rs.getString("�յ�").trim()))
						{
						//	JOptionPane.showMessageDialog(null,"dangqian"+rs.getString("�յ�").trim());

							ad=rs.getString("·�߱��").trim();
							bh1=true;
						}
					}
				}
				
				if(bh1)
				{
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼɾ�����ݿ⣺");
				String stt="delete from ·�߱� where ·�߱��="+ad;
				s.executeUpdate(stt);
				JOptionPane.showMessageDialog(null,"ɾ���ɹ���");
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				    txta1.setText(null);
					  txta2.setText(null);
				 }
				    else
				    {
				    	 s.close();
						 con.close();      //�ر������ݿ���ص�����
					  JOptionPane.showMessageDialog(null,"�������·�߲����ڣ����������룡");
					  txta1.setText(null);
					  txta2.setText(null);
				    }
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    
			    
			    }
				
			
			
			
			
		}
		if(e.getSource()==jbn2 )        //ȷ���޸���·
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy0=txtb0.getText().trim();
				String yy=txtb1.getText().trim();
				String yy1=txtb2.getText().trim();
				String yy2=txtb3.getText().trim();
			
				JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				//String ad = null;                 //�������·�ߺ�
				boolean bh1=false;      //������֤����������յ������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				boolean bh2=false;      //������֤�����·�ߺ��Ƿ���ȷΪtrue��
				try
				{
					//int az=Integer.parseInt(txtb0.getText());
					String az=txtb0.getText();
					String str0="select * from ·�߱� where ·�߱��="+az;
							s.executeQuery(str0);
							JOptionPane.showMessageDialog(null,"���ӳɹ�555");
							//bh2=true;
							bh2=true;
					
				}catch(Exception e3){
					
					JOptionPane.showMessageDialog(null,"��·���������������ԣ�");
					//bh2=true;
				}
				
				if(bh2)
				{
					String sdd="select * from ·�߱�";
					ResultSet rs=s.executeQuery(sdd);
				while(rs.next())
				{
					//ad++;
					//JOptionPane.showMessageDialog(null,"��ʲ�Ƚ����"+rs.getString("���").trim());
					if(yy.equals(rs.getString("���").trim()))
					{
						//JOptionPane.showMessageDialog(null,"dangqian"+rs.getString("���").trim());

						if(yy1.equals(rs.getString("�յ�").trim()))
						{
							//JOptionPane.showMessageDialog(null,"dangqian"+rs.getString("�յ�").trim());

							//ad=rs.getString("·�߱��").trim();
							bh1=true;
						}
					}
				}
				
				if(!bh1)
				{
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼ�޸����ݿ⣺");
				String  ayy="'"+yy+"'";
				String  ayy1="'"+yy1+"'";
				String  ayy2="'"+yy2+"'";
				String  ayy0="'"+yy0+"'";
				
				
				String stt="UPDATE ·�߱� SET ���="+ayy+",�յ�="+ayy1+",��ʱ="+ayy2+" where ·�߱��="+ayy0;
				s.executeUpdate(stt);
				JOptionPane.showMessageDialog(null,"�޸ĳɹ���");
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				 }
				    else
				    {
				    	  s.close();
						    con.close();      //�ر������ݿ���ص�����
					  JOptionPane.showMessageDialog(null,"�����������յ��Ѵ��ڣ����������룡");
					  txtb1.setText(null);
					  txtb2.setText(null);
				    }
				}
				else
				{
					 s.close();
					    con.close();      //�ر������ݿ���ص�����
					JOptionPane.showMessageDialog(null,"�������·�߲����ڣ����������룡");
					txtb0.setText(null);
					txtb1.setText(null);
					  txtb2.setText(null);
				}
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    }
		}
		
		if(e.getSource()==jbna)          //����������
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy1=txt11.getText().trim();
				String yy2=txt12.getText().trim();
				String yy3=txt13.getText().trim();
				String yy4=txt14.getText().trim();
				String yy5=txt15.getText().trim();
				int aq1=Integer.parseInt(yy1);
				int aq3=Integer.parseInt(yy3);
				int aq4=Integer.parseInt(yy4);
				int aq5=Integer.parseInt(yy5);
				String aq2="'"+yy2+"'";
				String sdd="select * from ·�߱�";
				ResultSet rs=s.executeQuery(sdd);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				int ad=0;
				boolean bh1=false;      //������֤�����·�ߺ������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				while(rs.next())
				{
					//ad++;
					if(yy1.equals(rs.getString("·�߱��").trim()))
					{
					//	JOptionPane.showMessageDialog(null,"dangqian"+rs.getString("���").trim());
							bh1=true;
					}
				}
				String sdd1="select * from ������";
				ResultSet rs1=s.executeQuery(sdd1);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				while(rs1.next())
				{
					    ad=Integer.parseInt(rs1.getString("�������").trim());
					//	JOptionPane.showMessageDialog(null,"dangqian"+rs.getString("���").trim());
				}
				
				
				if(bh1)
				{
				ad++;      //����ǰ������ż�1
				//JOptionPane.showMessageDialog(null,"����������е�Ԫ�ظ���Ϊ��"+(ad-1));
				//float aas=Float.valueOf(txt3.getText()).floatValue();
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼд�����ݿ⣺");
				String aq0="'"+String.valueOf(ad)+"'";
				String stt="insert into ������ values("+aq0+","+aq1+","+aq2+","+aq3+
						","+aq4+","+aq5+
						")";
				//PreparedStatement ps=con.prepareStatement(str3);
				s.executeUpdate(stt);
				//boolean b1=false;       //�����ж��Ƿ��û��������붼��ȷ
				JOptionPane.showMessageDialog(null,"��ӳɹ���");
				//JOptionPane.showMessageDialog(null,"�û�����"+str);
				
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
					  txt11.setText(null);
					  txt12.setText(null);
					  txt13.setText(null);
					  txt14.setText(null);
					  txt15.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"�������·�߱�Ų����ڣ������ԣ�");
					  s.close();
					    con.close();      //�ر������ݿ���ص�����
						  txt11.setText(null);
						  txt12.setText(null);
						  txt13.setText(null);
						  txt14.setText(null);
						  txt15.setText(null);
				}
				
				
				
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    
			    
			    }
			
		}
		if(e.getSource()==jbna1)         //�������ɾ��
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy=txta11.getText().trim();
				String sdd="select * from ������";
				ResultSet rs=s.executeQuery(sdd);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				boolean bh1=false;      //������֤����������յ������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				while(rs.next())
				{
					if(yy.equals(rs.getString("�������").trim()))
					{
					//	JOptionPane.showMessageDialog(null,"������ţ�"+rs.getString("�������").trim());
							bh1=true;
						
					}
				}
				
				if(bh1)
				{
					String yy1="'"+yy+"'";
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼɾ�����ݿ⣺");
				String stt="delete from ������ where �������="+yy1;
				s.executeUpdate(stt);
				JOptionPane.showMessageDialog(null,"ɾ���ɹ���");
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				    txta11.setText(null);
					 
				 }
				    else
				    {
				    	 s.close();
						 con.close();      //�ر������ݿ���ص�����
					  JOptionPane.showMessageDialog(null,"�������������Ų����ڣ����������룡");
					  txta11.setText(null);
					  
				    }
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    
			    
			    }
			
			
		}
		if(e.getSource()==jbna2)         //��������޸�
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy0=txtb10.getText().trim();
				String yy1=txtb11.getText().trim();
				String yy2=txtb12.getText().trim();
				String yy3=txtb13.getText().trim();
				String yy4=txtb14.getText().trim();
				String yy5=txtb15.getText().trim();
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				//String ad = null;                 //�������·�ߺ�
				boolean bh2=false;      //������֤�������������Ƿ���ȷΪtrue��
				try
				{
					//int az=Integer.parseInt(txtb0.getText());
					String az=txtb10.getText().trim();
					String str0="select * from ������ where �������="+az;
							s.executeQuery(str0);
					//		JOptionPane.showMessageDialog(null,"���ӳɹ�555");
							//bh2=true;
							bh2=true;
					
				}catch(Exception e3){
					
					JOptionPane.showMessageDialog(null,"������Ų����ڣ������ԣ�");
					//bh2=true;
				}
				
				
				
				if(bh2)
				{
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼ�޸����ݿ⣺");
				String  ayy2="'"+yy2+"'";
				String  ayy0="'"+yy0+"'";
				int ayy1=Integer.parseInt(yy1);
				int ayy3=Integer.parseInt(yy3);
				int ayy4=Integer.parseInt(yy4);
				int ayy5=Integer.parseInt(yy5);
				
				String stt="UPDATE ������ SET ·�߱��="+ayy1+",����ʱ��="+ayy2+",�������="+ayy3+",ʣ������="+ayy4+",�۸�="+ayy5+" where �������="+ayy0;
				s.executeUpdate(stt);
				JOptionPane.showMessageDialog(null,"�޸ĳɹ���");
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				      txtb10.setText(null);
					  txtb11.setText(null);
					  txtb12.setText(null);
					  txtb13.setText(null);
					  txtb14.setText(null);
					  txtb15.setText(null);
				 }
				    else
				    {
				    	  s.close();
						    con.close();      //�ر������ݿ���ص�����
					  JOptionPane.showMessageDialog(null,"�������������Ų����ڣ����������룡");
					  txtb10.setText(null);
					  txtb11.setText(null);
					  txtb12.setText(null);
					  txtb13.setText(null);
					  txtb14.setText(null);
					  txtb15.setText(null);
				    
				     }
			   }
			     
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    }
			
		}
		
		if(e.getSource()==jbnb)          //����������
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String sdd="select * from ��Ʊ��";
				ResultSet rs=s.executeQuery(sdd);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				int ad=0;
				//boolean bh1=false;      //������֤����������յ������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				while(rs.next())
				{
					ad=Integer.parseInt(rs.getString("������"));
					
				}
				ad++;      //����ǰ������ż�1
				
				//JOptionPane.showMessageDialog(null,"����������е�Ԫ�ظ���Ϊ��"+ad);
				String st1="'"+String.valueOf(ad)+"'";
				String st2="'"+txt21.getText().trim()+"'";
				String st3="'"+txt22.getText().trim()+"'";
				String st4="'"+txt23.getText().trim()+"'";
				//float aas=Float.valueOf(txt3.getText()).floatValue();
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼд�����ݿ⣺"+st1);
				//String stt="insert into �û���(�û���,����) values("+strr+","+str1r+")";
				String stt="insert into ��Ʊ�� values("+st1+","+st2+","+st3+
						","+st4+
						")";
				//PreparedStatement ps=con.prepareStatement(str3);
				s.executeUpdate(stt);
				//boolean b1=false;       //�����ж��Ƿ��û��������붼��ȷ
				JOptionPane.showMessageDialog(null,"��ӳɹ���");
				//JOptionPane.showMessageDialog(null,"�û�����"+str);
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
					  txt21.setText(null);
					  txt22.setText(null);
					  txt23.setText(null);
				    
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    
			    
			    }
				
			
		}
		if(e.getSource()==jbnb1)         //�������ɾ��
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			 
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy=txta21.getText().trim();
				String sdd="select * from ��Ʊ��";
				ResultSet rs=s.executeQuery(sdd);
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				boolean bh1=false;      //������֤����Ķ����������ݿ����Ƿ��Ѿ����ڣ�false��ʾ������
				while(rs.next())
				{
					if(yy.equals(rs.getString("������").trim()))
					{bh1=true;
					}
				}
				if(bh1)
				{
					String yy1="'"+yy+"'";
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼɾ�����ݿ⣺");
				String stt="delete from ��Ʊ�� where ������="+yy1;
				s.executeUpdate(stt);
				JOptionPane.showMessageDialog(null,"ɾ���ɹ���");
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				    txta21.setText(null);
				 }
				    else
				    {
				    	 s.close();
						 con.close();      //�ر������ݿ���ص�����
					  JOptionPane.showMessageDialog(null,"������Ķ����Ų����ڣ����������룡");
					  txta21.setText(null);
				    }
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    }
			
			
		}
		if(e.getSource()==jbnb2)         //��������޸�
		{
			String JDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433;DatabaseName=��;��������ϵͳ���ݿ�";
			
			try {
				Class.forName(JDriver);          //ע��
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Connection con=DriverManager.getConnection(url,"admin","1");   //����
				//JOptionPane.showMessageDialog(null,"���ӳɹ���");
				Statement s=con.createStatement();
				String yy0=txtb20.getText().trim();
				String yy=txtb21.getText().trim();
				String yy1=txtb22.getText().trim();
				String yy2=txtb23.getText().trim();
			
				//JOptionPane.showMessageDialog(null,"�ɹ���ȡ���ݿ⣺");
				//String ad = null;                 //�������·�ߺ�
				boolean bh1=false;           //��֤��������Ƿ���ڴ���Ϊtrue
				boolean bh2=false;      //������֤����Ķ������Ƿ���ȷΪtrue��
				try
				{
					//int az=Integer.parseInt(txtb0.getText());
					String az=txtb20.getText();
					String str0="select * from ��Ʊ�� where ������="+az;
							s.executeQuery(str0);
					//		JOptionPane.showMessageDialog(null,"���ӳɹ�555");
							//bh2=true;
							bh2=true;
					
				}catch(Exception e3){
					
					JOptionPane.showMessageDialog(null,"��·���������������ԣ�");
					//bh2=true;
				}
				
				if(bh2)
				{
					String sdd="select * from ������";
					ResultSet rs=s.executeQuery(sdd);
				while(rs.next())
				{
					if(yy.equals(rs.getString("�������").trim()))
					{
						bh1=true;
					}
				}
				
				if(!bh1)
				{
				//JOptionPane.showMessageDialog(null,"���Ͽ�ʼ�޸����ݿ⣺");
				String  ayy="'"+yy+"'";
				String  ayy1="'"+yy1+"'";
				String  ayy2="'"+yy2+"'";
				String  ayy0="'"+yy0+"'";
				
				
				String stt="UPDATE ��Ʊ�� SET �������="+ayy+",�û���="+ayy1+",�Ƿ���Ʊ="+ayy2+" where ������="+ayy0;
				s.executeUpdate(stt);
				JOptionPane.showMessageDialog(null,"�޸ĳɹ���");
				    s.close();
				    con.close();      //�ر������ݿ���ص�����
				 }
				    else
				    {
				    	  s.close();
						    con.close();      //�ر������ݿ���ص�����
					  JOptionPane.showMessageDialog(null,"�������������Ų����ڣ����������룡");
					  txtb21.setText(null);
					  txtb22.setText(null);
					  txtb23.setText(null);
					  txtb20.setText(null);
				    }
				}
				else
				{
					 s.close();
					    con.close();      //�ر������ݿ���ص�����
					JOptionPane.showMessageDialog(null,"�㶩���Ų����ڣ����������룡");
					 txtb21.setText(null);
					  txtb22.setText(null);
					  txtb23.setText(null);
					  txtb20.setText(null);
				}
			     }
			    catch(SQLException e2)
			    {
			    	JOptionPane.showMessageDialog(null,"�������ݿ�ʧ�ܣ�");
			    }
			
			
		}
		
		
	}
		public static void main(String[] args)
		{
			
			new ����Ա��������();
			 
			
		}
	
}
