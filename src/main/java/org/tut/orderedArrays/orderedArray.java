package org.tut.orderedArrays;

public class orderedArray {

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
        int left = 0;
        int right = arr.length -1;

        while(left < right)
        {
            final int mid = (left + right) / 2;  // whole number because it is an integer

            if(arr[mid] == num)
            {
                return true;
            }else if(arr[mid] < num)
            {
                left = mid +1;
            }else{
                right = mid -1;
            }
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
