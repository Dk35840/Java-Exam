package mB1.ch3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Pg137 {

	public static void main(String[] args) {
		// FIFO single ended queue
		// people say offer/poll/peek.
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); // true
		System.out.println(queue.offer(4)); // true
		System.out.println(queue.peek()); // 10
		System.out.println(queue.poll()); // 10
		System.out.println(queue.poll()); // 4
		System.out.println(queue.peek()); // null

		// about LIFO (stack), people say push/pop/peek.
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		System.out.println(stack.peek()); // 4
		System.out.println(stack.poll()); // 4
		System.out.println(stack.poll()); // 10
		System.out.println(stack.peek());
	}

}
