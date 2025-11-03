package Git2;

public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;

    public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
    //getters and setters
    public T getData() {
        return data;
    }
    public DoubleNode<T> getNext() {
        return next;
    }
    public DoubleNode<T> getPrevious() {
        return previous;
    }

    public void setData(T data) {
        this.data = data;
    }
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }
    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }
    /* exemplo de instanciação do DoubleNode<T>
    DoubleNode<Computador> db = new DoubleNode<>();
    DoubleNode<Projetor> db2 = new DoubleNote<>();
    Projetor p =new Projetor();
    Computador c = new Computador();
    db.setData(c);
    db2.set
    */
}
