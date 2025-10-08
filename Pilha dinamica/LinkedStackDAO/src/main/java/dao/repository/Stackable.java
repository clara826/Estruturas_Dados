public interface Stackable<T> {
    T pop();
    push(T Data);
    void update(T newData);
    T peek();
    boolean isEmpty();
    boolean isFull();
    Stringprint();
}
