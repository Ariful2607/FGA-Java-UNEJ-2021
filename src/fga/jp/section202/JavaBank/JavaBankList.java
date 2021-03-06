package fga.jp.section202.JavaBank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*; 
 
public class JavaBankList extends JFrame {
	private static final long serialVersionUID = 1L;
	// Make these variables publicly available
    public String name;
    public int accountNum;
    public int balance;
	    
    // JPanel for user inputs
    private JPanel inputDetailJPanel;
 
    // JLabel and JTextField for account name
    private JLabel nameJLabel;
    private JTextField nameJTextField;
 
    // JLabel and JTextField for account number
    private JLabel accountNumJLabel;
    private JTextField accountNumJTextField;
	 
    // JLabel and JTextField for balance
    private JLabel balanceJLabel;
    private JTextField balanceJTextField;
	 
    // JLabel and JTextField for withdraw
    private JLabel depositJLabel;
    private JTextField depositJTextField;

    // JLabel and JTextField for Withdraw
    private JLabel withdrawJLabel;
    private JTextField withdrawJTextField;
 
    // JButton to create account
    private JButton createAccountJButton;
	 
    // JButton to delete account
    private JButton deleteAccountJButton;
	 
    // JButton to make transaction
    private JButton transactionJButton;
	    
    // JButton to display account
    private JButton displayJButton;
	 
    // JLabel and JTextArea to display account details
    private JLabel displayJLabel;
    private static JTextArea displayJTextArea;
	    
    //  array to store Account details and an Arraylist
    ArrayList<Account> accounts = new ArrayList<Account>();
	    
    //static int noAccounts = 0; 
	 
    // constructor
    public JavaBankList() {
    	//create the interface and start the application
        createUserInterface();
    }//end constructor method
	    
