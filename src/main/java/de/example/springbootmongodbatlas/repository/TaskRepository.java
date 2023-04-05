package de.example.springbootmongodbatlas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.example.springbootmongodbatlas.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {
    public List<Task> findBySeverity(int severity);
    public List<Task> findByAssignee(String assignee);
}
