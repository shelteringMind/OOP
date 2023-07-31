package org.example;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class StudyGroupIterator extends StudyGroup implements Iterator<Student>{

    public boolean hasNext() {
        return false;
    }

    public E next(){
        return E;
    }

    public void remove(String fio) {
        Iterator<Student> iterator = getStudents().iterator();
        while(iterator.hasNext()) {
            if (iterator.next().getFio().equals(fio)) {
                iterator.remove();
            }
        }
    }



}
