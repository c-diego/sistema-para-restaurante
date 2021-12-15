package visao;

import dao.ClienteDAO;
import dao.PratoDAO;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Prato;
import modelo.Usuario;
        

public class PaginaPrincipal extends javax.swing.JFrame {

    private int teste;
    private Usuario usuario;
    private UsuarioDAO usuarioDao = new UsuarioDAO();
    private List<Usuario> usuarios;
    private Usuario usuarioSelecionado;
    
    private ClienteDAO clienteDao = new ClienteDAO();
    private List<Cliente> clientes;
    private Cliente clienteSelecionado;
    
    private PratoDAO pratoDao = new PratoDAO();
    private List<Prato> pratos;
    private Prato pratoSelecionado;
    
    public PaginaPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        configurarPermissao();
        habilitar_formulario_cliente(false);
        atualizar_botao_cliente(true);
        atualizar_cliente_tabela();
        
    }

    private void configurarPermissao() {
        if (this.usuario.getPermissao() == 1) {
            jTabbedPane1.setEnabledAt(0, true);
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);
            atualizar_cardapio_vendedor();
            
        } else {
            jTabbedPane1.setEnabledAt(0, true);
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, true);
            jTabbedPane1.setEnabledAt(5, true);
            atualizar_usuario_tabela();
            
            atualizar_botao_gerente(true);
            habilitar_formulario_gerente(false);
            
            habilitar_formulario_cardapio(false);
            atualizar_botao_cardapio(true);
            atualizar_cardapio_gerente();
            atualizar_cardapio_vendedor();
            
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
        btn_cliente_ok = new javax.swing.JButton();
        btn_cliente_alt = new javax.swing.JButton();
        btn_cliente_can = new javax.swing.JButton();
        btn_cliente_rm = new javax.swing.JButton();
        btn_cliente_add = new javax.swing.JButton();
        txtf_cliente_nome = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        Jtable_cliente = new javax.swing.JTable();
        txtf_cliente_sobrenome = new javax.swing.JTextField();
        txtf_cliente_telefone = new javax.swing.JTextField();
        txtf_cliente_estado = new javax.swing.JTextField();
        txtf_cliente_cidade = new javax.swing.JTextField();
        txtf_cliente_bairro = new javax.swing.JTextField();
        txtf_cliente_rua = new javax.swing.JTextField();
        txtf_cliente_numero = new javax.swing.JTextField();
        btn_cliente_pesquisar = new javax.swing.JButton();
        txtf_cliente_pesquisar = new javax.swing.JTextField();
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
        btn_alt_gerente_add = new javax.swing.JButton();
        btn_alt_gerente_rm = new javax.swing.JButton();
        btn_alt_gerente_alt = new javax.swing.JButton();
        btn_alt_gerente_can = new javax.swing.JButton();
        btn_alt_gerente_ok = new javax.swing.JButton();
        txtf_gerente_pesquisar = new javax.swing.JTextField();
        btn_alt_gerente_pesquisar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_usuario = new javax.swing.JTable();
        txtf_nome = new javax.swing.JTextField();
        txtf_login = new javax.swing.JTextField();
        pswd_senha = new javax.swing.JPasswordField();
        cbox_cargo = new javax.swing.JComboBox<>();

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

        btn_cliente_ok.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cliente_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_cliente_ok.setText("Pronto");
        btn_cliente_ok.setBorder(null);
        btn_cliente_ok.setOpaque(true);
        btn_cliente_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_okActionPerformed(evt);
            }
        });

        btn_cliente_alt.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente_alt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cliente_alt.setForeground(new java.awt.Color(70, 70, 70));
        btn_cliente_alt.setText("Alterar");
        btn_cliente_alt.setBorder(null);
        btn_cliente_alt.setOpaque(true);
        btn_cliente_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_altActionPerformed(evt);
            }
        });

        btn_cliente_can.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cliente_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_cliente_can.setText("Cancelar");
        btn_cliente_can.setBorder(null);
        btn_cliente_can.setOpaque(true);
        btn_cliente_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_canActionPerformed(evt);
            }
        });

        btn_cliente_rm.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cliente_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_cliente_rm.setText("Remover");
        btn_cliente_rm.setBorder(null);
        btn_cliente_rm.setOpaque(true);
        btn_cliente_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_rmActionPerformed(evt);
            }
        });

        btn_cliente_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cliente_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_cliente_add.setText("Adicionar");
        btn_cliente_add.setBorder(null);
        btn_cliente_add.setOpaque(true);
        btn_cliente_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_addActionPerformed(evt);
            }
        });

        txtf_cliente_nome.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_nome.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        Jtable_cliente.setForeground(new java.awt.Color(200, 200, 200));
        Jtable_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtable_cliente.setGridColor(new java.awt.Color(200, 200, 200));
        Jtable_cliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(Jtable_cliente);

        txtf_cliente_sobrenome.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_sobrenome.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_sobrenome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Sobrenome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cliente_telefone.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_telefone.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_telefone.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cliente_estado.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_estado.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_estado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cliente_cidade.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_cidade.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_cidade.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cliente_bairro.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_bairro.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_bairro.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cliente_rua.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_rua.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_rua.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Rua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cliente_numero.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_numero.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_numero.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Número", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        btn_cliente_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente_pesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cliente_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        btn_cliente_pesquisar.setText("Pesquisar");
        btn_cliente_pesquisar.setBorder(null);
        btn_cliente_pesquisar.setOpaque(true);
        btn_cliente_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_pesquisarActionPerformed(evt);
            }
        });

        txtf_cliente_pesquisar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cliente_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cliente_pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_cliente_sobrenome))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_cliente_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_cliente_estado))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_cliente_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_cliente_bairro))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(txtf_cliente_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_cliente_numero))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 183, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addComponent(btn_cliente_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cliente_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cliente_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cliente_can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cliente_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(txtf_cliente_pesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cliente_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cliente_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cliente_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cliente_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cliente_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cliente_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cliente_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cliente_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cliente_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtf_cliente_pesquisar))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cliente_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cliente_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cliente_can, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cliente_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cliente_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btn_alt_menu_ok.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_menu_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_ok.setText("Pronto");
        btn_alt_menu_ok.setBorder(null);
        btn_alt_menu_ok.setOpaque(true);
        btn_alt_menu_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_okActionPerformed(evt);
            }
        });

        btn_alt_menu_alt.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_menu_alt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_alt.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_alt.setText("Alterar");
        btn_alt_menu_alt.setBorder(null);
        btn_alt_menu_alt.setOpaque(true);
        btn_alt_menu_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_altActionPerformed(evt);
            }
        });

        btn_alt_menu_can.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_menu_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_can.setText("Cancelar");
        btn_alt_menu_can.setBorder(null);
        btn_alt_menu_can.setOpaque(true);
        btn_alt_menu_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_canActionPerformed(evt);
            }
        });

        btn_alt_menu_rm.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_menu_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_rm.setText("Remover");
        btn_alt_menu_rm.setBorder(null);
        btn_alt_menu_rm.setOpaque(true);
        btn_alt_menu_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_menu_rmActionPerformed(evt);
            }
        });

        txtf_preco.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_preco.setForeground(new java.awt.Color(70, 70, 70));
        txtf_preco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        btn_alt_menu_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_menu_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_menu_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_menu_add.setText("Adicionar");
        btn_alt_menu_add.setBorder(null);
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

        btn_alt_gerente_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_gerente_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_gerente_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_gerente_add.setText("Cadastrar");
        btn_alt_gerente_add.setBorder(null);
        btn_alt_gerente_add.setOpaque(true);
        btn_alt_gerente_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_gerente_addActionPerformed(evt);
            }
        });

        btn_alt_gerente_rm.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_gerente_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_gerente_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_gerente_rm.setText("Excluir");
        btn_alt_gerente_rm.setBorder(null);
        btn_alt_gerente_rm.setOpaque(true);
        btn_alt_gerente_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_gerente_rmActionPerformed(evt);
            }
        });

        btn_alt_gerente_alt.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_gerente_alt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_gerente_alt.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_gerente_alt.setText("Alterar");
        btn_alt_gerente_alt.setBorder(null);
        btn_alt_gerente_alt.setOpaque(true);
        btn_alt_gerente_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_gerente_altActionPerformed(evt);
            }
        });

        btn_alt_gerente_can.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_gerente_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_gerente_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_gerente_can.setText("Cancelar");
        btn_alt_gerente_can.setBorder(null);
        btn_alt_gerente_can.setOpaque(true);
        btn_alt_gerente_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_gerente_canActionPerformed(evt);
            }
        });

        btn_alt_gerente_ok.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_gerente_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_gerente_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_gerente_ok.setText("Salvar");
        btn_alt_gerente_ok.setBorder(null);
        btn_alt_gerente_ok.setOpaque(true);
        btn_alt_gerente_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_gerente_okActionPerformed(evt);
            }
        });

        txtf_gerente_pesquisar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_gerente_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        txtf_gerente_pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        txtf_gerente_pesquisar.setCaretColor(new java.awt.Color(70, 70, 70));

        btn_alt_gerente_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btn_alt_gerente_pesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_alt_gerente_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        btn_alt_gerente_pesquisar.setText("Pesquisar");
        btn_alt_gerente_pesquisar.setBorder(null);
        btn_alt_gerente_pesquisar.setOpaque(true);
        btn_alt_gerente_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alt_gerente_pesquisarActionPerformed(evt);
            }
        });

        jtable_usuario.setForeground(new java.awt.Color(70, 70, 70));
        jtable_usuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtable_usuario);

        txtf_nome.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_nome.setForeground(new java.awt.Color(70, 70, 70));
        txtf_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_login.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_login.setForeground(new java.awt.Color(70, 70, 70));
        txtf_login.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        pswd_senha.setForeground(new java.awt.Color(70, 70, 70));
        pswd_senha.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        cbox_cargo.setBackground(new java.awt.Color(255, 255, 255));
        cbox_cargo.setForeground(new java.awt.Color(70, 70, 70));
        cbox_cargo.setMaximumRowCount(2);
        cbox_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente" }));
        cbox_cargo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtf_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtf_login, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(btn_alt_gerente_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_gerente_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_gerente_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_gerente_can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_alt_gerente_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(txtf_gerente_pesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_alt_gerente_pesquisar))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(pswd_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_cargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_alt_gerente_ok, btn_alt_gerente_pesquisar});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pswd_senha, txtf_login, txtf_nome});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswd_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_gerente_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_gerente_pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alt_gerente_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_gerente_can, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_gerente_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_gerente_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alt_gerente_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_alt_gerente_ok, btn_alt_gerente_pesquisar, txtf_gerente_pesquisar});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbox_cargo, pswd_senha, txtf_login});

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

