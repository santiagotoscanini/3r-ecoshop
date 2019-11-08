package Vistas;

import Modelos.Sistema;

public class Inicio extends javax.swing.JFrame {
    private final Sistema sis;
    
    public Inicio() {
        initComponents();
        sis = new Sistema();
        pnlDatos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTienda = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        pnlImagenUsuario = new javax.swing.JPanel();
        lblPuntosUsuario = new javax.swing.JLabel();
        btnMisDirecciones = new javax.swing.JButton();
        btnMisFavoritos = new javax.swing.JButton();
        btnMisLogros = new javax.swing.JButton();
        btnMiCarrito = new javax.swing.JButton();
        btnMisRecibos = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        pnlSecundario = new javax.swing.JPanel();
        tabTienda = new javax.swing.JTabbedPane();
        pnlTodo = new javax.swing.JPanel();
        pnlFrutosSecos = new javax.swing.JPanel();
        lblFrutosSecos = new javax.swing.JLabel();
        lblImagenFrutosSecos = new javax.swing.JLabel();
        pnlEspecialidades = new javax.swing.JPanel();
        lblEspecialidades = new javax.swing.JLabel();
        lblImagenEspecialidades = new javax.swing.JLabel();
        pnlFrutasCongeladas = new javax.swing.JPanel();
        lblFrutasCongeladas = new javax.swing.JLabel();
        lblImagenFrutasCongeladas = new javax.swing.JLabel();
        pnlRecomendado = new javax.swing.JPanel();
        pnlPuntosDeVenta = new javax.swing.JPanel();
        pnlEstadisticas = new javax.swing.JPanel();
        pnlPreVenta = new javax.swing.JPanel();
        pnlProducto1 = new javax.swing.JPanel();
        pnlPrecioP1 = new javax.swing.JPanel();
        btnAgregarP1 = new javax.swing.JButton();
        btnEditarP1 = new javax.swing.JButton();
        pnlProducto2 = new javax.swing.JPanel();
        pnlPrecioP2 = new javax.swing.JPanel();
        btnAgregarP2 = new javax.swing.JButton();
        btnEditarP2 = new javax.swing.JButton();
        pnlProducto3 = new javax.swing.JPanel();
        pnlPrecioP3 = new javax.swing.JPanel();
        btnAgregarP3 = new javax.swing.JButton();
        btnEditarP3 = new javax.swing.JButton();
        pnlProducto4 = new javax.swing.JPanel();
        pnlPrecioP4 = new javax.swing.JPanel();
        btnAgregarP4 = new javax.swing.JButton();
        btnEditarP4 = new javax.swing.JButton();
        pnlProducto5 = new javax.swing.JPanel();
        pnlPrecioP5 = new javax.swing.JPanel();
        btnAgregarP5 = new javax.swing.JButton();
        btnEditarP5 = new javax.swing.JButton();
        pnlProducto6 = new javax.swing.JPanel();
        pnlPrecioP6 = new javax.swing.JPanel();
        btnAgregarP6 = new javax.swing.JButton();
        btnEditarP6 = new javax.swing.JButton();
        pnlRecibos = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlFavoritos = new javax.swing.JPanel();
        pnlCarrito = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTienda.setBackground(new java.awt.Color(47, 24, 50));
        pnlTienda.setName("pnlTienda"); // NOI18N

        lblNombreUsuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(240, 240, 240));
        lblNombreUsuario.setText("María García");

