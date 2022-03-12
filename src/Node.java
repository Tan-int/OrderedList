public class Node extends ListItem{
    public Node(Object data) {
        super(data);
    }

    @Override
    ListItem next() {
        return nextItem;
    }

    @Override
    ListItem previous() {
        return previousItem;
    }

    @Override
    ListItem setNext(ListItem item) {
        return nextItem = item;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return previousItem = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
