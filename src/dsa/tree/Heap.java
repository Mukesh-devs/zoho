package dsa.tree;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(9);
//        Collections.reverse(minHeap);
        maxHeap = new PriorityQueue<>(minHeap);
        System.out.println(maxHeap);
        System.out.println();
    }
}
