package DataTypesandVaribales;
import java.util.*;
public class Userbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the Price of Pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of Eraiser");
        float eraser =sc.nextFloat();
        float cost = pen + pencil + eraser;
        float gst = (pen + pencil+eraser)*18/100;
        System.out.println(gst + cost);
    }
}
