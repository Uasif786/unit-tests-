/**
 * Author: Umar Asif
 * Date: April 2025
 * Purpose: Unit tests for Appointment class
 */

package com.contactservice;


import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private final Map<String, Task> taskMap = new HashMap<>();

    public void addTask(Task task) {
        if (taskMap.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID must be unique.");
        }
        taskMap.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        taskMap.remove(taskId);
    }

    public void updateTask(String taskId, String name, String description) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        Task task = taskMap.get(taskId);
        if (name != null) {
            task.setName(name);
        }
        if (description != null) {
            task.setDescription(description);
        }
    }

    public Task getTask(String taskId) {
        return taskMap.get(taskId);
    }
}
