package todoList.dao;

import consultation.todolist.model.Task;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

    // quantity of tasks
    int quantity();

}
