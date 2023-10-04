import java.util.Scanner;

//Studenttest.java
public class Studenttest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String name = scanner.nextLine();
        double grade = scanner.nextDouble();
        Student s1 = new Student( "name" );
        System.out.println(s1.toString());
    }
}

