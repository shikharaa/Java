package com.shikhara.EH;

import java.io.IOException;

public class JavaTuto
{  
     
    public static void main(String args[])  
    {  
        
        try {  
        	
        	 
    
              
            try {  
    
               
                try {  
                	int arr[] = { 1, 2, 3, 4 };  
              	  
                    
                    System.out.println(arr[10]);  
                	
                }  
    
                
                catch (ArithmeticException e) {  
                    System.out.println("Arithmetic exception");  
                    System.out.println(" inner try block 2");  
                }  
            }  
    
              
            catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
            }  
        }
        
        catch (NullPointerException e4) { 
        	System.out.println(" outer (main) try block");  
            System.out.print(e4);  
            
        }     
        
        catch (ArrayIndexOutOfBoundsException e5) { 
        	System.out.println(" outer (main) try block");  
            System.out.print(e5);  
            
        }   
        
    }  
}  