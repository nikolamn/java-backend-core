1. Core Interfaces
2. Implementations characteristics
3. Iteration & Access patterns
4. Concurrency considerations
5. Null handling & Equality
6. Sorting & Searching
7. Performance & Memory trade-offs
8. Best practices
9. Advanced utilities

1. Core Interfaces - 
(java.util)
(java.util.Collection)
Collection – root interface for most collection types
-List – ordered, allows duplicates (ArrayList, LinkedList)
-Set – no duplicates, unordered or ordered (HashSet, LinkedHashSet, TreeSet)
-Queue / Deque – FIFO or double-ended structures (LinkedList, ArrayDeque, PriorityQueue)
(java.util.Map)
Map – key-value storage, not part of Collection but essential
2. Implementations characteristics
List:
-ArrayList: fast random access, slow inserts/removes in middle 
-LinkedList: fast insert/removal anywhere, slow random access
Set: 
-HashSet: unordered, fast
-LinkedHashSet: insertion order
-TreeSet: sorted, log(n) operations
Map:
-HashMap: fast lookup
-LinkedHashMap: insertion order
-TreeMap: sorted keys
-ConcurrentHashMap: thread-safe
Queue / Deque:
-PriorityQueue: sorted order
-ArrayDeque: fast stack/queue ops
-LinkedList: flexible
3. Iteration & Access patterns
Enhanced for-loop
Iterator / ListIterator: safe removal
Streams: functional operations (filter, map, reduce) with stream() or parallelStream() for concurrency
forEach(): lambda-friendly
5. Null Handling & Equality
HashMap allows one null key, multiple null values. HashSet allows one null
TreeMap / TreeSet do not allow null keys (natural ordering)
equals() and hashCode() contract is critical for proper set/map behavior
6. Sorting & Searching
Collections.sort() for lists, Comparator vs Comparable
TreeSet/TreeMap maintain sorted order automatically
Binary search on sorted lists: Collections.binarySearch()
Stream-based sorting: list.stream().sorted(Comparator.comparing(...)).
7. Performance & Memory trade-offs
ArrayList vs LinkedList: memory overhead vs access speed.
Hash-based collecions: memory vs speed; high load factor reduces collisions but increases memory.
Tree-based collections: O(log n) operations, memory for nodes.
8. Best practices
Always code to interfaces, not implementations: List<String> list = new ArrayList<>();
Prefer immutable collections for thread safety: List.of(...), Map.copyOf(...)
Use appropriate collection type for semantics: Set for uniqueness, Map for key-value, List for ordered sequences
9. Advanced utilities
Collections helper class: shuffle, reverse, unmodifiableList, emptyList.
Arrays.asList() vs List.of().
EnumSet and EnumMap for enum-heavy backends: compact and fast.
WeakHashMap / IdentityHashMap for special caching scenarios.