import java.util.Scanner;

public class NumToWord 
{
	//String array for word representation of 1 to 19 integer values
	 static String onePlace[] = { "", "One ", "Two ", "Three ", "Four ", 
                 "Five ", "Six ", "Seven ", "Eight ", 
                 "Nine ", "Ten ", "Eleven ", "Twelve ", 
                 "Thirteen ", "Fourteen ", "Fifteen ", 
                 "Sixteen ", "Seventeen ", "Eighteen ", 
                 "Nineteen " }; 
	 
	//String array for word representation of 20,30,40,50,60,70,80,90  integer values
	  static String tensPlace[] = { "", "", "Twenty ", "Thirty ", "Forty ", 
                                    "Fifty ", "Sixty ", "Seventy ", "Eighty ", 
                                    "Ninety " }; 
	  
	// function for n is 1 or 2-digit number 
	  static String numToWords(int n)
	  {
		  String str= "";
		// if n is more than 19, divide it 
		  if (n<20) {
			  str= str+ onePlace[n];
		  }
		  else if (n>=20 && n<100) {
			str= str+ tensPlace[n/10] + onePlace[n%10] ;
		  }
			  
		  return str;
		  
	  }
	  
	  // Function to print a given number in words 
	  static String convertToWords(int n) 
	  {
		  // stores word representation of given number n 
		  String out="";
		  
		  //for numbers upto 99
		  if(n<100) {
			out= numToWords(n);
		  }

	        // handles digit at hundreds places (for hundred) 
		  else if(n>=100 && n<1000) {
			 out= numToWords(n/100) + "Hundred " + convertToWords(n%100);
		  }
		  
		  // handles digits at thousands and tens thousands places (for thosands) 
		    else if(n>=1000 && n<100000) {
				 out= numToWords(n/1000) + "Thousand " + convertToWords(n%1000);
			  }
		  
		  // handles digits at hundred thousands and one millions places (for Lakh) 
		  else if(n>=100000 && n<10000000) {
				 out= numToWords(n/100000) + "Lakh " + convertToWords(n%100000);
			  }
		  
		 
		  return out;
	  }
	  public static void main(String[] args) 
	  {
		  //Accepting input from user
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number for conversion");
            double n=sc.nextDouble();


            if(n>=1000000)
            {
                System.out.println("No. exceed maximum value..terminating");
                return;
            }

            if(n<0)
            {
                System.out.println("No. is less than minimum value..terminating");
                return;
            }
        
            int intN=(int)n;
            int n1=(int)(n*100);
            String extra="";
            int f = (n1-intN*100);
            if(f > 0){
                 extra+=String.valueOf(f)+"/100 ";
            }

		  //Print Word representation of given number n
		   System.out.printf("Rs."+convertToWords(intN)+extra+"ONLY"); 
           return;
	  }
}
