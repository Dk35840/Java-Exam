package javaBrainsLambda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;
import java.util.TreeSet;

// this is collectin from the in28 minutes youtube channel 
//  https://www.youtube.com/watch?v=3hgYHXDVh-o



// array cannot have null value but collection can have null element


// main class 
public class CollectionsMain {
	
	public static void main(String...strings) {
		
		
		
		
	}

}


//collection is interface
 interface Collection<E> extends Iterable<E> {
  // collection is base interface of all collection
}
 
// Collections is predefine class
 class Collections{ // remember here is s added
	   static int binarySearch(List, key) {
		   // can be used on sorted list
	   }
	   
	   static int binarySearch(List, key, Comparator) {
		   // can be used on sorted list
	   }
	 static Comparator reverseOrder() {
		 
	 }
	 
	 static void sort(List) {
		 
	 }
	 
	 static void sort(List, Comparator) {
		 
	 }
 }
 
 
 
 
 
 // 1 set for unique
  interface Set<E> extends Collection<E>{
	  // does not allow duplicate
  }
  
  interface SortedSet<E> extends Set<E>{
	  // elements in a sorted order
	  // had many function
	  // ie E first(); E Last();
  }
  
  // noting but have addition of navigation method
  interface NavigableSet<E> extends SortedSet<E>{
	  // E lower(E e);
	  // E floor(E e);
	  // etc	  
  }
  
  
  class HashSet // implements Set<E>
  {
	  // unordered, unsorted
  }
  
  class LinkedHashSet // implements Set<E>  extends HashSet<E>
  {
	  // maintain the order
  }
  
  class TreeSet // implements Set<E>, NavigableSet<E>
  
  {
	  // sorted natural order
  }
  
  
  //===================================================================================//
  // interface list and the class that it extends it
  interface List<E> extends Collection<E>{
	  // added by position or by default at end
	  // also have sublist method(start, end);
  }
  
  // 1 arraylist extends List
  class ArrayList<E> //implements List<E>, RandomAccess
  {
// RandomAccess a marker interface meaning it support fast 
	  // so access time is fast
	  // it is not thread safe
  }
  
  
  // 2 vector
  class Vector //implements List<E>, RandomAccess
  {
	  
	  // it is thread safe
  }
  
  
  // 3 Linked list
  class LinkedList  // implements List<E>, Queue<E>
  {
	  // elements are doubly linked ie forward and backward
	  // iteation slow but fast addition and deletion
  }
  
  
  
  //===============================================================================
  interface Queue<E> extends Collection<E>{
	  // arrange in order of processing
	  
	  boolean add(E paramE);
	  boolean offer(E paramE);
	  E remove();  // it give exception if element is not removed
	  E poll();
	  // many more
  }
  
  // a linear collection that suports both ends
  interface Deque<E> //extends Queue<E>
  {
	  void addFirst(E e);
  }
  
  
  // queue with wait feature 
  // we can wait until an element is available
  interface BlockingQueue<E> // extends Queue<E>
  {
	  // wait for the specified wait time
	  boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException;
  }
  
  class priorityQueue // implements Queue
  {
	  //sorted natural order
  }
  
  class ArrayDeque // implements Deque
  {
	  
	  
  }
  
  class ArrayBlockingQueue // implements BlockingQueue<E>
  {
	  
  }
  
  class LinkedBlockingQueue // implements BlockingQueue<E>
  {
	  // used linkedlist 
  }
  //====================================================================================//
  // 4 map not extend Collection
  interface Map<K,V> {
	  // things with uniques indentifier
	  // map support key value pairs
	  
	  int size();
	  void putAll(Map<K,V> paraMap);
  }
  
  interface SortedMap<K,V> extends Map<K,V>{
	  // for sorted map
	  K firstKey();
	  K lastKey();
  }
  
  interface NavigableMap<K,V> extends SortedMap<K,V>{
	  
  }
  
  class HashMap //implements Map
  {
	  // unsorted , unordered
	  // key's hashcode() is used
  }
  
  class Hashtable //implements Map
  {
	  // synchronized , thread safe version of hashmap
	  // hashmap does not have null value while hashmap have
  }
  
  class LinkedHashMap //implements Map
  {
	  // slow insertion and deletion
	  // faster iteration
  }
  class TreeMap //implements Map
  {
	  // sorted order is maintain
  }
  }
  //------------------------------------------------------------
  
 
  