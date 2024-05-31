import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestToDoList {

    TodoList todoList = new TodoList();

    @Test
    public void addTaskToToDoList(){
        Assertions.assertTrue(todoList.add("test"));
    }

    @Test
    public void CantAddTaskToToDoList(){
        todoList.add("test again");
        Assertions.assertFalse(todoList.add("test again"));
    }
    @Test
    public void RemoveTaskFromToDoList(){
        todoList.add("test");
        todoList.add("test again");
        todoList.add("repeat test again");

        Assertions.assertTrue(todoList.remove(2));
    }

    @Test
    public void CantRemoveTaskFromToDoList(){
        todoList.add("test");
        todoList.add("test again");
        todoList.add("repeat test again");

        Assertions.assertFalse(todoList.remove(0));
        Assertions.assertFalse(todoList.remove(5));
    }

}