        javax.swing.GroupLayout pnlImagenUsuarioLayout = new javax.swing.GroupLayout(pnlImagenUsuario);
        pnlImagenUsuario.setLayout(pnlImagenUsuarioLayout);
        pnlImagenUsuarioLayout.setHorizontalGroup(
            pnlImagenUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        pnlImagenUsuarioLayout.setVerticalGroup(
            pnlImagenUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblPuntosUsuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        lblPuntosUsuario.setForeground(new java.awt.Color(240, 240, 240));
        lblPuntosUsuario.setText("567pts.");

        btnMisDirecciones.setBackground(new java.awt.Color(223, 219, 222));
        btnMisDirecciones.setText("Mis direcciones");
        btnMisDirecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMisDireccionesMouseClicked(evt);
            }
        });
        btnMisDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisDireccionesActionPerformed(evt);
            }
        });

        btnMisFavoritos.setBackground(new java.awt.Color(223, 219, 222));
        btnMisFavoritos.setText("Mis favoritos");

        btnMisLogros.setBackground(new java.awt.Color(223, 219, 222));
        btnMisLogros.setText("Mis logros");

        btnMiCarrito.setBackground(new java.awt.Color(223, 219, 222));
        btnMiCarrito.setText("Mi carrito");
        btnMiCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiCarritoActionPerformed(evt);
            }
        });

        btnMisRecibos.setBackground(new java.awt.Color(223, 219, 222));
        btnMisRecibos.setText("Mis recibos");

        btnAyuda.setBackground(new java.awt.Color(223, 219, 222));
        btnAyuda.setText("Ayuda");

        javax.swing.GroupLayout pnlTiendaLayout = new javax.swing.GroupLayout(pnlTienda);
        pnlTienda.setLayout(pnlTiendaLayout);
        pnlTiendaLayout.setHorizontalGroup(
            pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiendaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMisRecibos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMisDirecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMisFavoritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMisLogros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMiCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTiendaLayout.createSequentialGroup()
                        .addComponent(btnAyuda)
                        .addGap(140, 140, 140)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTiendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblPuntosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        pnlTiendaLayout.setVerticalGroup(
            pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTiendaLayout.createSequentialGroup()
                        .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPuntosUsuario))
                    .addComponent(pnlImagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(btnMisDirecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMisRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMisFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMisLogros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMiCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(btnAyuda)
                .addContainerGap())
        );

        pnlTiendaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMiCarrito, btnMisDirecciones, btnMisFavoritos, btnMisLogros, btnMisRecibos});

        getContentPane().add(pnlTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 720));
        pnlTienda.getAccessibleContext().setAccessibleName("");
        pnlTienda.getAccessibleContext().setAccessibleDescription("");

        pnlSecundario.setBackground(new java.awt.Color(47, 24, 50));
        pnlSecundario.setForeground(new java.awt.Color(47, 24, 50));

        tabTienda.setBackground(new java.awt.Color(47, 24, 50));
        tabTienda.setForeground(new java.awt.Color(240, 240, 240));
        tabTienda.setToolTipText("\n");
        tabTienda.setFont(tabTienda.getFont());
        tabTienda.setName(""); // NOI18N

        pnlTodo.setBackground(new java.awt.Color(47, 24, 50));
        pnlTodo.setName(""); // NOI18N

        pnlFrutosSecos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFrutosSecos.setText("Frutos secos");

        lblImagenFrutosSecos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/frutos_secos.jpg"))); // NOI18N
        lblImagenFrutosSecos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenFrutosSecosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFrutosSecosLayout = new javax.swing.GroupLayout(pnlFrutosSecos);
        pnlFrutosSecos.setLayout(pnlFrutosSecosLayout);
        pnlFrutosSecosLayout.setHorizontalGroup(
            pnlFrutosSecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrutosSecosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFrutosSecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFrutosSecosLayout.createSequentialGroup()
                        .addComponent(lblFrutosSecos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblImagenFrutosSecos, javax.swing.GroupLayout.PREFERRED_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFrutosSecosLayout.setVerticalGroup(
            pnlFrutosSecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrutosSecosLayout.createSequentialGroup()
                .addComponent(lblFrutosSecos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenFrutosSecos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEspecialidades.setText("Especialidades de la casa");

        lblImagenEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/tartas.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlEspecialidadesLayout = new javax.swing.GroupLayout(pnlEspecialidades);
        pnlEspecialidades.setLayout(pnlEspecialidadesLayout);
        pnlEspecialidadesLayout.setHorizontalGroup(
            pnlEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEspecialidadesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEspecialidadesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblImagenEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 678, Short.MAX_VALUE))
                    .addGroup(pnlEspecialidadesLayout.createSequentialGroup()
                        .addComponent(lblEspecialidades)
                        .addGap(0, 513, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEspecialidadesLayout.setVerticalGroup(
            pnlEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEspecialidadesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblEspecialidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlFrutasCongeladas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFrutasCongeladas.setText("Frutas congeladas");

        lblImagenFrutasCongeladas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/frutas.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlFrutasCongeladasLayout = new javax.swing.GroupLayout(pnlFrutasCongeladas);
        pnlFrutasCongeladas.setLayout(pnlFrutasCongeladasLayout);
        pnlFrutasCongeladasLayout.setHorizontalGroup(
            pnlFrutasCongeladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrutasCongeladasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFrutasCongeladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenFrutasCongeladas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlFrutasCongeladasLayout.createSequentialGroup()
                        .addComponent(lblFrutasCongeladas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFrutasCongeladasLayout.setVerticalGroup(
            pnlFrutasCongeladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrutasCongeladasLayout.createSequentialGroup()
                .addComponent(lblFrutasCongeladas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenFrutasCongeladas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlTodoLayout = new javax.swing.GroupLayout(pnlTodo);
        pnlTodo.setLayout(pnlTodoLayout);
        pnlTodoLayout.setHorizontalGroup(
            pnlTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlEspecialidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFrutosSecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFrutasCongeladas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTodoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnlEspecialidades, pnlFrutosSecos});

        pnlTodoLayout.setVerticalGroup(
            pnlTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFrutosSecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFrutasCongeladas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabTienda.addTab("Todo", pnlTodo);

        pnlRecomendado.setBackground(new java.awt.Color(47, 24, 50));
        pnlRecomendado.setForeground(new java.awt.Color(47, 24, 50));

        javax.swing.GroupLayout pnlRecomendadoLayout = new javax.swing.GroupLayout(pnlRecomendado);
        pnlRecomendado.setLayout(pnlRecomendadoLayout);
        pnlRecomendadoLayout.setHorizontalGroup(
            pnlRecomendadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnlRecomendadoLayout.setVerticalGroup(
            pnlRecomendadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabTienda.addTab("Recomendado", pnlRecomendado);

        pnlPuntosDeVenta.setBackground(new java.awt.Color(47, 24, 50));

        javax.swing.GroupLayout pnlPuntosDeVentaLayout = new javax.swing.GroupLayout(pnlPuntosDeVenta);
        pnlPuntosDeVenta.setLayout(pnlPuntosDeVentaLayout);
        pnlPuntosDeVentaLayout.setHorizontalGroup(
            pnlPuntosDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnlPuntosDeVentaLayout.setVerticalGroup(
            pnlPuntosDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabTienda.addTab("Puntos de venta", pnlPuntosDeVenta);

        pnlEstadisticas.setBackground(new java.awt.Color(47, 24, 50));

        javax.swing.GroupLayout pnlEstadisticasLayout = new javax.swing.GroupLayout(pnlEstadisticas);
        pnlEstadisticas.setLayout(pnlEstadisticasLayout);
        pnlEstadisticasLayout.setHorizontalGroup(
            pnlEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnlEstadisticasLayout.setVerticalGroup(
            pnlEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        tabTienda.addTab("Estadísticas", pnlEstadisticas);

        pnlPreVenta.setBackground(new java.awt.Color(47, 24, 50));

        pnlProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlPrecioP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarP1.setText("+");

        javax.swing.GroupLayout pnlPrecioP1Layout = new javax.swing.GroupLayout(pnlPrecioP1);
        pnlPrecioP1.setLayout(pnlPrecioP1Layout);
        pnlPrecioP1Layout.setHorizontalGroup(
            pnlPrecioP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecioP1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarP1))
        );
        pnlPrecioP1Layout.setVerticalGroup(
            pnlPrecioP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEditarP1.setText("editar");

        javax.swing.GroupLayout pnlProducto1Layout = new javax.swing.GroupLayout(pnlProducto1);
        pnlProducto1.setLayout(pnlProducto1Layout);
        pnlProducto1Layout.setHorizontalGroup(
            pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrecioP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarP1))
        );
        pnlProducto1Layout.setVerticalGroup(
            pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(btnEditarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlPrecioP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pnlProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlPrecioP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarP2.setText("+");

        javax.swing.GroupLayout pnlPrecioP2Layout = new javax.swing.GroupLayout(pnlPrecioP2);
        pnlPrecioP2.setLayout(pnlPrecioP2Layout);
        pnlPrecioP2Layout.setHorizontalGroup(
            pnlPrecioP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecioP2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarP2))
        );
        pnlPrecioP2Layout.setVerticalGroup(
            pnlPrecioP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEditarP2.setText("editar");

        javax.swing.GroupLayout pnlProducto2Layout = new javax.swing.GroupLayout(pnlProducto2);
        pnlProducto2.setLayout(pnlProducto2Layout);
        pnlProducto2Layout.setHorizontalGroup(
            pnlProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrecioP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProducto2Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(btnEditarP2))
        );
        pnlProducto2Layout.setVerticalGroup(
            pnlProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto2Layout.createSequentialGroup()
                .addGap(0, 195, Short.MAX_VALUE)
                .addComponent(btnEditarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPrecioP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlPrecioP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarP3.setText("+");

        javax.swing.GroupLayout pnlPrecioP3Layout = new javax.swing.GroupLayout(pnlPrecioP3);
        pnlPrecioP3.setLayout(pnlPrecioP3Layout);
        pnlPrecioP3Layout.setHorizontalGroup(
            pnlPrecioP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecioP3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarP3))
        );
        pnlPrecioP3Layout.setVerticalGroup(
            pnlPrecioP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrecioP3Layout.createSequentialGroup()
                .addComponent(btnAgregarP3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnEditarP3.setText("editar");

        javax.swing.GroupLayout pnlProducto3Layout = new javax.swing.GroupLayout(pnlProducto3);
        pnlProducto3.setLayout(pnlProducto3Layout);
        pnlProducto3Layout.setHorizontalGroup(
            pnlProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrecioP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProducto3Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addComponent(btnEditarP3))
        );
        pnlProducto3Layout.setVerticalGroup(
            pnlProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarP3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlPrecioP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlProducto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlPrecioP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarP4.setText("+");

        javax.swing.GroupLayout pnlPrecioP4Layout = new javax.swing.GroupLayout(pnlPrecioP4);
        pnlPrecioP4.setLayout(pnlPrecioP4Layout);
        pnlPrecioP4Layout.setHorizontalGroup(
            pnlPrecioP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecioP4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarP4))
        );
        pnlPrecioP4Layout.setVerticalGroup(
            pnlPrecioP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEditarP4.setText("editar");
        btnEditarP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarP4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProducto4Layout = new javax.swing.GroupLayout(pnlProducto4);
        pnlProducto4.setLayout(pnlProducto4Layout);
        pnlProducto4Layout.setHorizontalGroup(
            pnlProducto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrecioP4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProducto4Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addComponent(btnEditarP4))
        );
        pnlProducto4Layout.setVerticalGroup(
            pnlProducto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarP4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlPrecioP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlProducto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlPrecioP5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarP5.setText("+");

        javax.swing.GroupLayout pnlPrecioP5Layout = new javax.swing.GroupLayout(pnlPrecioP5);
        pnlPrecioP5.setLayout(pnlPrecioP5Layout);
        pnlPrecioP5Layout.setHorizontalGroup(
            pnlPrecioP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecioP5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarP5))
        );
        pnlPrecioP5Layout.setVerticalGroup(
            pnlPrecioP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEditarP5.setText("editar");

        javax.swing.GroupLayout pnlProducto5Layout = new javax.swing.GroupLayout(pnlProducto5);
        pnlProducto5.setLayout(pnlProducto5Layout);
        pnlProducto5Layout.setHorizontalGroup(
            pnlProducto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrecioP5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProducto5Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addComponent(btnEditarP5))
        );
        pnlProducto5Layout.setVerticalGroup(
            pnlProducto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarP5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPrecioP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlProducto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlPrecioP6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarP6.setText("+");

        javax.swing.GroupLayout pnlPrecioP6Layout = new javax.swing.GroupLayout(pnlPrecioP6);
        pnlPrecioP6.setLayout(pnlPrecioP6Layout);
        pnlPrecioP6Layout.setHorizontalGroup(
            pnlPrecioP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecioP6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarP6))
        );
        pnlPrecioP6Layout.setVerticalGroup(
            pnlPrecioP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnEditarP6.setText("editar");

        javax.swing.GroupLayout pnlProducto6Layout = new javax.swing.GroupLayout(pnlProducto6);
        pnlProducto6.setLayout(pnlProducto6Layout);
        pnlProducto6Layout.setHorizontalGroup(
            pnlProducto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrecioP6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlProducto6Layout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addComponent(btnEditarP6))
        );
        pnlProducto6Layout.setVerticalGroup(
            pnlProducto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProducto6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEditarP6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPrecioP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlPreVentaLayout = new javax.swing.GroupLayout(pnlPreVenta);
        pnlPreVenta.setLayout(pnlPreVentaLayout);
        pnlPreVentaLayout.setHorizontalGroup(
            pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProducto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProducto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProducto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlProducto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPreVentaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnlProducto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlProducto6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlPreVentaLayout.setVerticalGroup(
            pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreVentaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProducto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProducto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProducto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(pnlPreVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProducto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProducto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProducto6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        tabTienda.addTab("Pre-venta", pnlPreVenta);

        javax.swing.GroupLayout pnlSecundarioLayout = new javax.swing.GroupLayout(pnlSecundario);
        pnlSecundario.setLayout(pnlSecundarioLayout);
        pnlSecundarioLayout.setHorizontalGroup(
            pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabTienda)
                .addContainerGap())
        );
        pnlSecundarioLayout.setVerticalGroup(
            pnlSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabTienda)
                .addGap(1, 1, 1))
        );

        tabTienda.getAccessibleContext().setAccessibleName("tab12");

        getContentPane().add(pnlSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, 760, -1));

        pnlRecibos.setBackground(new java.awt.Color(47, 24, 50));
        pnlRecibos.setForeground(new java.awt.Color(47, 24, 50));

        javax.swing.GroupLayout pnlRecibosLayout = new javax.swing.GroupLayout(pnlRecibos);
        pnlRecibos.setLayout(pnlRecibosLayout);
        pnlRecibosLayout.setHorizontalGroup(
            pnlRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        pnlRecibosLayout.setVerticalGroup(
            pnlRecibosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        getContentPane().add(pnlRecibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, 760, -1));

        pnlDatos.setBackground(new java.awt.Color(47, 24, 50));
        pnlDatos.setForeground(new java.awt.Color(47, 24, 50));

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(652, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(681, Short.MAX_VALUE))
        );

        getContentPane().add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, 760, -1));

        pnlFavoritos.setBackground(new java.awt.Color(47, 24, 50));
        pnlFavoritos.setForeground(new java.awt.Color(47, 24, 50));

        javax.swing.GroupLayout pnlFavoritosLayout = new javax.swing.GroupLayout(pnlFavoritos);
        pnlFavoritos.setLayout(pnlFavoritosLayout);
        pnlFavoritosLayout.setHorizontalGroup(
            pnlFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        pnlFavoritosLayout.setVerticalGroup(
            pnlFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        getContentPane().add(pnlFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, 760, -1));

        pnlCarrito.setBackground(new java.awt.Color(47, 24, 50));
        pnlCarrito.setForeground(new java.awt.Color(47, 24, 50));

        javax.swing.GroupLayout pnlCarritoLayout = new javax.swing.GroupLayout(pnlCarrito);
        pnlCarrito.setLayout(pnlCarritoLayout);
        pnlCarritoLayout.setHorizontalGroup(
            pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        pnlCarritoLayout.setVerticalGroup(
            pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, 760, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMiCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiCarritoActionPerformed

    private void btnEditarP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarP4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarP4ActionPerformed

    private void lblImagenFrutosSecosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenFrutosSecosMouseClicked
        System.out.println("frutos secos");
    }//GEN-LAST:event_lblImagenFrutosSecosMouseClicked

    private void btnMisDireccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMisDireccionesMouseClicked
        pnlSecundario.setVisible(false);
        pnlDatos.setVisible(true);
    }//GEN-LAST:event_btnMisDireccionesMouseClicked

    private void btnMisDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisDireccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMisDireccionesActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        pnlSecundario.setVisible(true);
        pnlDatos.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarP1;
    private javax.swing.JButton btnAgregarP2;
    private javax.swing.JButton btnAgregarP3;
    private javax.swing.JButton btnAgregarP4;
    private javax.swing.JButton btnAgregarP5;
    private javax.swing.JButton btnAgregarP6;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnEditarP1;
    private javax.swing.JButton btnEditarP2;
    private javax.swing.JButton btnEditarP3;
    private javax.swing.JButton btnEditarP4;
    private javax.swing.JButton btnEditarP5;
    private javax.swing.JButton btnEditarP6;
    private javax.swing.JButton btnMiCarrito;
    private javax.swing.JButton btnMisDirecciones;
    private javax.swing.JButton btnMisFavoritos;
    private javax.swing.JButton btnMisLogros;
    private javax.swing.JButton btnMisRecibos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblEspecialidades;
    private javax.swing.JLabel lblFrutasCongeladas;
    private javax.swing.JLabel lblFrutosSecos;
    private javax.swing.JLabel lblImagenEspecialidades;
    private javax.swing.JLabel lblImagenFrutasCongeladas;
    private javax.swing.JLabel lblImagenFrutosSecos;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPuntosUsuario;
    private javax.swing.JPanel pnlCarrito;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlEspecialidades;
    private javax.swing.JPanel pnlEstadisticas;
    private javax.swing.JPanel pnlFavoritos;
    private javax.swing.JPanel pnlFrutasCongeladas;
    private javax.swing.JPanel pnlFrutosSecos;
    private javax.swing.JPanel pnlImagenUsuario;
    private javax.swing.JPanel pnlPreVenta;
    private javax.swing.JPanel pnlPrecioP1;
    private javax.swing.JPanel pnlPrecioP2;
    private javax.swing.JPanel pnlPrecioP3;
    private javax.swing.JPanel pnlPrecioP4;
    private javax.swing.JPanel pnlPrecioP5;
    private javax.swing.JPanel pnlPrecioP6;
    private javax.swing.JPanel pnlProducto1;
    private javax.swing.JPanel pnlProducto2;
    private javax.swing.JPanel pnlProducto3;
    private javax.swing.JPanel pnlProducto4;
    private javax.swing.JPanel pnlProducto5;
    private javax.swing.JPanel pnlProducto6;
    private javax.swing.JPanel pnlPuntosDeVenta;
    private javax.swing.JPanel pnlRecibos;
    private javax.swing.JPanel pnlRecomendado;
    private javax.swing.JPanel pnlSecundario;
    private javax.swing.JPanel pnlTienda;
    private javax.swing.JPanel pnlTodo;
    private javax.swing.JTabbedPane tabTienda;
    // End of variables declaration//GEN-END:variables
}
