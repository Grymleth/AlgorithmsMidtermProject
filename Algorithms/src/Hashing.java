import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Static class used for hashing passwords
 */
public class Hashing {
    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";            // the alphabet that the bruteforce algo is based on
    static final int N = ALPHABET.length();                                 // size of the alphabet
    
    /**
     * returns the MD5 hash of a the string 
     * @param input the plain text string
     * @return the MD5 hash of the input
     * @throws RuntimeException 
     */
    public static String getMd5(String input) throws RuntimeException{
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.toUpperCase().getBytes());
            
            BigInteger no = new BigInteger(1, messageDigest);
            
            String hashtext = no.toString(16);
            while(hashtext.length() < 32){
                hashtext = "0" + hashtext;
            }   
            return hashtext;
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns the MD5 hash of a char array
     * @param input the plain text char array
     * @return the MD5 hash of the input
     * @throws RuntimeException 
     */
    public static String getMd5(char[] input) throws RuntimeException{
        try{
            StringBuilder plainText = new StringBuilder("");
            
            for(int i=0;i<input.length;i++){
                plainText.append(input[i]);
            }
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(plainText.toString().toUpperCase().getBytes());
            
            BigInteger no = new BigInteger(1, messageDigest);
            
            String hashtext = no.toString(16);
            while(hashtext.length() < 32){
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finds and returns the plain text of the MD5 hash string
     * @param md5 the MD5 hash
     * @return the equivalent plain text string
     */
    public static String getPlain(String md5){
        String bruteforce;
        
        int[] array;
        StringBuilder permute = new StringBuilder(" ");
        Base26 num = new Base26();
        do{
            
            array = num.toIntArray();
            for (int i = 0; i < array.length; i++) {
                permute.setCharAt(i, ALPHABET.charAt(array[i]));
            }
            bruteforce = getMd5(permute.toString());
            System.out.println(permute+"\t"+bruteforce);
            num.increment();
            
            if(num.length() > permute.length()){
                permute.append(" ");
            }
        }
        while(!bruteforce.equals(md5));
        
        return permute.toString();
    }
}
