package week1.day1.assignments;

public class Factorial {
/*my learning from this code
 * initialize i equal to one and if the input is less than i then increment the value of i
 * multiply the factorial value to i
 * 
 */
	public static void main(String[] args) {
		int input=5,fact=1;
		for(int i=1;i<=input;i++) {
			fact=fact*i;
			
		}
System.out.println(fact);
	}

}
