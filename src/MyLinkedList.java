public class MyLinkedList implements NodeList{
    private ListItem head = null;

    public MyLinkedList(ListItem head) {
        this.head = head;
    }

    @Override
    public ListItem getHead() {
        return head;
    }


    @Override
    public boolean add(ListItem newItem) {
        if (this.head == null) {
            // The list was empty, so this item becomes the head of the list
            this.head = newItem;
            return true;
        }

        ListItem currentItem = this.head;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.head).setPrevious(newItem);
                    this.head = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " already exists in the list");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean remove(ListItem item) {
//        if (item != null) {
//            System.out.println("Deleting item " + item.getData());
//        }

        ListItem currentItem = this.head;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                System.out.println("Deleting item: " + item.getValue());
                if (currentItem == this.head) {
                    this.head = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                System.out.println(item.getValue() + " is not in the list");
                return false;
            }
        }

        // We have reached the end of the list
        // Without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem head) {
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            while (head != null) {
                System.out.println(head.getValue());
                head = head.next();
            }
        }
        System.out.println();
    }
}
