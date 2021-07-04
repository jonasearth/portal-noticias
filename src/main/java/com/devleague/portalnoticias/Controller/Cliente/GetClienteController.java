package com.devleague.portalnoticias.Controller.Cliente;

import com.devleague.portalnoticias.Model.Cliente;

import java.util.ArrayList;
import java.util.UUID;

public class GetClienteController {
    public static Cliente get( UUID id) {
        Cliente cliente = new Cliente();
        try {
            return cliente.get(id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Cliente> getAll() {
        Cliente cliente = new Cliente();
        try {
            return cliente.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
