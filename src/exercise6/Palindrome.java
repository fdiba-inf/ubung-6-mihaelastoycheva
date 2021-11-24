package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number2 = number;
        int first = number;
        int counter = 0;

        while (number != 0){
          number = number / 10;
          counter++;
        }

        int arr [] = new int [counter];

        for (int i = 0; i < counter; i++){
          arr [i] = number2 % 10;
          number2 = number2 / 10;
        }

        int last = 0;

        for (int i = 0; i < counter; i++){
          last = last * 10;
          last = last + arr[i];
        }

        if (last == first){
          System.out.println("Palindrome: true");
        } else {
          System.out.println("Palindrome: false");
        }

    }
}
