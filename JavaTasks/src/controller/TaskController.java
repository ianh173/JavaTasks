package controller;

import java.util.ArrayList;

import model.Task;

public class TaskController {

    ArrayList<Task> tasks;

    public TaskController () {
        tasks = new ArrayList<Task>();
    }

    public void createTask ( final String name, final Integer priority ) {
        tasks.add( new Task( name, priority ) );
    }

    public void updateTask ( final int index, final Task task ) {
        tasks.set( index, task );
    }

    public void deleteTask ( final int index ) {
        tasks.remove( index );
    }

    public Task getTask ( final int index ) {
        return tasks.get( index );
    }

    public ArrayList<Task> getAllTasks () {
        return tasks;
    }

}
