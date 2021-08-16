
import java.util.Scanner;
import java.util.*;
public class ArrayListTask{
    public static int findLength(){
      ArrayList<String> list=new ArrayList<>();
      int length=list.size();
      return length;
    }
    public static int findListLength(ArrayList<String> list){
      int length=list.size();
      System.out.println("ArrayList elements are:");
      for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
      }
      return length;
    }
     public static int findIntegerListLength(ArrayList<Integer> list){
      int length=list.size();
      System.out.println("ArrayList elements are:");
      for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
      }
      return length;
    }
     
     public static int createCustomArrayList(){
      ArrayList<Student> list=new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      System.out.println("Enter the rollNo:");
      int [] rollNo=new int[size];
       for(int i=0;i<size;i++){
          rollNo[i]=sc.nextInt();
       }
      System.out.println("Enter the name:");
      String [] name=new String[size];
      for(int i=0;i<size;i++){
          name[i]=sc.next();
      }
      System.out.println("Enter the marks:");
      int [] marks=new int[size];
      for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++){
         list.add(new Student(rollNo[i],name[i],marks[i]));
      }
      System.out.println("Custom ArrayList elements:");
      for(int i=0;i<list.size();i++){
           System.out.println(list.get(i)+" ");
      }
     int length=list.size();
      return length;
  }
     public static int createList(ArrayList<Integer> list,ArrayList<String> list1){
       ArrayList<Object> arrList=new ArrayList<>();
       arrList.addAll(list);
       arrList.addAll(list1);
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      System.out.println("Enter the rollNo:");
      int [] rollNo=new int[size];
       for(int i=0;i<size;i++){
          rollNo[i]=sc.nextInt();
       }
      System.out.println("Enter the name:");
      String [] name=new String[size];
      for(int i=0;i<size;i++){
          name[i]=sc.next();
      }
      System.out.println("Enter the marks:");
      int [] marks=new int[size];
      for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++){
         arrList.add(new Student(rollNo[i],name[i],marks[i]));
      }
       System.out.println("ArrayList elements are:");
       for(int i=0;i<arrList.size();i++){
         System.out.println(arrList.get(i)+" ");
      }
      int length=arrList.size();
      return length;
    }
     public static int findIndex(ArrayList<String> list){
      int length=findListLength(list);
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string for which you want to find index:");
      String str=sc.next();
      int index=list.indexOf(str);
      System.out.println("Index of the element is:"+index);
      return length;
    }
    
    public static void iterator(ArrayList<String> list){
      Iterator<String> iter=list.iterator();
      System.out.println("ArrayList elements using iterator:");
      while(iter.hasNext()){
          System.out.println(iter.next()+" ");
      }
      System.out.println("ArrayList elements using for loop:");
      for(int i=0;i<list.size();i++){
         System.out.println(list.get(i)+" ");
      }
    }
   public static int findStringAtIndex(ArrayList<String> list){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the index:");
      int index=sc.nextInt();
      String str=list.get(index);
      System.out.println("String at the given index is:"+str);
      int length=str.length();
      return length;
    }
   public static void findIndexOfDuplicate(ArrayList<String> list){
      String str=null;
      for(int i=0;i<list.size();i++){
         for(int j=i+1;j<list.size();j++){
            if(list.get(i).equals(list.get(j))){
               str=list.get(j);
            }
         }
      }
      int firstIndex=list.indexOf(str);
      System.out.println("First index of the duplicate element is:"+firstIndex);
      int lastIndex=list.lastIndexOf(str);
      System.out.println("Last index of the duplicate element is:"+lastIndex);
    }
   public static int addString(ArrayList<String> list){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string to be entered at 2nd position:");
      String str=sc.next();
      list.add(1,str);
      int length=findListLength(list);
      System.out.println("ArrayList elements after adding a string:");
      for(String arr:list){
         System.out.println(arr);
      }
      return length;
    }
     public static int createArrayList(ArrayList<String> list){
      ArrayList<String> list1=new ArrayList<>();
      for(int i=2;i<list.size()-2;i++){
           list1.add(list.get(i));
      }
      System.out.println("First ArrayList elements:");
      for(String arr:list){
         System.out.println(arr);
      }
      int firstLength=findListLength(list);
      System.out.println("First ArrayList size:"+firstLength);
      int secondLength=findListLength(list1);
      System.out.println("Second ArrayList elements:");
      for(String arr:list1){
         System.out.println(arr);
      }
      return secondLength;
    }
   public static int createThreeArrayList(ArrayList<String> list1){
      ArrayList<String> list2=ArrayListTaskRunner.createStringArrayList();
      ArrayList<String> list3=new ArrayList<String>();
      list3.addAll(list1);
      list3.addAll(list2);
      System.out.println("Third ArrayList elements:");
      for(int i=0;i<list3.size();i++){
         System.out.println(list3.get(i)+" ");
      }
      int thirdLength=findListLength(list3);
      return thirdLength;
    }
   public static int createThirdArrayList(ArrayList<String> list1){
     ArrayList<String> list2=ArrayListTaskRunner.createStringArrayList();
      ArrayList<String> list3=new ArrayList<String>();
      list3.addAll(list2);
      list3.addAll(list1);
      System.out.println("Third ArrayList elements:");
      for(int i=0;i<list3.size();i++){
         System.out.println(list3.get(i)+" ");
      }
      int thirdLength=findListLength(list3);
      return thirdLength;
    }
   public static int removeDecimalValue(ArrayList<Double> decimalList){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value to be removed:");
      double decimalValue=sc.nextDouble();
      decimalList.remove(decimalValue);
      int length=decimalList.size();
      System.out.println("Arraylist after removing an element:");
      for(Double arr:decimalList){
         System.out.println(arr);
      }
      return length;
    }   
   public static int removeDecimalValueAtIndex(ArrayList<Double> decimalList){
      decimalList.remove(3);
      int length=decimalList.size();
      System.out.println("Arraylist after removing an element at 4th position:");
      for(Double arr:decimalList){
         System.out.println(arr);
      }
      return length;
    } 
   public static int removeElements(ArrayList<String> list1){
      ArrayList<String> list2=ArrayListTaskRunner.createStringArrayList();
      list1.removeAll(list2);
      System.out.println("First ArrayList elements after removing elements which are present in 2nd arraylist:");
      for(int i=0;i<list1.size();i++){
         System.out.println(list1.get(i)+" ");
      }
      int firstLength=findListLength(list1);
      return firstLength;
    }
   public static int removeNonDuplicateElements(ArrayList<String> list1){
      ArrayList<String> list2=ArrayListTaskRunner.createStringArrayList();
      list1.retainAll(list2);
      System.out.println("First ArrayList elements after removing elements which are not present in 2nd arraylist:");
      for(int i=0;i<list1.size();i++){
         System.out.println(list1.get(i)+" ");
      }
      int firstLength=findListLength(list1);
      return firstLength;
    }
  public static int removeAllLongValue(ArrayList<Long> longList){
      longList.removeAll(longList);
      int length=longList.size();
      System.out.println("Arraylist after removing the elements:");
      for(Long arr:longList){
         System.out.println(arr);
      }
      return length;
    }
  public static int checkString(ArrayList<String> list){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string to be checked:");
      String str=sc.next();
       if(list.contains(str)){
            System.out.println("Given string is present in the ArrayList");
       }
      int length=findListLength(list);
      System.out.println("ArrayList elements are:");
      for(String arr:list){
         System.out.println(arr);
      }
      return length;
    } 
}
  class Remove extends ArrayList<Long>{
      public static int removeLongValue(){
         Remove longList=new Remove();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no.of long values:");
         int size1=sc.nextInt();
         System.out.println("Enter the long values:");
         Long [] longArray=new Long[size1];
         for(int i=0;i<size1;i++){
            longArray[i]=sc.nextLong();
         }
        for(int i=0;i<longArray.length;i++){
          longList.add(longArray[i]);
        } 
        longList.removeRange(3,8);
        int length=longList.size();
        System.out.println("Arraylist after removing the elements from position 4 to 8 is:");
        for(Long arr:longList){
           System.out.println(arr);
        }
      return length;
    } 
  }
    class Student{
       int rollNo;
       String name;
       int marks;
       Student(int rollNo,String name,int marks){
          this.rollNo=rollNo;
          this.name=name;
          this.marks=marks;
      }
      public String toString(){
           return "RollNo: "+rollNo+" "+"Name: "+name+" "+"Marks: "+marks;
      }
   }
