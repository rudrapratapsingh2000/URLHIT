package com.URLHitCount.Service;

import com.URLHitCount.Model.Url;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlService {
    int c=0;
    public int countHit(){
        return c++;
    }
    static Map<String, Integer> map=new HashMap<>();
    public static Url getVisits(String username){
        int count=map.getOrDefault(username,0)+1;
        map.put(username,count);
        Url url=new Url(count,username);
        return url;
    }
}
