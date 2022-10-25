package com.example.patterns.behavioral;

import com.example.patterns.behavioral.iterator.MyIterator;
import com.example.patterns.behavioral.iterator.Notes;

public class Iterator {
    public static void main(String[] args) {
        String[] listNotes = {"go on a date", "meet a friend", "walk the dog"};

        Notes notes = new Notes(listNotes);
        MyIterator iterator = notes.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
