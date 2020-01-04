package com.deloitte;

import java.util.ArrayList;
import java.util.Scanner;


public class Exam {

	public static void main(String[] args) {
		 
try {	
	
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter id,name,showdate,showtime,status");
		 int   id=sc.nextInt();
		 String name=sc.next();
		 String  showdate=sc.next();
	     String  showtime=sc.next();
	     String  status=sc.next();
		      
	     Movie m=new Movie(id,name,showdate,showtime,status);
	 
		 ArrayList< Movie>list = new ArrayList<Movie>();	 
		 list.add(m);
	 
		 System.out.println("Enter id");
		 int w=sc.nextInt();
		 if(w==id)
		 {
		 	 		    
		   int size = list.size();
	       for(int i=0;i<size;i++)
	        {
	            System.out.println(list.get(i));
	        }
		 }
	 
		 else
		 {
			 System.out.println("wrong id");
		 }
         
	  
 		 
	        sc.close();	 
		}
	catch(Exception e)
		{
			System.out.println(e+"error");	
		}

	}

}
 