    // create and position GUI components; register event handlers
    private void createUserInterface() {
        // get content pane for attaching GUI components
        Container contentPane = getContentPane();
	 
        // enable explicit positioning of GUI components
        contentPane.setLayout(null);
	 
        // set up inputDetailJPanel
        inputDetailJPanel = new JPanel();
        inputDetailJPanel.setBounds(16, 16, 208, 250);
        inputDetailJPanel.setBorder(new TitledBorder("Input Details"));
        inputDetailJPanel.setLayout(null);
        contentPane.add(inputDetailJPanel);
 
        // set up NameJLabel
        nameJLabel = new JLabel();
        nameJLabel.setBounds(8, 32, 90, 23);
        nameJLabel.setText("Name:");
        inputDetailJPanel.add(nameJLabel);
	 
        // set up NameJTextField
        nameJTextField = new JTextField();
        nameJTextField.setBounds(112, 32, 80, 21);
        nameJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(nameJTextField);
 
        // set up AccountnumJLabel
        accountNumJLabel = new JLabel();
        accountNumJLabel.setBounds(8, 56, 100, 23);
        accountNumJLabel.setText("Account Number:");
        inputDetailJPanel.add(accountNumJLabel);
	 
        // set up AccountnumTextField
        accountNumJTextField = new JTextField();
        accountNumJTextField.setBounds(112, 56, 80, 21);
        accountNumJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(accountNumJTextField);
	 
        // set up BalanceJLabel
        balanceJLabel = new JLabel();
        balanceJLabel.setBounds(8, 80, 60, 23);
        balanceJLabel.setText("Balance:");
        inputDetailJPanel.add(balanceJLabel);
	 
        // set up BalanceTextField
        balanceJTextField = new JTextField();
        balanceJTextField.setBounds(112, 80, 80, 21);
        balanceJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(balanceJTextField);
	 
        // set up DepositJLabel
        depositJLabel = new JLabel();
        depositJLabel.setBounds(8, 104, 80, 23);
        depositJLabel.setText("Deposit:");
        inputDetailJPanel.add(depositJLabel);
	 
        // set up DepositJTextField
        depositJTextField = new JTextField();
        depositJTextField.setBounds(112, 104, 80, 21);
        depositJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(depositJTextField);
	 
        // set up WithdrawJLabel
        withdrawJLabel = new JLabel();
        withdrawJLabel.setBounds(8, 128, 60, 23);
        withdrawJLabel.setText("Withdraw:");
        inputDetailJPanel.add(withdrawJLabel);
 
        // set up WithdrawJTextField
        withdrawJTextField = new JTextField();
        withdrawJTextField.setBounds(112, 128, 80, 21);
        withdrawJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(withdrawJTextField);
 
        // set up CreateAccountButton
        createAccountJButton = new JButton();
        createAccountJButton.setBounds(112, 152, 80, 24);
        createAccountJButton.setText("Create");
        inputDetailJPanel.add(createAccountJButton);
        createAccountJButton.addActionListener(
	       new ActionListener() {
	          // event handler called when CreateAccountJButton
	          // is clicked
	          public void actionPerformed(ActionEvent event) {
	             createAccountJButtonActionPerformed(event);
	          }//end method actionPerformed
	        }//end ActionListener
	     ); // end call to addActionListener
	 
	     // set up DeleteAccountButton
	     deleteAccountJButton = new JButton();
	     deleteAccountJButton.setBounds(16, 152, 80, 24);
	     deleteAccountJButton.setText("Delete");
	     inputDetailJPanel.add(deleteAccountJButton);
	     deleteAccountJButton.addActionListener(
	        new ActionListener() // anonymous inner class
	        {
	           // event handler called when DeleteAccountJButton
	           // is clicked
	           public void actionPerformed(ActionEvent event) {
	              deleteAccountJButtonActionPerformed(event);
		       }//end method actionPerformed
		    }//end ActionListener
		 ); // end call to addActionListener
	 
	     // set up TransactionJButton
	     transactionJButton = new JButton();
	     transactionJButton.setBounds(16, 180, 176, 24);
	     transactionJButton.setText("Make Transaction");
	     inputDetailJPanel.add(transactionJButton);
	     transactionJButton.addActionListener(
	        new ActionListener() // anonymous inner class
	           {
	              // event handler called when TransactionJButton
	              // is clicked
	              public void actionPerformed(ActionEvent event) {
	                 transactionJButtonActionPerformed(event);
			       }//end method actionPerformed
			    }//end ActionListener
			 ); // end call to addActionListener
	 
	     // set up DisplayJButton
	     displayJButton = new JButton();
	     displayJButton.setBounds(16, 208, 176, 24);
	     displayJButton.setText("Display Accounts");
	     inputDetailJPanel.add(displayJButton);
	     displayJButton.addActionListener(
	        new ActionListener() // anonymous inner class
	        {
	           // event handler called when TransactionJButton
	           // is clicked
	           public void actionPerformed(ActionEvent event) {
	              displayJButtonActionPerformed(event);
	     	   }//end method actionPerformed
	    	}//end ActionListener
	     ); // end call to addActionListener
	        
	     // set up displayJLabel
	     displayJLabel = new JLabel();
	     displayJLabel.setBounds(240, 16, 150, 23);
	     displayJLabel.setText("Account Details:");
	     contentPane.add(displayJLabel);
	 
	     // set up displayJTextArea
	     displayJTextArea = new JTextArea();
	     JScrollPane scrollPane = new JScrollPane(displayJTextArea); 
	     scrollPane.setBounds(240,48,402,184); 
	     scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);        
	     contentPane.add(scrollPane);
	     displayJTextArea.setText("Welcome to Java Bank - There are currently no Accounts created");
	 
	     // clear other JTextFields for new data
	     nameJTextField.setText("");
	     accountNumJTextField.setText("0");
	     balanceJTextField.setText("0");
	     depositJTextField.setText("0");
	     withdrawJTextField.setText("0");
	        
