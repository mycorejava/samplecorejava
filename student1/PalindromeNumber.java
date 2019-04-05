import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int r;
        int temp,sum=0;

        temp = num;
        while(num >0)
        {
            r = num%10;
            sum = (sum*10)+r;
            num=num/10;
        }



        if(temp==sum)
        {
            System.out.println("it is a palindrome number");
        }
        else
        {
            System.out.println("it is not a palindrome number");
        }
    }
}
