/** Description of Ch3dot3ex
*
*@author Dan Revay
*@version 1.0
*@return Returns the correct username and password if the correct username and password were used.
*/
import java.util.Scanner;
public class Ch3dot3ex{
public static void main (String[]args){
String[] authtoken=new String[2];
authtoken[0]="USER";
authtoken[1]="PASS";
boolean Recog1=false;
System.out.println("Input your username.");
Scanner keyboard= new Scanner(System.in);
if (keyboard.nextLine().equals(authtoken[0])) {
System.out.println("Input your password.");
/**
*The boolean is for the next if else, to see if
*the username is valid. Otherwise, it can ignore
*the password completely.
*/
Recog1 = true; 
}
else {
System.out.println("Input your password.");
Recog1 = false;
}
if ((keyboard.nextLine().equals(authtoken[1])) && (Recog1 == true)) {
System.out.printf("Welcome %s! Your password is %s.",authtoken[0],authtoken[1]);
}
else {
System.out.print("Your username or password was not recognized.");
}
keyboard.close();
}
}
