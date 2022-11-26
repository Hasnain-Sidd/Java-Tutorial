import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.event.*;
import java.awt.*;

class Practical{
	Practical(){
		JFrame JF=new JFrame("Simple Calculator");
		JTextField JT1=new JTextField();
		JTextField JT2 =new JTextField();
		JTextField JT3 =new JTextField();
		//JLabel JL1=new JLabel("Result");
		JButton JB1=new JButton("ADD");
		JButton JB2=new JButton("SUB");
		JButton JB3=new JButton("MUL");
		JButton JB4=new JButton("DIV");
		JButton JB5=new JButton("CLEAR");
	//	JF.setLayout(new FlowLayout(FlowLayout.TRAILING));
		JF.setLayout(null);
		JF.getContentPane().setBackground(Color.GRAY);
		JF.setSize(400,400);
		JT1.setBounds(100, 100, 50, 20);
		JT2.setBounds(200, 100, 50, 20);
		JB1.setBounds(70,200,65,30);
		JB2.setBounds(150,200,65,30);
		JB3.setBounds(230,200,65,30);
		JB4.setBounds(300,200,65,30);
		JT3.setBounds(200,300,95,20);
		JB5.setBounds(100, 300, 75, 30);
		JB5.setBackground(Color.BLACK);
		JB5.setForeground(Color.WHITE);
		JT3.setBackground(Color.WHITE);
		JB1.setBackground(Color.BLACK);
		JB2.setBackground(Color.BLACK);
		JB3.setBackground(Color.BLACK);
		JB4.setBackground(Color.BLACK);
		JB1.setForeground(Color.WHITE);
		JB2.setForeground(Color.WHITE);
		JB3.setForeground(Color.WHITE);
		JB4.setForeground(Color.WHITE);
		JB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(JT1.getText());
				float b=Float.parseFloat(JT2.getText());
				float sum=a+b;
				JT3.setText(sum+" ");
			}
		});
		JB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(JT1.getText());
				float b=Float.parseFloat(JT2.getText());
				float sub=a-b;
				JT3.setText(sub+" ");
			}
		});
		JB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(JT1.getText());
				float b=Float.parseFloat(JT2.getText());
				float mul=a*b;
				JT3.setText(mul+" ");
				if(a==b) {
					JT3.setText(mul+" ");
				}
			}
		});
		JB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(JT1.getText());
				float  b=Float.parseFloat(JT2.getText());
				double div=a/b;
				JT3.setText(div+" ");
			}
		});
		JB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JT1.setText("  ");
				JT2.setText("  " );
				JT3.setText("  " );
				
			}
		});
		JF.add(JT1);
		JF.add(JT2);
		JF.add(JB1);
		JF.add(JB2);
		JF.add(JB3);
		JF.add(JB5);
		JF.add(JB4);
		JF.add(JT3);
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JF.EXIT_ON_CLOSE);
		
		
	}
}
public class SimpleCalculator {
public static void main(String[] args) {
	Practical P =new Practical();
}
}
