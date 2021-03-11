/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosHerencia;

import java.util.Calendar;
import static java.util.Calendar.YEAR;

public class BonoBus {

    private int id;
    private int saldo = 0;
    private Calendar fechaCreacion;
    private Calendar fechaValidez;
    final static float PRECIO_BILLETE = 1.5f;
    static int contador = 0;

    public BonoBus() {
        id = contador++;
        fechaCreacion = Calendar.getInstance();
        fechaValidez = Calendar.getInstance();
        fechaValidez.add(YEAR, 2);
    }

    
    
    
    public boolean pagarViaje() {

        if (saldo < PRECIO_BILLETE) {
            System.out.println("Bajate que no tienes dinero pae");
            return false;
        } else {
            saldo -= PRECIO_BILLETE;
            return true;
        }
    }

    public void nViajes(int cantidad) {
        saldo -= PRECIO_BILLETE * cantidad;
    }

    public void recarga(int dinero) {
        saldo = dinero;
    }

    public int getSaldo() {
        return saldo;
    }

    public Calendar getFechaValidez() {
        return fechaValidez;
    }
    
    
    
    
    
    
}
