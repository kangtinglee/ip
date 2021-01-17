public class Todo extends Task {
    public Todo(String description) { super(description, TaskType.TODO); }

    public static Todo parseTodo(String description) throws DukeException {
        if (description.isEmpty()) {
            throw new DukeException("☹ OOPS!!! The description of a todo cannot be empty.");
        }
        return new Todo(description);
    }
}
