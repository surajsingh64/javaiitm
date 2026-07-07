import java.util.*;

class evenDisplay {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        evenDisplay(s1);
    }

    //Define evenDisplay(String) method here
    static void evenDisplay(String s1){
        for(int i=0 ; i<s1.length();i+=2)
            System.out.println(s1.charAt(i));
    }
}