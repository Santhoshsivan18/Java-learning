import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class collection {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ArrayList");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        // list.forEach(System.out::println);

        /*
         * for (String s : list) {
         * System.out.print(s + " ");
         * }
         */

        System.out.println();
        System.out.println("LinkedList");
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Vector");
        Vector<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Kali");
        v.add("Max");
        v.add("Garima");
        itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Stack");
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Priority Queue");
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println();
        System.out.println("ArrayDeque");
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        for (String str : deque) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Hashset");
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("LinkedHashSet");
        LinkedHashSet<String> set1 = new LinkedHashSet<String>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Ravi");
        set1.add("Ajay");
        itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("TreeSet");
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Ravi");
        set2.add("Vijay");
        set2.add("Ravi");
        set2.add("Ajay");
        itr = set2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        // Set set3=map.entrySet();//Converting to Set so that we can traverse
        // while(itr.hasNext()){
        // //Converting to Map.Entry so that we can get key and value separately
        // Map.Entry entry=(Map.Entry)itr.next();
        // System.out.println(entry.getKey()+" "+entry.getValue());
        // }
        for (Integer s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }

        System.out.println();
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        for (Integer s : hm.keySet()) {
            System.out.println(s + " " + hm.get(s));
        }

        System.out.println();
        TreeMap<Integer, String> m1 = new TreeMap<Integer, String>();
        m1.put(100, "Amit");
        m1.put(102, "Ravi");
        m1.put(101, "Vijay");
        m1.put(103, "Rahul");
        for (Integer s : m1.keySet()) {
            System.out.println(s + " " + m1.get(s));
        }
    }
}
