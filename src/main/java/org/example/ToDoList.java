package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Task 1");
        toDoList.addTask("Task 2");
        toDoList.addTask("Task 3");
        toDoList.addTask("Task 4");
        toDoList.removeTask("Task 1");

        for (String task : toDoList.getTasks()) {
            System.out.println(task);
        }
    }
}