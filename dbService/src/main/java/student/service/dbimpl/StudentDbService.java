package student.service.dbimpl;

import student.model.Student;
import student.service.StudentService;

public class StudentDbService implements StudentService {
    public String create(Student student) {
        return student.getRegistrationId();
    }

    public Student read(String registrationId) {
        return new Student();
    }

    public Student update(Student student) {
        return student;
    }

    public String delete(String registrationId) {
        return registrationId;
    }
}
