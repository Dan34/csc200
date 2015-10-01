import javax.swing.JOptionPane;
public class Ex3dot5 {
public static void main(String[]args){
	String auth = JOptionPane.showInputDialog(null,"Enter your role.");
	int put=0;
	switch (auth){
		case "Administrator": put=0;
		break;
		case "Faculty": put=0;
		break;
		case "Staff": put=0;
		break;
		case "Student": put=0;
		break;
		case "Guest": put=0;
		break;
		default: put = 1;	
		break;
	}
	if (put==0){
			JOptionPane.showMessageDialog(null,"Welcome, "+auth+".");
	} else {
			JOptionPane.showMessageDialog(null,"Role not recognized.");
	}
}
}
