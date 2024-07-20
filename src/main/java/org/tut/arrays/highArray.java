package org.tut.arrays;

public class highArray {
    // intialize an array

    private long [] arr;

    private int elem; // keep track of how many elements are in the array

    public highArray(int max)
    {
        arr = new long[max];
        elem = 0;
    }

    // find an element
    public boolean find(int num)
    {
        if(elem == 0)
        {
            return false;
        }

        for (int i = 0; i < elem; i++)
        {
            if(arr[i]== num)
                return true;
        }

        return false;
    }

    // insert into
    public void insert(int num)
    {
        arr[elem] = num;
        elem++;
    }

    // delete in array
    public boolean delete(int num)
    {
        // search in the array - linear search in the arrraay which is an expense of big 0(n)

        for(int i = 0 ; i < elem; i++)
        {
            if (arr[i] == num)
            {
                for (int j = i; j < elem;j++)
                {
                    arr[j] = arr[j +1];
                }
                return true;
            }
        }
        return false;
    }

    public void display()
    {
        for (int i = 0; i < elem; i++)
        {
            System.out.println(arr[i]);
        }
    }


}
