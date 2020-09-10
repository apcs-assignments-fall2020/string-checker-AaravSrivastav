import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        // REPLACE WITH YOUR CODE
        int count = 0;
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'b' || ch =='c')
            {
                count++;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        boolean bool = false;
        if(str.indexOf("the") != -1 || str.indexOf("The") != -1)
        {
            bool = true;
        }
        return bool;

    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        boolean bool = false;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(str.length()-1-i))
            {
                bool = true;
            }
            else
            {
                break;
            }
        }
        return bool;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.nextLine();
        System.out.println("Your string contains " + countABC(str) + " a's, b's, or c's");
        if(containsThe(str))
        {
            System.out.println("Your string DOES contain the");
        }
        else
        {
            System.out.println("Your string DOES NOT contain the");
        }
        if(isPalindrome(str))
        {
            System.out.println("Your string IS a palindrome");
        }
        else
        {
            System.out.println("Your string IS NOT a palindrome");
        }
    }
}
