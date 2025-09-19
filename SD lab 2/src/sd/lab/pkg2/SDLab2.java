/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd.lab.pkg2;

/**
 *
 * @author HP
 */
import java.util.*;
public class SDLab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print "Hello, World!"
        System.out.println("Hello, World!");

        // 2. Take user's name and greet them
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // 3. Check if a number is even or odd
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        // 4. Find the maximum of 3 numbers
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        System.out.println("Maximum = " + max);

        // 5. Simple Calculator
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.print("Choose operation (+ - * /): ");
        char op = sc.next().charAt(0);
        if(op == '+') System.out.println("Result = " + (x+y));
        else if(op == '-') System.out.println("Result = " + (x-y));
        else if(op == '*') System.out.println("Result = " + (x*y));
        else if(op == '/') {
            if(y != 0) System.out.println("Result = " + (x/y));
            else System.out.println("Division by zero not allowed");
        } else System.out.println("Invalid operator");

        // 6. Print numbers from 1 to N
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 7. Print multiplication table of a number
        System.out.print("Enter number for table: ");
        int t = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(t + " x " + i + " = " + (t*i));
        }

        // 8. Calculate factorial of a number
        System.out.print("Enter number for factorial: ");
        int f = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=f; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);

        // 9. Sum of all numbers from 1 to N
        System.out.print("Enter N for sum: ");
        int sN = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=sN; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
