package Lab02;

import javax.swing.JOptionPane;

public class bai51 {
	public static void main(String args[]) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticker?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: " +
		(option == JOptionPane.YES_OPTION?"Yes" : "No"));
		System.exit(0);
	}
}
