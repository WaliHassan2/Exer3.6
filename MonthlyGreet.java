/**
 * 
 * @author walihassan
 *
 */
import javax.swing.JOptionPane;

public class MonthlyGreet {
/**
 * 
 * @param args
 */
	public enum Month {December,January,February,March,April,May,June,July,August,September,October,November}
	public static void main(String[] args) {
		Month [] choices = {Month.December,Month.January,Month.February,Month.March,Month.April,Month.May,Month.June,Month.July,Month.August,Month.September,Month.October,Month.November};
		
		Month select = (Month)JOptionPane.showInputDialog(null, "Choose a month below", "Monthly Greetings", JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);
		
		
			while(select!=null){
			switch (select){
			
			case December:	
				JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
				break;
			case January:
				JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
				break;
			case February:
				JOptionPane.showMessageDialog(null,"Do you want to build a snowman?");
				break;
			case March:
				JOptionPane.showMessageDialog(null,"Happy Spring days!");
				break;
			case April:
				JOptionPane.showMessageDialog(null,"Happy Spring days!");
				break;
			case May:
				JOptionPane.showMessageDialog(null,"Happy Spring days!");
				break;
			case June:
				JOptionPane.showMessageDialog(null,"It’s a summer time.");
				break;
			case July:
				JOptionPane.showMessageDialog(null,"It’s a summer time.");
				break;
			case August:
				JOptionPane.showMessageDialog(null,"It’s a summer time.");
				break;
			case September:
				JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
			case October:
				JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
				break;
			case November:
				JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
				break;
			
			}	
			
			select = (Month) JOptionPane.showInputDialog(null, "Choose a month below", "Monthly Greetings",JOptionPane.QUESTION_MESSAGE, null, choices, choices[11]);
		}
		
		
		
	}

}
