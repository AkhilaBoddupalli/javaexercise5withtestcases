package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayStringtoMap {
    public String checkCount(String input)
    {
        if(input==null)
        {
            return null;
        }
        List<String> string= Arrays.asList(input.split("[\\W_]+")); //splits the string
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s:string)
        {
                if(map.containsKey(s)){  //checks if the input contains key value pair
                    int get = map.get(s);
                    map.put(s, get + 1);
                }
                else{
                    map.put(s, 1);
                }
            }



        Map<String, Boolean> booleanmap = new HashMap<String, Boolean>();

       for(String str:map.keySet())
       {

           if(map.get(str)>=2) //
           {
             booleanmap.put(str,true);
           }
           else
           {
                booleanmap.put(str,false);
           }
       }

        return booleanmap.toString();
    }
}
