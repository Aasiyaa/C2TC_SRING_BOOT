package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class StudentService {
 
    @Autowired
    private StudentRepository repi;
     
    public List<Student> listAll() {
        return repi.findAll();
    }
     
    public void save(Student student) {
        repi.save(student);
    }
     
    public Student get(Integer id) {
        return repi.findById(id).get();
    }
     
    public void delete(Integer id) {
        repi.deleteById(id);
    }
}
