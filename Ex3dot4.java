import javax.swing.JOptionPane;
public class Ex3dot4 {
public static void main(String[]args){
int groupsiz = 0;
String numPeop = JOptionPane.showInputDialog(null,"Enter number of People.",JOptionPane.INFORMATION_MESSAGE);
int peop = Integer.parseInt(numPeop);
if (peop >= 10){
groupsiz = peop/2;
} else if (peop > 3) {
groupsiz = peop/3;
} else {
JOptionPane.showMessageDialog(null,"The number must be at least 3.","Default",JOptionPane.INFORMATION_MESSAGE);
}
JOptionPane.showMessageDialog(null,"The number of people you input was "+numPeop+". The number of people in a group was "+groupsiz+".","Default",JOptionPane.INFORMATION_MESSAGE);
String numPlay = JOptionPane.showInputDialog(null,"Enter the number of players.","Default",JOptionPane.INFORMATION_MESSAGE);
int play = Integer.parseInt(numPlay);
int team = 0;
if (play > 11){
if (play < 55){
team = play/11;
} else {
team = 1;
}
} else {
team = 1;
}
JOptionPane.showMessageDialog(null,"The number of players was "+play+". The size of the team was "+team+".","Default",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
}
}
