
import java.util.ArrayList;

/**
 * This class is to make it easier to increment possible
 * combinations when brute forcing the password attack
 * 
 */
public class Base26 {
    private final ArrayList<Integer> digit;
    private int length;
    
    /**
     * Initializes the base 26 number as 0
     */
    public Base26(){
        digit = new ArrayList<>();
        digit.add(0);
        length = 1;
        
    }
    /**
     * increments the base 26 number by 1
     * it automatically increments the next digit by 1
     * when the previous digit reaches 26
     */
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
    
    /**
     * Returns the integer array representation of the base 26 digits
     * @return the digits as an array
     */
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
