package com.binary_search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int low = 0, high = 100, middle = -1;
        String answer = "n";
        Scanner sc = new Scanner(System.in);
        int steps=0;
        while(!answer.equals("y")){
            steps++;
            middle = (low + high)/2;
            System.out.print("Is this your guess? "+ middle +" ");
            answer = sc.next();
            if(!answer.equals("y")){
                System.out.print("higher or lower? (h/l) ");
                String temp = sc.next();
                if(temp.equals("h")){
                    low = middle + 1;
                }
                else if(temp.equals("l")){
                    high = middle - 1;
                }
            }
        }
        System.out.println("Your guess was "+ middle + " and it took " + steps + " tries");
    }
}
