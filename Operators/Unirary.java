package Operators;

public class Unirary {
    public static void main(String[] args) {
        // int a = 10;
        // // int b = ++a; // pre increment 
        // int c = a++;
        // // System.out.println(a);
        // // System.out.println(b);
        // System.out.println(a);
        // System.out.println(c);
        // int a = 10;
        // int b = --a;
        // int c  = a--;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        //Relational operators
        // int a= 10;
        // int b=12;
        // System.out.println(a==b);
        // System.out.println(a != b);
        // System.out.println(a > b);
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);
        

        //Logical operators
        //Logical and
        System.out.println((3>2) && (5>0));
        System.out.println((3>2) && (5< 0));
        //Logical or 
        System.out.println((3>2) || (4>3));
        System.out.println((1>2) || (4>5));

        //Logical not
        System.out.println(!(4>2));
    }
}
