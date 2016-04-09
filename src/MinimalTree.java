import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MinimalTree{
    public boolean isPalindrome(String wordOrPhase){
        int head = 0;
        int tail = wordOrPhase.length() - 1;
        while (head <= tail){
            while (head < tail && !Character.isLetterOrDigit(wordOrPhase.charAt(head))){
                head++;
            }
            while (head < tail && !Character.isLetterOrDigit(wordOrPhase.charAt(tail))){
                tail--;
            }
            if (Character.toLowerCase(wordOrPhase.charAt(head)) != Character.toLowerCase(wordOrPhase.charAt(tail))){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    public static void main(String[] args){
        MinimalTree testCase = new MinimalTree();
        String test = "aab";
        System.out.print(testCase.isPalindrome(test));
    }
}