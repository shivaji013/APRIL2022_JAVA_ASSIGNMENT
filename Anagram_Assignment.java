package First_week_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Assignment {

	public static boolean isAnagram(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		else
		{
			char[] ArrayStr1=str1.toCharArray();
			char[] ArrayStr2=str2.toCharArray();
			
			Arrays.sort(ArrayStr1);
			Arrays.sort(ArrayStr2);
			return Arrays.equals(ArrayStr1, ArrayStr2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check the String are Anagram ::");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre the first String  => ");
		String str1=sc.nextLine();
		System.out.println("Entre the second String => ");
		String str2=sc.nextLine();
		
		str1.replaceAll("\\s"," ").toLowerCase();
		str2.replaceAll("\\s"," ").toLowerCase();
		
		if(isAnagram(str1,str2))
			System.out.println("String "+str1+" and "+str2 +" are Anagram  ");
		else
			System.out.println("String "+str1+ " and "+str2+" are Not Anagram ");
	}

}
