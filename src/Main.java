import com.todo.Todo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Todo TodoList = new Todo();
        Scanner scanner = new Scanner(System.in);

        boolean exec = true;
        while (exec) {
            //Like object literals in JS
            Map<Integer, Runnable> actionsTodo = new HashMap<>();
            actionsTodo.put(1, TodoList::createItem);
            actionsTodo.put(2, TodoList::updateItem);
            actionsTodo.put(3, TodoList::ListItems);
            actionsTodo.put(4, TodoList::deleteItem);

            System.out.println("1 - Adicionar nova tarefa ");
            System.out.println("2 - Atualizar tarefa");
            System.out.println("3 - Listar tarefas ");
            System.out.println("4 - Deletar tarefa");
            System.out.println("* - Selecione sua ação");

            int option = scanner.nextInt();

            // RUN Like object literals in JS
            Runnable selectedAction = actionsTodo.get(option);
            if (selectedAction != null) {
                selectedAction.run();
            } else {
                exec = false;
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}