
package vista;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class TInventarioNaves extends javax.swing.JFrame {

    public TInventarioNaves() {
        initComponents();
        setLocationRelativeTo(null);//centrar
        setTitle("Inventario De Naves");
    }

    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cajaBuscar = new javax.swing.JTextField();
        botonVer = new javax.swing.JButton();
        botonTipoLanzadera = new javax.swing.JButton();
        botonSondas = new javax.swing.JButton();
        botonTripuladas = new javax.swing.JButton();
        botonSatelite = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        setForeground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave: ");

        botonVer.setBackground(new java.awt.Color(224, 238, 245));
        botonVer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonVer.setText("Ver Naves");
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });

        botonTipoLanzadera.setBackground(new java.awt.Color(224, 238, 245));
        botonTipoLanzadera.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonTipoLanzadera.setText("Lanzadera");
        botonTipoLanzadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTipoLanzaderaActionPerformed(evt);
            }
        });

        botonSondas.setBackground(new java.awt.Color(224, 238, 245));
        botonSondas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonSondas.setText("Sondas");
        botonSondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSondasActionPerformed(evt);
            }
        });

        botonTripuladas.setBackground(new java.awt.Color(224, 238, 245));
        botonTripuladas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonTripuladas.setText("Tripuladas");
        botonTripuladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTripuladasActionPerformed(evt);
            }
        });

        botonSatelite.setBackground(new java.awt.Color(224, 238, 245));
        botonSatelite.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonSatelite.setText("Satelites Artificiales");
        botonSatelite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSateliteActionPerformed(evt);
            }
        });

        tablaProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Peso", "Combustible", "V Km/H", "Potencia", "Empuje", "C Personas", "Orbita", "Transporta T", "Tipo", "Funcion", "Agencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.setSelectionBackground(new java.awt.Color(252, 253, 253));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventario De Naves");

        botonCerrar.setBackground(new java.awt.Color(224, 238, 245));
        botonCerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(603, 603, 603)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonVer)
                        .addGap(18, 18, 18)
                        .addComponent(botonTipoLanzadera)
                        .addGap(18, 18, 18)
                        .addComponent(botonSondas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonTripuladas)
                        .addGap(18, 18, 18)
                        .addComponent(botonSatelite)
                        .addGap(78, 78, 78)
                        .addComponent(botonCerrar)
                        .addGap(215, 215, 215))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVer)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(botonTipoLanzadera)
                    .addComponent(botonSondas)
                    .addComponent(botonTripuladas)
                    .addComponent(botonSatelite)
                    .addComponent(botonCerrar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        //creamos modelo para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);//establecemos el modelo de la tabla
        
        //atributos para buscar cuando presiona boton cargar tabla
        String campo = cajaBuscar.getText();//guarda la entrada
        String where = "";//para concatenar en la consulta a buscar
        
        if(!"".equals(campo)){ //Si el campo no esta vacio
            where = "where clave='"+campo+"'"; //guardamos en where la consulta mysql concatenado con la entrada del usuario
        }
        //para trabajar con la base de datos mysql
        PreparedStatement ps = null;//realizar consulta bd
        ResultSet rs = null;//Obtener resultados de bd
        
        try{// se crea objeto conexion y obtenemos conexion con la bd
            Conexion con = new Conexion();
            java.sql.Connection conexion = con.getConnection();//conectamos bd
            
            //realizamos consulta a base de datos
            ps = conexion.prepareStatement("select n.clave,n.nombre,n.pesoTonelada,n.combustible,n.velocidadKmHora,n.PotenciaHp,n.PropulsionTonelada,n.cantidadPersona,n.orbitaKm,n.transportaTonelada, t.tipo, f.funcion, a.agencia from nave as n inner join tipo as t on n.idTipo=t.idTipo inner join funcion as f on t.idFuncion=f.idFuncion inner join agencia as a on n.idAgencia=a.idAgencia "+where);// con +where consultamos el registro buscado por codigo de la consulta
            rs = ps.executeQuery();//ejecuttamos la consulta y la guardamos en rs aqui estaran todos los datos del registro
            
            //agregamos a modelo tabla las columnas de la bd
            modeloTabla.addColumn("Clave");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Peso T");
            modeloTabla.addColumn("Combustible");
            modeloTabla.addColumn("V Km/H");
            modeloTabla.addColumn("Potencia");
            modeloTabla.addColumn("Empuje");
            modeloTabla.addColumn("C Personas");
            modeloTabla.addColumn("Orbita Km");
            modeloTabla.addColumn("Transporta T");
            modeloTabla.addColumn("Tipo");
            modeloTabla.addColumn("Funcion");
            modeloTabla.addColumn("Agencia");
            
            
            
            //para obtener la cantidad de columnas que el usuario cree, o si elimina alguna solo aparezca las que hay
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();// var para el contador, realiza el conteo de cuantas columnas hay en la base de datos
            
                        //configura el ancho de la columna con este arreglo primera columna ancho de 50 segunda de 150....
            int anchos[] = {50,50,50,80,50,50,50,50,50,50,90,150,80};
            
               for(int i=0;i<cantidadColumnas;i++){//recorre las columnas array anchos
                tablaProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);//setPreferredWidth(anchos[i] establecemos el ancho predefinido con el array
//cogemos la tabla productos, obtenemos modelo de la tabla, obtenemos sus columnas y establecemos ancho de cada columna
            }
            
            while(rs.next()){//mientras hallan registros en la bd
                //se crea arreglo tipo Objet de la cantidad de columnas
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){//recorremos el arreglo
                    fila[i] = rs.getObject(i+1);//guardamos el registro de datos en el arreglo fila
                }
                
                modeloTabla.addRow(fila);//se adiciona cada fila en el modelotabla desde el arreglo guardado
            }
            
        }catch(Exception ex){//si presenta excepciones
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonVerActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked

    }//GEN-LAST:event_tablaProductoMouseClicked

    private void botonTipoLanzaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTipoLanzaderaActionPerformed
        //creamos modelo para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);//establecemos el modelo de la tabla
      
        //para trabajar con la base de datos mysql
        PreparedStatement ps = null;//realizar consulta bd
        ResultSet rs = null;//Obtener resultados de bd
        
        try{// se crea objeto conexion y obtenemos conexion con la bd
            Conexion con = new Conexion();
            java.sql.Connection conexion = con.getConnection();//conectamos bd
            
            //realizamos consulta a base de datos
            ps = conexion.prepareStatement("select n.clave, n.nombre, n.pesoTonelada, n.combustible, n.potenciaHp, n.propulsionTonelada, n.transportaTonelada, t.tipo, f.funcion, a.agencia  from nave as n inner join tipo as t on n.idTipo=t.idTipo inner join funcion as f on t.idFuncion=f.idFuncion inner join agencia as a on n.idAgencia=a.idAgencia where tipo='Lanzadera' ");// con +where consultamos el registro buscado por codigo de la consulta
            rs = ps.executeQuery();//ejecuttamos la consulta y la guardamos en rs aqui estaran todos los datos del registro
            
            //agregamos a modelo tabla las columnas de la bd
            modeloTabla.addColumn("Clave");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Peso T");
            modeloTabla.addColumn("Combustible");
            modeloTabla.addColumn("Potencia");
            modeloTabla.addColumn("Propulsion T");
            modeloTabla.addColumn("Transporta T");
            modeloTabla.addColumn("Tipo");
            modeloTabla.addColumn("Funcion");
            modeloTabla.addColumn("Agencia");
            
            
            
            //para obtener la cantidad de columnas que el usuario cree, o si elimina alguna solo aparezca las que hay
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();// var para el contador, realiza el conteo de cuantas columnas hay en la base de datos
            
            while(rs.next()){//mientras hallan registros en la bd
                //se crea arreglo tipo Objet de la cantidad de columnas
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){//recorremos el arreglo
                    fila[i] = rs.getObject(i+1);//guardamos el registro de datos en el arreglo fila
                }
                
                modeloTabla.addRow(fila);//se adiciona cada fila en el modelotabla desde el arreglo guardado
            }
            
        }catch(Exception ex){//si presenta excepciones
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonTipoLanzaderaActionPerformed

    private void botonSondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSondasActionPerformed
        //creamos modelo para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);//establecemos el modelo de la tabla
       
        
        //para trabajar con la base de datos mysql
        PreparedStatement ps = null;//realizar consulta bd
        ResultSet rs = null;//Obtener resultados de bd
        
        try{// se crea objeto conexion y obtenemos conexion con la bd
            Conexion con = new Conexion();
            java.sql.Connection conexion = con.getConnection();//conectamos bd
            
            //realizamos consulta a base de datos
            ps = conexion.prepareStatement("select n.clave, n.nombre, n.pesoTonelada, n.combustible, n.velocidadKmHora, n.propulsionTonelada, t.tipo, f.funcion, a.agencia  from nave as n inner join tipo as t on n.idTipo=t.idTipo inner join funcion as f on t.idFuncion=f.idFuncion inner join agencia as a on n.idAgencia=a.idAgencia where tipo='Sondas' ");// con +where consultamos el registro buscado por codigo de la consulta
            rs = ps.executeQuery();//ejecuttamos la consulta y la guardamos en rs aqui estaran todos los datos del registro
            
            //agregamos a modelo tabla las columnas de la bd
            modeloTabla.addColumn("Clave");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Peso T");
            modeloTabla.addColumn("Combustible");
            modeloTabla.addColumn("V Km/H");
            modeloTabla.addColumn("Propulsion T");
            modeloTabla.addColumn("Tipo");
            modeloTabla.addColumn("Funcion");
            modeloTabla.addColumn("Agencia");
            
            
            
            //para obtener la cantidad de columnas que el usuario cree, o si elimina alguna solo aparezca las que hay
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();// var para el contador, realiza el conteo de cuantas columnas hay en la base de datos
            
            while(rs.next()){//mientras hallan registros en la bd
                //se crea arreglo tipo Objet de la cantidad de columnas
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){//recorremos el arreglo
                    fila[i] = rs.getObject(i+1);//guardamos el registro de datos en el arreglo fila
                }
                
                modeloTabla.addRow(fila);//se adiciona cada fila en el modelotabla desde el arreglo guardado
            }
            
        }catch(Exception ex){//si presenta excepciones
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonSondasActionPerformed

    private void botonTripuladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTripuladasActionPerformed
        //creamos modelo para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);//establecemos el modelo de la tabla
        
        //para trabajar con la base de datos mysql
        PreparedStatement ps = null;//realizar consulta bd
        ResultSet rs = null;//Obtener resultados de bd
        
        try{// se crea objeto conexion y obtenemos conexion con la bd
            Conexion con = new Conexion();
            java.sql.Connection conexion = con.getConnection();//conectamos bd
            
            //realizamos consulta a base de datos
            ps = conexion.prepareStatement("select n.clave, n.nombre, n.pesoTonelada, n.combustible, n.velocidadKmHora, n.cantidadPersona, t.tipo, f.funcion, a.agencia  from nave as n inner join tipo as t on n.idTipo=t.idTipo inner join funcion as f on t.idFuncion=f.idFuncion inner join agencia as a on n.idAgencia=a.idAgencia where tipo='Tripuladas' ");// con +where consultamos el registro buscado por codigo de la consulta
            rs = ps.executeQuery();//ejecuttamos la consulta y la guardamos en rs aqui estaran todos los datos del registro
            
            //agregamos a modelo tabla las columnas de la bd
            modeloTabla.addColumn("Clave");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Peso T");
            modeloTabla.addColumn("Combustible");
            modeloTabla.addColumn("V Km/H");
            modeloTabla.addColumn("C Personas");
            modeloTabla.addColumn("Tipo");
            modeloTabla.addColumn("Funcion");
            modeloTabla.addColumn("Agencia");
            
            
            
            //para obtener la cantidad de columnas que el usuario cree, o si elimina alguna solo aparezca las que hay
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();// var para el contador, realiza el conteo de cuantas columnas hay en la base de datos
            
            while(rs.next()){//mientras hallan registros en la bd
                //se crea arreglo tipo Objet de la cantidad de columnas
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){//recorremos el arreglo
                    fila[i] = rs.getObject(i+1);//guardamos el registro de datos en el arreglo fila
                }
                
                modeloTabla.addRow(fila);//se adiciona cada fila en el modelotabla desde el arreglo guardado
            }
            
        }catch(Exception ex){//si presenta excepciones
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonTripuladasActionPerformed

    private void botonSateliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSateliteActionPerformed
         //creamos modelo para la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaProducto.setModel(modeloTabla);//establecemos el modelo de la tabla
        
        //para trabajar con la base de datos mysql
        PreparedStatement ps = null;//realizar consulta bd
        ResultSet rs = null;//Obtener resultados de bd
        
        try{// se crea objeto conexion y obtenemos conexion con la bd
            Conexion con = new Conexion();
            java.sql.Connection conexion = con.getConnection();//conectamos bd
            
            //realizamos consulta a base de datos
            ps = conexion.prepareStatement("select n.clave, n.nombre, n.pesoTonelada, n.combustible, n.velocidadKmHora,n.orbitaKm, t.tipo, f.funcion, a.agencia  from nave as n inner join tipo as t on n.idTipo=t.idTipo inner join funcion as f on t.idFuncion=f.idFuncion inner join agencia as a on n.idAgencia=a.idAgencia where tipo='Satelite Artificial' ");// con +where consultamos el registro buscado por codigo de la consulta
            rs = ps.executeQuery();//ejecuttamos la consulta y la guardamos en rs aqui estaran todos los datos del registro
            
            //agregamos a modelo tabla las columnas de la bd
            modeloTabla.addColumn("Clave");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Peso T");
            modeloTabla.addColumn("Combustible");
            modeloTabla.addColumn("V Km/H");
            modeloTabla.addColumn("Orbita Km");
            modeloTabla.addColumn("Tipo");
            modeloTabla.addColumn("Funcion");
            modeloTabla.addColumn("Agencia");
            
            
            
            //para obtener la cantidad de columnas que el usuario cree, o si elimina alguna solo aparezca las que hay
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();// var para el contador, realiza el conteo de cuantas columnas hay en la base de datos
            
            while(rs.next()){//mientras hallan registros en la bd
                //se crea arreglo tipo Objet de la cantidad de columnas
                Object fila[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){//recorremos el arreglo
                    fila[i] = rs.getObject(i+1);//guardamos el registro de datos en el arreglo fila
                }
                
                modeloTabla.addRow(fila);//se adiciona cada fila en el modelotabla desde el arreglo guardado
            }
            
        }catch(Exception ex){//si presenta excepciones
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonSateliteActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TInventarioNaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TInventarioNaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TInventarioNaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TInventarioNaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TInventarioNaves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonSatelite;
    private javax.swing.JButton botonSondas;
    private javax.swing.JButton botonTipoLanzadera;
    private javax.swing.JButton botonTripuladas;
    private javax.swing.JButton botonVer;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables
}
