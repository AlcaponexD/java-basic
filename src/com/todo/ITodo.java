package com.todo;

import java.util.ArrayList;

interface ITodo {
    public boolean createItem();
    public ArrayList<String> ListItems();
    public boolean updateItem();
    public boolean deleteItem();
}
