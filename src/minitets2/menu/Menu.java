package minitets2.menu;
import minitets2.manger.StudentManger;
import minitets2.model.Student;
import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner=new Scanner(System.in);
        StudentManger studentManger=new StudentManger();
        studentManger.listStudents[0]=new Student(1,"Sơn",23,"Nam","HaNoi",80.5);
        studentManger.listStudents[1]=new Student(2,"Dung",25,"Nam","HaNoi",81.0);
        studentManger.listStudents[2]=new Student(3,"Vũ",21,"Nam","HaNoi",82.5);
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Show StudentList");
            System.out.println("2. Show High Score");
            System.out.println("3. Add Student");
            System.out.println("4. Sear Name Student");
            System.out.println("5. Edit Student By Id:");
            System.out.println("6. Show Student By Gender:");
            System.out.println("0. Exit");
            System.out.println("Enter Choice ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("List Student");
                    studentManger.display();
                    break;
                case 2:
                    studentManger.scoreMaxMin();
                    break;
                case 3:
                    studentManger.addStudent();
                    break;
                case 4:
                    System.out.println("Enter the name you want to find");
                    studentManger.searNameStudent(scanner.next());
                    break;
                case 5:
                    System.out.println("Enter Edit By ID :");
                    studentManger.editStudentById(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Enter Gender :");
                    String input=scanner.next();
                    studentManger.showByGender(input);
                    break;
            }
        }while (choice!=0);
    }
}
