package javacollections.hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapScratch {
	//K, V is necessary so that we can make the class of generic data-type
	static class HashMap<K, V> {
		class Node {
			K key;
			V value;
			
			Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}
		
		private int n;	//Number of Key-Value Pairs
		private int N;	//Number of Buckets
		private LinkedList<Node> buckets[]; //Array of LinkedList (Buckets)
		private double loadFactor;
		
		@SuppressWarnings("unchecked")
		HashMap() {
			this.n = 0;
			this.N = 4;	//Taking initial array size (no of buckets) as 4
			
			//Initializing the array of LinkedList of size N
			buckets = new LinkedList[N];
			
			//Initializing a LinkedList in each bucket
			for(int i=0; i<this.N; ++i)
				buckets[i] = new LinkedList<>();
			
			this.loadFactor = 0.75;
		}
		
		private int getBucketIndex(K key) {
			int hashCode = Math.abs(key.hashCode());
			return hashCode % this.N;
		}
		
		private int searchLL(K key, int bucketIndex) {
			LinkedList<Node> ll = buckets[bucketIndex];
			
			for(int i=0; i<ll.size(); ++i) {
				if(ll.get(i).key == key)
					return i;
			}
			
			return -1;	
		}
		
		private void reHash() {
			LinkedList<Node> tempBucket[] = this.buckets;
			
			this.N = this.N * 2;
			this.buckets = new LinkedList[this.N];
			
			for(int i=0; i<this.N; ++i)
				this.buckets[i] = new LinkedList<>();
			
			for(int i=0; i<tempBucket.length; ++i) {
				LinkedList<Node> ll = tempBucket[i];
				
				for(int j=0; j<ll.size(); ++j) {
					Node tempNode = ll.get(j);
					//this.buckets[i].add(new Node(tempNode.key, tempNode.value)); //Not using this, as we've to save data w.r.t new bucket index returned based on new array size
					put(tempNode.key, tempNode.value);					
				}
			}

		}
		
		public void put(K key, V value) {
			int bucketIndex = getBucketIndex(key); //Get bucket index based on HashCode of key
			int searchNodeIndex = searchLL(key, bucketIndex); //Check whether key is present at any index in the LinkedList
			
			if(searchNodeIndex == -1) {
				buckets[bucketIndex].add(new Node(key, value));  //Add new pair as a Node of LinkedList
				++n;					//Increase the number of pairs
				
				double lambda = (double) this.n / this.N;
				if(lambda > this.loadFactor)
					reHash();
			}
			else
				buckets[bucketIndex].get(searchNodeIndex).value = value; //Update the value of the pair in Node of LinkedList
		}
		
		public boolean containsKey(K key) {
			int bucketIndex = getBucketIndex(key); //Get bucket index based on HashCode of key
			int searchNodeIndex = searchLL(key, bucketIndex); //Check whether key is present at any index in the LinkedList
			
			if(searchNodeIndex == -1)	return false;
			else	return true;
		}
		
		public V remove(K key) {
			int bucketIndex = getBucketIndex(key); //Get bucket index based on HashCode of key
			int searchNodeIndex = searchLL(key, bucketIndex); //Check whether key is present at any index in the LinkedList
			
			if(searchNodeIndex == -1)	return null;
			else {
				Node node = buckets[bucketIndex].remove(searchNodeIndex);				
				--n;
				return node.value;
			}
		}
		
		public V get(K key) {
			int bucketIndex = getBucketIndex(key); //Get bucket index based on HashCode of key
			int searchNodeIndex = searchLL(key, bucketIndex); //Check whether key is present at any index in the LinkedList
			
			if(searchNodeIndex == -1)	return null;
			else
				return buckets[bucketIndex].get(searchNodeIndex).value;
		}
		
		public boolean isEmpty() {
			return n == 0;
		}
		
		public ArrayList<K> keySet() {
			ArrayList<K> keys = new ArrayList<>();
			
			for(int i=0; i<this.N; ++i) {
				LinkedList<Node> ll = buckets[i];
				for(int j=0; j<ll.size(); ++j)
					keys.add(ll.get(j).key);
			}
			
			return keys;
		}
	}

	public static void main(String[] args) {
			
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 190);
		map.put("China", 200);
		map.put("UK", 75);
		map.put("Bangladesh", 250);
		map.put("US", 50);

		System.out.println(map.containsKey("USA"));
		System.out.println(map.containsKey("US"));
		System.out.println(map.get("China"));
		map.put("UK", 60);

		for(String key : map.keySet())
			System.out.println(key + ", " + map.get(key));
		
		map.remove("China");
		System.out.println();
		for(String key : map.keySet())
			System.out.println(key + ", " + map.get(key));
	}
}