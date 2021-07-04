package com.devleague.portalnoticias.Controller.Cliente;

import com.devleague.portalnoticias.Model.Cliente;

public class DeleteClienteController {
    public static boolean delete(Cliente cliente) {
        try {
            cliente.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
