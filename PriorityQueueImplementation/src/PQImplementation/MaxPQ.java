package PQImplementation;

public class MaxPQ<Key extends Comparable<Key>> {
		private Key[] priorityQueue;
		private int capacity = 0;
		private Key val;

		public MaxPQ(int max) {
			priorityQueue = (Key[]) new Comparable[max + 1];
		}

		public boolean isEmpty() {
			return capacity == 0;
		}

		public int size() {
			return capacity;
		}

		public void insert(Key key) {
			priorityQueue[++capacity] = key;
			if (capacity == 1 || val.compareTo(key) > 0) {
				val = key;
			}
			swim(capacity);
		}

		public Key delMax() {
			Key max = priorityQueue[1];
			exch(1, capacity--);
			priorityQueue[capacity + 1] = null;
			sink(1);
			if (isEmpty()) {
				val = null;
			}
			return max;
		}

		private boolean less(int i, int j) {
			return priorityQueue[i].compareTo(priorityQueue[j]) < 0;
		}

		private void exch(int i, int j) {
			Key t = priorityQueue[i];
			priorityQueue[i] = priorityQueue[j];
			priorityQueue[j] = t;
		}

		private void swim(int k) {
			while (k > 1 && less(k / 2, k)) {
				exch(k / 2, k);
				k = k / 2;
			}
		}

		private void sink(int k) {
			while (2 * k <= capacity) {
				int j = 2 * k;
				if (j < capacity && less(j, j + 1)) {
					j++;
				}
				if (!less(k, j)) {
					break;
				}
				exch(k, j);
				k = j;
			}
		}

	
		public Key min() {
			return val;
		}
		
		 public static void main(String[] args) {
		        MaxPQ<Integer> priorityQueue = new MaxPQ<Integer>(10);  
		        priorityQueue.insert(1);
		        priorityQueue.insert(9);
		        priorityQueue.insert(0);
		        priorityQueue.insert(9);
		        priorityQueue.insert(10);
		        priorityQueue.insert(78);      
		        priorityQueue.insert(90);
		        priorityQueue.insert(23);      
		        priorityQueue.insert(2);    
		       
		        
		        
		        
		        while(!priorityQueue.isEmpty()) {
		        	System.out.println(priorityQueue.delMax()+" ");
		        }
		    }
	}

