package Basics.Job;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting 
{
    public static void main(String args[])
    {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("John");
        arraylist.add("Kartik");
        arraylist.add("Amir");
        arraylist.add("Zahid");
        arraylist.add("Rambo");
       
        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for(String str: arraylist)
         {
             System.out.println(str);
         }
 
        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());
 
        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(String str: arraylist)
         {
             System.out.println(str);
         }
    }         
}
