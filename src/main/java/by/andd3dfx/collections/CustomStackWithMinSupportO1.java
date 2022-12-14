package by.andd3dfx.collections;

import java.util.Stack;

/**
 * Напишите стек, который поддерживает следующие операции:
 * <pre>
 * push(x) – кладет элемент в стек
 * pop() – берет элемент из стека
 * getMin() – возвращает значение минимального элемента в стеке
 * </pre>
 * Методы pop() и getMin() вызываются всегда для непустого стека.
 * <p>
 * push() and getMin() should have O(1) complexity.
 */
public class CustomStackWithMinSupportO1 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minElementsStack = new Stack<>();

    public void push(int element) {
        stack.push(element);

        if (minElementsStack.isEmpty()) {
            minElementsStack.push(element);
            return;
        }

        if (element <= minElementsStack.peek()) {
            minElementsStack.push(element);
        }
    }

    public int pop() {
        Integer result = stack.pop();
        if (minElementsStack.peek() == result) {
            minElementsStack.pop();
        }
        return result;
    }

    public int getMin() {
        return minElementsStack.peek();
    }
}
