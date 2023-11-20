import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the given number");
           int num = sc.nextInt();
           int temp = num;
           int rev=0;
           int rem;
           while(num!=0) {
        	   rem = num%10;
        	   rev = rev +rem*rem*rem;
        	   num = num/10;
        	   
           }
          
           if(temp==rev) {
        	   System.out.println(temp +" "+ "number is armstrong");
           }
           else {
        	   System.out.println(temp+" " +"number is not a armstrong");
           }

	}

}
