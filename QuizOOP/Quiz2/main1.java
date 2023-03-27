package QuizOOP.Quiz2;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Person person = new Person("Adi","Jogja");
        Student student = new Student("Beni","Bali","Sarjana",2022,0);
        Staff staff = new Staff("Anto", "Banten", "UGM",10000000);

        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan Nilai Address Person: ");
        String AddressPerson = a.nextLine();
        person.setAddress(AddressPerson);

        System.out.println("Masukkan Nilai Address Student: ");
        String AddressStudent = a.nextLine();
        student.setAddress(AddressStudent);
        System.out.println("Masukkan Nilai Program Student: ");
        String ProgramStudent = a.nextLine();
        student.setProgram(ProgramStudent);
        System.out.println("Masukkan Nilai Year Student: ");
        int YearStudent = a.nextInt();
        student.setYear(YearStudent);
        System.out.println("Masukkan Nilai Fee Student: ");
        double FeeStudent = a.nextDouble();
        student.setFee(FeeStudent);

        System.out.println("Masukkan Nilai School Staff: ");
        String SchoolStaff = a.nextLine();
        staff.setSchool(SchoolStaff);
        System.out.println("Masukkan Nilai Pay Staff: ");
        double PayStaff = a.nextDouble();
        staff.setPay(PayStaff);

        System.out.println("Person: ");
        System.out.println("Name: "+ person.getName());
        System.out.println("Address: "+ person.getAddress());

        System.out.println("Student: ");
        System.out.println("Name: "+ student.getName());
        System.out.println("Address: "+ student.getAddress());
        System.out.println("Program: "+ student.getProgram());
        System.out.println("Year: "+ student.getYear());
        System.out.println("Fee: "+ student.getFee());

        System.out.println("Staff: ");
        System.out.println("Name: "+ staff.getName());
        System.out.println("Address: "+ staff.getAddress());
        System.out.println("School: "+ staff.getSchool());
        System.out.println("Pay: "+ staff.getPay());
    }
}
