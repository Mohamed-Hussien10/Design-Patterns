public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("Root");
        root.add(new Leaf("Leaf 1", 10));
        root.add(new Leaf("Leaf 2", 20));
        root.add(new Leaf("Leaf 3", 30));
        root.add(new Leaf("Leaf 4", 40));
        root.add(new Leaf("Leaf 5", 50));
        root.add(new Leaf("Leaf 6", 60));
        root.add(new Leaf("Leaf 7", 70));
        root.add(new Leaf("Leaf 8", 80));
        root.add(new Leaf("Leaf 9", 90));
        root.add(new Leaf("Leaf 10", 100));
        root.add(new Composite("Composite 1"));

        root.displayPrice();
    }
}
