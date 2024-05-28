package individual_1;
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add tasks
        toDoList.addToDo(new Task("Finish project report", "Complete the project report by the end of the week."));
        toDoList.addToDo(new Task("Grocery shopping", "Buy milk, eggs, and bread."));
        toDoList.addToDo(new Task("Call mom", "Remember to call mom on her birthday."));

        // View the to-do list
        toDoList.viewToDoList();

        // Mark a task as completed
        toDoList.markToDoAsCompleted("Grocery shopping");

        // View the updated to-do list
        toDoList.viewToDoList();
    }
}