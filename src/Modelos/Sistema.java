package Modelos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sistema {

    private static int cantEnvReu = 0;
    private static int cantEnvComp = 0;
    private static Usuario selectedUser;

    private static final double pesoEnKilos = 0.14;
    private static final List<Sucursal> sucursales = new LinkedList<>();
    private static final List<Usuario> ranking = new LinkedList<>();
    private static final List<Par> alimentos = new LinkedList<>();
    private static final DateFormat formato = new SimpleDateFormat("dd/mm/YYYY HH:mm");

    public void setSelectedUser(Usuario user) {
        selectedUser = user;
    }

    public Usuario getSelectedUser() {
        return selectedUser;
    }

    public void addSucursal(Sucursal suc) {
        sucursales.add(suc);
    }

    public void eliminarSucursalPorId(int id) {
        int i;
        boolean encontre = false;
        for (i = 0; i < sucursales.size(); i++) {
            Sucursal sucursal = sucursales.get(i);
            if (sucursal.getId() == id) {
                encontre = true;
                break;
            }
        }
        if (encontre) {
            sucursales.remove(i);
        }
    }

    public void eliminarAlimentoPorId(int id) {
        int i;
        for (i = 0; i < alimentos.size(); i++) {
            Alimento alimento = (Alimento) alimentos.get(i).getPrimerValor();
            if (alimento.getId() == id) {
                break;
            }
        }
        alimentos.remove(i);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addUsuario(Usuario user) {
        ranking.add(user);
    }

    public List<Usuario> getRanking() {
        Collections.sort(ranking);
        return ranking;
    }

    public Alimento[] getMasVendidos() {
        Collections.sort(alimentos);
        Alimento[] alimentosMasVendidos = new Alimento[alimentos.size()];
        for (int i = 0; i < alimentos.size(); i++) {
            alimentosMasVendidos[alimentos.size() - i - 1] = (Alimento) alimentos.get(i).getPrimerValor();

        }
        return alimentosMasVendidos;
    }

    public void addCantidadAlimento(int id, int cantidad) {
        for (int i = 0; i < alimentos.size(); i++) {
            Par par = alimentos.get(i);
            Alimento alim = (Alimento) par.getPrimerValor();
            if (alim.getId() == id) {
                alimentos.get(i).setSegundoValor((int) par.getSegundoValor() + cantidad);
                break;
            }
        }
    }

    public void addAlimento(Alimento alimento) {
        alimentos.add(new Par(alimento, 0));
    }

    public Alimento getMaxAlimento() {
        Alimento mayor = null;
        int mayorActual = 0;
        for (Par a : alimentos) {
            Alimento alimento = (Alimento) a.getPrimerValor();
            int cantidad = (int) a.getSegundoValor();
            if (cantidad > mayorActual) {
                mayorActual = cantidad;
                mayor = alimento;
            }
        }
        return mayor;
    }

    public List<Alimento> getAlimentos() {
        List<Alimento> auxAlimentos = new LinkedList<>();
        for (Par p : alimentos) {
            auxAlimentos.add((Alimento) p.getPrimerValor());
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

    public void eliminarElementoPorId(int id) {
        int i;
        for (i = 0; i < this.getSelectedUser().getElementosCarrito().size(); i++) {
            if (this.getSelectedUser().getElementosCarrito().get(i).getAlimento().getId() == id) {
                break;
            }
        }
        this.getSelectedUser().getElementosCarrito().remove(i);
    }

    public Alimento getAlimento(int id) {
        int i;
        List<Alimento> alimentosAux = this.getAlimentos();
        for (i = 0; i < alimentosAux.size(); i++) {
            if (alimentosAux.get(i).getId() == id) {
                break;
            }
        }
        assert (i <= alimentosAux.size());
        return alimentosAux.get(i);
    }

    public int getIndexOfAlimento(int id) {
        int i;
        List<Alimento> alimentosAux = this.getAlimentos();
        for (i = 0; i < alimentosAux.size(); i++) {
            if (alimentosAux.get(i).getId() == id) {
                break;
            }
        }
        assert (i <= alimentosAux.size());
        return i;

    }
}
