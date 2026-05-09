/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffettathreadrelay;

/**
 *
 * @author onorati.nicolo
 */
public class Atleta extends Thread {
    private Staffetta staffetta;
    private int metriPercorsi = 0;

    public Atleta(Staffetta staffetta) {
        this.staffetta = staffetta;
    }

    @Override
    public void run() {
        while (metriPercorsi < 100) {
            metriPercorsi++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }

    public int getMetriPercorsi() {
        return metriPercorsi;
    }
}
