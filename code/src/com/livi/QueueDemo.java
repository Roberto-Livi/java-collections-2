package com.livi;

import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        for(int i = 0; i > 0; i--) {
            q.add(i);
        }

        // Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        // PriorityQueue sorts the data for us

        // Peeking -> Obtaining the head of queue
        // Polling -> Remove the head of queue

        System.out.println(q.peek());  // Head of queue: 1
        q.poll();  // Removing the head 1
        System.out.println("Queue size after poll is " + q.size());
        System.out.println(q.peek()); // New head of queue: 2
    }

}
