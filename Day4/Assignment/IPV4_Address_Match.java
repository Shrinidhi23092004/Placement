import java.util.Scanner;
import java.util.regex.Pattern;
class IPV4_Address_Match
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String Address;
        System.out.println("Enter the Ipv4 address:");
        Address=sc.nextLine();
        String patternforAddress="^[0-255]{0,3}+\\.[0-255]{0,3}+\\.[0-255]{0,3}+\\.[0-255]{0,3}";
        System.out.println("Is Ipv4 pattern valid:"+Pattern.matches(patternforAddress,Address));
        sc.close();
    }
}