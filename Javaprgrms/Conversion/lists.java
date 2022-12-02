import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

class lists {
    public static void main(String[] args)
    {
        String[] names={"Rahul","Sonia","Rajeev"};
        //Array to ArrayList
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
        System.out.println("Array Elements");
        for(String name:names){
            System.out.println(name);
        }
         System.out.println("ArrayList al\n"+al);
//ArrayList to LInkedList

LinkedList<String> l1 = new LinkedList<String>();
l1.addAll(al);
System.out.println("LinkedListl1\n"+l1);

//LinkedList to HashSet
HashSet  hs= new HashSet();
hs.addAll(l1);
hs.add(10);
System.out.println("HashSet hs\n"+hs);

//HashSet to linkedHashSet
LinkedHashSet ls= new LinkedHashSet();
ls.addAll(hs);
System.out.println("LinkedHashSet ls\n"+ls);


    }
}