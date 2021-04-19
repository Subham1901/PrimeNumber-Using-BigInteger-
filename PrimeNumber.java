@Author Subham_Prasad
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        BigInteger b=new BigInteger(s);
        System.out.println(b.isProbablePrime(1)?"prime":"not prime");  
}
}
