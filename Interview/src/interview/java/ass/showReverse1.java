//Reverse String using Applet
package interview.java.ass;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class showReverse1 extends JApplet implements ActionListener {
 private JLabel ReverseLabel;
 private JTextField inputField;
 private JButton clickButton;
 
 public void init(){
	 ReverseLabel=new JLabel();
	 inputField=new JTextField();
	 clickButton=new JButton("Reverse");
	 
	 
	 clickButton.addActionListener(this);
 
     add(inputField,BorderLayout.NORTH);
     add(ReverseLabel,BorderLayout.CENTER);
     add(clickButton,BorderLayout.SOUTH);
     
 }
 
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==clickButton) {
		ReverseLabel.setText(ReverseStringRecusive(inputField.getText()));
	  }	
		
	}

	private String ReverseStringRecusive(String text) {
		if (text.length()>1) {
			String rev="";
			for (int i = text.length()-1;i>=0; i--) {
				rev=rev+Character.toString(text.charAt(i));
			}
			return rev;
		}
		else {
			return text;
		}
	}

}
