package com.example.trabalhopoo1.visao;

import com.example.trabalhopoo1.dao.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.example.trabalhopoo1.modelo.*;
        

public class PaginaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    private final UsuarioDAO usuarioDao = new UsuarioDAO();
    private List<Usuario> usuarios;
    private Usuario usuarioSelecionado;
    
    private final ClienteDAO clienteDao = new ClienteDAO();
    private List<Cliente> clientes;
    private Cliente clienteSelecionado;
    
    private final PratoDAO pratoDao = new PratoDAO();
    private List<Prato> pratos;
    private Prato pratoSelecionado;
    
    private final PedidoDAO pedidoDao = new PedidoDAO();
    private List<Pedido> pedidos;
    private Pedido pedidoSelecionado;
    
    private ArrayList<Pedido> listaPedidos = new ArrayList<>(); 
    
    private int paginaAtual;
    private int pratosDesativados = contarPratosDesativados();
    
    public PaginaPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        configurarPermissao();
        label_inicio_nome.setText(usuario.getLogin());
        label_inicio_cumprimentos.setText(label_inicio_cumprimentos.getText() + 
                usuario.getNome() + "!");
        habilitar_formulario_cliente(false);
        atualizar_botao_cliente(true);
        atualizar_cliente_tabela();
        atualizar_vender_tabela_cliente();
        atualizar_pedidos_cliente();        
        
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
        btn_inicio_sair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label_inicio_nome = new javax.swing.JLabel();
        label_inicio_cumprimentos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable_ven_menu = new javax.swing.JTable();
        btn_vender_can = new javax.swing.JButton();
        btn_vender_ok = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtable_vender_pedido = new javax.swing.JTable();
        btn_vender_rm = new javax.swing.JButton();
        btn_vender_add = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_vender_total = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtable_vender_cliente = new javax.swing.JTable();
        txtf_vender_pesquisar = new javax.swing.JTextField();
        btn_vender_pesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lab_selected_customer = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtable_pedidos_cliente = new javax.swing.JTable();
        btn_pedidos_pesquisar = new javax.swing.JButton();
        label_pedidos_nome_cliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_pedidos_total = new javax.swing.JLabel();
        btn_pedidos_anterior = new javax.swing.JButton();
        btn_pedidos_proximo = new javax.swing.JButton();
        txtf_pedidos_pesquisar = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtable_pedidos_pedido = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        label_pedidos_numero = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        btn_cliente_ok = new javax.swing.JButton();
        btn_cliente_alt = new javax.swing.JButton();
        btn_cliente_can = new javax.swing.JButton();
        btn_cliente_rm = new javax.swing.JButton();
        btn_cliente_add = new javax.swing.JButton();
        txtf_cliente_nome = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        Jtable_cliente_cliente = new javax.swing.JTable();
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
        btn_cardapio_ok = new javax.swing.JButton();
        btn_cardapio_alt = new javax.swing.JButton();
        btn_cardapio_can = new javax.swing.JButton();
        btn_cardapio_rm = new javax.swing.JButton();
        txtf_cardapio_preco = new javax.swing.JTextField();
        btn_cardapio_add = new javax.swing.JButton();
        txtf_cardapio_principal = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtable_cardapio_menu = new javax.swing.JTable();
        txtf_cardapio_secundario = new javax.swing.JTextField();
        txtf_cardapio_carne = new javax.swing.JTextField();
        txtf_cardapio_acompanhamento = new javax.swing.JTextField();
        txtf_cardapio_salada = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btn_gerente_add = new javax.swing.JButton();
        btn_gerente_rm = new javax.swing.JButton();
        btn_gerente_alt = new javax.swing.JButton();
        btn_gerente_can = new javax.swing.JButton();
        btn_gerente_ok = new javax.swing.JButton();
        txtf_gerente_pesquisar = new javax.swing.JTextField();
        btn_gerente_pesquisar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable_gerente_usuario = new javax.swing.JTable();
        txtf_gerente_nome = new javax.swing.JTextField();
        txtf_gerente_login = new javax.swing.JTextField();
        pswd_gerente_senha = new javax.swing.JPasswordField();
        cbox_gerente_cargo = new javax.swing.JComboBox<>();

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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btn_inicio_sair.setBackground(new java.awt.Color(255, 100, 100));
        btn_inicio_sair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_inicio_sair.setForeground(new java.awt.Color(70, 70, 70));
        btn_inicio_sair.setText("Sair");
        btn_inicio_sair.setBorder(null);
        btn_inicio_sair.setBorderPainted(false);
        btn_inicio_sair.setContentAreaFilled(false);
        btn_inicio_sair.setOpaque(true);
        btn_inicio_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_sairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel3.setText("Conectado como:");

        label_inicio_cumprimentos.setBackground(new java.awt.Color(255, 255, 255));
        label_inicio_cumprimentos.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        label_inicio_cumprimentos.setForeground(new java.awt.Color(70, 70, 70));
        label_inicio_cumprimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_inicio_cumprimentos.setText("Bem-Vindo, ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_inicio_cumprimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_inicio_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(btn_inicio_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_inicio_cumprimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inicio_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(label_inicio_nome))
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

        jtable_ven_menu.setForeground(new java.awt.Color(70, 70, 70));
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

        btn_vender_can.setBackground(new java.awt.Color(255, 255, 255));
        btn_vender_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_vender_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_vender_can.setText("Cancelar");
        btn_vender_can.setBorder(null);
        btn_vender_can.setOpaque(true);
        btn_vender_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vender_canActionPerformed(evt);
            }
        });

        btn_vender_ok.setBackground(new java.awt.Color(255, 255, 255));
        btn_vender_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_vender_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_vender_ok.setText("Finalizar");
        btn_vender_ok.setBorder(null);
        btn_vender_ok.setOpaque(true);
        btn_vender_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vender_okActionPerformed(evt);
            }
        });

        jtable_vender_pedido.setForeground(new java.awt.Color(70, 70, 70));
        jtable_vender_pedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_vender_pedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jtable_vender_pedido);
        if (jtable_vender_pedido.getColumnModel().getColumnCount() > 0) {
            jtable_vender_pedido.getColumnModel().getColumn(0).setMinWidth(50);
            jtable_vender_pedido.getColumnModel().getColumn(0).setMaxWidth(50);
            jtable_vender_pedido.getColumnModel().getColumn(2).setMinWidth(100);
            jtable_vender_pedido.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        btn_vender_rm.setBackground(new java.awt.Color(255, 255, 255));
        btn_vender_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_vender_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_vender_rm.setText("Remover");
        btn_vender_rm.setBorder(null);
        btn_vender_rm.setOpaque(true);
        btn_vender_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vender_rmActionPerformed(evt);
            }
        });

        btn_vender_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_vender_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_vender_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_vender_add.setText("Adicionar");
        btn_vender_add.setBorder(null);
        btn_vender_add.setOpaque(true);
        btn_vender_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vender_addActionPerformed(evt);
            }
        });

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

        label_vender_total.setText("0.0");

        jtable_vender_cliente.setForeground(new java.awt.Color(70, 70, 70));
        jtable_vender_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_vender_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_vender_clienteMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jtable_vender_cliente);
        if (jtable_vender_cliente.getColumnModel().getColumnCount() > 0) {
            jtable_vender_cliente.getColumnModel().getColumn(0).setMinWidth(150);
            jtable_vender_cliente.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        txtf_vender_pesquisar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_vender_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        txtf_vender_pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        txtf_vender_pesquisar.setCaretColor(new java.awt.Color(70, 70, 70));

        btn_vender_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btn_vender_pesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_vender_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        btn_vender_pesquisar.setText("Pesquisar");
        btn_vender_pesquisar.setBorder(null);
        btn_vender_pesquisar.setOpaque(true);
        btn_vender_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vender_pesquisarActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lab_selected_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtf_vender_pesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_vender_pesquisar))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(label_vender_total)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_vender_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_vender_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn_vender_can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_vender_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_vender_add, btn_vender_pesquisar});

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
                            .addComponent(btn_vender_pesquisar)
                            .addComponent(txtf_vender_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lab_selected_customer)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vender_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vender_can, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vender_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vender_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(label_vender_total))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_vender_add, btn_vender_pesquisar, txtf_vender_pesquisar});

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

        jtable_pedidos_cliente.setForeground(new java.awt.Color(70, 70, 70));
        jtable_pedidos_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_pedidos_cliente.getTableHeader().setReorderingAllowed(false);
        jtable_pedidos_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_pedidos_clienteMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jtable_pedidos_cliente);

        btn_pedidos_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btn_pedidos_pesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_pedidos_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        btn_pedidos_pesquisar.setText("Pesquisar");
        btn_pedidos_pesquisar.setBorder(null);
        btn_pedidos_pesquisar.setOpaque(true);
        btn_pedidos_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidos_pesquisarActionPerformed(evt);
            }
        });

        label_pedidos_nome_cliente.setText("nome");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel6.setText("Cliente");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel5.setText("Total");

        label_pedidos_total.setText("0.0");

        btn_pedidos_anterior.setBackground(new java.awt.Color(255, 255, 255));
        btn_pedidos_anterior.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_pedidos_anterior.setForeground(new java.awt.Color(70, 70, 70));
        btn_pedidos_anterior.setText("Anterior");
        btn_pedidos_anterior.setBorder(null);
        btn_pedidos_anterior.setOpaque(true);
        btn_pedidos_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidos_anteriorActionPerformed(evt);
            }
        });

        btn_pedidos_proximo.setBackground(new java.awt.Color(255, 255, 255));
        btn_pedidos_proximo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_pedidos_proximo.setForeground(new java.awt.Color(70, 70, 70));
        btn_pedidos_proximo.setText("Próximo");
        btn_pedidos_proximo.setBorder(null);
        btn_pedidos_proximo.setOpaque(true);
        btn_pedidos_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidos_proximoActionPerformed(evt);
            }
        });

        txtf_pedidos_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        txtf_pedidos_pesquisar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_pedidos_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        txtf_pedidos_pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        jtable_pedidos_pedido.setForeground(new java.awt.Color(70, 70, 70));
        jtable_pedidos_pedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_pedidos_pedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jtable_pedidos_pedido);
        if (jtable_pedidos_pedido.getColumnModel().getColumnCount() > 0) {
            jtable_pedidos_pedido.getColumnModel().getColumn(0).setMinWidth(100);
            jtable_pedidos_pedido.getColumnModel().getColumn(0).setMaxWidth(100);
            jtable_pedidos_pedido.getColumnModel().getColumn(2).setMinWidth(150);
            jtable_pedidos_pedido.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel7.setText("Número do Pedido");

        label_pedidos_numero.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_pedidos_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(label_pedidos_total, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtf_pedidos_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pedidos_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_pedidos_nome_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_pedidos_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pedidos_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_pedidos_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_pedidos_nome_cliente)
                        .addComponent(jLabel6))
                    .addComponent(btn_pedidos_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pedidos_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pedidos_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(label_pedidos_total)
                    .addComponent(jLabel7)
                    .addComponent(label_pedidos_numero))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_pedidos_pesquisar, txtf_pedidos_pesquisar});

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

        Jtable_cliente_cliente.setForeground(new java.awt.Color(70, 70, 70));
        Jtable_cliente_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtable_cliente_cliente.setGridColor(new java.awt.Color(200, 200, 200));
        Jtable_cliente_cliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(Jtable_cliente_cliente);

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
                        .addGap(0, 171, Short.MAX_VALUE)
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

        btn_cardapio_ok.setBackground(new java.awt.Color(255, 255, 255));
        btn_cardapio_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cardapio_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_cardapio_ok.setText("Pronto");
        btn_cardapio_ok.setBorder(null);
        btn_cardapio_ok.setOpaque(true);
        btn_cardapio_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardapio_okActionPerformed(evt);
            }
        });

        btn_cardapio_alt.setBackground(new java.awt.Color(255, 255, 255));
        btn_cardapio_alt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cardapio_alt.setForeground(new java.awt.Color(70, 70, 70));
        btn_cardapio_alt.setText("Alterar");
        btn_cardapio_alt.setBorder(null);
        btn_cardapio_alt.setOpaque(true);
        btn_cardapio_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardapio_altActionPerformed(evt);
            }
        });

        btn_cardapio_can.setBackground(new java.awt.Color(255, 255, 255));
        btn_cardapio_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cardapio_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_cardapio_can.setText("Cancelar");
        btn_cardapio_can.setBorder(null);
        btn_cardapio_can.setOpaque(true);
        btn_cardapio_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardapio_canActionPerformed(evt);
            }
        });

        btn_cardapio_rm.setBackground(new java.awt.Color(255, 255, 255));
        btn_cardapio_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cardapio_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_cardapio_rm.setText("Remover");
        btn_cardapio_rm.setBorder(null);
        btn_cardapio_rm.setOpaque(true);
        btn_cardapio_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardapio_rmActionPerformed(evt);
            }
        });

        txtf_cardapio_preco.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cardapio_preco.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cardapio_preco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        btn_cardapio_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_cardapio_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_cardapio_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_cardapio_add.setText("Adicionar");
        btn_cardapio_add.setBorder(null);
        btn_cardapio_add.setOpaque(true);
        btn_cardapio_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardapio_addActionPerformed(evt);
            }
        });

        txtf_cardapio_principal.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cardapio_principal.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cardapio_principal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        jtable_cardapio_menu.setForeground(new java.awt.Color(70, 70, 70));
        jtable_cardapio_menu.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_cardapio_menu.setGridColor(new java.awt.Color(200, 200, 200));
        jtable_cardapio_menu.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jtable_cardapio_menu);

        txtf_cardapio_secundario.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cardapio_secundario.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cardapio_secundario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Secundário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cardapio_carne.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cardapio_carne.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cardapio_carne.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Carne", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cardapio_acompanhamento.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cardapio_acompanhamento.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cardapio_acompanhamento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Acompanhamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_cardapio_salada.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_cardapio_salada.setForeground(new java.awt.Color(70, 70, 70));
        txtf_cardapio_salada.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Salada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtf_cardapio_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(txtf_cardapio_carne)
                            .addComponent(txtf_cardapio_principal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtf_cardapio_acompanhamento)
                            .addComponent(txtf_cardapio_salada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_cardapio_preco)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 171, Short.MAX_VALUE)
                        .addComponent(btn_cardapio_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cardapio_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cardapio_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cardapio_can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cardapio_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtf_cardapio_acompanhamento, txtf_cardapio_carne, txtf_cardapio_preco, txtf_cardapio_principal, txtf_cardapio_salada, txtf_cardapio_secundario});

        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cardapio_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cardapio_salada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cardapio_secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cardapio_acompanhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_cardapio_carne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_cardapio_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cardapio_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cardapio_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cardapio_can, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cardapio_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cardapio_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtf_cardapio_acompanhamento, txtf_cardapio_carne, txtf_cardapio_preco, txtf_cardapio_principal, txtf_cardapio_salada, txtf_cardapio_secundario});

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

        btn_gerente_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_gerente_add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_gerente_add.setForeground(new java.awt.Color(70, 70, 70));
        btn_gerente_add.setText("Cadastrar");
        btn_gerente_add.setBorder(null);
        btn_gerente_add.setOpaque(true);
        btn_gerente_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerente_addActionPerformed(evt);
            }
        });

        btn_gerente_rm.setBackground(new java.awt.Color(255, 255, 255));
        btn_gerente_rm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_gerente_rm.setForeground(new java.awt.Color(70, 70, 70));
        btn_gerente_rm.setText("Excluir");
        btn_gerente_rm.setBorder(null);
        btn_gerente_rm.setOpaque(true);
        btn_gerente_rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerente_rmActionPerformed(evt);
            }
        });

        btn_gerente_alt.setBackground(new java.awt.Color(255, 255, 255));
        btn_gerente_alt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_gerente_alt.setForeground(new java.awt.Color(70, 70, 70));
        btn_gerente_alt.setText("Alterar");
        btn_gerente_alt.setBorder(null);
        btn_gerente_alt.setOpaque(true);
        btn_gerente_alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerente_altActionPerformed(evt);
            }
        });

        btn_gerente_can.setBackground(new java.awt.Color(255, 255, 255));
        btn_gerente_can.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_gerente_can.setForeground(new java.awt.Color(70, 70, 70));
        btn_gerente_can.setText("Cancelar");
        btn_gerente_can.setBorder(null);
        btn_gerente_can.setOpaque(true);
        btn_gerente_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerente_canActionPerformed(evt);
            }
        });

        btn_gerente_ok.setBackground(new java.awt.Color(255, 255, 255));
        btn_gerente_ok.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_gerente_ok.setForeground(new java.awt.Color(70, 70, 70));
        btn_gerente_ok.setText("Salvar");
        btn_gerente_ok.setBorder(null);
        btn_gerente_ok.setOpaque(true);
        btn_gerente_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerente_okActionPerformed(evt);
            }
        });

        txtf_gerente_pesquisar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_gerente_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        txtf_gerente_pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        txtf_gerente_pesquisar.setCaretColor(new java.awt.Color(70, 70, 70));

        btn_gerente_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btn_gerente_pesquisar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_gerente_pesquisar.setForeground(new java.awt.Color(70, 70, 70));
        btn_gerente_pesquisar.setText("Pesquisar");
        btn_gerente_pesquisar.setBorder(null);
        btn_gerente_pesquisar.setOpaque(true);
        btn_gerente_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerente_pesquisarActionPerformed(evt);
            }
        });

        jtable_gerente_usuario.setForeground(new java.awt.Color(70, 70, 70));
        jtable_gerente_usuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtable_gerente_usuario);

        txtf_gerente_nome.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_gerente_nome.setForeground(new java.awt.Color(70, 70, 70));
        txtf_gerente_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        txtf_gerente_login.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        txtf_gerente_login.setForeground(new java.awt.Color(70, 70, 70));
        txtf_gerente_login.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        pswd_gerente_senha.setForeground(new java.awt.Color(70, 70, 70));
        pswd_gerente_senha.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true), "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N

        cbox_gerente_cargo.setBackground(new java.awt.Color(255, 255, 255));
        cbox_gerente_cargo.setForeground(new java.awt.Color(70, 70, 70));
        cbox_gerente_cargo.setMaximumRowCount(2);
        cbox_gerente_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente" }));
        cbox_gerente_cargo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 12), new java.awt.Color(70, 70, 70))); // NOI18N
        cbox_gerente_cargo.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pswd_gerente_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(txtf_gerente_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtf_gerente_login)
                            .addComponent(cbox_gerente_cargo, 0, 273, Short.MAX_VALUE)))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(btn_gerente_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_gerente_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_gerente_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_gerente_can, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_gerente_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(txtf_gerente_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_gerente_pesquisar)))))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_gerente_ok, btn_gerente_pesquisar});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbox_gerente_cargo, pswd_gerente_senha, txtf_gerente_login});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_gerente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_gerente_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswd_gerente_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_gerente_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_gerente_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerente_pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gerente_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerente_can, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerente_alt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerente_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gerente_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_gerente_ok, btn_gerente_pesquisar, txtf_gerente_pesquisar});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbox_gerente_cargo, pswd_gerente_senha, txtf_gerente_login, txtf_gerente_nome});

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_inicio_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_sairActionPerformed
        PaginaLogin loginPage = new PaginaLogin();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inicio_sairActionPerformed

