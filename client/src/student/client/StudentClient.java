package student.client;

import student.service.StudentService;
import student.model.Student;
import student.service.dbimpl.StudentDbService;

public class StudentClient {
    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");

        System.out.println("규현");
    }
}
