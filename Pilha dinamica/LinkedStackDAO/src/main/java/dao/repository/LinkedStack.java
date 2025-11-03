package Git2;
import java.util.NoSuchElementException;

/**
 * Implementação de uma pilha dinâmica genérica
 * @param <T>, tipo de dado que será armazenado
 * @author Ana clara
 * @version 1.0
 * @since 06/10/2025
 */

public class LinkedStack<T> implements Stackable<T> {
    /** aponta para o topo da pilha*/
    private DoubleNode<T> topPoiner;
    /** indica o número atual de dados na pilha*/
    private int numberElements;
    /** indica o número maximo de elementos que a pilha pode ter*/
    private int maxElementes;
    /**
     * Construtor que não recebe parâmetros, cria uma pilha tamanho 10
     *
     */
    public LinkedStack() {
        this(10);
    }
    /**
     * Construtor que recebe um inteiro
     *
     * @param maxElements, contém o número máximo de elementos que pode conter na pilha
     */
    public LinkedStack(int maxElements){
        topPoiner = null;
        numberElements = 0;
        this.maxElementes = maxElements;
    }
    /**
     * Verifica se a pilha esta vazia
     *
     * @return retorna True se a pilha estiver vazia
     */
    @Override
    boolean isEmpty(){
        return numberElements == 0;
    }
    @Override
    boolean isFull(){
        return numberElements == maxElements;
    }
    /**
     * Retorna elemento do topo da pilha
     *
     * @return retorna elemento do topo da pilha
     * @throws  NoSuchElementException , quando a pilha esta vazia.
     */
    @Override
    public T peek(){
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return topPoiner.getData();
    }
    /**
     * Desempilha pilha
     *
     * @return retorna elemento removido do topo da pilha
     * @throws  NoSuchElementException , quando a pilha esta vazia.
     */
    @Override
    public T pop(){
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        numberElements--;
        T auxData = topPoiner.getData();
        topPointer = topPointer.getPrevious();
        topPointer.setNext(null);
        return auxData;
    }
    /**
     * desempilha da pilha
     *
     * @return retorna elemento do topo da pilha
     * @throws  NoSuchElementException , quando a pilha esta cheia.
     */
    @Override
    public push(T Data){
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is full!");
        }
        DoubleNode<T> newNote = new DoubleNode<>();
        newNode.setData(data);
        topPointer.setNext(newNode);
        newNode.setPrevious(topPoiner);
        topPoiner = newNote;
        numberElements++;
    }
    @Override
    public void update(T newData){
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        topPointer.setData(newData);
    }
    /**
     * Imprime elementos da pilha
     *
     * @return
     */
    public String print(){
        String result = "";
        for (int i = 0; i < numberElements; i++) {
            result += topPoiner.getData();
            auxPointer = auxPointer.getPrevious();
            if ( i != numberElementes -1) {
                result += ",";
            }
        }
        return null;
    }
}
