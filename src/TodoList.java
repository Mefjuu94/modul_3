import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    TodoList(){

    }

    public boolean add(String task){
        if (todoList.contains(task)){
            return false;
        }else {
            return todoList.add(task);
        }
    }
    public void print(){

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("task " + (i + 1) + " : " + todoList.get(i));
        }

    }
    public boolean remove(int number){

        if (number > todoList.size() || number < 1){
            System.out.println("Invalid index " + number);
            return false;
        }else {
            todoList.remove(number - 1); // to match indexes when delete
            return true;
        }
    }

}
