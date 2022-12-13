package minitets2.manger;

import minitets2.model.Student;

import java.util.Scanner;

public class StudentManger {
    public Student[] listStudents = new Student[10];

    public void display() {
        for (Student s :
                listStudents) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public void scoreMaxMin() {
        double scoreMax = 0;
        double scoreMin = listStudents[0].getAvg();
        for (Student s : listStudents) {
            if (s != null) {
                if (s.getAvg() > scoreMax) {
                    scoreMax = s.getAvg();
                }
            }
        }
        for (Student student :
                listStudents) {
            if (student != null) {
                if (student.getAvg() == scoreMax) {
                    System.out.println("Student Max: " + student);
                }
            }
        }
        for (Student student : listStudents) {
            if (student != null) {
                if (student.getAvg() <= scoreMin) {
                    scoreMin = student.getAvg();
                }
            }
        }
        for (Student student :
                listStudents) {
            if (student != null) {
                if (student.getAvg() == scoreMin) {
                    System.out.println("Student Min: " + student);
                }
            }
        }
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i] != null) {
                index = i + 1;
            } else {
                break;
            }
        }
        if (index == listStudents.length) {
            System.out.println(" No add Student..!");
        } else {
            System.out.println("Add Student.");
            System.out.println("Enter Name:");
            String name = scanner.next();
            System.out.println("Enter Age:");
            int age = scanner.nextInt();
            System.out.println("Enter Gender:");
            String gender = scanner.next();
            System.out.println("Enter Address");
            String address = scanner.next();
            System.out.println("Enter avg:");
            double avg = scanner.nextDouble();
            listStudents[index] = new Student(index + 1, name, age, gender, address, avg);
        }
    }

    public void searNameStudent(String name) {
        Student student;
        for (Student s :
                listStudents) {
            if (s != null) {
                if (name.equals(s.getName())) {
                    student = s;
                    System.out.println(student);
                    break;
                }
            }
        }
    }

    public void editStudentById(int id) {
        System.out.println("Find By Name:");
        Scanner scanner = new Scanner(System.in);
        for (Student listStudent : listStudents) {
            if (listStudent != null) {
                if (listStudent.getId() == id) {
                    System.out.println("Edit Student:");
                    System.out.printf("%-5s%-5s%s", "Name : ", listStudent.getName(), " Edit->:");
                    String name = scanner.nextLine();
                    if (name.equals("")) {
                        listStudent.setName(listStudent.getName());
                    } else {
                        listStudent.setName(name);
                    }

                    System.out.printf("%-5s%-5s%s", "Age : ", listStudent.getAge(), " Edit->:");
                    int age;
                    try {
                        age = Integer.parseInt(scanner.nextLine());
                        listStudent.setAge(age);
                        if (age >= 0) {
                            break;
                        }
                        break;
                    } catch (Exception e) {
                        listStudent.setAge(listStudent.getAge());
                    }

                    System.out.printf("%-5s%-5s%s", "Gender : ", listStudent.getGender(), " Edit->:");
                    String gender = scanner.nextLine();
                    if (gender.equals("")) {
                        listStudent.setGender(listStudent.getGender());
                    } else {
                        listStudent.setGender(gender);
                    }

                    System.out.printf("%-5s%-5s%s", "Address : ", listStudent.getAddress(), " Edit->:");
                    String address = scanner.nextLine();

                    if (address.equals("")) {
                        listStudent.setAddress(listStudent.getAddress());
                    } else {
                        listStudent.setAddress(address);
                    }

                    System.out.printf("%-5s%-5s%s", "Avg : ", listStudent.getAvg(), " Edit->:");
                    double avg;
                    try {
                        avg = Integer.parseInt(scanner.nextLine());
                        listStudent.setAvg(avg);
                        if (avg >= 0) {
                            break;
                        }
                        break;
                    } catch (Exception e) {
                        listStudent.setAvg(listStudent.getAvg());
                    }
                }
            } else {
                System.out.println(" No find by name");
                break;
            }
        }
    }

    public void showByGender(String input) {
        for (Student s :
                listStudents) {
            if (s != null) {
                if (s.getGender() != null) {
                    if (s.getGender().toUpperCase().contains(input.toUpperCase())) {
                        System.out.println(s);
                    }
                }

            }
        }
    }

    public void deleteStudent(int id) {
        int index = 0;
        Student[] newList = new Student[listStudents.length];
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i].getId() == id) {
                listStudents[i] = listStudents[i + 1];
                index = i;
                break;
            } else {
                newList[i] = listStudents[i];
            }
        }
        for (int i = index; i < listStudents.length - 1; i++) {
            if (listStudents[i] != null) {
                listStudents[i].setId(i);
                newList[i] = listStudents[i + 1];
            }
        }
        listStudents = newList;
    }
    public void stringInt(){
        Scanner scanner =new Scanner(System.in);
        String string=scanner.nextLine();
        if (string.equals("")) {
            System.out.println("No");
        }else {
            int number=Integer.parseInt(string);
            System.out.println(number);
        }

    }
}
