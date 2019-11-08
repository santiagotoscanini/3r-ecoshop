package Modelos;

import java.util.LinkedList;
import java.util.List;

public class Sistema {

    private final List<Usuario> usuarios;
    private final List<Sucursal> sucursales;
    private final List<Factura> facturas;
    private final List<Alimento> alimentos;

    public Sistema() {
        this.usuarios = new LinkedList<>();
        this.sucursales = new LinkedList<>();
        this.facturas = new LinkedList<>();
        this.alimentos = new LinkedList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void addFactura(Factura factura) {
        this.facturas.add(factura);
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void addAlimento(Alimento alimento) {
        this.alimentos.add(alimento);
    }
}
