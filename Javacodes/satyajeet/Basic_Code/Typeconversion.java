import java.io.*;
import java.util.*;
import java.lang.*;

public class Typeconversion {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int val=scan.nextInt();
                System.out.println("before conversion:- " +val);

        char ch= (char)val;
        System.out.println("after conversion:- "+ch);
       
    }
}