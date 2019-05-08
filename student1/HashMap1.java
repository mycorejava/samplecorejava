package com.seleniumpractice;

import java.util.HashMap;
import java.util.Map;

public class HashMap1
{
    public static void main(String[] args)
    {

        //HashMap<Key,Value>
        HashMap<String,String> h1 = new HashMap<String,String>();
//only one value will print from duplicate values
        h1.put("abc", "100");
        h1.put("abc", "100");
        h1.put("def", "200");
        h1.put("ghi", "300");
        h1.put("jkl", "400");
        h1.put("mno", "500");
        System.out.println(h1);
        String value = h1.get("abc");
        System.out.println(value);
//if we enter invalid key , it will return null
        String value1 = h1.get("sss");
        System.out.println(value1);
        for(Map.Entry<String, String> data : h1.entrySet())
        {
            System.out.println("Key : "+data.getKey()+" Value : "+data.getValue());
        }

    }
}