//######################################### Tela Cardapio #######################################################
    private void btn_cardapio_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardapio_addActionPerformed
        habilitar_formulario_cardapio(true);
        atualizar_botao_cardapio(false);
        pratoSelecionado = null;
    }//GEN-LAST:event_btn_cardapio_addActionPerformed

    private void btn_cardapio_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardapio_rmActionPerformed
        int linha = jtable_cardapio_menu.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um prato", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        pratoSelecionado = pratos.get(linha + pratosDesativados);
        int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir um item do menu?",
                "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            try {
                pratoDao.desabilitarPrato(false, pratoSelecionado.getId());
                JOptionPane.showMessageDialog(null, "Prato excluido com sucesso");
                pratosDesativados++;
                atualizar_cardapio_gerente();
                atualizar_cardapio_vendedor();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_cardapio_rmActionPerformed

    private void btn_cardapio_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardapio_altActionPerformed
        int linha = jtable_cardapio_menu.getSelectedRow();
        
        if (linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um prato", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        habilitar_formulario_cardapio(true);
        atualizar_botao_cardapio(false);
        
        pratoSelecionado = pratos.get(linha + pratosDesativados);
        
        txtf_cardapio_principal.setText(pratoSelecionado.getPrincipal());
        txtf_cardapio_secundario.setText(pratoSelecionado.getSecundario());
        txtf_cardapio_carne.setText(pratoSelecionado.getCarne());
        txtf_cardapio_salada.setText(pratoSelecionado.getSalada());
        txtf_cardapio_acompanhamento.setText(pratoSelecionado.getAcompanhamento());
        txtf_cardapio_preco.setText(String.valueOf(pratoSelecionado.getPreco()));
    }//GEN-LAST:event_btn_cardapio_altActionPerformed

    private void btn_cardapio_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardapio_canActionPerformed
        habilitar_formulario_cardapio(false);
        atualizar_botao_cardapio(true);
        pratoSelecionado = null;
        txtf_cardapio_principal.setText("");
        txtf_cardapio_secundario.setText("");
        txtf_cardapio_carne.setText("");
        txtf_cardapio_salada.setText("");
        txtf_cardapio_acompanhamento.setText("");
        txtf_cardapio_preco.setText("");        
    }//GEN-LAST:event_btn_cardapio_canActionPerformed

    private void btn_cardapio_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardapio_okActionPerformed
        
        String principal = txtf_cardapio_principal.getText();
        String segundario = txtf_cardapio_secundario.getText();
        String carne = txtf_cardapio_carne.getText();
        String salada = txtf_cardapio_salada.getText();
        String acompanhamento = txtf_cardapio_acompanhamento.getText();
        float preco = 0.0f;
        
        try {
            preco =  Float.parseFloat(txtf_cardapio_preco.getText());
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
        
        if (pratoSelecionado == null) {
            Prato prato = new Prato(
                principal,
                segundario,
                carne,
                salada,
                acompanhamento,
                preco,
                true
            );
            
            try {
                pratoDao.adicionar(prato);
                
                JOptionPane.showMessageDialog(null, "Prato cadastrado");
                
                txtf_cardapio_principal.setText("");
                txtf_cardapio_secundario.setText("");
                txtf_cardapio_carne.setText("");
                txtf_cardapio_salada.setText("");
                txtf_cardapio_acompanhamento.setText("");
                txtf_cardapio_preco.setText("");
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
                
                txtf_cardapio_principal.setText("");
                txtf_cardapio_secundario.setText("");
                txtf_cardapio_carne.setText("");
                txtf_cardapio_salada.setText("");
                txtf_cardapio_acompanhamento.setText("");
                txtf_cardapio_preco.setText("");

                atualizar_botao_cardapio(true);
                habilitar_formulario_cardapio(false);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        pratoSelecionado = null;
        atualizar_cardapio_gerente();
        atualizar_cardapio_vendedor();        
    }//GEN-LAST:event_btn_cardapio_okActionPerformed

    private void habilitar_formulario_cardapio(boolean status){
        txtf_cardapio_principal.setEnabled(status);
        txtf_cardapio_secundario.setEnabled(status);
        txtf_cardapio_carne.setEnabled(status);
        txtf_cardapio_salada.setEnabled(status);
        txtf_cardapio_acompanhamento.setEnabled(status);
        txtf_cardapio_preco.setEnabled(status);
    }
    
    private void atualizar_botao_cardapio(Boolean status) {
        btn_cardapio_add.setEnabled(status);
        btn_cardapio_alt.setEnabled(status);
        btn_cardapio_rm.setEnabled(status);
        btn_cardapio_can.setEnabled(!status);
        btn_cardapio_ok.setEnabled(!status);
        
    }
    
    private void atualizar_cardapio_gerente(){
        try {
            pratos = pratoDao.buscar("");
            DefaultTableModel model
                    = (DefaultTableModel) jtable_cardapio_menu.getModel();
            model.setNumRows(0);
            for (int i = 0; i < pratos.size(); i++) {
                Prato prato = pratos.get(i);
                if (prato.getStatus()) {
                    model.addRow(new Object[]{
                        prato.getPrincipal(),
                        prato.getSecundario(),
                        prato.getCarne(),
                        prato.getSalada(),
                        prato.getAcompanhamento(),
                        prato.getPreco(),});
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
   
    private void atualizar_cardapio_vendedor(){
        try {
            pratos = pratoDao.buscar("");
            DefaultTableModel model
                    = (DefaultTableModel) jtable_ven_menu.getModel();
            model.setNumRows(0);
            for (int i = 0; i < pratos.size(); i++) {
                Prato prato = pratos.get(i);
                if (prato.getStatus()) {
                    model.addRow(new Object[]{
                        prato.getPrincipal(),
                        prato.getSecundario(),
                        prato.getCarne(),
                        prato.getSalada(),
                        prato.getAcompanhamento(),
                        prato.getPreco(),});
                }
            }
        } catch (SQLException ex) {
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
                numero,
                0
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
            }
        }
        clienteSelecionado = null;
        atualizar_cliente_tabela();
        atualizar_vender_tabela_cliente();
        atualizar_pedidos_cliente();
    }//GEN-LAST:event_btn_cliente_okActionPerformed

    private void btn_cliente_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_altActionPerformed

        int linha = Jtable_cliente_cliente.getSelectedRow();
        
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
        int linha = Jtable_cliente_cliente.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        clienteSelecionado = clientes.get(linha);

        int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir o cliente "
                + clienteSelecionado.getNome() + " " + clienteSelecionado.getSobrenome()
                + " e todos os seus pedidos?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            try {
                clienteDao.remover(clienteSelecionado.getId());
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");
                atualizar_cliente_tabela();
                atualizar_vender_tabela_cliente();
                atualizar_pedidos_cliente();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
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
                    (DefaultTableModel) Jtable_cliente_cliente.getModel();
            model.setNumRows(0);
            for(int i = 0;i < clientes.size(); i++){
                Cliente cliente = clientes.get(i);
                model.addRow(new Object[]{
                    cliente.getNome(),
                    cliente.getSobrenome(),
                    cliente.getTelefone(),
                    cliente.getEstado(),
                    cliente.getCidade(),
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

       
    
 //######################################### Tabbed Panel #############################################  
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        int index = jTabbedPane1.getSelectedIndex();
        switch(index) {
            case 0:
                setTitle("Início");
                clienteSelecionado = null;
                pedidoSelecionado = null;
                usuarioSelecionado = null;
                pratoSelecionado = null;
                break;
            case 1:
                setTitle("Vender");
                clienteSelecionado = null;
                pedidoSelecionado = null;
                usuarioSelecionado = null;
                pratoSelecionado = null;
                break;
            case 2:
                setTitle("Pedidos");
                clienteSelecionado = null;
                pedidoSelecionado = null;
                usuarioSelecionado = null;
                pratoSelecionado = null;
                break;
            case 3:
                setTitle("Cadastrar Cliente");
                clienteSelecionado = null;
                pedidoSelecionado = null;
                usuarioSelecionado = null;
                pratoSelecionado = null;
                break;
            case 4:
                setTitle("Alterar Cardápio");
                clienteSelecionado = null;
                pedidoSelecionado = null;
                usuarioSelecionado = null;
                pratoSelecionado = null;
                break;
            case 5:
                setTitle("Cadastrar Usuário");
                clienteSelecionado = null;
                pedidoSelecionado = null;
                usuarioSelecionado = null;
                pratoSelecionado = null;
                break;            
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged
    private int contarPratosDesativados() {
        int n = 0;
        try {
            n = 0;
            pratos = pratoDao.buscar("");
            for (Prato p : pratos) {
                if (!p.getStatus()) {
                    n++;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return n;
    }

//######################################### FIM #######################################################  
    
    
    
//######################################### Tela Gerente #######################################################
    private void btn_gerente_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerente_addActionPerformed
        atualizar_botao_gerente(false);
        habilitar_formulario_gerente(true);
        usuarioSelecionado = null;
    }//GEN-LAST:event_btn_gerente_addActionPerformed

    private void btn_gerente_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerente_rmActionPerformed
        int linha = jtable_gerente_usuario.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        usuarioSelecionado = usuarios.get(linha);

        if (usuarioSelecionado.getId() == usuario.getId()) {
            JOptionPane.showMessageDialog(null, "Não é possível excluir a conta logada.", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir o usuário "
                + usuarioSelecionado.getNome(), "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            try {

                usuarioDao.remover(usuarioSelecionado.getId());
                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");
                atualizar_usuario_tabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btn_gerente_rmActionPerformed

    private void btn_gerente_altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerente_altActionPerformed
        int linha = jtable_gerente_usuario.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        atualizar_botao_gerente(false);
        habilitar_formulario_gerente(true);
        
        usuarioSelecionado = usuarios.get(linha);
        txtf_gerente_nome.setText(usuarioSelecionado.getNome());
        txtf_gerente_login.setText(usuarioSelecionado.getLogin());
        cbox_gerente_cargo.setSelectedIndex(usuarioSelecionado.getPermissao() - 1);
    }//GEN-LAST:event_btn_gerente_altActionPerformed

    private void btn_gerente_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerente_canActionPerformed
        atualizar_botao_gerente(true);
        habilitar_formulario_gerente(false);
        usuarioSelecionado = null;
        txtf_gerente_nome.setText("");
        txtf_gerente_login.setText("");
        pswd_gerente_senha.setText("");
    }//GEN-LAST:event_btn_gerente_canActionPerformed

    private void btn_gerente_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerente_okActionPerformed

        String nome = txtf_gerente_nome.getText();
        String login = txtf_gerente_login.getText();
        String senha = String.valueOf(pswd_gerente_senha.getPassword());
        int permissao = cbox_gerente_cargo.getSelectedIndex() + 1;

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
                txtf_gerente_nome.setText("");
                txtf_gerente_login.setText("");
                pswd_gerente_senha.setText("");
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
    }//GEN-LAST:event_btn_gerente_okActionPerformed

    private void btn_gerente_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerente_pesquisarActionPerformed
        atualizar_usuario_tabela();
    }//GEN-LAST:event_btn_gerente_pesquisarActionPerformed

    private void habilitar_formulario_gerente(boolean status){
        txtf_gerente_nome.setEnabled(status);
        txtf_gerente_login.setEnabled(status);
        cbox_gerente_cargo.setEnabled(status);
        pswd_gerente_senha.setEnabled(status);
        txtf_gerente_pesquisar.setEnabled(!status);
    }
    
    private void atualizar_botao_gerente(Boolean status) {
        btn_gerente_add.setEnabled(status);
        btn_gerente_alt.setEnabled(status);
        btn_gerente_rm.setEnabled(status);
        btn_gerente_can.setEnabled(!status);
        btn_gerente_ok.setEnabled(!status);
        btn_gerente_pesquisar.setEnabled(status);
        
    }
   
    private void atualizar_usuario_tabela(){
        try {
            usuarios = usuarioDao.buscarPeloNome(txtf_gerente_pesquisar.getText());
            DefaultTableModel model = 
                    (DefaultTableModel) jtable_gerente_usuario.getModel();
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
    

    
    
    
    
    
//######################################### Tela Pedidos ####################################################### 
    private void btn_pedidos_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidos_pesquisarActionPerformed
        atualizar_pedidos_cliente();
    }//GEN-LAST:event_btn_pedidos_pesquisarActionPerformed

    private void jtable_pedidos_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_pedidos_clienteMouseClicked
        int linha = jtable_pedidos_cliente.getSelectedRow();
            if (linha < 0) {
                return;
            }
        clienteSelecionado = clientes.get(linha);
        label_pedidos_nome_cliente.setText(clienteSelecionado.getNome() + " " + clienteSelecionado.getSobrenome());
        paginaAtual = clienteSelecionado.getQtnPedidos();
        atualizar_pedidos_pedido();

    }//GEN-LAST:event_jtable_pedidos_clienteMouseClicked

    private void btn_pedidos_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidos_anteriorActionPerformed
        if (clienteSelecionado != null && paginaAtual >= 2 && paginaAtual != 0) {
            paginaAtual--;
            atualizar_pedidos_pedido();
        }
    }//GEN-LAST:event_btn_pedidos_anteriorActionPerformed

    private void btn_pedidos_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidos_proximoActionPerformed
        if (clienteSelecionado != null && paginaAtual < clienteSelecionado.getQtnPedidos()) {
            paginaAtual++;
            atualizar_pedidos_pedido();
        }
    }//GEN-LAST:event_btn_pedidos_proximoActionPerformed

    private void atualizar_pedidos_pedido() {
        try {
            pedidos = pedidoDao.listar();
            Pedido pedido;
            Prato prato;
            float total = 0f;

            DefaultTableModel model
                    = (DefaultTableModel) jtable_pedidos_pedido.getModel();
            model.setNumRows(0);
            for (int i = 0; i < pedidos.size(); i++) {
                pedido = pedidos.get(i);
                prato = pratoDao.buscarPorId(pedido.getFk_prato());
                if (pedido.getFk_cliente() == clienteSelecionado.getId()
                        && pedido.getNumero() == paginaAtual) {

                    model.addRow(new Object[]{
                        pedido.getQuantidade(),
                        prato.getPrincipal() + ", "
                        + prato.getSecundario() + ", "
                        + prato.getCarne() + ", "
                        + prato.getSalada() + ", "
                        + prato.getAcompanhamento(),
                        pedido.getPreco()
                    });

                    total += pedido.getPreco();

                }
                label_pedidos_total.setText(String.valueOf(total));
                label_pedidos_numero.setText(String.valueOf(paginaAtual));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }
    
    private void atualizar_pedidos_cliente() {
        try {
            clientes = clienteDao.buscarPeloNome(txtf_pedidos_pesquisar.getText());
            DefaultTableModel model = (DefaultTableModel) jtable_pedidos_cliente.getModel();
            model.setNumRows(0);
            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);

                model.addRow(new Object[]{
                    cliente.getNome(),
                    cliente.getSobrenome(),
                    cliente.getTelefone()
                });

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
//######################################### FIM ####################################################### 
  
  
    
    
    
    
    
    
    
//######################################### tela vender ###############################################
    private void btn_vender_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vender_pesquisarActionPerformed
        atualizar_vender_tabela_cliente();
    }//GEN-LAST:event_btn_vender_pesquisarActionPerformed

    private void jtable_vender_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_vender_clienteMouseClicked
        int linha = jtable_vender_cliente.getSelectedRow();        
        lab_selected_customer.setText(jtable_vender_cliente.getValueAt(linha, 0).toString());
        
        if (linha  < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }      
        clienteSelecionado = clientes.get(linha);
        listaPedidos = new ArrayList<>();
        atualizar_vender_tabela_pedido();
    }//GEN-LAST:event_jtable_vender_clienteMouseClicked

    private void btn_vender_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vender_addActionPerformed
        int linha_cardapio = jtable_ven_menu.getSelectedRow();

        
        if (linha_cardapio < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Prato.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (clienteSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;        
        }
        
        boolean flag = false;
        
        Prato prato = pratos.get(linha_cardapio + pratosDesativados);
        Pedido pedido = new Pedido(
            prato.getId(),
            clienteSelecionado.getId(),
            1,
            prato.getPreco(),
            clienteSelecionado.getQtnPedidos() + 1
        );
        
        for (Pedido p : listaPedidos) {
            if (pedido.getFk_prato() == p.getFk_prato()) {
                flag = true;
                p.setQuantidade(p.getQuantidade() + 1);
                p.setPreco(prato.getPreco() * p.getQuantidade());
                break;
            }
        }
        
        if (!flag) {
            listaPedidos.add(pedido);
        }
        
        atualizar_vender_tabela_pedido();
    }//GEN-LAST:event_btn_vender_addActionPerformed

    private void btn_vender_rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vender_rmActionPerformed
        int linha = jtable_vender_pedido.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um pedido", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
   
        try {
            pedidoSelecionado = listaPedidos.get(linha);
            for (Pedido p : listaPedidos) {
                if (p.getFk_prato() == pedidoSelecionado.getFk_prato()) {
                    if (p.getQuantidade() > 1) {
                        p.setQuantidade(p.getQuantidade() - 1);
                        p.setPreco(pratoDao.buscarPorId(p.getFk_prato()).getPreco() * p.getQuantidade());
                    } else {
                        listaPedidos.remove(p);
                    }
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        atualizar_vender_tabela_pedido();
    }//GEN-LAST:event_btn_vender_rmActionPerformed

    private void btn_vender_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vender_canActionPerformed
        listaPedidos = new ArrayList<>();
        atualizar_vender_tabela_pedido();
    }//GEN-LAST:event_btn_vender_canActionPerformed

    private void btn_vender_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vender_okActionPerformed
        if (listaPedidos.isEmpty() || clienteSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Adicione algum prato ao pedido.", "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } 

        try {
            for (Pedido p : listaPedidos) {
                pedidoDao.adicionar(p);
            }
            clienteSelecionado.setQtnPedidos(clienteSelecionado.getQtnPedidos() + 1);
            clienteDao.alterar(clienteSelecionado);
            
            listaPedidos = new ArrayList<>();
            atualizar_vender_tabela_pedido();
            JOptionPane.showMessageDialog(null, "Compra finalizada.");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_vender_okActionPerformed

    private void atualizar_vender_tabela_cliente(){
        try {
            clientes = clienteDao.buscarPeloNome(txtf_vender_pesquisar.getText());
            DefaultTableModel model
                    = (DefaultTableModel) jtable_vender_cliente.getModel();
            model.setNumRows(0);
            for(int i = 0;i < clientes.size(); i++){
                Cliente cliente = clientes.get(i);
                model.addRow(new Object[]{
                    cliente.getNome() + " " + 
                    cliente.getSobrenome(),
                    cliente.getTelefone(),
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void atualizar_vender_tabela_pedido(){
        try {
         float total = 0f;
        DefaultTableModel model
                = (DefaultTableModel) jtable_vender_pedido.getModel();
        model.setNumRows(0);
        for (Pedido p : listaPedidos) {
            
            Prato prato = pratoDao.buscarPorId(p.getFk_prato());
            model.addRow(new Object[]{
                p.getQuantidade(),
                prato.getPrincipal() + ", "
                + prato.getSecundario() + ", "
                + prato.getCarne() + ", "
                + prato.getSalada() + ", "
                + prato.getAcompanhamento(),
                p.getPreco()
            });
            
            total += p.getPreco();
        }
        
        label_vender_total.setText(String.valueOf(total));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
 //######################################### FIM ###############################################   





    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_cliente_cliente;
    private javax.swing.JButton btn_cardapio_add;
    private javax.swing.JButton btn_cardapio_alt;
    private javax.swing.JButton btn_cardapio_can;
    private javax.swing.JButton btn_cardapio_ok;
    private javax.swing.JButton btn_cardapio_rm;
    private javax.swing.JButton btn_cliente_add;
    private javax.swing.JButton btn_cliente_alt;
    private javax.swing.JButton btn_cliente_can;
    private javax.swing.JButton btn_cliente_ok;
    private javax.swing.JButton btn_cliente_pesquisar;
    private javax.swing.JButton btn_cliente_rm;
    private javax.swing.JButton btn_gerente_add;
    private javax.swing.JButton btn_gerente_alt;
    private javax.swing.JButton btn_gerente_can;
    private javax.swing.JButton btn_gerente_ok;
    private javax.swing.JButton btn_gerente_pesquisar;
    private javax.swing.JButton btn_gerente_rm;
    private javax.swing.JButton btn_inicio_sair;
    private javax.swing.JButton btn_pedidos_anterior;
    private javax.swing.JButton btn_pedidos_pesquisar;
    private javax.swing.JButton btn_pedidos_proximo;
    private javax.swing.JButton btn_vender_add;
    private javax.swing.JButton btn_vender_can;
    private javax.swing.JButton btn_vender_ok;
    private javax.swing.JButton btn_vender_pesquisar;
    private javax.swing.JButton btn_vender_rm;
    private javax.swing.JComboBox<String> cbox_gerente_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtable_cardapio_menu;
    private javax.swing.JTable jtable_gerente_usuario;
    private javax.swing.JTable jtable_pedidos_cliente;
    private javax.swing.JTable jtable_pedidos_pedido;
    private javax.swing.JTable jtable_ven_menu;
    private javax.swing.JTable jtable_vender_cliente;
    private javax.swing.JTable jtable_vender_pedido;
    private javax.swing.JLabel lab_selected_customer;
    private javax.swing.JLabel label_inicio_cumprimentos;
    private javax.swing.JLabel label_inicio_nome;
    private javax.swing.JLabel label_pedidos_nome_cliente;
    private javax.swing.JLabel label_pedidos_numero;
    private javax.swing.JLabel label_pedidos_total;
    private javax.swing.JLabel label_vender_total;
    private javax.swing.JPasswordField pswd_gerente_senha;
    private javax.swing.JTextField txtf_cardapio_acompanhamento;
    private javax.swing.JTextField txtf_cardapio_carne;
    private javax.swing.JTextField txtf_cardapio_preco;
    private javax.swing.JTextField txtf_cardapio_principal;
    private javax.swing.JTextField txtf_cardapio_salada;
    private javax.swing.JTextField txtf_cardapio_secundario;
    private javax.swing.JTextField txtf_cliente_bairro;
    private javax.swing.JTextField txtf_cliente_cidade;
    private javax.swing.JTextField txtf_cliente_estado;
    private javax.swing.JTextField txtf_cliente_nome;
    private javax.swing.JTextField txtf_cliente_numero;
    private javax.swing.JTextField txtf_cliente_pesquisar;
    private javax.swing.JTextField txtf_cliente_rua;
    private javax.swing.JTextField txtf_cliente_sobrenome;
    private javax.swing.JTextField txtf_cliente_telefone;
    private javax.swing.JTextField txtf_gerente_login;
    private javax.swing.JTextField txtf_gerente_nome;
    private javax.swing.JTextField txtf_gerente_pesquisar;
    private javax.swing.JTextField txtf_pedidos_pesquisar;
    private javax.swing.JTextField txtf_vender_pesquisar;
    // End of variables declaration//GEN-END:variables
}
