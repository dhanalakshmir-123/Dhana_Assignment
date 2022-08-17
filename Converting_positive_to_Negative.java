package week1.day1;

public class Converting_positive_to_Negative {

	 public static void main(String[] args) throws java.lang.Exception {
	      int positiveVal = 100;
	      int negativeVal = (~(positiveVal - 1));
	      System.out.println("Result: Positive value converted to Negative = "+negativeVal);
	      positiveVal = ~(negativeVal - 1);
	      System.out.println("Actual Positive Value = "+positiveVal);
	      negativeVal = -200;
	      System.out.println("Actual Negative Value = "+negativeVal);
	      positiveVal = ~(negativeVal - 1);
	      System.out.println("Result: Negative value converted to Positive = "+positiveVal);
	   }
	
}
