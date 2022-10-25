package com.example.patterns.behavioral.iterator;

import java.util.Arrays;

public class Notes {
    private String[] listNotes;

    public Notes(String[] listNotes) {
        this.listNotes = listNotes;
    }

    public MyIterator getIterator(){
        return new NotesReversIterator();
    }

    private class NotesReversIterator implements MyIterator{

        int index = listNotes.length-1;

        @Override
        public boolean hasNext() {
            if(index >= 0)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return listNotes[index--];
            }
            return null;
        }
    }
}
