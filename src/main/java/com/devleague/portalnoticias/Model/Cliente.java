package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Cliente {

    private UUID id;
    private String nome;
    private boolean fisico;
    private boolean pagante;
    private boolean bloqueado;

    public Cliente(){
        super();
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFisico() {
        return fisico;
    }

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }

    public boolean isPagante() {
        return pagante;
    }

    public void setPagante(boolean pagante) {
        this.pagante = pagante;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Cliente get( UUID id){
        try {
            List<Cliente> list  = DB.cliente
                    .stream()
                    .filter(cliente-> cliente.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.cliente;
    }

    public boolean create(){
        try{
            DB.cliente.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.cliente.set(DB.cliente.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.cliente.remove(DB.cliente.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
