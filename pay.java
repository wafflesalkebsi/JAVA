# JAVA
# First Java code
import javax.swing.JOptionPane; 
public class javapay
{
	public static void main (String[]args)
	{ double pay= 0;
	String name=""; 
	int hours =0; 
	double payrate=0;
	name=JOptionPane.showInputDialog("Enter your Name");
	hours=Integer.parseInt(JOptionPane.showInputDialog("Enter Number of hours"));
	payrate=Double.parseDouble(JOptionPane.showInputDialog ("Enter the Pay Rate"));
	pay= hours *payrate; 
	System.out.println( name + " is paid " + pay );
	}
}
