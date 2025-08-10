import java.util.*;


public class stringsbasic{
    public static  void printLetters(String str){
    for(int i=0 ; i<str.length() ; i++){
        System.out.print(str.charAt(i));
    }

}
 
    public static void main(String[] args) {
        
    
    String str = "abcde";
    printLetters(str);
    String str2 = new String("xyz");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);

    }
}