package org.ivanovskiy.patterns.structural.compositeUI;

public interface Component {

    void add(Shape component);
    void add(Shape... components);
    void remove(Shape child);
    void remove(Shape... components);
    void clear();
}
