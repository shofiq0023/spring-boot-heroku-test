package com.example.springbootherokutest.student;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAll() {
        return Arrays.asList(
                new Student(132, "Shofiqul Islam", "shofiqul@gmail.com"),
                new Student(255, "John Doe", "john@yahoo.com"),
                new Student(357, "Lily Smith", "lily@rock.com"),
                new Student(486, "Nafiz Islam", "nafiz@nigga.com")
        );
    }
}
