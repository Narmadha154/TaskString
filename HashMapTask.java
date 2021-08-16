
import java.util.Scanner;
import java.util.*;
public class HashMapTask{
   public static int findSize(){
       HashMap map=new HashMap();
       int size=map.size();
       return size;
   }
   public static int findStringMapSize(HashMap<String,String> map){
       int size=map.size();
       System.out.println("Hashmap elements:");
       for(Map.Entry m : map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
      }  
       return size;
   }
    public static int findIntegerMapSize(HashMap<Integer,Integer> map){
       int size=map.size();
       System.out.println("Hashmap elements:");
       for(Map.Entry m : map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
      }  
       return size;
   }
 }
