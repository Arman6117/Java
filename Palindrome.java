import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) 
    {
        int no =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
      no = in.nextInt();

      Check obj = new Check();
      boolean p =  p = obj.isPalindrome(no);

      System.out.println(p ? no + " is a palindrome number" : no +" is not a palidrome number");
    }
}

class Check
{
    public boolean isPalindrome(int x)
    {
        int n = x;
        int rev = 0;
        while(x != 0)
        {
            rev = rev *10+ x % 10;
            x = x / 10;
            
        }

        if(rev==n && n>= 0)
        {
            return true;
        }
        else if(n<= 0)
        {
            return false;
        }
        else 
        {
            return false;
        }
    }
}
