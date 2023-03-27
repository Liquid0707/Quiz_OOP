package QuizOOP.Quiz1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder();

        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan Nilai Radius cylinder1: ");
        double Radius1 = a.nextDouble();
        cylinder1.setRadius(Radius1);

        System.out.println("Masukkan Nilai Radius cylinder2: ");
        double Radius2 = a.nextDouble();
        cylinder2.setRadius(Radius2);
        System.out.println("Masukkan Nilai Height cylinder2: ");
        double Height2 = a.nextDouble();
        cylinder2.setHeight(Height2);

        System.out.println("Cylinder: ");
        System.out.println("Radius: "+ cylinder.getRadius());
        System.out.println("Height: "+ cylinder.getHeight());
        System.out.println("Volume: "+ cylinder.getVolume());
        System.out.println(cylinder.toString());
        System.out.println();

        System.out.println("Cylinder1: ");
        System.out.println("Radius: "+ cylinder1.getRadius());
        System.out.println("Height: "+ cylinder1.getHeight());
        System.out.println("Volume: "+ cylinder1.getVolume());
        System.out.println(cylinder1.toString());
        System.out.println();

        System.out.println("Cylinder2: ");
        System.out.println("Radius: "+ cylinder2.getRadius());
        System.out.println("Height: "+ cylinder2.getHeight());
        System.out.println("Volume: "+ cylinder2.getVolume());
        System.out.println(cylinder2.toString());
        System.out.println();
    }
}
