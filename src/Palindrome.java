import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the given number");
		int num = sc.nextInt();
		int temp = num;
		int rem ;
		int rev = 0;
	    while(num!=0) {
	    	rem = num%10;
	    	rev = rev *10 + rem;
	    	num= num/10;
	    	
	    	
	    }
	    System.out.println(rev);
	    if(temp==rev) {
	    	System.out.println(temp + "is a palindrome");
	    }else {
	    	System.out.println(temp + " "+"is not a palindrome");
	    }

	}

}
