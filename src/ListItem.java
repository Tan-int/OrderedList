public abstract class ListItem {
    protected ListItem nextItem;
    protected ListItem previousItem;
    protected Object data;

    public ListItem(Object data) {
        this.data = data;
    }

    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setNext(ListItem item);
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return data;
    }

    public void setValue(Object data) {
        this.data = data;
    }
}
