import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class pidGen {
    public static String generate() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
}

class course {
    String name;
    String course_id;

    public course(String inp_name, String inp_course_id) {
        name = inp_name;
        course_id = inp_course_id;
    }
}

class Student {
    String name;
    String surname;
    String personal_id;
    Date birth_date;
    Date valid_until;
    List<course> courses;

    public Student(String inp_name, String inp_surname, Date inp_birth_date, Date inp_valid_until) {
        name = inp_name;
        surname = inp_surname;
        birth_date = inp_birth_date;
        valid_until = inp_valid_until;
        courses = new ArrayList<>();

        Random rand = new Random();
        personal_id = pidGen.generate();
    }

    public void displayStudentDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String birthDateString = dateFormat.format(birth_date);
        String validUntilString = dateFormat.format(valid_until);

        System.out.println("Student Name: " + name + " " + surname);
        System.out.println("Personal ID: " + personal_id);
        System.out.println("Birth Date: " + birthDateString);
        System.out.println("ID Card Valid Until: " + validUntilString);
        System.out.println();
    }
}

public class Main {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        while (true) {
            System.out.println("bhos basic oop project - student management system");
            System.out.println("1. add student");
            System.out.println("2. list students");
            System.out.println("3. exit");

            int inp = scanner.nextInt();
            scanner.nextLine();

            switch (inp) {
                case 1:
                    System.out.println("Student name: ");
                    String student_name = scanner.nextLine().trim();
                    System.out.println("Student surname: ");
                    String student_surname = scanner.nextLine().trim();

                    System.out.println("Student birth date (yyyy/MM/dd): ");
                    String buffer = scanner.nextLine();

                    Date student_birth_date = null;
                    Date student_valid_until_date = null;

                    try {
                        student_birth_date = dateFormat.parse(buffer);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Student ID card valid until date (yyyy/MM/dd): ");
                    buffer = scanner.nextLine();
                    try {
                        student_valid_until_date = dateFormat.parse(buffer);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    Student student = new Student(student_name, student_surname, student_birth_date, student_valid_until_date);
                    students.add(student);
                    break;
                case 2:
                    for (Student s : students) {
                        s.displayStudentDetails();
                    }
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
