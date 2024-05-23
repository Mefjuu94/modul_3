//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SortowanieTablicy zad1 = new SortowanieTablicy();

        System.out.println("--------------------");

        TodoList todoList = new TodoList();

        todoList.add("zrobić kawę");
        todoList.add("zjeść śniadanie");
        todoList.add("umyć naczynia");
        todoList.add("pracka pracka x 8h");
        todoList.add("nauka");
        todoList.add("spanko");

        todoList.print();

        todoList.remove(4);
        System.out.println("--działanie--");

        todoList.print();

        System.out.println("--------------------");



    }
}