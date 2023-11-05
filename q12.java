// Find non-repeating characters in a string

import java.util.*;

class q12
{
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the string");

        String str = sc.next ();	//Taking input as a string from the user
        int freq[] = new int[256];

        //Calculating frequency of each character
        for (int i = 0; i < str.length (); i++)
            freq[str.charAt (i)]++;

        System.out.println ("The non repeating characters are : ");

        for (int i = 0; i < 256; i++)
            if (freq[i] == 1)	//finding the character whose frequency is 1
	            System.out.print ((char) i + " ");
        sc.close();
    } 
}