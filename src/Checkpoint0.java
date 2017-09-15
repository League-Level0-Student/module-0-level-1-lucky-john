import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint0 {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("what is your favorite color?");
    JOptionPane.showMessageDialog(null, color+ " is also my favorite color");
  Robot draw = new Robot("mini");
  draw.setSpeed(10);
  draw.penDown();
  draw.move(100);
  draw.turn(120);
  draw.move(100);
  draw.turn(120);
  draw.move(100);
}
}
