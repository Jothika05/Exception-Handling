package Exceptoin_handling;

import java.io.*;

public class exception3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub 
		try {
			 throw new IOException("hiii");
		}
		catch(Exception e){
			 System.out.println("Exception message:"+e.getMessage());	
		}
    
     System.out.println("After Exception");
     
	}

}
