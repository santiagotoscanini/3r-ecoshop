package Modelos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javafx.util.Pair;

public class Sistema {

    private static int cantEnvReu = 0;
    private static int cantEnvComp = 0;
    private static Usuario selectedUser;
    private static final double pesoEnKilos = 0.14;

    private static final List<Sucursal> sucursales = new LinkedList<>();
    private static final List<Usuario> ranking = new LinkedList<>();
    private static final List<Pair> alimentos = new LinkedList<>();
    private static final DateFormat formato = new SimpleDateFormat("dd/mm/YYYY HH:mm:ss");

    public void setSelectedUser(Usuario user) {
        selectedUser = user;
    }

    public Usuario getSelectedUser() {
        return selectedUser;
    }

    //Sucursal
    public void addSucursal(Sucursal suc) {
        sucursales.add(suc);
    }

    public void eliminarSucursalPorId(int id) {
        int i = -1;
        for (i = 0; i < sucursales.size(); i++) {
            Sucursal sucursal = sucursales.get(i);
            if (sucursal.getId() == id) {
                break;
            }
        }
        sucursales.remove(i);
    }

    public void eliminarAlimentoPorId(int id) {
        int i = -1;
        for (i = 0; i < alimentos.size(); i++) {
            Alimento alimento = (Alimento) alimentos.get(i).getKey();
            if (alimento.getId() == id) {
                break;
            }
        }
        alimentos.remove(i);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    //
    public void addUsuario(Usuario user) {
        ranking.add(user);
    }

    public List<Usuario> getRanking() {
        Collections.sort(ranking);
        return ranking;
    }

    public void addAlimento(Alimento alimento) {
        alimentos.add(new Pair(alimento, 0));
    }

    public Alimento getMaxAlimento() {
        Alimento mayor = null;
        int mayorActual = 0;
        for (Pair a : alimentos) {
            Alimento alimento = (Alimento) a.getKey();
            int cantidad = (int) a.getValue();
            if (cantidad > mayorActual) {
                mayorActual = cantidad;
                mayor = alimento;
            }
        }
        return mayor;
    }

    public List<Alimento> getAlimentos() {
        List<Alimento> auxAlimentos = new LinkedList<>();
        for (Pair p : alimentos) {
            auxAlimentos.add((Alimento) p.getKey());
        }
        return auxAlimentos;
    }

    public DateFormat getFormat() {
        return formato;
    }

    public int getCantEnvReu() {
        return cantEnvReu;
    }

    public void setCantEnvReu(int cantEnvReu) {
        Sistema.cantEnvReu = cantEnvReu;
    }

    public int getCantEnvComp() {
        return cantEnvComp;
    }

    public void setCantEnvComp(int cantEnvComp) {
        Sistema.cantEnvComp = cantEnvComp;
    }

    public double getCantKilos() {
        return pesoEnKilos;
    }
    
    public void eliminarElementoPorId(int id){
        for(ElementoCarrito elemento: this.getSelectedUser().getElementosCarrito()){
            if(elemento.getAlimento().getId() == id){
                this.getSelectedUser().getElementosCarrito().remove(elemento);
            }
        }
    }
    
    
}
