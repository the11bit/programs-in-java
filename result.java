import java.util.Scanner;
class mainn{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rollno;
    System.out.print("Enter your Roll No.: ");
    rollno = sc.nextInt();
    if(rollno == 23010464) {
        System.out.println("Name: Showkat Bashir\nResult: Pass\nCGPA: 9.0\nSemester: 4\nMajor: Computer Applications");
    } else if(rollno == 23010457) {
        System.out.println("Name: Sakiba Lateef\nResult: Pass\nCGPA: 8.3\nSemester: 4\nMajor: Computer Applications");
    } else if(rollno == 23010467) {
        System.out.println("Name: Hatim Parvaiz\nResult: Pass\nCGPA: 8.9\nSemester: 4\nMajor: Computer Applications");
    } else {
        System.out.println("Please, Check your Roll No. and try again!");
    }
    sc.close();
}}
