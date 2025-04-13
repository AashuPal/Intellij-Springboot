package in.aashu;

import in.aashu.JpaInterface.StudentRepository;
import in.aashu.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DataJpa01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataJpa01Application.class, args);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        Student student = new Student();
        student.setId(0);
        student.setName("John Doe");
        student.setAddress("123 Main St");
        student.setEmail("john.doe@gmail.com");
        student.setPhone(1234567890L);
        student.setCourse("Computer Science");
        student.setCollege("ABC University");

        Student student1=new Student(1,"Payal","payal@gmail.com",1234567894L,"gzb","B.Tech","KIET");
        Student student2=new Student(2,"Rohan","rohan@gmail.com",1234567895L,"hyd","B.Tech","RDEC");
        Student student3=new Student(3,"Anjali","anjali@gmail.com",1234467895L,"delhi","M.Tech","RDEC");
        Student student4=new Student(4,"Nandani","nandani@gmail.com",1214567895L,"Meerut","B.Tech","Abes");
        Student student5=new Student(5,"Ankit","ankit@gmail.com",1234564895L,"Del","B.Tech","AKTU");
        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);
        // Save multiple students
        studentRepository.saveAll(list);


        // Save the student
        studentRepository.save(student);

        // Retrieve the student
        studentRepository.findAll()
                .forEach(s -> System.out.println("Student ID: " + s.getId() + ", Name: " + s.getName() +
                        ", Email: " + s.getEmail() + ", Phone: " + s.getPhone() +
                        ", Address: " + s.getAddress() + ", Course: " + s.getCourse() +
                        ", College: " + s.getCollege()));


        // Find a student by ID
        Optional<Object> foundStudent = studentRepository.findByAddress("hyd");
        foundStudent.stream()
                .forEach(s -> System.out.println("Found Student: " + s));
    }

}
