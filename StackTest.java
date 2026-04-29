public class StackTest {
    public static void main(String[] args) {
        Stack testStack = new Stack();
        testStack.isEmpty();
        testStack.push("first");
        testStack.isEmpty();
        testStack.push("second");
        Object top1 = testStack.peek();
        System.out.println(top1);
        testStack.isEmpty();
        Object top2 = testStack.pop();
        System.out.println(top2);
        testStack.isEmpty();
        Object top3 = testStack.pop();
        System.out.println(top3);
        // testStack.pop();
        testStack.peek();

    }

}
