package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapImplementation
{
    public String stringChange(Map<String,String> map)
    {
        if(map==null)
        {
            return null;
        }

        Map<String, String> swapmap = new HashMap<String, String>();

       String temp=map.get("val1");  //swaps the value1 and stores in value2 and make value1 empty
       map.put("val2",temp);
       map.put("val1"," ");
        return map.toString();


    }


}
