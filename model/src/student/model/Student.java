package student.model;

public class Student {
    private String registrationId;

    public String getRegistrationId() {
        return this.registrationId;
    }

    public Student(String registrationId) {
        this.registrationId = registrationId;
    }

    public Student() {
    }
}
