import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Test extends Thread{
	JFrame j=new JFrame();
	public void run() {
		int a=JOptionPane.showConfirmDialog(j,"Are You Want To Exit" );
		if(a==JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		else if(a==JOptionPane.NO_OPTION) {
			System.console();
		}
	
	}
}

public class BankMain extends javax.swing.JFrame {
    
    
    public BankMain() {
   
setLocation(400,250);
getContentPane().setBackground(Color.ORANGE);
        initComponents();
    }

  
  
    private void initComponents() {
    	Test t=new Test();
          
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
      
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Bank Account System");

    

        jLabel1.setFont(new Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel1.setText("           *******WELCOME TO  BANK  MANAGEMENT  SYSTEM ******");
        jButton1.setText(" CREATE  ACCOUNT ");
        jButton1.setBackground(Color.black);
        jButton1.setForeground(Color.ORANGE);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DEPOSIT");
        jButton2.setBackground(Color.black);
        jButton2.setForeground(Color.ORANGE);
        jButton2.setMaximumSize(new Dimension(107, 23));
        jButton2.setMinimumSize(new Dimension(107, 23));
        jButton2.setPreferredSize(new Dimension(107, 23));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("WITHDRAW");
        jButton3.setBackground(Color.black);
        jButton3.setForeground(Color.ORANGE);
      
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("CHECK BALANCE");
        jButton4.setBackground(Color.black);
        jButton4.setForeground(Color.ORANGE);
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("ABOUT");
        jButton6.setBackground(Color.black);
        jButton6.setForeground(Color.ORANGE);
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("EXIT");
        jButton7.setBackground(Color.black);
        jButton7.setForeground(Color.ORANGE);
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               t.start();
               
              
            }
        });
      


        jMenu1.setText("New");
        jMenu1.setBackground(Color.black);
        jMenu1.setForeground(Color.BLACK);

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Account..");
        jMenuItem1.setBackground(Color.black);
        jMenuItem1.setForeground(Color.ORANGE);
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("About");
        jMenuItem3.setBackground(Color.black);
        jMenuItem3.setForeground(Color.ORANGE);
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.setBackground(Color.black);
        jMenuItem4.setForeground(Color.ORANGE);
        jMenuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);
        
        

        jMenu2.setText("Transaction");
     
        jMenu2.setForeground(Color.BLACK);
        jMenuItem5.setText("Deposit Amount..");
        jMenuItem5.setBackground(Color.black);
        jMenuItem5.setForeground(Color.ORANGE);
        jMenuItem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Withdraw Amount..");
        jMenuItem6.setBackground(Color.black);
        jMenuItem6.setForeground(Color.ORANGE);
        jMenuItem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
        jMenuItem7.setText("Check Account Balance..");
        jMenuItem7.setBackground(Color.black);
        jMenuItem7.setForeground(Color.ORANGE);
        jMenuItem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                  
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  
                    .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        pack();
    }
    private static Account acc;
    
    private void jButton1ActionPerformed(ActionEvent evt) {
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
        acc = new Account(name, num);
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }


    private void jButton2ActionPerformed(ActionEvent evt) {
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
          
             JOptionPane.showMessageDialog(jButton2, "You Have Enterd Invalid Information");
            System.exit(0);
        }
    }
    private void jButton3ActionPerformed(ActionEvent evt) {
        try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException  | NumberFormatException  |NullPointerException ex)
           {
               JOptionPane.showMessageDialog(jButton3, "First You Have To Deposit The Amount ");
           }
    }
    private void jButton4ActionPerformed(ActionEvent evt) {
        try
        {
          double num = acc.getBalance();
          JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
        }
        catch(NullPointerException npe)
        {
            JOptionPane.showMessageDialog(jButton4, "First You Have To Create Your Account ");
        }
     }
    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Created By 21SW013", "About", 1);
    }
    private void jButton7ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }
    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
        acc = new Account(name, num);
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }

    

    private void jMenuItem3ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Created By 21SW013", "About", 1);
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt) {
       System.exit(0);
        
        
    }
    private void jMenuItem5ActionPerformed(ActionEvent evt) {
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(jMenuItem5, "First You Have To Created Your Account");
        }
    }
    private void jMenuItem7ActionPerformed(ActionEvent evt) {
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(jMenuItem7, "First You Have To Create your Account");
       }
    }
    private void jMenuItem6ActionPerformed(ActionEvent evt) {
        try
        {
            String num;
            num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
       
            double num1 = Double.parseDouble(num);
            acc.withdraw(num1);
        }
        catch(BankAccountException | NumberFormatException | NullPointerException ex)
        {
            JOptionPane.showMessageDialog(jMenuItem6, "First Deposit The Amount ");
        }
 }
public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new BankMain().setVisible(true);
        });
    }

   
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPopupMenu.Separator jSeparator1;
  
}


