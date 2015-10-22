/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Histogram<T> {
    private final HashMap<T,Integer> map = new HashMap<>();


    public Integer get(Object key) {
        return map.get(key);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public void increment (T key){
        if(map.containsKey(key)){
            map.put(key,map.get(key)+1);
        }else{
            map.put(key,1);
        }
        
        
       // Otro forma---> map.put(key, map.containsKey(key) ? map.get(key)+1 :1);
    }
    
}
