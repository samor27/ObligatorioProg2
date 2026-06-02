package uy.edu.um.tad.heap;

public class EmptyHeapException extends RuntimeException {
    public EmptyHeapException() {
    }

    public EmptyHeapException(String message) {
        super(message);
    }
}
