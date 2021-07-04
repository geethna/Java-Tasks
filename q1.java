import java.util.*;  
public class Shape{

    int length;
    int width;
    
    public Shape(int l, int w){
        length = l;
        width = w;
    }
    public boolean isSquare(){
        if(this.length == this.width){
            return true;
        }
        else{
            throw new RuntimeException("Not a Square");
        }
    }
    
     public static void main(String []args){
        Shape sq = new Shape(12,13);
        sq.isSquare();
     }
}