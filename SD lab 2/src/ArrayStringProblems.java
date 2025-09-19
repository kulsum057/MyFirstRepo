/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;
public class ArrayStringProblems {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Store and print 5 numbers in an array
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5; i++) arr[i] = sc.nextInt();
        System.out.print("Numbers are: ");
        for(int i=0; i<5; i++) System.out.print(arr[i] + " ");
        System.out.println();

        // 2. Find the largest number in an array
        int max = arr[0];
        for(int i=1; i<5; i++) if(arr[i] > max) max = arr[i];
        System.out.println("Largest = " + max);

        // 3. Find the smallest number in an array
        int min = arr[0];
        for(int i=1; i<5; i++) if(arr[i] < min) min = arr[i];
        System.out.println("Smallest = " + min);

        // 4. Calculate the average of an array
        int sum = 0;
        for(int i=0; i<5; i++) sum += arr[i];
        System.out.println("Average = " + (sum/5.0));

        // 5. Count even and odd numbers in an array
        int even = 0, odd = 0;
        for(int i=0; i<5; i++) {
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count = " + even + ", Odd count = " + odd);

        // 6. Search for an element in an array
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0; i<5; i++) {
            if(arr[i] == key) {
                found = true;
                break;
            }
        }
        if(found) System.out.println(key + " Found");
        else System.out.println(key + " Not Found");

        // 7. Sort an array (Ascending Order)
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for(int x : arr) System.out.print(x + " ");
        System.out.println();

        // 8. Check if a string is palindrome
        sc.nextLine(); // clear buffer
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        // 9. Count vowels and consonants in a string
        int vowels=0, consonants=0;
        str = str.toLowerCase();
        for(char ch : str.toCharArray()) {
            if("aeiou".indexOf(ch) != -1) vowels++;
            else if(ch >= 'a' && ch <= 'z') consonants++;
        }
        System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);

        // 10. Convert a string to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}

