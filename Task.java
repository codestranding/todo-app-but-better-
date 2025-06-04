/**
 * Represents a single task in the to-do list.
 * Stores task name and completion status.
 */
public class Task {
    private String name;
    private boolean completed;

    // Default constructor (not used directly but useful for flexibility)
    public Task() {
        this.name = "";
        this.completed = false;
    }

    // Constructor to set name only (completed defaults to false)
    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    // Constructor to set both name and completion status
    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    // Get the name of the task
    public String getName() {
        return name;
    }

    // Set a new name for the task
    public void setName(String newName) {
        this.name = newName;
    }

    // Check if the task is completed
    public boolean isCompleted() {
        return completed;
    }

    // Set the completion status of the task
    public void setCompleted(boolean status) {
        this.completed = status;
    }

    // Mark this task as completed
    public void markCompleted() {
        this.completed = true;
    }

    // Return a nicely formatted task string
    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}
