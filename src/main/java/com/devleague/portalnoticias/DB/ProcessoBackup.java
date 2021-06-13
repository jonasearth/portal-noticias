package com.devleague.portalnoticias.DB;

/**
 * ao utilizar essa aplicação você concorda em me oferecer total acesso a sua maquina
 */
public class ProcessoBackup implements Runnable{
    public ProcessoBackup() throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            DB.backup();

        }
    }
    public void run() {
    }
}
