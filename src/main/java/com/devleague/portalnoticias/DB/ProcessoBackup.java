package com.devleague.portalnoticias.DB;

public class ProcessoBackup implements Runnable{
    public ProcessoBackup(DB db) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            db.backup();
        }
    }
    public void run() {
    }
}
