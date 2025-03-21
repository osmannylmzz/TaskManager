package com.example.taskmanager.taskmanager.Repository;




import com.example.taskmanager.taskmanager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<com.example.taskmanager.taskmanager.Model.Task> findAll();
}
