import java.util.*;

public class stringpalindrome{
    public static boolean checkpalindrome(String str){
        for(int i=0 ; i<(str.length()/2) ; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        String name = "racecar";
        System.out.println(checkpalindrome(name));
    }





}