package com.example.onlineschool_2_0.service;

import com.example.onlineschool_2_0.entity.Homework;
import com.example.onlineschool_2_0.repositories.HomeworkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeworkService {

    private final HomeworkRepo homeworkRepo;

    @Autowired
    public HomeworkService(HomeworkRepo homeworkRepo) {
        this.homeworkRepo = homeworkRepo;
    }

    public void saveHomeworks(final Homework homework) {
        homeworkRepo.save(homework);
    }

    public List<Homework> findAll() {
        return homeworkRepo.findAll();
    }

    public Optional<Homework> getHomeworks(final Long id) {
        return homeworkRepo.findById(id);
    }

    public void createHomeworksBeforeStart(String task) {

        final Homework homework = new Homework();

        homework.setTask(task);

    }
}
