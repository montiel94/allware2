package com.allware.service.application.ws;

import java.io.Serializable;

/**
 * lista linkeada generica creada por mi.
 * @param <E> tipo de dato a utilizar en la lista linkeada.
 */
public class LinkedList<E> implements Serializable {
    /**
     * nodo cabezera.
     */
    private Nodo head;

    /**
     * constructor
     */
    LinkedList() {
        head = null;
    }

    /**
     * agregar nodo
     * @param o nodo de tipo generic.
     */
    void add(E o) {
        if(head==null){
            head = new Nodo<E>(o);
        } else {
            Nodo temp = head;
            Nodo nuevo =  new Nodo<E>(o);
            nuevo.add(temp);
            head =  nuevo;
        }
    }

    /**
     * ver nodo
     * @param index posicion a mostrar
     * @return objeto en la posicion index.
     */
    Object see(int  index){
        Nodo temp = head;
        for (int i = 0; i<index;i++) {
            temp = temp.seeNext();
        }
        return temp.seeData();
    }
}
