package com.java.kilhyun.OOP;

public class BookShelf extends Shelf implements ShelfQueue{

    @Override
    public void enQueue(String title)
    {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
