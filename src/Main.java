public class Main {

    private static MyLinkedList list = new MyLinkedList(null);
    private static SearchTree tree = new SearchTree(null);
    public static void main(String[] args) {
        //Trying to traverse an empty list --> Output: The list is empty
        list.traverse(list.getHead());
        tree.traverse(tree.getHead());

        String string_data = "Alpha Charlie Lima Foxtrot Juliet Hotel India Bravo";
        String[] data = string_data.split(" ");

        //Adding the data to the custom linked list
        for(String s: data) {
            list.add(new Node(s));
        }

        //Adding the data to the custom binary search tree
        for(String s: data) {
            tree.add(new Node(s));
        }

        //Printing the list in alphabetical/numerical order
        System.out.println("First Linked List");
        list.traverse(list.getHead());

        //Adding new items to the list
        list.add(new Node("Delta"));
        list.add(new Node("Delta")); // Cannot add duplicate items
        list.add(new Node("Zulu"));
        list.add(new Node("Sierra"));
        System.out.println("Second Linked List -- After adding three new items");
        list.traverse(list.getHead()); // Printing the list to see the new additions

        //Removing items from the list
        list.remove(new Node("Delta"));
        list.remove(new Node("Alpha"));
        list.remove(new Node("X-Ray")); // Cannot remove items that aren't in the list
        list.remove(new Node("Lima"));
        System.out.println("Third Linked List -- After removing three items");
        list.traverse(list.getHead()); // Printing the list after removing three items


        // TREE LIST STARTS BELOW



        //Printing the list in alphabetical/numerical order
        System.out.println("First Tree List");
        tree.traverse(tree.getHead());

        //Adding new items to the list
        tree.add(new Node("Delta"));
        tree.add(new Node("Delta")); // Cannot add duplicate items
        tree.add(new Node("Zulu"));
        tree.add(new Node("Sierra"));
        System.out.println("Second Tree List -- After adding three new items");
        tree.traverse(tree.getHead()); // Printing the list to see the new additions

        //Removing items from the list
        tree.remove(new Node("Delta"));
        tree.remove(new Node("Alpha"));
        tree.remove(new Node("X-Ray")); // Cannot remove items that aren't in the list
        tree.remove(new Node("Lima"));
        System.out.println("Third Tree List -- After removing three items");
        tree.traverse(tree.getHead()); // Printing the list after removing three items
    }
}
