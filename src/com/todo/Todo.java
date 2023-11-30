package com.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo implements ITodo {
    private final ArrayList<String> items = new ArrayList<String>();

    @Override
    public boolean createItem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nova tarefa");
        String task = sc.nextLine();

        if (task == null) {
            System.out.println("Você não digitou nenhuma tarefa");
            return false;
        }
        items.add(task);

        return true;
    }

    @Override
    public boolean updateItem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID a ser atualizado");
        int id = sc.nextInt();
        sc.nextLine();

        if (id < 0) {
            System.out.println("Você não digitou um id");
            return false;
        }

        String task = items.get(id);
        if (task == null) {
            System.out.println("Você não digitou um id válido tarefa");
        }
        System.out.println("Digite a mudança da tarefa");

        String change = sc.nextLine();

        items.set(id,change);

        return true;
    }

    @Override
    public boolean deleteItem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID a ser atualizado");
        int id = sc.nextInt();
        sc.nextLine();

        if (id < 0) {
            System.out.println("Você não digitou um id");
            return false;
        }

        String task = items.get(id);
        if (task == null) {
            System.out.println("Você não digitou um id válido tarefa");
        }
        items.remove(id);

        return true;
    }

    @Override
    public ArrayList<String> ListItems() {
        System.out.println(items);
        for (int i = 0; i < items.size(); i++) {
            System.out.println("ID " + i + " - " + items.get(i));
        }
        return items;
    }
}
