package com.example.StudentResultPublisher.Controller;

import com.example.StudentResultPublisher.Models.Students;
import com.example.StudentResultPublisher.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class StudentAppController {

    @Autowired
    private StudentRepository studentRepo;

    @PostMapping("/addStudent")
    public ResponseEntity<Map<String,String>> addStudent(@RequestBody Students student){
        Students students = studentRepo.save(student);

        Map<String,String> response = new HashMap<>();

        response.put("Status","New student added successfully");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/viewAllStudents")
    public ResponseEntity <List<Students>> viewStudentList(){
        List <Students> students = studentRepo.findAll();

        return ResponseEntity.ok(students);

    }

    @GetMapping("/calculateGrade/{rollno}")
    public ResponseEntity<Map<String, String>> calculateGrade(@PathVariable String rollno) {
        Optional<Students> studentOptional = studentRepo.findById(Long.valueOf(rollno));

        if (studentOptional.isEmpty()) {
            Map<String, String> response = new HashMap<>();
            response.put("Error", "Student not found");
            return ResponseEntity.badRequest().body(response);
        }

        Students student = studentOptional.get();
        double percentage = calculatePercentage(student);
        String grade = assignGrade(percentage);

        Map<String, String> result = new HashMap<>();
        result.put("Name", student.getName());
        result.put("Roll No", student.getRollNo());
        result.put("Percentage", String.format("%.2f", percentage) + "%");
        result.put("Grade", grade);

        return ResponseEntity.ok(result);
    }

    private double calculatePercentage(Students student) {
        double totalMarks = Double.parseDouble(student.getSub1_marks() + student.getSub2_marks() +
                student.getSub3_marks() + student.getSub4_marks() + student.getSub5_marks() + student.getSub6_marks());
        return (totalMarks / 600) * 100; // Assuming each subject is out of 100
    }

    private String assignGrade(double percentage) {
        if (percentage >= 90) return "S";
        else if (percentage >= 85) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 75) return "B+";
        else if (percentage >= 70) return "B";
        else if (percentage >= 65) return "C+";
        else if (percentage >= 60) return "C";
        else if (percentage >= 55) return "D+";
        else if (percentage >= 50) return "D";
        else return "F (Failed)";
    }
}