//######################################### Tela Cardapio #######################################################
    private void btn_alt_menu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_addActionPerformed
        habilitar_formulario_cardapio(true);
        atualizar_botao_cardapio(false);
        pratoSelecionado = null;
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
            atualizar_cardapio_gerente();
            atualizar_cardapio_vendedor();
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
        
        habilitar_formulario_cardapio(true);
        atualizar_botao_cardapio(false);
        
        pratoSelecionado = pratos.get(linha);
        
        txtf_principal.setText(pratoSelecionado.getPrincipal());
        txtf_secundario.setText(pratoSelecionado.getSecundario());
        txtf_carne.setText(pratoSelecionado.getCarne());
        txtf_salada.setText(pratoSelecionado.getSalada());
        txtf_acompanhamento.setText(pratoSelecionado.getAcompanhamento());
        txtf_preco.setText(String.valueOf(pratoSelecionado.getPreco()));
    }//GEN-LAST:event_btn_alt_menu_altActionPerformed

    private void btn_alt_menu_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_canActionPerformed
        habilitar_formulario_cardapio(false);
        atualizar_botao_cardapio(true);
        pratoSelecionado = null;
        txtf_principal.setText("");
        txtf_secundario.setText("");
        txtf_carne.setText("");
        txtf_salada.setText("");
        txtf_acompanhamento.setText("");
        txtf_preco.setText("");        
    }//GEN-LAST:event_btn_alt_menu_canActionPerformed

    private void btn_alt_menu_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_menu_okActionPerformed
        
        String principal = txtf_principal.getText();
        String segundario = txtf_secundario.getText();
        String carne = txtf_carne.getText();
        String salada = txtf_salada.getText();
        String acompanhamento = txtf_acompanhamento.getText();
        float preco = 0.0f;
        
        try {
            preco =  Float.parseFloat(txtf_preco.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe um preço válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
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
                atualizar_botao_cardapio(true);
                habilitar_formulario_cardapio(false);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "erro ao inserir no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            pratoSelecionado.setPrincipal(principal);
            pratoSelecionado.setSecundario(segundario);
            pratoSelecionado.setCarne(carne);
            pratoSelecionado.setSalada(salada);
            pratoSelecionado.setAcompanhamento(acompanhamento);
            pratoSelecionado.setPreco(preco);
            
            try {
                pratoDao.alterar(pratoSelecionado);
                JOptionPane.showMessageDialog(null, "Prato Alterado!");
                
                txtf_principal.setText("");
                txtf_secundario.setText("");
                txtf_carne.setText("");
                txtf_salada.setText("");
                txtf_acompanhamento.setText("");
                txtf_preco.setText("");

                atualizar_botao_cardapio(true);
                habilitar_formulario_cardapio(false);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        pratoSelecionado = null;
        atualizar_cardapio_gerente();
        atualizar_cardapio_vendedor();        
    }//GEN-LAST:event_btn_alt_menu_okActionPerformed

    private void habilitar_formulario_cardapio(boolean status){
        txtf_principal.setEnabled(status);
        txtf_secundario.setEnabled(status);
        txtf_carne.setEnabled(status);
        txtf_salada.setEnabled(status);
        txtf_acompanhamento.setEnabled(status);
        txtf_preco.setEnabled(status);
    }
    
    private void atualizar_botao_cardapio(Boolean status) {
        btn_alt_menu_add.setEnabled(status);
        btn_alt_menu_alt.setEnabled(status);
        btn_alt_menu_rm.setEnabled(status);
        btn_alt_menu_can.setEnabled(!status);
        btn_alt_menu_ok.setEnabled(!status);
        
    }
    
    private void atualizar_cardapio_gerente(){
        try {
            pratos = pratoDao.buscar("");
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
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
   
    private void atualizar_cardapio_vendedor(){
        try {
            pratos = pratoDao.buscar("");
            DefaultTableModel model = 
                    (DefaultTableModel) jtable_ven_menu.getModel();
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
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
//######################################### FIM #######################################################
     
     
     
     
//######################################### Tela Clientes ######################################################
    private void btn_cliente_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_okActionPerformed

        String nome = txtf_cliente_nome.getText();
        String sobrenome = txtf_cliente_sobrenome.getText();
        String telefone = txtf_cliente_telefone.getText();
        String estado = txtf_cliente_estado.getText();
        String cidade = txtf_cliente_cidade.getText();
        String bairro = txtf_cliente_bairro.getText();
        String rua = txtf_cliente_rua.getText();
        int numero = 0;
        
        try {
            numero = Integer.parseInt(txtf_cliente_numero.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (numero <= 0){
            JOptionPane.showMessageDialog(null, "Informe um número válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (nome.length() <= 2){
            JOptionPane.showMessageDialog(null, "Informe um nome válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (sobrenome.length() <= 2){
            JOptionPane.showMessageDialog(null, "Informe um sobrenome válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (telefone.length() != 11){
            JOptionPane.showMessageDialog(null, "Informe um telefone válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (estado.length() <= 1){
            JOptionPane.showMessageDialog(null, "Informe um estado válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cidade.length() <= 1){
            JOptionPane.showMessageDialog(null, "Informe uma cidade válida.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (bairro.length() <= 2){
            JOptionPane.showMessageDialog(null, "Informe um bairro válido.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (rua.length() <= 2){
            JOptionPane.showMessageDialog(null, "Informe uma rua válida.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (clienteSelecionado == null) {
            Cliente cliente = new Cliente(
                nome,
                sobrenome,
                telefone,
                estado,
                cidade, 
                bairro,
                rua,
                numero
            );
            
            try {
                clienteDao.adicionar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado");
                txtf_cliente_nome.setText("");
                txtf_cliente_sobrenome.setText("");
                txtf_cliente_telefone.setText("");
                txtf_cliente_estado.setText("");
                txtf_cliente_cidade.setText("");
                txtf_cliente_bairro.setText("");
                txtf_cliente_rua.setText("");
                txtf_cliente_numero.setText("");
                atualizar_botao_cliente(true);
                habilitar_formulario_cliente(false);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            clienteSelecionado.setNome(nome);
            clienteSelecionado.setSobrenome(sobrenome);
            clienteSelecionado.setTelefone(telefone);
            clienteSelecionado.setEstado(estado);
            clienteSelecionado.setCidade(cidade);
            clienteSelecionado.setBairro(bairro);
            clienteSelecionado.setRua(rua);
            clienteSelecionado.setNumero(numero);
            
            try {
                clienteDao.alterar(clienteSelecionado);
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                atualizar_botao_cliente(true);
                habilitar_formulario_cliente(false);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        clienteSelecionado = null;
        atualizar_cliente_tabela();
    }//GEN-LAST:event_btn_cliente_okActionPerformed

    private void btn_cliente_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_altActionPerformed

        int linha = Jtable_cliente.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizar_botao_cliente(false);
        habilitar_formulario_cliente(true);
        
        clienteSelecionado = clientes.get(linha);
        
        txtf_cliente_nome.setText(clienteSelecionado.getNome());
        txtf_cliente_sobrenome.setText(clienteSelecionado.getSobrenome());
        txtf_cliente_telefone.setText(clienteSelecionado.getTelefone());
        txtf_cliente_estado.setText(clienteSelecionado.getEstado());
        txtf_cliente_cidade.setText(clienteSelecionado.getCidade());
        txtf_cliente_bairro.setText(clienteSelecionado.getBairro());
        txtf_cliente_rua.setText(clienteSelecionado.getRua());
        txtf_cliente_numero.setText(String.valueOf(clienteSelecionado.getNumero()));
    }//GEN-LAST:event_btn_cliente_altActionPerformed

    private void btn_cliente_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_canActionPerformed
        atualizar_botao_cliente(true);
        habilitar_formulario_cliente(false);
        clienteSelecionado = null;
        txtf_cliente_nome.setText("");
        txtf_cliente_sobrenome.setText("");
        txtf_cliente_telefone.setText("");
        txtf_cliente_estado.setText("");
        txtf_cliente_cidade.setText("");
        txtf_cliente_bairro.setText("");
        txtf_cliente_rua.setText("");
        txtf_cliente_numero.setText("");
        
    }//GEN-LAST:event_btn_cliente_canActionPerformed

    private void btn_cliente_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_rmActionPerformed
        int linha = Jtable_cliente.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        clienteSelecionado = clientes.get(linha);
        
        try {
            clienteDao.remover(clienteSelecionado.getId());
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");
            atualizar_cliente_tabela();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_cliente_rmActionPerformed

    private void btn_cliente_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_addActionPerformed
        atualizar_botao_cliente(false);
        habilitar_formulario_cliente(true);
        clienteSelecionado = null;
    }//GEN-LAST:event_btn_cliente_addActionPerformed

    private void btn_cliente_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_pesquisarActionPerformed
        atualizar_cliente_tabela();
    }//GEN-LAST:event_btn_cliente_pesquisarActionPerformed

    private void habilitar_formulario_cliente(boolean status){
        txtf_cliente_nome.setEnabled(status);
        txtf_cliente_sobrenome.setEnabled(status);
        txtf_cliente_telefone.setEnabled(status);
        txtf_cliente_estado.setEnabled(status);
        txtf_cliente_cidade.setEnabled(status);
        txtf_cliente_bairro.setEnabled(status);
        txtf_cliente_rua.setEnabled(status);
        txtf_cliente_numero.setEnabled(status);
        txtf_cliente_pesquisar.setEnabled(!status);
    }
    
    private void atualizar_botao_cliente(Boolean status) {
        btn_cliente_add.setEnabled(status);
        btn_cliente_alt.setEnabled(status);
        btn_cliente_rm.setEnabled(status);
        btn_cliente_can.setEnabled(!status);
        btn_cliente_ok.setEnabled(!status);
        btn_cliente_pesquisar.setEnabled(status);
        
    }
   
    private void atualizar_cliente_tabela(){
        try {
            clientes = clienteDao.buscarPeloNome(txtf_cliente_pesquisar.getText());
            DefaultTableModel model = 
                    (DefaultTableModel) Jtable_cliente.getModel();
            model.setNumRows(0);
            for(int i = 0;i < clientes.size(); i++){
                Cliente cliente = clientes.get(i);
                model.addRow(new Object[]{
                    cliente.getNome(),
                    cliente.getSobrenome(),
                    cliente.getTelefone(),
                    cliente.getEstado(),
                    cliente.getBairro(),
                    cliente.getRua(),
                    cliente.getNumero()
                });
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
//######################################### FIM #######################################################    

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

//######################################### Tela Gerente #######################################################
    private void btn_alt_gerente_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_gerente_addActionPerformed
        atualizar_botao_gerente(false);
        habilitar_formulario_gerente(true);
        usuarioSelecionado = null;
    }//GEN-LAST:event_btn_alt_gerente_addActionPerformed

    private void btn_alt_gerente_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_gerente_rmActionPerformed
        int linha = jtable_usuario.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        usuarioSelecionado = usuarios.get(linha);
        try {
            if (usuarioSelecionado.getId() == usuario.getId()) {
                JOptionPane.showMessageDialog(null, "Não é possível excluir a conta logada.", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            } else {
                usuarioDao.remover(usuarioSelecionado.getId());
                JOptionPane.showMessageDialog(null, "Pessoa excluida com sucesso");
                atualizar_usuario_tabela();
            } 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_alt_gerente_rmActionPerformed

    private void btn_alt_gerente_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_gerente_altActionPerformed
        int linha = jtable_usuario.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizar_botao_gerente(false);
        habilitar_formulario_gerente(true);
        
        usuarioSelecionado = usuarios.get(linha);
        txtf_nome.setText(usuarioSelecionado.getNome());
        txtf_login.setText(usuarioSelecionado.getLogin());
        cbox_cargo.setSelectedIndex(usuarioSelecionado.getPermissao() - 1);
    }//GEN-LAST:event_btn_alt_gerente_altActionPerformed

    private void btn_alt_gerente_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_gerente_canActionPerformed
        atualizar_botao_gerente(true);
        habilitar_formulario_gerente(false);
        usuarioSelecionado = null;
        txtf_nome.setText("");
        txtf_login.setText("");
        pswd_senha.setText("");
    }//GEN-LAST:event_btn_alt_gerente_canActionPerformed

    private void btn_alt_gerente_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_gerente_okActionPerformed

        String nome = txtf_nome.getText();
        String login = txtf_login.getText();
        String senha = String.valueOf(pswd_senha.getPassword());
        int permissao = cbox_cargo.getSelectedIndex() + 1;

        if (nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "informe um nome.", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (login.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um login", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;

        }
        if (senha.length() < 8) {
            JOptionPane.showMessageDialog(null, "Senha muito curta.", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (usuarioSelecionado == null) {
            Usuario usuario = new Usuario(nome, login, senha, permissao);

            try {
                usuarioDao.adicionar(usuario);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado");
                txtf_nome.setText("");
                txtf_login.setText("");
                pswd_senha.setText("");
                atualizar_botao_gerente(true);
                habilitar_formulario_gerente(false);
        
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "erro ao inserir no banco de dados",
                        "Erro", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            usuarioSelecionado.setNome(nome);
            usuarioSelecionado.setLogin(login);
            usuarioSelecionado.setSenha(senha);
            usuarioSelecionado.setPermissao(permissao);

            try {
                usuarioDao.alterar(usuarioSelecionado);
                JOptionPane.showMessageDialog(null, "Usuário Alterado");
                atualizar_botao_gerente(true);
                habilitar_formulario_gerente(false);
        

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        usuarioSelecionado = null;
        atualizar_usuario_tabela();
    }//GEN-LAST:event_btn_alt_gerente_okActionPerformed

    private void btn_alt_gerente_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alt_gerente_pesquisarActionPerformed
        atualizar_usuario_tabela();
    }//GEN-LAST:event_btn_alt_gerente_pesquisarActionPerformed

    private void habilitar_formulario_gerente(boolean status){
        txtf_nome.setEnabled(status);
        txtf_login.setEnabled(status);
        cbox_cargo.setEnabled(status);
        pswd_senha.setEnabled(status);
        txtf_gerente_pesquisar.setEnabled(!status);
    }
    
    private void atualizar_botao_gerente(Boolean status) {
        btn_alt_gerente_add.setEnabled(status);
        btn_alt_gerente_alt.setEnabled(status);
        btn_alt_gerente_rm.setEnabled(status);
        btn_alt_gerente_can.setEnabled(!status);
        btn_alt_gerente_ok.setEnabled(!status);
        btn_alt_gerente_pesquisar.setEnabled(status);
        
    }
   
    private void atualizar_usuario_tabela(){
        try {
            usuarios = usuarioDao.buscarPeloNome(txtf_gerente_pesquisar.getText());
            DefaultTableModel model = 
                    (DefaultTableModel) jtable_usuario.getModel();
            model.setNumRows(0);
            for(int i = 0;i < usuarios.size(); i++){
                Usuario usuario_linha = usuarios.get(i);
                model.addRow(new Object[]{
                    usuario_linha.getNome(),
                    usuario_linha.getLogin()
                });
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
//######################################### FIM #######################################################     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_alterar_menu;
    private javax.swing.JTable Jtable_cliente;
    private javax.swing.JButton btn_alt_gerente_add;
    private javax.swing.JButton btn_alt_gerente_alt;
    private javax.swing.JButton btn_alt_gerente_can;
    private javax.swing.JButton btn_alt_gerente_ok;
    private javax.swing.JButton btn_alt_gerente_pesquisar;
    private javax.swing.JButton btn_alt_gerente_rm;
    private javax.swing.JButton btn_alt_menu_add;
    private javax.swing.JButton btn_alt_menu_alt;
    private javax.swing.JButton btn_alt_menu_can;
    private javax.swing.JButton btn_alt_menu_ok;
    private javax.swing.JButton btn_alt_menu_rm;
    private javax.swing.JButton btn_cliente_add;
    private javax.swing.JButton btn_cliente_alt;
    private javax.swing.JButton btn_cliente_can;
    private javax.swing.JButton btn_cliente_ok;
    private javax.swing.JButton btn_cliente_pesquisar;
    private javax.swing.JButton btn_cliente_rm;
    private javax.swing.JButton btn_logout;
    private javax.swing.JComboBox<String> cbox_cargo;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTable jtable_usuario;
    private javax.swing.JTable jtable_ven_menu;
    private javax.swing.JLabel lab_selected_customer;
    private javax.swing.JPasswordField pswd_senha;
    private javax.swing.JTextField txtf_acompanhamento;
    private javax.swing.JTextField txtf_carne;
    private javax.swing.JTextField txtf_cliente_bairro;
    private javax.swing.JTextField txtf_cliente_cidade;
    private javax.swing.JTextField txtf_cliente_estado;
    private javax.swing.JTextField txtf_cliente_nome;
    private javax.swing.JTextField txtf_cliente_numero;
    private javax.swing.JTextField txtf_cliente_pesquisar;
    private javax.swing.JTextField txtf_cliente_rua;
    private javax.swing.JTextField txtf_cliente_sobrenome;
    private javax.swing.JTextField txtf_cliente_telefone;
    private javax.swing.JTextField txtf_gerente_pesquisar;
    private javax.swing.JTextField txtf_login;
    private javax.swing.JTextField txtf_nome;
    private javax.swing.JTextField txtf_preco;
    private javax.swing.JTextField txtf_principal;
    private javax.swing.JTextField txtf_salada;
    private javax.swing.JTextField txtf_secundario;
    // End of variables declaration//GEN-END:variables
}
