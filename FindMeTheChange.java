import java.util.Locale;
import java.util.Scanner;


public class FindMeTheChange {
/* 
 * The purpose of this program is to help cashiers to find out the change 
 * based on the Turkish liras.
 */
	public static void main(String[] args) {
		// Creates a new Scanner
		Scanner input = new Scanner(System.in);
		// To use decimal point I have to indicate which unit I used
		input.useLocale(Locale.US);
		System.out.print("Enter the billing amount : ");
		double billing = input.nextDouble();
		System.out.print("Enter the money given : ");
		double given = input.nextDouble();
		 double change = given - billing ;
		 double a = change/200 ;
		 // This operation converts double to integer
		    int newa = (int) (change/200) ;
		 if (newa <= 0) 
				System.out.println(0 + " 200" + " TL");
		 else System.out.println(newa + " 200" + " TL");

		 double change1 = change - (newa*200);
		 int newb = (int) (change1/100) ;
		    if (newb <= 0) 
		    	System.out.println(0 + " 100" + " TL");
		    else System.out.println(newb + " 100" + " TL");
		    
		    double change2 = change1 -(newb*100);
		    int newc = (int) (change2/50) ;
		    if (newc <= 0)
		    	System.out.println(0 + " 50" + " TL");
		    else  System.out.println(newc + " 50" + " TL");
		    
		    double change3 = change2 -(newc*50);
		    int newd = (int) (change3/20) ;
		    if (newd <= 0) 
		    	System.out.println(0 + " 20" + " TL");
		    else  System.out.println(newd + " 20" + " TL");
		    
		    double change4 = change3 -(newd*20);
		    int newe = (int) (change4/10) ;
		    if (newe <= 0) 
		    	System.out.println(0 + " 10" + " TL");
		    else System.out.println(newe + " 10" + " TL");
		    
		    double change5 = change4 -(newe*10);
		    int newf = (int) (change5/5) ;
		    if (newf <=0) 
		    	System.out.println(0 + " 5" + " TL");
		    else  System.out.println(newf + " 5" + " TL");
		    
		    double change6 = change5 -(newf*5);
		    int newg = (int) (change6/1) ;
		    if (newg <=0) 
		    	System.out.println(0 + " 1" + " TL");
		    else  System.out.println(newg + " 1" + " TL");
		    
		    double change7 = change6 -(newg*1);
		    int newh = (int) (change7/0.5) ;
		    if (newh <= 0) 
		    	System.out.println(0 + " 50" + " KR");
		    else System.out.println(newh + " 50" + " KR");
		    
		    double change8 = change7 -(newh*0.5);
		    int newj = (int) (change8/0.25) ;
		    if (newj <= 0) 
		    	System.out.println(0 + " 25" + " KR");
		    else   System.out.println(newj + " 25" + " KR");
		    
		    double change9 = change8 -(newj*0.25);
		    int newk = (int) (change9/0.1) ;
		    if (newk <= 0) 
		    	System.out.println(0 + " 10" + " KR");
		    else   System.out.println(newk + " 10" + " KR");
		    
		    double change10 = change9 -(newk*0.1);
		    int newl = (int) (change10/0.05) ;
		    if (newl <= 0) 
		    	System.out.println(0 + " 5" + " KR");
		    else System.out.println(newl + " 5" + " KR");
		    
		    double change11 = change10 -(newl*0.05);
		    int newm = (int) (change11/0.01) ;
		    if (newm <= 0) 
		    	System.out.println(0 + " 1" + " KR");
		    else  System.out.println(newm + " 1" + " KR");
		
		    
	}
}