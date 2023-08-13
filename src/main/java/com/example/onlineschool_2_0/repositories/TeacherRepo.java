package com.example.onlineschool_2_0.repositories;

import com.example.onlineschool_2_0.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository <Teacher, Long> {


}
