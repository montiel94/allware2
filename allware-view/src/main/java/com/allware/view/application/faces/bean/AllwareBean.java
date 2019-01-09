package com.allware.view.application.faces.bean;

import com.allware.service.application.ws.AllwareService;
import com.allware.service.application.ws.AllwareServiceService;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * bean que se comunica con el servidor web.
 */
@Named
@ViewScoped
public class AllwareBean implements Serializable {

    /**
     * metodo que llama servidor web
     * @return lista de objectos genericos.
     */
    public List<Object> connectToServer() {
        List<Object> list = null;
        try {
            AllwareServiceService service = new AllwareServiceService();
            AllwareService server = service.getAllwareServicePort();
            list = server.getLinkedList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
