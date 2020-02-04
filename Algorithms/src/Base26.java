
import java.util.ArrayList;


public class Base26 {
    private final ArrayList<Integer> digit;
    private int length;
    
    public Base26(){
        digit = new ArrayList<>();
        digit.add(0);
        length = 1;
        
    }
    
    public void increment(){
        digit.set(0, digit.get(0) + 1);
        
        for(int i=0;i<length;i++){
            if(digit.get(i) == 26){
                digit.set(i, 0);
                if(i == length - 1){
                    digit.add(0);
                    length++;
                    break;
                }
                else{
                    digit.set(i+1, digit.get(i+1)+1);
                }
            }
        }
    }
    
    public void print(){
        for(int i=length-1;i>=0;i--){
            System.out.print(digit.get(i)+",");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Base26 num = new Base26();
        
        for(int i=0;i<256;i++){
            
            num.print();
            num.increment();
        }      
    }
    
    public int[] toIntArray(){
        int[] array = new int[length];
        
        int i=0;
        int j=length-1;
        
        while(i < length){
            array[i] = digit.get(j);
            i++;
            j--;
        }
        
        return array;
    }
    
    public int length(){
        return length;
    }
    
}
