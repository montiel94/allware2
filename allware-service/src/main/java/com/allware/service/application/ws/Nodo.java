package com.allware.service.application.ws;

import java.io.Serializable;

/**
 * nodo de lista generic
 * @param <E>
 */
public class Nodo<E> implements Serializable {
    /**
     * proximo nodo.
     */
    private Nodo next;
    /**
     * data dentro del nodo.
     */
    private E data;

    /**
     * constructor del nodo.
     * @param data
     */
    Nodo(E data) {
        this.data = data;
        this.next = null;
    }

    /**
     * ver proximo nodo
     * @return proximo nodo.
     */
    Nodo seeNext() {
        return this.next;
    }

    /**
     * agregar nodo
     * @param n
     */
    void add(Nodo n){
        this.next = n;
    }

    /**
     * ver data del nodo.
     * @return
     */
    Object seeData() {
        return this.data;
    }
}
