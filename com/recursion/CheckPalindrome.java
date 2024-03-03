package com.recursion;

public class CheckPalindrome {
    static boolean palindromeWithRecursion(String value,int i, int j){
        if(i>=value.length()/2)
            return true;
        else {
            if(value.charAt(i)==value.charAt(j))
                return palindromeWithRecursion(value,i+1,j-1);
            else
                return false;
        }
    }

    public static void main(String[] args) {
        String str = "TeneT";
        if(palindromeWithRecursion(str,0,str.length()-1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
