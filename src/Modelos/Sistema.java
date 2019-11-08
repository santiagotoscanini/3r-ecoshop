package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Sistema {

    private static final List<Usuario> usuarios = new LinkedList<>();
    private static final List<Sucursal> sucursales = new LinkedList<>();
    private static final List<Factura> facturas = new LinkedList<>();
    private static final List<Alimento> alimentos = new LinkedList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFactura(Factura factura) {
        facturas.add(factura);
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void addAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }
}
