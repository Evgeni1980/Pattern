package ru.kremenia.structural.composit;

public abstract class File implements Item{

    public abstract byte[] getData();

    @Override
    public boolean isFile() {
        return true;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

}
