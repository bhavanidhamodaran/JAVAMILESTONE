import java.util.Scanner;

	import java.util.*;

public class ex14 {

	

		public static void main(String[] args) {

			Scanner s=new Scanner(System.in);

			int n,value=0;

			int[] a=new int[10];

			System.out.println("Enter the number:");

			n=s.nextInt();

			if((n/10)==0)

			{

				System.out.println("Please enter the number with atleast two or more digit");

			}

			else if(n>300)

			{

				System.out.println(n);

			}

			while( n != 0 )

		    {

		        value = value * 10;

		        value = value + n%10;

		        n = n/10;

		    }

			System.out.println("The largest number is: "+value);

		}

	}
