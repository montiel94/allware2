package com.allware.service.application.ws;
import javax.jws.WebService;
import javax.jws.WebMethod;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * servicio web soap.
 */
@WebService
public class AllwareService implements Serializable {

    /**
     * Nombre : LOGGER.
     * Descripcion : LOGGER de la clase.
     */
    private static final Logger LOGGER = Logger.getLogger(AllwareService.class.getName());

    /**
     * metodo que se comunica con el cliente app.
     * @return lista linkeada.
     */
    @WebMethod
    public java.util.LinkedList getLinkedList() {
        LOGGER.info("entrando al metodo getLinkedList");

        java.util.LinkedList names = new java.util.LinkedList<String>();
        try {
         /*
            prueba de metodo de lista linkeada generica creada por mi.
         */
            testLinkedList();
            names.add("Rams");
            names.add("Posa");
            names.add("Chinni");
            names = new java.util.LinkedList<Integer>();
            names.add(2011);
            names = new java.util.LinkedList<String>();
            names.add("china");
            names.add("peru");
            names.add("argentina");
            names.add("italia");
            names.add("espana");
        } catch (Exception e ) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo getLinkedList");
        return names;
    }
    /**
            prueba de metodo de lista linkeada generica creada por mi.
    */
    public void testLinkedList (){
        LOGGER.info("entrando al metodo testLinkedList");
        try {
            LinkedList list = new LinkedList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list = new LinkedList<String>();
            list.add("aa");
            list.add("bb");
            list.add("cc");
            list.add("dd");
            list.add("dd");
            System.out.println(list.see(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo testLinkedList");
    }
}

