public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3, "John");
        tree.insert(8, "T1000");
        tree.insert(1, "Sara");
        tree.insert(2, "T800");

        Node findJohn = tree.find(3);
        findJohn.printNode();

        tree.print(findJohn);
    }
}
