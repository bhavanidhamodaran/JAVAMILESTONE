import java.util.*;

	import java.lang.*;

public class ex15 {

		public static void main(String[] args) {

			String str1,str2;	

			int[] a=new int[20];

		    char st[]=new char[20];

			char ch;

			String words;

			Scanner s1=new Scanner(System.in);

			System.out.println("Enter the String1:");

			str1=s1.nextLine();	

			Scanner s2=new Scanner(System.in);

			System.out.println("Enter the String2:");

			str2=s2.nextLine();	

			String[]word=str1.split("");

			String[]word1=str2.split("");

			for(int i=0;i<word.length;i++)		//Outer loop for Comparison		

			{

				if(word[i]!=null)

				{

				

				for(int j=i+1;j<word.length;j++)	//Inner loop for Comparison

				{

					

				if(word[i].equals(word[j]))	//Checking for both strings are equal

					{

						word[j]=null;			//Delete the duplicate words

					}

				}

				}

			}

			for(int k=0;k<word.length;k++)		//Displaying the String without duplicate words	

			{

				if(word[k]!=null)

				{

					System.out.println(word[k]);

				}

			

		}

			for(int i=0;i<word1.length;i++)		//Outer loop for Comparison		

			{

				if(word1[i]!=null)

				{

				

				for(int j=i+1;j<word1.length;j++)	//Inner loop for Comparison

				{

					

				if(word1[i].equals(word1[j]))	//Checking for both strings are equal

					{

						word1[j]=null;			//Delete the duplicate words

					}

				}

				}

			}

			for(int k=0;k<word1.length;k++)		//Displaying the String without duplicate words	

			{

				if(word1[k]!=null)

				{

					System.out.println(word1[k]);

				}

			

		}

			

		}

	}