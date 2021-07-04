package com.devleague.portalnoticias.Controller.Cliente;

import com.devleague.portalnoticias.Model.Cliente;

public class CreateClienteController {
    public static boolean add(Cliente cliente) {
        try {
            cliente.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
