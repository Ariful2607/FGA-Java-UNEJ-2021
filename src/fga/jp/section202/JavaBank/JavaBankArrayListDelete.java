package fga.jp.section202.JavaBank;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*; 

 
public class JavaBankArrayListDelete extends JFrame {

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
    private JButton CreateAccountJButton;
 
    // JButton to delete account
    private JButton DeleteAccountJButton;
 
    // JButton to make transaction
    private JButton TransactionJButton;
    
    // JButton to display account
    private JButton DisplayJButton;
 
    // JLabel and JTextArea to display account details
    private JLabel displayJLabel;
    private static JTextArea displayJTextArea;
    
    //  array to store Account details and an Arraylist
    ArrayList<Account> accounts = new ArrayList<Account>();
    
    //static int noAccounts = 0; 
 
    // constructor
    public JavaBankArrayListDelete() {
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
       CreateAccountJButton = new JButton();
       CreateAccountJButton.setBounds(112, 152, 80, 24);
       CreateAccountJButton.setText("Create");
       inputDetailJPanel.add(CreateAccountJButton);
       CreateAccountJButton.addActionListener(
          new ActionListener() {
             // event handler called when CreateAccountJButton
             // is clicked
             public void actionPerformed(ActionEvent event) {
                CreateAccountJButtonActionPerformed(event);
             }//end method actionPerformed
          }//end ActionListener
       ); // end call to addActionListener
 
       // set up DeleteAccountButton
       DeleteAccountJButton = new JButton();
       DeleteAccountJButton.setBounds(16, 152, 80, 24);
       DeleteAccountJButton.setText("Delete");
       inputDetailJPanel.add(DeleteAccountJButton);
       DeleteAccountJButton.addActionListener(
          new ActionListener() // anonymous inner class
          {
             // event handler called when DeleteAccountJButton
             // is clicked
             public void actionPerformed(ActionEvent event) {
                DeleteAccountJButtonActionPerformed(event);
             }//end method actionPerformed
          }//end ActionListener
       ); // end call to addActionListener
 
       // set up TransactionJButton
       TransactionJButton = new JButton();
       TransactionJButton.setBounds(16, 180, 176, 24);
       TransactionJButton.setText("Make Transaction");
       inputDetailJPanel.add(TransactionJButton);
       TransactionJButton.addActionListener(
          new ActionListener() // anonymous inner class
          {
             // event handler called when TransactionJButton
             // is clicked
             public void actionPerformed(ActionEvent event) {
                TransactionJButtonActionPerformed(event);
             }//end method actionPerformed
          }//end ActionListener
       ); // end call to addActionListener
        
       // set up DisplayJButton
       DisplayJButton = new JButton();
       DisplayJButton.setBounds(16, 208, 176, 24);
       DisplayJButton.setText("Display Accounts");
       inputDetailJPanel.add(DisplayJButton);
       DisplayJButton.addActionListener(
          new ActionListener() // anonymous inner class
          {
             // event handler called when TransactionJButton
             // is clicked
             public void actionPerformed(ActionEvent event) {
                DisplayJButtonActionPerformed(event);
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
    }// end method createUserInterface
 
    private void CreateAccountJButtonActionPerformed(ActionEvent event) {
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
    }//end method CreateAccountJButtonActionPerformed
 
    private void DeleteAccountJButtonActionPerformed(ActionEvent event) {
       if (accounts.size() == 0) {
          displayJTextArea.setText("No Accounts currently created");
       }else {
          // get user input
          int accountNum = Integer.parseInt(accountNumJTextField.getText());
     	  for ( int i = 0; i < accounts.size(); i++ )
          {
             // get the element
             Account tempAccount = (Account)accounts.get(i);                
             if ((tempAccount.accountNum == accountNum)) {
     		    accounts.remove(i);
     		    //break;
     	     }//endif
           }//endfor
       }//endif
    	
       nameJTextField.setText("");
       accountNumJTextField.setText("0");
       balanceJTextField.setText("0");
       depositJTextField.setText("0");
       withdrawJTextField.setText("0");
    }//end method DeleteAccountJButtonActionPerformed
   
	private void TransactionJButtonActionPerformed(ActionEvent event) {
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
        	    tempAccount.setBalance(tempAccount.getBalance()+deposit);
        		accounts.set(i, tempAccount);
        		displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
        		
        	 }//endif

             // if account number matches and withdrawal field has entry then withdraw from account
        	 if ((tempAccount.accountNum == accountNum) && (withdraw>0)) {        		
        	    tempAccount.setBalance(tempAccount.getBalance()- withdraw);
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
    }//end method TransactionJButtonActionPerformed
 
    private void DisplayJButtonActionPerformed(ActionEvent event) {
       name = nameJTextField.getText();
       displayJTextArea.setText("");
    	
       if (accounts.isEmpty()) {
       	  displayJTextArea.setText("No Accounts currently created");
       }else {
          for (int i=0; i < accounts.size(); i++) { 
             Account tempAccount = (Account)accounts.get(i);
    		 displayJTextArea.append(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance()  + "\n");
    	  }//endfor
       }//endif

       // clear other JTextFields for new data
       nameJTextField.setText("");
       accountNumJTextField.setText("0");
       balanceJTextField.setText("0");
       depositJTextField.setText("0");
       withdrawJTextField.setText("0");
    }//end method DisplayJButtonActionPerformed
 
    public static void main(String[] args) {
       // Populate arrays with the word EMPTY
       // so we can check to see if the values are empty later
    	    	 
       JavaBankArrayListDelete application = new JavaBankArrayListDelete();
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end method main
 
}//end class JavaBankArrayListDelete