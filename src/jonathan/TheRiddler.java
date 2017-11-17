package jonathan;
import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
int score=0;

String riddle= JOptionPane.showInputDialog("what is black and white and asian?");
String answer ="panda";
 
 if(riddle.equals("panda")){
	 
	 JOptionPane.showMessageDialog(null, "Correct!");
	 score=score+1;
	 JOptionPane.showMessageDialog(null, "thats a point");
	 
 }
 else{JOptionPane.showMessageDialog(null, "WRONG!!!!!!!!!!!!!!!");}

	
	  
	

 
 String moreriddles = JOptionPane.showInputDialog("what is black and white and read all over?");
 String  answers="newspaper";
  score=score+1; 
  if(moreriddles.equals("newspaper")){
 	 
 	 JOptionPane.showMessageDialog(null, "Correct!");
 	 
 	 JOptionPane.showMessageDialog(null, "thats another point");
 	 
  }
  else{JOptionPane.showMessageDialog(null, "WRONG!!!!!!!!!!!!!!!");}

 JOptionPane.showMessageDialog(null,"You scored congratulations!"+score);
	
 	 

}
}
