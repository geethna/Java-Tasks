import java.util.*;  

class NullStringException extends Exception{  
    NullStringException(String s){  
    super(s);  
    }
}

public class Shape{

    public static void method1() throws NullStringException{
    try{
        method2();
    }
    catch(NullPointerException m)
        {
            throw new NullStringException(m.toString());
        }
        
    }
    
    public static void method2(){
        String t = null;
            if (t.equals("t")){
                System.out.print("They are the same");
            }
            
            else{
                throw new NullPointerException("Null value found");
            }
                
    }
    
     public static void main(String []args){
        try{  
        method1();  
        }
        
        catch(Exception m)
        {
            System.out.println("Exception occured: " + m);
        }  
     }
}