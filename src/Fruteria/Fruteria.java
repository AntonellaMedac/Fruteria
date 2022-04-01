package Fruteria;

import java.util.ArrayList;

public class Fruteria {

    private String nombre;
    private ArrayList<Cliente> listaClientesNoAtendidos;
    private ArrayList<Cliente> listaClientesAtendidos;
    private int contadorClientes;

    public Fruteria(String nombre) {
        this.setFruteria(nombre);
        this.listaClientesAtendidos = new ArrayList<>();
        this.listaClientesNoAtendidos = new ArrayList<>();
        this.setContadorClientes(0);
    }

    public String getFruteria() {
        return this.nombre;
    }

    public void setFruteria(String fruteria) {
        this.nombre = fruteria;
    }

    public ArrayList<Cliente> getListaClientesNoAtendidos() {
        return this.listaClientesNoAtendidos;
    }

    public void setListaClientesNoAtendidos(ArrayList<Cliente> listaClientesNoAtendidos) {
        this.listaClientesNoAtendidos = listaClientesNoAtendidos;
    }

    public ArrayList<Cliente> getListaClientesAtendidos() {
        return this.listaClientesAtendidos;
    }

    public void setListaClientesAtendidos(ArrayList<Cliente> listaClientesAtendidos) {
        this.listaClientesAtendidos = listaClientesAtendidos;
    }

    public int getContadorClientes() {
        return this.contadorClientes;
    }

    public void setContadorClientes(int contadorClientes) {
        this.contadorClientes = contadorClientes;
    }

    private int buscarCliente(int ticket){
        int posicion = -1;
        int i = 0;
        while (i < this.listaClientesNoAtendidos.size() && this.listaClientesNoAtendidos.get(i).getnTicket() != ticket){
            i++;
        }
        if (i < this.listaClientesNoAtendidos.size()) {
            posicion = i;
        }
        return posicion;
    }
    public int adelantar(int ticket) {
        int posicion = this.buscarCliente(ticket);
        Cliente clientePos = null;
        if (posicion >= 0 && posicion != 0) {
            clientePos = this.listaClientesNoAtendidos.get(posicion);
            this.listaClientesNoAtendidos.get(posicion - 1);
            this.listaClientesNoAtendidos.set(posicion - 1, clientePos);
            return posicion;
        }
        return posicion;
    }

    public int retrasar(int ticket) {
       int posicion = this.buscarCliente(ticket);
        if (posicion >= 0 && posicion != this.listaClientesNoAtendidos.size() - 1) {
            this.listaClientesNoAtendidos.set(posicion, this.listaClientesNoAtendidos.get(posicion + 1));
            return posicion;
        }

        return posicion;
    }

    public boolean dejarPasar() {
        if (this.listaClientesNoAtendidos.get(1) == null) {
            return false;
        } else {
            Cliente clienteDejaPasar = this.listaClientesNoAtendidos.get(0);
            this.listaClientesNoAtendidos.set(0, this.listaClientesNoAtendidos.get(1));
            this.listaClientesNoAtendidos.set(1, clienteDejaPasar);
            return true;
        }
    }

        @Override
        public String toString(){
            String frase = "";
            frase += "Fruteria " + this.nombre;
            frase += "\nClientes atendidos: " + this.contadorClientes;
        return frase;
        }
    }
