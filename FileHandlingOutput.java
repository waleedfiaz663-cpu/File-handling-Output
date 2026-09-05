
package file.handling.output;

import java.io.*;

public class FileHandlingOutput {

   
    public static void main(String[] args) {
        
       
        try{
            
        
        FileOutputStream fos = new FileOutputStream("C:/Users/Administrator/OneDrive/Desktop/Sample.txt");
        
        String i="My name is Waleed";
        
        byte B[]=i.getBytes();
        
        fos.write(B);
        
        System.out.println(B);
        
        fos.close();
        
        }
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
            
        }
        
    }
    
}
   
    

