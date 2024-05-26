import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    TodoList(){

    }

    public void add(String task){

        todoList.add(task);

    }
    public void print(){

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("task " + (i + 1) + " : " + todoList.get(i));
        }

    }
    public void remove(int number){

        if (number > todoList.size() || number < 1){
            System.out.println("Invalid index " + number);
        }else {
            todoList.remove(number - 1); // to match indexes when delete
        }
    }

}
