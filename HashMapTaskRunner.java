
import java.util.Scanner;
import java.util.HashMap;
public class HashMapTaskRunner{
   public static HashMap<String,String> createStringHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     System.out.println("Enter the keys:");
     String [] keyArray=new String[num];
     for(int i=0;i<num;i++){
          keyArray[i]=sc.next();
     }
     System.out.println("Enter the values:");
     String [] valueArray=new String[num];
     for(int i=0;i<num;i++){
          valueArray[i]=sc.next();
     }
     HashMap<String,String> stringMap=new HashMap<>(num);
     for(int i=0;i<num;i++){
        stringMap.put(keyArray[i],valueArray[i]);
     }
     return stringMap;
    }
     public static HashMap<Integer,Integer> createIntegerHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     System.out.println("Enter the keys:");
     int [] keyArray=new int[num];
     for(int i=0;i<num;i++){
          keyArray[i]=sc.nextInt();
     }
     System.out.println("Enter the values:");
     int [] valueArray=new int[num];
     for(int i=0;i<num;i++){
          valueArray[i]=sc.nextInt();
     }
     HashMap<Integer,Integer> integerMap=new HashMap<>(num);
     for(int i=0;i<num;i++){
        integerMap.put(keyArray[i],valueArray[i]);
     }
     return integerMap;
    }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
       case 1:
          int size=HashMapTask.findSize();
          System.out.println("Size of the Hashmap:"+size);
          break;
       case 2:
          HashMap<String,String> map1=createStringHashMap();
          int mapSize1=HashMapTask.findStringMapSize(map1);
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          HashMap<Integer,Integer> map2=createIntegerHashMap();
          int mapSize2=HashMapTask.findIntegerMapSize(map2);
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
       default:
         System.out.println("No program");
         break;
     }
  }
 }
