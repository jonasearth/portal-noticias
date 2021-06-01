package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;

public class Model {

    public Object get(DB db, int index){
        return db.getDB(db, super.getClass().getSimpleName()).get(index);
    }
    public ArrayList getAll(DB db){

        return db.getDB(db, super.getClass().getSimpleName());
    }
    public  Object create(DB db,Object obj){
        try{
            db.getDB(db, super.getClass().getSimpleName()).add(obj);
            return  true;
        }catch (Exception e) {
            return false;
        }
    }
    public  boolean update(DB db, int index, Object obj){
        try{
            db.getDB(db, super.getClass().getSimpleName()).set(index, obj);
            return  true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean delete(DB db, int index){
        try{
            db.getDB(db, super.getClass().getSimpleName()).remove(index);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
