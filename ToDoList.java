package individual_1;
class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                System.out.println("Marked '" + title + "' as completed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task '" + title + "' not found in the to-do list.");
    }

    public void viewToDoList() {
        System.out.println("To-Do List:");
        Node current = head;
        while (current != null) {
            System.out.println(current.task.getTitle() + ": " + current.task.getDescription() + " [" + (current.task.isCompleted() ? "Completed" : "Incomplete") + "]");
            current = current.next;
        }
        System.out.println();
    }
}

