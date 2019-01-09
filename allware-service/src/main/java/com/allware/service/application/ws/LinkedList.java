package com.allware.service.application.ws;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * lista linkeada generica creada por mi.
 * @param <E> tipo de dato a utilizar en la lista linkeada.
 */
public class LinkedList<E> implements Serializable {
    /**
     * Nombre : LOGGER.
     * Descripcion : LOGGER de la clase.
     */
    private static final Logger LOGGER = Logger.getLogger(LinkedList.class.getName());
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
        LOGGER.info("entrando al metodo add");
        try {
            if (head == null) {
                head = new Nodo<E>(o);
            } else {
                Nodo temp = head;
                Nodo nuevo = new Nodo<E>(o);
                nuevo.add(temp);
                head = nuevo;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo add");
    }

    /**
     * ver nodo
     * @param index posicion a mostrar
     * @return objeto en la posicion index.
     */
    Object see(int  index){
        LOGGER.info("entrando al metodo see");
        Nodo temp = head;
        try {
            for (int i = 0; i < index; i++) {
                temp = temp.seeNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo see");
        return temp.seeData();
    }
}
