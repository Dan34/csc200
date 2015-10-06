import javax.swing.JOptionPane;
public class input {
public enum Month {January, Feburary, March, April, May, June, July, August, September, October, November, December}
public static void main(String[]args){
Month[] choices = {Month.January, Month.Feburary, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
Month input = (Month) JOptionPane.showInputDialog(null, "Select the month.", "Months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
int out = 0;
String[] output = {"Do you want to build a snowman?", "Happy Spring days!", "It's summer time.", "Welcome to the foliage season."};
switch (input) {
case January: out = 0;
break;
case Feburary: out = 0;
break;
case March: out = 1;
break;
case April: out = 1;
break;
case May: out = 1;
break;
case June: out = 2;
break;
case July: out = 2;
break;
case August: out = 2;
break;
case September: out = 3;
break;
case October: out = 3;
break;
case November: out = 3;
break;
case December: out = 0;
break;
default: break;
}
JOptionPane.showMessageDialog(null,output[out],"Out",out);
while (input != null){
input=(Month) JOptionPane.showInputDialog(null, "Select the month.", "Months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
switch (input) {
case January: out = 0;
break;
case Feburary: out = 0;
break;
case March: out = 1;
break;
case April: out = 1;
break;
case May: out = 1;
break;
case June: out = 2;
break;
case July: out = 2;
break;
case August: out = 2;
break;
case September: out = 3;
break;
case October: out = 3;
break;
case November: out = 3;
break;
case December: out = 0;
break;
}
JOptionPane.showMessageDialog(null,output[out],"Out",out);
}
}
}
