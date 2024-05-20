package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
	JFrame jf;
	JLabel Dispaly;
	JButton Seven;JButton Eight;JButton Nine;JButton Four;JButton Five;JButton Six;JButton One;JButton Two;
	JButton Three;
	JButton Dote;JButton Zero;JButton EqualTo;JButton Multi;JButton Sub;JButton Add;JButton Div;JButton Clr;
	
	String oldValue;
	String newValue;
	String op;
	
	boolean Operater=false;
	

	
	public Calculator() {
		
		jf=new JFrame();
		jf.setLayout(null);
		jf.setSize(340, 425);
		jf.setLocation(50, 50);
		jf.getContentPane().setBackground(Color.black);
		
		
		Dispaly=new JLabel();
		Dispaly.setBounds(5,5 ,315, 70);
		Dispaly.setBackground(Color.black);
		Dispaly.setOpaque(true);
		Dispaly.setHorizontalAlignment(SwingConstants.RIGHT);
		Dispaly.setFont(new Font("",Font.PLAIN,50));
		Dispaly.setForeground(Color.white);
		jf.add(Dispaly);
		
		Clr=new JButton("CLR");
		Clr.setBounds(5, 85, 78, 40);
		Clr.setBackground(Color.black);
		Clr.setFont(new Font("",Font.PLAIN,20));
		Clr.setForeground(Color.white);
		Clr.addActionListener(this);
		jf.add(Clr);
		
		
		Seven=new JButton("7");
		Seven.setBounds(5, 136, 78, 60);
		Seven.setBackground(Color.black);
		Seven.setFont(new Font("",Font.PLAIN,50));
		Seven.setForeground(Color.white);
		Seven.addActionListener(this);
		jf.add(Seven);
		Eight=new JButton("8");
		Eight.setBounds(84,136, 78, 60);
		Eight.setBackground(Color.black);
		Eight.setFont(new Font("",Font.PLAIN,50));
		Eight.setForeground(Color.white);
		Eight.addActionListener(this);
		jf.add(Eight);
		Nine=new JButton("9");
		Nine.setBounds(163, 136, 78, 60);
		Nine.setBackground(Color.black);
		Nine.setFont(new Font("",Font.PLAIN,50));
		Nine.setForeground(Color.white);
		Nine.addActionListener(this);
		jf.add(Nine);
		
		Four=new JButton("4");
		Four.setBounds(5, 197, 78, 60);
		Four.setBackground(Color.black);
		Four.setFont(new Font("",Font.PLAIN,50));
		Four.setForeground(Color.white);
		Four.addActionListener(this);
		jf.add(Four);
		Five=new JButton("5");
		Five.setBounds(84, 197, 78, 60);
		Five.setBackground(Color.black);
		Five.setFont(new Font("",Font.PLAIN,50));
		Five.setForeground(Color.white);
		Five.addActionListener(this);
		jf.add( Five);
		Six=new JButton("6");
		Six.setBounds(163,197, 78, 60);
		Six.setBackground(Color.black);
		Six.setFont(new Font("",Font.PLAIN,50));
		Six.setForeground(Color.white);
		Six.addActionListener(this);
		jf.add(Six);
		
		One=new JButton("1");
		One.setBounds(5, 258, 78, 60);
		One.setBackground(Color.black);
		One.setFont(new Font("",Font.PLAIN,50));
		One.setForeground(Color.white);
		One.addActionListener(this);
		jf.add(One);
		Two=new JButton("2");
		Two.setBounds(84, 258, 78,60);
		Two.setBackground(Color.black);
		Two.setFont(new Font("",Font.PLAIN,50));
		Two.setForeground(Color.white);
		Two.addActionListener(this);
		jf.add( Two);
		Three=new JButton("3");
		Three.setBounds(163,258, 78, 60);
		Three.setBackground(Color.black);
		Three.setFont(new Font("",Font.PLAIN,50));
		Three.setForeground(Color.white);
		Three.addActionListener(this);
		jf.add(Three);
		
		Dote=new JButton(".");
		Dote.setBounds(5,320, 78,60);
		Dote.setBackground(Color.black);
		Dote.setFont(new Font("",Font.PLAIN,50));
		Dote.setForeground(Color.white);
		Dote.addActionListener(this);
		jf.add(Dote);
		Zero=new JButton("0");
		Zero.setBounds(84,320, 78, 60);
		Zero.setBackground(Color.black);
		Zero.setFont(new Font("",Font.PLAIN,50));
		Zero.setForeground(Color.white);
		Zero.addActionListener(this);
		jf.add( Zero);
		EqualTo=new JButton("=");
		EqualTo.setBounds(242,320, 78, 60);
		EqualTo.setBackground(Color.black);
		EqualTo.setFont(new Font("",Font.PLAIN,50));
		EqualTo.setForeground(Color.white);
		EqualTo.addActionListener(this);
		jf.add(EqualTo);
		
		Div=new JButton("/");
		Div.setBounds(242, 136, 78, 60);
		Div.setBackground(Color.black);
		Div.setFont(new Font("",Font.PLAIN,50));
		Div.setForeground(Color.white);
		Div.addActionListener(this);
		jf.add(Div);
		Multi=new JButton("*");
		Multi.setBounds(242,197, 78, 60);
		Multi.setBackground(Color.black);
		Multi.setFont(new Font("",Font.PLAIN,50));
		Multi.setForeground(Color.white);
		Multi.addActionListener(this);
		jf.add(Multi);
		Sub=new JButton("-");
		Sub.setBounds(242,258, 78, 60);
		Sub.setBackground(Color.black);
		Sub.setFont(new Font("",Font.PLAIN,50));
		Sub.setForeground(Color.white);
		Sub.addActionListener(this);
		jf.add(Sub);
		Add=new JButton("+");
		Add.setBounds(163,320, 78, 60);
		Add.setBackground(Color.black);
		Add.setFont(new Font("",Font.PLAIN,50));
		Add.setForeground(Color.white);
		Add.addActionListener(this);
		jf.add(Add);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Seven) {
			if(Operater) {
				Dispaly.setText("7");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"7");
			}
			
		}else if(e.getSource()==Eight) {
			if(Operater) {
				Dispaly.setText("8");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"8");
			}
		}
		else if(e.getSource()==Nine) {
			if(Operater) {
				Dispaly.setText("9");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"9");
			}
		}
		else if(e.getSource()==Four) {
			if(Operater) {
				Dispaly.setText("4");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"4");
			}
		}
		else if(e.getSource()==Five) {
			if(Operater) {
				Dispaly.setText("5");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"5");
			}
		}
		else if(e.getSource()==Six) {
			if(Operater) {
				Dispaly.setText("6");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"6");
			}
		}
		else if(e.getSource()==One) {
			if(Operater) {
				Dispaly.setText("1");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"1");
			}
		}
		else if(e.getSource()==Two) {
			if(Operater) {
				Dispaly.setText("2");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"2");
			}
		}
		else if(e.getSource()==Three) {
			if(Operater) {
				Dispaly.setText("3");
				Operater=false;
			}
			else {
				Dispaly.setText(Dispaly.getText()+"3");
			}
		}
		else if(e.getSource()==Dote) {
			if(Operater) {
				Dispaly.setText(".");
				Operater=false;
			}else {
				Dispaly.setText(Dispaly.getText()+".");
			}
		}
		else if(e.getSource()==Zero) {
			if(Operater) {
				Dispaly.setText("0");
				Operater=false;
				
			}
			else {
				Dispaly.setText(Dispaly.getText()+"0");
			}
		}
		else if(e.getSource()==Clr) {
			Dispaly.setText(" ");
		}
		else if(e.getSource()==Sub) {
			Operater=true;
			op="-";
			oldValue=Dispaly.getText();
		}
		else if(e.getSource()==Multi) {
			Operater=true;
			op="*";
			oldValue=Dispaly.getText();
		}
		else if(e.getSource()==Div) {
			Operater=true;
			op="/";
			oldValue=Dispaly.getText();
		}
		else if(e.getSource()==Add) {
			Operater=true;
			op="+";
			oldValue=Dispaly.getText();
		}
		else if(e.getSource()==EqualTo) {
			newValue=Dispaly.getText();
			float oldValue1=Float.parseFloat(oldValue);
			float newvalue1=Float.parseFloat(newValue);
			
			if(op=="+"){
				float Result=oldValue1+newvalue1;
				
				Dispaly.setText(Result+"");
			}
		else if(op=="-") {
			float Result=oldValue1-newvalue1;
			
			Dispaly.setText(Result+"");
			
			
		}else if(op=="*") {
			float Result=oldValue1*newvalue1;
			
			Dispaly.setText(Result+"");
			
			
		}else if(op=="/") {
			float Result=oldValue1/newvalue1;
			
			Dispaly.setText(Result+"");
			
			
		}
			
			}
		
			
			
		
	}

}
