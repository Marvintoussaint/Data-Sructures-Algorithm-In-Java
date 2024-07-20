package org.tut.arrays;

public class highArrayApp {
    public static void main(String[] args) {
        boolean found = false;
        int maxSize = 20;
        highArray arr = new highArray(maxSize);

        arr.insert(12);
        arr.insert(13);
        arr.insert(14);
        arr.insert(15);
        arr.delete(12);
        found = arr.find(12);
        arr.display();

        System.out.println(found);


    }
}
