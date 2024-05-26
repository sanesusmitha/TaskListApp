#TaskListApp

This Java code is a simple task list application that allows users to add, remove, and list tasks. The application uses a TaskList class to manage the tasks, which is an ArrayList of String objects. The TaskList class has methods to add tasks, remove tasks, list tasks, check if the list is empty, and check if a task number is valid.

The TaskListApp class contains the main method, which is the entry point of the application. It creates a TaskList object and a Scanner object to read user input. The application enters a loop that displays a menu, prompts the user for a choice, and performs the corresponding action. The loop continues until the user chooses to quit.

The displayMenu method displays a menu of options to the user. The getUserChoice method reads the user's choice from the console and returns it as an integer. The getTaskName method reads the name of a task from the console and returns it as a string. The getUserInput method reads an integer input from the console and returns it.

The TaskList class contains methods to add tasks, remove tasks, list tasks, check if the list is empty, and check if a task number is valid. The addTask method adds a task to the list and prints a message indicating that the task was added. The removeTask method removes a task from the list at the specified index (subtracting 1 because the index is 0-based) and prints a message indicating that the task was removed. The listTasks method prints the tasks in the list along with their numbers. The isEmpty method returns true if the list is empty, and the isValidTaskNumber method returns true if the task number is within the valid range.
