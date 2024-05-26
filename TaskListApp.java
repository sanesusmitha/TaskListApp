import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
    public static void main(String[] args) {
        TaskList taskList = new TaskList(); // Create a new instance of TaskList
        Scanner scanner = new Scanner(System.in); // Create a new instance of Scanner
        while (true) {
            displayMenu(); // Display the menu
            int choice = getUserChoice(scanner); // Get the user's choice
            switch (choice) {
                case 1: 
                    taskList.addTask(getTaskName(scanner)); // Add a task to the list
                    break;
                case 2: 
                    if (!taskList.isEmpty()) { // If the list is not empty
                        taskList.listTasks(); // List the tasks
                        int taskNumber = getUserInput(scanner,  "Enter the task number to remove:  "); // Get the task number to remove
                        if (taskList.isValidTaskNumber(taskNumber)) { // If the task number is valid
                            taskList.removeTask(taskNumber); // Remove the task from the list
                        } else {
                            System.out.println("Invalid task number."); // Print an error message if the task number is invalid
                        }
                    } else {
                        System.out.println("No tasks to remove."); // Print an error message if there are no tasks to remove
                    }
                    break;
                case 3: 
                    if (!taskList.isEmpty()) { // If the list is not empty
                        taskList.listTasks(); // List the tasks
                    } else {
                        System.out.println("No tasks to list."); // Print an error message if there are no tasks to list
                    }
                    break;
                case 4: 
                    scanner.close(); // Close the scanner
                    return; // Exit the program
                default: 
                    System.out.println("Invalid option. Please try again."); // Print an error message if the option is invalid
            }
        }
    }
    private static void displayMenu() {
        System.out.println("Task List Application"); // Display the menu
        System.out.println("1. Add Task"); // Display the option to add a task
        System.out.println("2. Remove Task"); // Display the option to remove a task
        System.out.println("3. List Tasks"); // Display the option to list tasks
        System.out.println("4. Quit"); // Display the option to quit the program
        System.out.print("Select an option:  "); // Prompt the user to select an option
    }
    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt(); // Get the user's choice
    }
    private static String getTaskName(Scanner scanner) {
        System.out.print("Enter task name:  "); // Prompt the user to enter a task name
        return scanner.next(); // Get the task name
    }
    private static int getUserInput(Scanner scanner,  String prompt) {
        System.out.print(prompt); // Prompt the user to enter a value
        return scanner.nextInt(); // Get the value
    }
}

class TaskList {
    private ArrayList<String> tasks = new ArrayList<>(); // Create a new ArrayList to store tasks
    public void addTask(String name) {
        tasks.add(name); // Add a task to the list
        System.out.println("Task added."); // Print a message indicating that the task was added
    }
    public void removeTask(int taskNumber) {
        tasks.remove(taskNumber - 1); // Remove the task at the specified index
        System.out.println("Task removed."); // Print a message indicating that the task was removed
    }
    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) { // Loop through the tasks
            System.out.println((i + 1) + ". " + tasks.get(i)); // Print the task number and name
        }
    }
    public boolean isEmpty() {
        return tasks.isEmpty(); // Check if the list is empty
    }
    public boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size(); // Check if the task number is valid
    }
}