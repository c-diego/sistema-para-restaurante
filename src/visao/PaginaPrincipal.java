package visao;

//@author diego

import dao.PratoDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Prato;
import modelo.Usuario;
        

public class PaginaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    private PratoDAO pratoDao = new PratoDAO();
    private List<Prato> pratos;
    private Prato pratoSelecionado;
    
    public PaginaPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        configurarPermissao();
        
    }

    private void configurarPermissao() {
        if (this.usuario.getPermissao() == 1) {
            jTabbedPane1.setEnabledAt(0, true);
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);
            
        } else {
            jTabbedPane1.setEnabledAt(0, true);
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, true);
            jTabbedPane1.setEnabledAt(5, true);
            
        }
    }

    public PaginaPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable_ven_menu = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jTextField27 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lab_selected_customer = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        btn_alt_menu_ok1 = new javax.swing.JButton();
        btn_alt_menu_alt1 = new javax.swing.JButton();
        btn_alt_menu_can1 = new javax.swing.JButton();
        btn_alt_menu_rm1 = new javax.swing.JButton();
        btn_alt_menu_add1 = new javax.swing.JButton();
        txtf_principal1 = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        Jtable_alterar_menu1 = new javax.swing.JTable();
        txtf_salada1 = new javax.swing.JTextField();
        txtf_principal2 = new javax.swing.JTextField();
        txtf_salada2 = new javax.swing.JTextField();
        txtf_principal3 = new javax.swing.JTextField();
        txtf_salada3 = new javax.swing.JTextField();
        txtf_principal4 = new javax.swing.JTextField();
        txtf_salada4 = new javax.swing.JTextField();
        btn_alt_menu_ok2 = new javax.swing.JButton();
        txtf_salada5 = new javax.swing.JTextField();
        jPanel_cardapio = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btn_alt_menu_ok = new javax.swing.JButton();
        btn_alt_menu_alt = new javax.swing.JButton();
        btn_alt_menu_can = new javax.swing.JButton();
        btn_alt_menu_rm = new javax.swing.JButton();
        txtf_preco = new javax.swing.JTextField();
        btn_alt_menu_add = new javax.swing.JButton();
        txtf_principal = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        Jtable_alterar_menu = new javax.swing.JTable();
        txtf_secundario = new javax.swing.JTextField();
        txtf_carne = new javax.swing.JTextField();
        txtf_acompanhamento = new javax.swing.JTextField();
        txtf_salada = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField26 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        pswd_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quentinhas");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(40, 148, 198));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1, 1));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btn_logout.setBackground(new java.awt.Color(255, 100, 100));
        btn_logout.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(70, 70, 70));
        btn_logout.setText("Sair");
        btn_logout.setBorder(null);
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.setOpaque(true);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Início", jPanel6);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(70, 70, 70));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Cardápio Do Dia");

        jtable_ven_menu.setForeground(new java.awt.Color(200, 200, 200));
        jtable_ven_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Principal", "Secundário", "Carne", "Salada", "Acompanhamento", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_ven_menu.setGridColor(new java.awt.Color(200, 200, 200));
        jtable_ven_menu.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtable_ven_menu);
        if (jtable_ven_menu.getColumnModel().getColumnCount() > 0) {
            jtable_ven_menu.getColumnModel().getColumn(5).setMinWidth(100);
            jtable_ven_menu.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jButton21.setBackground(new java.awt.Color(255, 100, 100));
        jButton21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton21.setForeground(new java.awt.Color(70, 70, 70));
        jButton21.setText("Cancelar");
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setOpaque(true);

        jButton22.setBackground(new java.awt.Color(0, 255, 144));
        jButton22.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton22.setForeground(new java.awt.Color(70, 70, 70));
        jButton22.setText("Finalizar");
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setOpaque(true);

        jTable6.setForeground(new java.awt.Color(70, 70, 70));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Qnt", "Pedido", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(50);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable6.getColumnModel().getColumn(2).setMinWidth(100);
            jTable6.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jButton23.setBackground(new java.awt.Color(40, 148, 198));
        jButton23.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton23.setForeground(new java.awt.Color(70, 70, 70));
        jButton23.setText("Remover");
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setOpaque(true);

        jButton24.setBackground(new java.awt.Color(40, 148, 198));
        jButton24.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton24.setForeground(new java.awt.Color(70, 70, 70));
        jButton24.setText("Adicionar");
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(70, 70, 70));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Pedido");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(70, 70, 70));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Selecionar Cliente");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel2.setText("Total");

        jLabel3.setText("0.0");

        jTable8.setForeground(new java.awt.Color(70, 70, 70));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(150);
            jTable8.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        jTextField27.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(70, 70, 70));
        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextField27.setCaretColor(new java.awt.Color(70, 70, 70));

        jButton5.setBackground(new java.awt.Color(40, 148, 198));
        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(70, 70, 70));
        jButton5.setText("Pesquisar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(70, 70, 70));
        jLabel8.setText("Cliente Selecionado:");

        lab_selected_customer.setBackground(new java.awt.Color(255, 255, 255));
        lab_selected_customer.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        lab_selected_customer.setForeground(new java.awt.Color(70, 70, 70));
        lab_selected_customer.setText("      ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField27)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5))
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lab_selected_customer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton24, jButton5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lab_selected_customer)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton24, jButton5, jTextField27});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vender", jPanel2);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setForeground(new java.awt.Color(70, 70, 70));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número", "Cliente", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jTable7.setForeground(new java.awt.Color(70, 70, 70));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Qnt", "Prato", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(100);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable7.getColumnModel().getColumn(2).setMinWidth(150);
            jTable7.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(70, 70, 70));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Detalhes");

        jTextField25.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(70, 70, 70));
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextField25.setCaretColor(new java.awt.Color(70, 70, 70));

        jButton8.setBackground(new java.awt.Color(0, 255, 144));
        jButton8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(70, 70, 70));
        jButton8.setText("Pesquisar");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setOpaque(true);

        jLabel7.setText("endereço");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel6.setText("Endereço");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel5.setText("Total");

        jLabel4.setText("0.0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pedidos", jPanel8);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        btn_alt_menu_ok1.setBackground(new java.awt.Color(0, 255, 144));
        btn_alt_menu_ok1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_ok1.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_ok1.setText("Pronto");
        btn_alt_menu_ok1.setBorder(null);
        btn_alt_menu_ok1.setBorderPainted(false);
        btn_alt_menu_ok1.setContentAreaFilled(false);
        btn_alt_menu_ok1.setOpaque(true);
        btn_alt_menu_ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_ok1ActionPerformed(evt);
            }
        });

        btn_alt_menu_alt1.setBackground(new java.awt.Color(40, 148, 198));
        btn_alt_menu_alt1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_alt1.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_alt1.setText("Alterar");
        btn_alt_menu_alt1.setBorder(null);
        btn_alt_menu_alt1.setBorderPainted(false);
        btn_alt_menu_alt1.setContentAreaFilled(false);
        btn_alt_menu_alt1.setOpaque(true);
        btn_alt_menu_alt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_alt1ActionPerformed(evt);
            }
        });

        btn_alt_menu_can1.setBackground(new java.awt.Color(255, 100, 100));
        btn_alt_menu_can1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_can1.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_can1.setText("Cancelar");
        btn_alt_menu_can1.setBorder(null);
        btn_alt_menu_can1.setBorderPainted(false);
        btn_alt_menu_can1.setContentAreaFilled(false);
        btn_alt_menu_can1.setOpaque(true);
        btn_alt_menu_can1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_can1ActionPerformed(evt);
            }
        });

        btn_alt_menu_rm1.setBackground(new java.awt.Color(40, 148, 198));
        btn_alt_menu_rm1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_rm1.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_rm1.setText("Remover");
        btn_alt_menu_rm1.setBorder(null);
        btn_alt_menu_rm1.setBorderPainted(false);
        btn_alt_menu_rm1.setContentAreaFilled(false);
        btn_alt_menu_rm1.setOpaque(true);
        btn_alt_menu_rm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_rm1ActionPerformed(evt);
            }
        });

        btn_alt_menu_add1.setBackground(new java.awt.Color(40, 148, 198));
        btn_alt_menu_add1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_add1.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_add1.setText("Adicionar");
        btn_alt_menu_add1.setBorder(null);
        btn_alt_menu_add1.setBorderPainted(false);
        btn_alt_menu_add1.setContentAreaFilled(false);
        btn_alt_menu_add1.setOpaque(true);
        btn_alt_menu_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_add1ActionPerformed(evt);
            }
        });

        txtf_principal1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_principal1.setForeground(new java.awt.Color(70, 70, 70));
        txtf_principal1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        Jtable_alterar_menu1.setForeground(new java.awt.Color(200, 200, 200));
        Jtable_alterar_menu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Telefone", "Estado", "Cidade", "Bairro", "Rua", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtable_alterar_menu1.setGridColor(new java.awt.Color(200, 200, 200));
        Jtable_alterar_menu1.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(Jtable_alterar_menu1);

        txtf_salada1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_salada1.setForeground(new java.awt.Color(70, 70, 70));
        txtf_salada1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Sobrenome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_principal2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_principal2.setForeground(new java.awt.Color(70, 70, 70));
        txtf_principal2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_salada2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_salada2.setForeground(new java.awt.Color(70, 70, 70));
        txtf_salada2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_principal3.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_principal3.setForeground(new java.awt.Color(70, 70, 70));
        txtf_principal3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_salada3.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_salada3.setForeground(new java.awt.Color(70, 70, 70));
        txtf_salada3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_principal4.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_principal4.setForeground(new java.awt.Color(70, 70, 70));
        txtf_principal4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Rua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_salada4.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_salada4.setForeground(new java.awt.Color(70, 70, 70));
        txtf_salada4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Número", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        btn_alt_menu_ok2.setBackground(new java.awt.Color(0, 255, 144));
        btn_alt_menu_ok2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_ok2.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_ok2.setText("Pesquisar");
        btn_alt_menu_ok2.setBorder(null);
        btn_alt_menu_ok2.setBorderPainted(false);
        btn_alt_menu_ok2.setContentAreaFilled(false);
        btn_alt_menu_ok2.setOpaque(true);
        btn_alt_menu_ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_ok2ActionPerformed(evt);
            }
        });

        txtf_salada5.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_salada5.setForeground(new java.awt.Color(70, 70, 70));
        txtf_salada5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_principal1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_salada1))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_principal2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_salada2))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_principal3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_salada3))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_principal4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_salada4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 183, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addComponent(btn_alt_menu_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_menu_rm1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_menu_alt1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_menu_can1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_menu_ok1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(txtf_salada5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_menu_ok2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_principal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_salada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_principal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_salada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_principal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_salada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_principal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_salada4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_alt_menu_ok2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtf_salada5))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alt_menu_ok1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_alt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_can1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_rm1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", jPanel3);

        jPanel_cardapio.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(70, 70, 70));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Alterar Cardápio");

        btn_alt_menu_ok.setBackground(new java.awt.Color(0, 255, 144));
        btn_alt_menu_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_ok.setText("Pronto");
        btn_alt_menu_ok.setBorder(null);
        btn_alt_menu_ok.setBorderPainted(false);
        btn_alt_menu_ok.setContentAreaFilled(false);
        btn_alt_menu_ok.setOpaque(true);
        btn_alt_menu_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_okActionPerformed(evt);
            }
        });

        btn_alt_menu_alt.setBackground(new java.awt.Color(40, 148, 198));
        btn_alt_menu_alt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_alt.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_alt.setText("Alterar");
        btn_alt_menu_alt.setBorder(null);
        btn_alt_menu_alt.setBorderPainted(false);
        btn_alt_menu_alt.setContentAreaFilled(false);
        btn_alt_menu_alt.setOpaque(true);
        btn_alt_menu_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_altActionPerformed(evt);
            }
        });

        btn_alt_menu_can.setBackground(new java.awt.Color(255, 100, 100));
        btn_alt_menu_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_can.setText("Cancelar");
        btn_alt_menu_can.setBorder(null);
        btn_alt_menu_can.setBorderPainted(false);
        btn_alt_menu_can.setContentAreaFilled(false);
        btn_alt_menu_can.setOpaque(true);
        btn_alt_menu_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_canActionPerformed(evt);
            }
        });

        btn_alt_menu_rm.setBackground(new java.awt.Color(40, 148, 198));
        btn_alt_menu_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_rm.setText("Remover");
        btn_alt_menu_rm.setBorder(null);
        btn_alt_menu_rm.setBorderPainted(false);
        btn_alt_menu_rm.setContentAreaFilled(false);
        btn_alt_menu_rm.setOpaque(true);
        btn_alt_menu_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_rmActionPerformed(evt);
            }
        });

        txtf_preco.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_preco.setForeground(new java.awt.Color(70, 70, 70));
        txtf_preco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        btn_alt_menu_add.setBackground(new java.awt.Color(40, 148, 198));
        btn_alt_menu_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_add.setText("Adicionar");
        btn_alt_menu_add.setBorder(null);
        btn_alt_menu_add.setBorderPainted(false);
        btn_alt_menu_add.setContentAreaFilled(false);
        btn_alt_menu_add.setOpaque(true);
        btn_alt_menu_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_addActionPerformed(evt);
            }
        });

        txtf_principal.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_principal.setForeground(new java.awt.Color(70, 70, 70));
        txtf_principal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        Jtable_alterar_menu.setForeground(new java.awt.Color(200, 200, 200));
        Jtable_alterar_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Principal", "Secundário", "Carne", "Salada", "Acompanhamento", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtable_alterar_menu.setGridColor(new java.awt.Color(200, 200, 200));
        Jtable_alterar_menu.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(Jtable_alterar_menu);

        txtf_secundario.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_secundario.setForeground(new java.awt.Color(70, 70, 70));
        txtf_secundario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Secundário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_carne.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_carne.setForeground(new java.awt.Color(70, 70, 70));
        txtf_carne.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Carne", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_acompanhamento.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_acompanhamento.setForeground(new java.awt.Color(70, 70, 70));
        txtf_acompanhamento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Acompanhamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_salada.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_salada.setForeground(new java.awt.Color(70, 70, 70));
        txtf_salada.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Salada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtf_secundario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtf_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                    .addComponent(txtf_carne))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtf_acompanhamento)
                                    .addComponent(txtf_salada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtf_preco, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_alt_menu_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_alt_menu_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_alt_menu_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_alt_menu_can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_alt_menu_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtf_acompanhamento, txtf_preco, txtf_principal, txtf_salada});

        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_salada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_acompanhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_carne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alt_menu_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_can, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_menu_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_cardapioLayout = new javax.swing.GroupLayout(jPanel_cardapio);
        jPanel_cardapio.setLayout(jPanel_cardapioLayout);
        jPanel_cardapioLayout.setHorizontalGroup(
            jPanel_cardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cardapioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_cardapioLayout.setVerticalGroup(
            jPanel_cardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cardapioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cardápio", jPanel_cardapio);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jButton27.setBackground(new java.awt.Color(40, 148, 198));
        jButton27.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton27.setForeground(new java.awt.Color(70, 70, 70));
        jButton27.setText("Cadastrar");
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setOpaque(true);

        jButton9.setBackground(new java.awt.Color(40, 148, 198));
        jButton9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(70, 70, 70));
        jButton9.setText("Excluir");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setOpaque(true);

        jButton14.setBackground(new java.awt.Color(40, 148, 198));
        jButton14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton14.setForeground(new java.awt.Color(70, 70, 70));
        jButton14.setText("Alterar");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setOpaque(true);

        jButton15.setBackground(new java.awt.Color(255, 100, 100));
        jButton15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton15.setForeground(new java.awt.Color(70, 70, 70));
        jButton15.setText("Cancelar");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setOpaque(true);

        jButton16.setBackground(new java.awt.Color(0, 255, 144));
        jButton16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton16.setForeground(new java.awt.Color(70, 70, 70));
        jButton16.setText("Salvar");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setOpaque(true);

        jTextField26.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(70, 70, 70));
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jTextField26.setCaretColor(new java.awt.Color(70, 70, 70));

        jButton10.setBackground(new java.awt.Color(40, 148, 198));
        jButton10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton10.setForeground(new java.awt.Color(70, 70, 70));
        jButton10.setText("Pesquisar");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setOpaque(true);

        jTable4.setForeground(new java.awt.Color(70, 70, 70));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jTextField6.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(70, 70, 70));
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        jTextField7.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(70, 70, 70));
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        jTextField8.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(70, 70, 70));
        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        pswd_senha.setForeground(new java.awt.Color(70, 70, 70));
        pswd_senha.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(jTextField6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswd_senha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jTextField26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10)))))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton16});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField6, jTextField7, jTextField8, pswd_senha});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswd_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton16, jTextField26});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField7, jTextField8, pswd_senha});

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gerente", jPanel10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        PaginaLogin loginPage = new PaginaLogin();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_alt_menu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_addActionPerformed
        habilitarFormulario(true);
        btn_alt_menu_rm.setEnabled(false);
        btn_alt_menu_alt.setEnabled(false);
    }//GEN-LAST:event_btn_alt_menu_addActionPerformed

    private void btn_alt_menu_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_rmActionPerformed
        int linha = Jtable_alterar_menu.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um prato", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        pratoSelecionado = pratos.get(linha);
        
        try {
            pratoDao.remover(pratoSelecionado.getId());
            JOptionPane.showMessageDialog(null, "Prato excluido com sucesso");
            atualizarTabela();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_alt_menu_rmActionPerformed

    private void btn_alt_menu_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_altActionPerformed
        int linha = Jtable_alterar_menu.getSelectedRow();
        
        if (linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um prato", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        habilitarFormulario(true);
        
        pratoSelecionado = pratos.get(linha);
        
        txtf_principal.setText(pratoSelecionado.getPrincipal());
        txtf_secundario.setText(pratoSelecionado.getSecundario());
        txtf_carne.setText(pratoSelecionado.getCarne());
        txtf_salada.setText(pratoSelecionado.getSalada());
        txtf_acompanhamento.setText(pratoSelecionado.getAcompanhamento());
        txtf_preco.setText(String.valueOf(pratoSelecionado.getPreco()));
    }//GEN-LAST:event_btn_alt_menu_altActionPerformed

    private void btn_alt_menu_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_canActionPerformed
        habilitarFormulario(false);
        pratoSelecionado = null;
    }//GEN-LAST:event_btn_alt_menu_canActionPerformed

    private void btn_alt_menu_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_okActionPerformed
        habilitarFormulario(false);
        
        String principal = txtf_principal.getText();
        String segundario = txtf_secundario.getText();
        String carne = txtf_carne.getText();
        String salada = txtf_salada.getText();
        String acompanhamento = txtf_acompanhamento.getText();
        float preco = 0.0f;
        
        try {
            preco =  Float.parseFloat(txtf_preco.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço não informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (preco <= 0){
            JOptionPane.showMessageDialog(null, "informe um preço válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (principal.length() <= 2) {
            JOptionPane.showMessageDialog(null, "informe o prato principal válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (segundario.length() <= 2) {
            JOptionPane.showMessageDialog(null, "informe o prato segundario válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (carne.length() <= 2) {
            JOptionPane.showMessageDialog(null, "informe a carne válida.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (salada.length() <= 2) {
            JOptionPane.showMessageDialog(null, "informe a salada válida.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (acompanhamento.length() <= 2) {
            JOptionPane.showMessageDialog(null, "informe um acompanhamento válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (pratoSelecionado == null) {
            Prato prato = new Prato(
                principal,
                segundario,
                carne,
                salada,
                acompanhamento,
                preco
            );
            
            try {
                pratoDao.adicionar(prato);
                
                JOptionPane.showMessageDialog(null, "Prato cadastrado");
                
                txtf_principal.setText("");
                txtf_secundario.setText("");
                txtf_carne.setText("");
                txtf_salada.setText("");
                txtf_acompanhamento.setText("");
                txtf_preco.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "erro ao inserir no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            txtf_principal.setText(principal);
            txtf_secundario.setText(segundario);
            txtf_carne.setText(carne);
            txtf_salada.setText(salada);
            txtf_acompanhamento.setText(acompanhamento);
            txtf_preco.setText(String.valueOf(preco));
            
            try {
                pratoDao.alterar(pratoSelecionado);
                JOptionPane.showMessageDialog(null, "Prato Alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        pratoSelecionado = null;
    }//GEN-LAST:event_btn_alt_menu_okActionPerformed

    private void btn_alt_menu_ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_ok1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_alt_menu_ok1ActionPerformed

    private void btn_alt_menu_alt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_alt1ActionPerformed
        
    }//GEN-LAST:event_btn_alt_menu_alt1ActionPerformed

    private void btn_alt_menu_can1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_can1ActionPerformed
       
    }//GEN-LAST:event_btn_alt_menu_can1ActionPerformed

    private void btn_alt_menu_rm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_rm1ActionPerformed
        
    }//GEN-LAST:event_btn_alt_menu_rm1ActionPerformed

    private void btn_alt_menu_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_add1ActionPerformed
        
    }//GEN-LAST:event_btn_alt_menu_add1ActionPerformed

    private void btn_alt_menu_ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_ok2ActionPerformed
        
    }//GEN-LAST:event_btn_alt_menu_ok2ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        int index = jTabbedPane1.getSelectedIndex();
        switch(index) {
            case 0: setTitle("Início"); break;
            case 1: setTitle("Vender"); break;
            case 2: setTitle("Pedidos"); break;
            case 3: setTitle("Clientes"); break;
            case 4: setTitle("Cardápio"); break;
            case 5: setTitle("Gerente"); break;            
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void habilitarFormulario(boolean status){
        txtf_principal.setEnabled(status);
        txtf_secundario.setEnabled(status);
        txtf_carne.setEnabled(status);
        txtf_salada.setEnabled(status);
        txtf_acompanhamento.setEnabled(status);
        txtf_preco.setEnabled(status);
    }
    
    private void atualizarTabela(){
        try{
            pratos = pratoDao.buscar(" ");
            DefaultTableModel model = 
                    (DefaultTableModel) Jtable_alterar_menu.getModel();
            model.setNumRows(0);
            for(int i = 0;i < pratos.size(); i++){
                Prato prato = pratos.get(i);
                model.addRow(new Object[]{
                    prato.getPrincipal(),
                    prato.getSecundario(),
                    prato.getCarne(),
                    prato.getSalada(),
                    prato.getAcompanhamento(),
                    prato.getPreco(),
                });
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_alterar_menu;
    private javax.swing.JTable Jtable_alterar_menu1;
    private javax.swing.JButton btn_alt_menu_add;
    private javax.swing.JButton btn_alt_menu_add1;
    private javax.swing.JButton btn_alt_menu_alt;
    private javax.swing.JButton btn_alt_menu_alt1;
    private javax.swing.JButton btn_alt_menu_can;
    private javax.swing.JButton btn_alt_menu_can1;
    private javax.swing.JButton btn_alt_menu_ok;
    private javax.swing.JButton btn_alt_menu_ok1;
    private javax.swing.JButton btn_alt_menu_ok2;
    private javax.swing.JButton btn_alt_menu_rm;
    private javax.swing.JButton btn_alt_menu_rm1;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_cardapio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable jtable_ven_menu;
    private javax.swing.JLabel lab_selected_customer;
    private javax.swing.JPasswordField pswd_senha;
    private javax.swing.JTextField txtf_acompanhamento;
    private javax.swing.JTextField txtf_carne;
    private javax.swing.JTextField txtf_preco;
    private javax.swing.JTextField txtf_principal;
    private javax.swing.JTextField txtf_principal1;
    private javax.swing.JTextField txtf_principal2;
    private javax.swing.JTextField txtf_principal3;
    private javax.swing.JTextField txtf_principal4;
    private javax.swing.JTextField txtf_salada;
    private javax.swing.JTextField txtf_salada1;
    private javax.swing.JTextField txtf_salada2;
    private javax.swing.JTextField txtf_salada3;
    private javax.swing.JTextField txtf_salada4;
    private javax.swing.JTextField txtf_salada5;
    private javax.swing.JTextField txtf_secundario;
    // End of variables declaration//GEN-END:variables
}
