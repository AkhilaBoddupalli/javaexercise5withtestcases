package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortingSetInterface
{
    HashSet<String> sort=new HashSet<String>();
    //add elts
    public List<String> addelements(String[] inputArray)
    {
        for(String input:inputArray)
        {
            sort.add(input);

        }
        List<String> list=new ArrayList<String>(sort);
        Collections.sort(list); //sort function sorts the list

        return list;

    }
}
