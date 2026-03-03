package jcore.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Colletions App started!");

        // LISTS
        // ArrayList: ordered, allows duplicates, fast random access, slower insert/remove in middle
        System.out.println("--- ArrayList -------");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add(1, "banana"); // insert at index
        System.out.println("Index 1: " + arrayList.get(1)); // access by index
        arrayList.remove("banana");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index " + i + " value: " + arrayList.get(i));
        }

        // LinkedList: ordered, allows duplicates, fast insert/remove anywhere, supports deque operations
        System.out.println("--- LinkedList -------");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.addFirst("start");
        linkedList.addLast("end");
        System.out.println(linkedList.poll()); // remove head, (deque-style)
        for (String s : linkedList) System.out.println(s);

        // SETS
        // HashSet: unordered, no duplicates, fast contains, add, remove
        // .hashCode()
        // objects can have the same hash value (called a collision) !!!
        System.out.println("--- HashSet -------");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("square");
        hashSet.add("circle");
        hashSet.add("circle"); // no duplicates
        hashSet.add("r1");
        hashSet.add("k2");
        System.out.println(hashSet.contains("circle"));
        hashSet.forEach(System.out::println);

        // LinkedHashSet: preserves insertion order
        System.out.println("--- LinkedHashSet -------");
        Set<String> linkedHashSet = new HashSet<>();
        linkedHashSet.add("unos");
        linkedHashSet.add("dos");
        linkedHashSet.add("tres");
        linkedHashSet.add("random1");
        linkedHashSet.add("random2");
        linkedHashSet.forEach(System.out::println);

        // TreeSet: sorted order, no duplicates, log(n) operations
        System.out.println("--- TreeSet -------");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("alfa");
        treeSet.add("beta");
        treeSet.add("gamma");
        treeSet.forEach(System.out::println);
        
        // QUEUES / DEQUES
        // ArrayDeque: double-ended queue, fast stack/queue operations
        System.out.println("--- ArrayDeque -------");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("front");
        deque.addLast("back");
        System.out.println(deque.peekFirst()); // view first
        System.out.println(deque.pollLast());  // remove last
        deque.forEach(System.out::println);

        // PriorityQueue: ordered by natural order or comparator, always removes smallest/priority element
        System.out.println("--- PriorityQueue -------");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.forEach(System.out::println);
        System.out.println(priorityQueue.poll()); // removes smallest
        priorityQueue.forEach(System.out::println);

        // MAPS
        // HashMap: key-value storage, fast lookup, allows one null key, multiple null values
        System.out.println("--- HashMap -------");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("water", 3);
        hashMap.put("cola", 5);
        hashMap.putIfAbsent("juice", 7);
        System.out.println(hashMap.get("cola"));
        hashMap.forEach((k,v) -> System.out.println(k + "=" + v));

        // LinkedHashMap: preserves insertion order
        System.out.println("--- LinkedHashMap -------");
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("water", 3);
        linkedMap.put("cola", 5);
        linkedMap.putIfAbsent("juice", 7);
        linkedMap.forEach((k,v) -> System.out.println(k + "=" + v));

        // TreeMap: sorted by keys, no null keys
        System.out.println("--- TreeMap -------");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("water", 3);
        treeMap.put("cola", 5);
        treeMap.putIfAbsent("juice", 7);
        treeMap.forEach((k,v) -> System.out.println(k + "=" + v));
        // System.out.println(treeMap.firstKey() + " -> " + treeMap.lastKey());

        // ConcurrentHashMap: thread-safe key-value storage
        System.out.println("--- ConcurrentHashMap -------");
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("apple", 1);
        concurrentMap.put("banana", 2);
        concurrentMap.forEach((k,v) -> System.out.println(k + "=" + v));

        // iMPORTANT USAGES
        // Check empty / size
        System.out.println(arrayList.isEmpty());
        System.out.println(hashSet.size());

        // Search / contains
        System.out.println(arrayList.contains("apple"));
        System.out.println(hashSet.contains("square"));
        System.out.println(hashMap.containsKey("cola"));

        // Sorting / comparing
        Collections.sort(arrayList); // List
        Collections.reverse(arrayList);
        arrayList.sort(Comparator.comparing(String::length));

        // Convert between collection types
        List<String> newList = new ArrayList<>(hashSet); // Set -> List
        Set<String> newSet = new HashSet<>(arrayList);   // List -> Set

        // Stream operations
        arrayList.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        hashMap.entrySet().stream().filter(e -> e.getValue() > 3)
               .forEach(e -> System.out.println(e.getKey()));

        // Immutable collections
        List<String> immutableList = List.of("apple","banana");
        Map<String,Integer> immutableMap = Map.of("apple",1,"banana",2);
    }
}
