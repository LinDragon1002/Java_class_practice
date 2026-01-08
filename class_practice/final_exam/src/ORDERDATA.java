import java.util.Scanner;

class Student {
    int id;
    String name;
    int midterm;
    int finalExam;
    double average;

    public Student(int id, String name, int midterm, int finalExam) {
        this.id = id;
        this.name = name;
        this.midterm = midterm;
        this.finalExam = finalExam;
        this.average = (midterm + finalExam) / 2.0;
    }

    public String toString() {
        return id + "-" + name + ":" + String.format("%.1f", average);
    }
}

public class ORDERDATA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[nums];

        for(int i = 0; i < nums; i++) {
            String[] data = sc.nextLine().split(" ");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int midterm = Integer.parseInt(data[2]);
            int finalExam = Integer.parseInt(data[3]);
            students[i] = new Student(id, name, midterm, finalExam);
        }

        for(int i = 0; i < nums - 1; i++) {
            for(int j = 0; j < nums - i - 1; j++) {
                if(students[j].id > students[j + 1].id) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for(Student s : students) {
            System.out.println(s);
        }

        for(int i = 0; i < nums - 1; i++) {
            for(int j = 0; j < nums - i - 1; j++) {
                if(students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for(Student s : students) {
            System.out.println(s);
        }
    }
}
