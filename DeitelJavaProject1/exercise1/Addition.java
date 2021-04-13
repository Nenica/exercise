import javax.swing.*;

public class Addition {
	public static void main (String args[]){
		String firstNum;
		String secondNum;
		
		int num1;
		int num2;
		int sum;
		
		firstNum = JOptionPane.showInputDialog("enter fist int");
		secondNum = JOptionPane.showInputDialog("enter second int");
		
		num1 = Integer.parseInt(firstNum);
		num2 = Integer.parseInt(secondNum);
		
		sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "the sum is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}

}
