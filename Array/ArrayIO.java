package Array;

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Math Marks:");
        numbers[0] = sc.nextInt();
        System.out.println("Enter the physics Marks:");
        numbers[1] = sc.nextInt();
        System.out.println("Enter the English Marks:");
        numbers[2] = sc.nextInt();
        System.out.println("Math Marks is "+ numbers[0]);
        System.out.println("Physics Marks is "+ numbers[1]);
        System.out.println("English Marks is "+ numbers[2]);
        numbers[2] = 98;
        numbers[2] = numbers[2] -1;
        System.out.println("Eng marks is "+numbers[2]);

        //calculate the percentage of marks
        int percentage = (numbers[0] + numbers[1] + numbers[2])/3;
        System.out.println("Pencetage = " + percentage+"%");
        //Calculate the length of Array
        System.out.println(numbers.length);
    }
}
