import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password = "JLP";
		String guess ;
		String code = JOptionPane.showInputDialog("To see the secret message type the code");
	guess=JOptionPane.showInputDialog("what is the secret code");
	
	if(guess.equalsIgnoreCase(password)){
		
		JOptionPane.showMessageDialog(null, "the password is JLP");
		}
	else{
		JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}
	
	}

}
