package local.exercises;

import java.util.LinkedList;
import java.util.Deque;

public class StackMax<T extends Comparable<T>> {
    private final Deque<T> stackData = new LinkedList<>();
    private final Deque<T> stackMax = new LinkedList<>();

    public void push(T element) {
        if (element != null) {
            stackData.addFirst(element);

            T maxElement = stackMax.peekFirst();
            if (maxElement == null || maxElement != null && element.compareTo(maxElement) >= 0) {
                stackMax.addFirst(element);
            }
        }
    }

    public T pop() {
        T element = stackData.pollFirst();
        T maxElement = stackMax.peekFirst();

        if (element != null && maxElement != null && element.compareTo(maxElement) == 0) {
            stackMax.pollFirst();
        }

        return element;
    }

    public T max() {
        return stackMax.peekFirst();
    }
}
