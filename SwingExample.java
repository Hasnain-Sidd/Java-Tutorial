import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import javax.swing.*;
public class SwingExample  {
	JCheckBox checkbox1,checkbox2,checkbox3,checkbox4;
	public SwingExample() {
		JFrame jframe =new JFrame();
		JButton jbutton1=new JButton("Login");
		JButton jbutton2 = new JButton("Clear ");
	JLabel jlabel =new JLabel("UserName");
	JLabel jlabel2=new JLabel("Mobile Number");
		JTextArea jtextarea=new JTextArea();
	
		JTextField jtextfield1= new JTextField("");
		JTextField  jpf=new JTextField();
		JLabel jlabel4=new JLabel("Qualification");
		JLabel jlabel3=new JLabel("Address");
		JLabel jlabel5=new JLabel("Gender");
		JLabel jlabel6=new JLabel("Country");
		String  Countryname[]= {"Pakistan","Australia","England","South Africa"};
		JComboBox jcombobox=new JComboBox(Countryname);
		JRadioButton jradiobutton1=new JRadioButton("Male");
		JRadioButton jradiobutton2=new JRadioButton("Female");
		checkbox1=new JCheckBox("Matric");
		checkbox1.setBounds(200,250,75,20);
		checkbox2=new JCheckBox("Intermediate");
		checkbox2.setBounds(300,250,100,20);
		checkbox3=new JCheckBox("Under-Graduate");
		checkbox3.setBounds(200,300,120,20);
		checkbox4=new JCheckBox("Post-Graduate");
		checkbox4.setBounds(350,300,130,20);
jframe.getContentPane().setBackground(Color.ORANGE);
jframe.setTitle("THIS IS FORM");
jframe.setLayout(null);
jframe.setSize(550,800);
jbutton1.setBounds(225, 660, 100, 30);
jbutton2.setBounds(100,660,100,30);
jlabel.setBounds(40,40,80,30);
jlabel2.setBounds(40,80,80,30);
jlabel3.setBounds(40,120,80,30);
jlabel4.setBounds(40,250,100,30);
jlabel5.setBounds(40,350,100,30);
jlabel6.setBounds(40,420,100,30);
jtextfield1.setBounds(200,44,100,20);
jradiobutton1.setBounds(200,355,80,20);
jradiobutton2.setBounds(300,355,80,20);
jcombobox.setBounds(200,420,80,25);
jpf.setBounds(200,80,100,20);
jtextarea.setBounds(200,124,250,100);
jframe.add(jlabel5);
jframe.add(jradiobutton1);
jframe.add(jradiobutton2);
jframe.add(jcombobox);
jframe.add(jlabel6);

jframe.add(checkbox1);
jframe.add(checkbox2);
jframe.add(checkbox3);
jframe.add(checkbox4);
jframe.add(jtextfield1);
jframe.add(jbutton1);
jframe.add(jbutton2);
jframe.add(jlabel);
jframe.add(jlabel2);
jframe.add(jlabel3);
jframe.add(jpf);
jframe.add(jtextarea);
jframe.add(jlabel4);
/*jframe.addWindowListener(new WindowAdapter() {
	@Override
	public void windowClosing(WindowEvent ev) {
	int a=JOptionPane.showInternalConfirmDialog(jframe,"Are You Want To Exit");
	if(a==JOptionPane.YES_OPTION) {
	jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}
	}
	

});*/

jbutton1.addActionListener( new ActionListener() {
		@Override
	public void actionPerformed(ActionEvent e) {
			String x1,x2,x3,x4;
	
		if(checkbox1.isSelected()) {
			JOptionPane.showMessageDialog(jframe, "You Are Not Applicable");
			
		}
		else if(checkbox2.isSelected()) {
			JOptionPane.showMessageDialog(jframe, "Now  You Are Applicable But You Have To Wait For Your Opportunity");
		}
		else if(checkbox3.isSelected()) {
			JOptionPane.showMessageDialog(jframe, "Now You Are Red Hot Favourite");
		}
		else if(checkbox4.isSelected()){
			JOptionPane.showMessageDialog(jframe, "You Are Out Of Run!");
		}

	}
});
jtextfield1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent es) {
	
	String Name=jtextfield1.getText();
	char j =0;
	if(Name.equals(j)) {
		JOptionPane.showConfirmDialog(jframe, "You have entered the valid information!");
	}
	else {
		JOptionPane.showConfirmDialog(jframe, "You have not entered the valid information!");
	}
	
}
});
jbutton2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent aex) {
	
	}
});




jframe.setVisible(true);
jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new SwingExample();
}
}
