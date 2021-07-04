package com.devleague.portalnoticias.Controller.Cliente;

import com.devleague.portalnoticias.Model.Cliente;

public class UpdateClienteController {

    public static boolean update(Cliente cliente) {
        try {
            cliente.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
