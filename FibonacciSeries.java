package week1.day1.assignments;

public class FibonacciSeries {
/*my learnings from this code
 * add two numbers and assign the value to the sum
 * assign first number value to the second number
 * assign second number to the sum
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int range=8,firstNum = 0, secondNum = 1,sum;
      System.out.println(firstNum);
      System.out.println(secondNum);
      for(int i=1; i<range-1; i++)
      {
      sum =  firstNum + secondNum ;
      firstNum = secondNum;
      secondNum=sum;
      System.out.println(sum);
      }
    
      
	}

}