	     // set properties of application's window
	     setTitle("Java Bank"); // set title bar string
	     setSize(670, 308); // set window size
	     setVisible(true); // display window
	  } // end method createUserInterface
	 
	  private void createAccountJButtonActionPerformed(ActionEvent event) {
	     // System.out.println("Create Account Button Clicked");
	        
	     displayJTextArea.setText("");
	           
	     name = "";
	    	
	     //Get Name from Text Field
	     name = nameJTextField.getText();
	    	
     	 //Get Accountnum from Text Field and convert to int unless blank then set to 0
	     if (accountNumJTextField.getText() == "0") {
	        accountNum = 0;
	     }
	     else {
	        accountNum = Integer.parseInt(accountNumJTextField.getText());
	     }//endif
	    		
	     //Get Balance from Text Field and convert to int unless blank then set to 0
	     if (balanceJTextField.getText() == "0") {
	        balance = 0;
	     }
	     else {
	        balance = Integer.parseInt(balanceJTextField.getText());
	     }//endif
	            
    	 if ((name != "") & (accountNum != 0))  {
	        //add a new account to the list using the Account constructor
	        accounts.add(new Account(name,accountNum,balance));
	        //Set a temp Account for display purposes
	        Account tempAccount = (Account)accounts.get(accounts.size()-1);
       		//Display tempAccount
       		displayJTextArea.setText(accounts.size() + " " + tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
         }
	     else {
	        displayJTextArea.setText("Both the Name field and Account Number must be completed");
	     }//endif           
	        
	     // clear other JTextFields for new data
	     nameJTextField.setText("");
	     accountNumJTextField.setText("0");
	     balanceJTextField.setText("0");
	     depositJTextField.setText("0");
	     withdrawJTextField.setText("0");            
	      
	  }//end method createAccountJButtonActionPerformed
	 
	  private void deleteAccountJButtonActionPerformed(ActionEvent event) {
	     displayJTextArea.setText("Oops this isnt coded in this version!");
	     //Name = NameJTextField.getText();
	     //System.out.println("Delete Account: " + Name);
	 
	     // Enter code to delete here
	 
	     // clear JTextFields for new data
	 
	     nameJTextField.setText(" ");
	     accountNumJTextField.setText("0");
	     balanceJTextField.setText("0");
	     depositJTextField.setText("0");
	     withdrawJTextField.setText("0");
      }//end method deleteAccountJButtonActionPerformed
	   
	  private void transactionJButtonActionPerformed(ActionEvent event) {
	     displayJTextArea.setText("");
	    	
	     if (accounts.size() == 0) {
	        displayJTextArea.setText("No Accounts currently created");
	     }else {
	        // get user input
	        int accountNum = Integer.parseInt(accountNumJTextField.getText());
	        int deposit = Integer.parseInt(depositJTextField.getText());
	        int withdraw = Integer.parseInt(withdrawJTextField.getText());
	            
	        for ( int i = 0; i < accounts.size(); i++ )
	        {
	           // get the element and set to TempAccount
	           Account tempAccount = (Account)accounts.get(i);    
	           // if account number matches and deposit field has entry then deposit in account
	           if ((tempAccount.accountNum == accountNum) && (deposit>0)) {
	              tempAccount.setBalance(tempAccount.getBalance()+ deposit);
	        	  accounts.set(i, tempAccount);
	        	  displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
       	       }//endif

	           // if account number matches and withdrawal field has entry then withdraw from account
	           if ((tempAccount.accountNum == accountNum) && (withdraw>0)) {        		
	              tempAccount.setBalance(tempAccount.getBalance()-withdraw);
	        	  accounts.set(i, tempAccount);
	        	  displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
	           }//endif 
	        }//endfor
	     }//endif
	        
	     // clear other JTextFields for new data
	     nameJTextField.setText("");
	     accountNumJTextField.setText("0");
	     balanceJTextField.setText("0");
	     depositJTextField.setText("0");
	     withdrawJTextField.setText("0");
      }//end method transactionJButtonActionPerformed
	 
	  private void displayJButtonActionPerformed(ActionEvent event) {
	     name = nameJTextField.getText();
	     displayJTextArea.setText("");
	    	
	     if (accounts.isEmpty()) {
	        displayJTextArea.setText("No Accounts currently created");
	     }else {
	        for (int i=0; i < accounts.size(); i++) { 
	    	   Account tempAccount = (Account)accounts.get(i);
	    	   displayJTextArea.append(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance()  + "\n");
	        }//endfor
	     }
	     
	     // clear other JTextFields for new data
	     nameJTextField.setText("");
	     accountNumJTextField.setText("0");
	     balanceJTextField.setText("0");
	     depositJTextField.setText("0");
	     withdrawJTextField.setText("0");
    }//end method displayJButtonActionPerformed
	           
    public static void main(String[] args) {
       // Populate arrays with the word EMPTY
	   // so we can check to see if the values are empty later
	    	    	 
	   JavaBankList application = new JavaBankList();
	   application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end method main
	 
}//end class JavaBankList