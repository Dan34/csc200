import java.util.Scanner;
public class Assignment2 {
public static int sum(int a[]) {
int l=0, sum=0;
while (l != a.length){
sum = sum + a[l];
l++; //Switches what number on the array to check
}
return sum;
}
public static int average(int a[]) {
int l=0, avg=0;
while (l != a.length) {
avg = avg + a[l];
l++;
}
avg = avg / a.length; //divides the sum by the number of numbers in the array
return avg;
}
public static void main(String[]args){
int i=0;
int[] num = new int[5]; //The array used for calculating the sum and average
Scanner keyboard = new Scanner(System.in);
while (i < num.length){
System.out.println("Enter a number.");
num[i] = keyboard.nextInt();
//The i-1 is important because the array starts at num[0] not num[1]
i++;
}
int avgF = average(num), sumF=sum(num);
//Running the calculations
System.out.println("Average: "+avgF+". Sum: "+sumF+".");
keyboard.close();
System.out.println(1/2);
System.out.println(1%2);
System.out.println(1.0/2);
System.out.println(5+7/2);
System.out.println("Beat"+' '+"Army");
System.out.println(6+13/5-35%3);
System.out.println(3.5*(5/4));
System.out.print((3.5*5)/4);
}
}
