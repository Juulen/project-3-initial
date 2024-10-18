package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T>{

    protected ArrayList<T> Container;

    public Bag() {
        Container = new ArrayList<T>();
    }

    @Override
    public boolean isEmpty() {
        return this.Container.isEmpty();
    }

    @Override
    public int size() {
        return this.Container.size();
    }
    @Override
    public void add(T t) {
        this.Container.add(t);

    }

    @Override
    public Iterator<T> iterator() {
        return this.Container.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }
}
