import java.util.Scanner;
public class rectangle {
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a width.");
		int wid = keyboard.nextInt();
		System.out.println("Enter a length.");
		int leng = keyboard.nextInt();
		int area = wid*leng;
		int perim = 2*wid + 2*leng;
		System.out.print("The area of the rectangle is "+area+", and the perimeter of the rectangle is "+perim+".");
		keyboard.close();
	}
}