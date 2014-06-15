import javax.swing.*;

import java.awt.*;

public class MultiLagi
{
public static void main(String[]args)
{
 //Create a panel that will be use to put
 //one JTextField, one JPasswordField and two JLabel
 JPanel panel=new JPanel();

 //Set JPanel layout using GridLayout
 panel.setLayout(new GridLayout(4,1));

 //Create a label with text (Username)
 JLabel username=new JLabel("Username");

 //Create a label with text (Password)
 JLabel password=new JLabel("Password");

 //Create text field that will use to enter username
 JTextField textField=new JTextField(12);

 //Create password field that will be use to enter password
 JPasswordField passwordField=new JPasswordField(12);

 //Add label with text (username) into created panel
 panel.add(username);

 //Add text field into created panel
 panel.add(textField);

 //Add label with text (password) into created panel
 panel.add(password);

 //Add password field into created panel
 panel.add(passwordField);

 //Create a window using JFrame with title ( Two text component in JOptionPane )
 JFrame frame=new JFrame("Two text component in JOptionPane");

 //Set default close operation for JFrame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //Set JFrame size
 frame.setSize(300,300);

 //Set JFrame locate at center
 frame.setLocationRelativeTo(null);

 //Make JFrame visible
 frame.setVisible(true);

 //Show JOptionPane that will ask user for username and password
 int a=JOptionPane.showConfirmDialog(frame,panel,"Put username and password",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

 //Operation that will do when user click 'OK'
 if(a==JOptionPane.OK_OPTION)
 {
  if(textField.getText().equals("admin")&&new String(passwordField.getPassword()).equals("007"))
  {
   JOptionPane.showMessageDialog(frame,"You are James Bond","Correct",JOptionPane.INFORMATION_MESSAGE);
  }
  else
  {
   JOptionPane.showMessageDialog(frame,"You are not James Bond","False",JOptionPane.ERROR_MESSAGE);
  }
 }

 //Operation that will do when user click 'Cancel'
 else if(a==JOptionPane.CANCEL_OPTION)
 {
  JOptionPane.showMessageDialog(frame,"You pressed Cancel button");
 }
}
}
