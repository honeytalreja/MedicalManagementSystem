
package home;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.*;
import java.io.*;
import java.nio.channels.SeekableByteChannel;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class Home extends javax.swing.JFrame implements Runnable {
static javax.swing.JTable data1 = null;


        Color notNow= Color.BLUE;
	Color now=Color.BLUE;
        Client c = new Client("127.0.0.1",5003);
        Thread ExpModule;
        Thread SearchModule;
        boolean StocksFlag=false,OrderFlag=false,SupplierFlag=false,ExpiryFlag=false,NewFlag=false;
        public Home() throws IOException {
        initComponents();
//        ExpModule = new Thread(new Home());
//        SearchModule = new Thread(new Home());
//        SearchModule.start();
        
    	now = MenuStock.getBackground();
	notNow=MenuOrder.getBackground();
        Name.setVisible(false);
        Quantity.setVisible(false);
        Price.setVisible(false);
        NameLabel.setVisible(false);
        PriceLabel.setVisible(false);
        QuantityLabel.setVisible(false);

        ADD.setVisible(false);
        data1 = Data;
	Color notNow=MenuOrder.getBackground();
	}
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        MenuStock = new javax.swing.JPanel();
        StockImg = new javax.swing.JLabel();
        StockTitle = new javax.swing.JLabel();
        MenuOrder = new javax.swing.JPanel();
        OrderImg = new javax.swing.JLabel();
        OrderTitle = new javax.swing.JLabel();
        MenuExpiry = new javax.swing.JPanel();
        ExpiryImg = new javax.swing.JLabel();
        ExpiryTitle = new javax.swing.JLabel();
        MenuSuppliers = new javax.swing.JPanel();
        SupplierImg = new javax.swing.JLabel();
        SupplierTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuNew = new javax.swing.JPanel();
        NewImg = new javax.swing.JLabel();
        NewTitle = new javax.swing.JLabel();
        HeadingPannel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Data = new javax.swing.JTable();
        Quantity = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        SearchField1 = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        PriceLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adarsh Medical");
        setBackground(new java.awt.Color(51, 0, 102));
        setBounds(new java.awt.Rectangle(250, 250, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 960));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setRequestFocusEnabled(false);

        menu.setBackground(new java.awt.Color(54, 33, 79));

        MenuStock.setBackground(new java.awt.Color(85, 65, 118));
        MenuStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuStockMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuStockMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuStockMouseEntered(evt);
            }
        });

        StockImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StockImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-open-box-filled-50.png"))); // NOI18N

        StockTitle.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        StockTitle.setForeground(new java.awt.Color(254, 254, 254));
        StockTitle.setText("Stocks");

        org.jdesktop.layout.GroupLayout MenuStockLayout = new org.jdesktop.layout.GroupLayout(MenuStock);
        MenuStock.setLayout(MenuStockLayout);
        MenuStockLayout.setHorizontalGroup(
            MenuStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MenuStockLayout.createSequentialGroup()
                .addContainerGap()
                .add(StockImg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(StockTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuStockLayout.setVerticalGroup(
            MenuStockLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, StockImg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuStockLayout.createSequentialGroup()
                .addContainerGap()
                .add(StockTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuOrder.setBackground(new java.awt.Color(64, 46, 90));
        MenuOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuOrderMouseExited(evt);
            }
        });

        OrderImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrderImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-todo-list-filled-50.png"))); // NOI18N

        OrderTitle.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        OrderTitle.setForeground(new java.awt.Color(254, 254, 254));
        OrderTitle.setText("Orders List");

        org.jdesktop.layout.GroupLayout MenuOrderLayout = new org.jdesktop.layout.GroupLayout(MenuOrder);
        MenuOrder.setLayout(MenuOrderLayout);
        MenuOrderLayout.setHorizontalGroup(
            MenuOrderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MenuOrderLayout.createSequentialGroup()
                .addContainerGap()
                .add(OrderImg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(OrderTitle)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuOrderLayout.setVerticalGroup(
            MenuOrderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, OrderImg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuOrderLayout.createSequentialGroup()
                .addContainerGap()
                .add(OrderTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuExpiry.setBackground(new java.awt.Color(64, 46, 90));
        MenuExpiry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExpiryMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuExpiryMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuExpiryMouseEntered(evt);
            }
        });

        ExpiryImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpiryImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-expired-filled-50.png"))); // NOI18N

        ExpiryTitle.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        ExpiryTitle.setForeground(new java.awt.Color(254, 254, 254));
        ExpiryTitle.setText("Expiries");

        org.jdesktop.layout.GroupLayout MenuExpiryLayout = new org.jdesktop.layout.GroupLayout(MenuExpiry);
        MenuExpiry.setLayout(MenuExpiryLayout);
        MenuExpiryLayout.setHorizontalGroup(
            MenuExpiryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MenuExpiryLayout.createSequentialGroup()
                .addContainerGap()
                .add(ExpiryImg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(ExpiryTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuExpiryLayout.setVerticalGroup(
            MenuExpiryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, ExpiryImg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuExpiryLayout.createSequentialGroup()
                .addContainerGap()
                .add(ExpiryTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuSuppliers.setBackground(new java.awt.Color(64, 46, 90));
        MenuSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSuppliersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuSuppliersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuSuppliersMouseExited(evt);
            }
        });

        SupplierImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplierImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-truck-filled-50.png"))); // NOI18N

        SupplierTitle.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        SupplierTitle.setForeground(new java.awt.Color(254, 254, 254));
        SupplierTitle.setText("Suppliers");

        org.jdesktop.layout.GroupLayout MenuSuppliersLayout = new org.jdesktop.layout.GroupLayout(MenuSuppliers);
        MenuSuppliers.setLayout(MenuSuppliersLayout);
        MenuSuppliersLayout.setHorizontalGroup(
            MenuSuppliersLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MenuSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .add(SupplierImg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SupplierTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        MenuSuppliersLayout.setVerticalGroup(
            MenuSuppliersLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SupplierImg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, MenuSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .add(SupplierTitle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Menu");

        jLabel2.setForeground(new java.awt.Color(253, 239, 239));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/check-mark-3-40.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 18, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        MenuNew.setBackground(new java.awt.Color(64, 46, 90));
        MenuNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuNewMouseClicked(evt);
            }
        });

        NewImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/images/icons8-circled-menu-50.png"))); // NOI18N

        NewTitle.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        NewTitle.setForeground(new java.awt.Color(255, 250, 250));
        NewTitle.setText("New Stock");
        NewTitle.setPreferredSize(new java.awt.Dimension(100, 33));

        org.jdesktop.layout.GroupLayout MenuNewLayout = new org.jdesktop.layout.GroupLayout(MenuNew);
        MenuNew.setLayout(MenuNewLayout);
        MenuNewLayout.setHorizontalGroup(
            MenuNewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MenuNewLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(NewImg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(NewTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuNewLayout.setVerticalGroup(
            MenuNewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, MenuNewLayout.createSequentialGroup()
                .addContainerGap()
                .add(NewImg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
            .add(MenuNewLayout.createSequentialGroup()
                .add(22, 22, 22)
                .add(NewTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout menuLayout = new org.jdesktop.layout.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MenuStock, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuOrder, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuExpiry, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuSuppliers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(MenuNew, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(menuLayout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(58, 58, 58)
                .add(MenuStock, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(MenuOrder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(MenuSuppliers, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(MenuExpiry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(MenuNew, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 162, Short.MAX_VALUE))
        );

        HeadingPannel.setBackground(new java.awt.Color(110, 89, 222));

        Heading.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Stock Availability");

        org.jdesktop.layout.GroupLayout HeadingPannelLayout = new org.jdesktop.layout.GroupLayout(HeadingPannel);
        HeadingPannel.setLayout(HeadingPannelLayout);
        HeadingPannelLayout.setHorizontalGroup(
            HeadingPannelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(HeadingPannelLayout.createSequentialGroup()
                .add(82, 82, 82)
                .add(Heading, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 555, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeadingPannelLayout.setVerticalGroup(
            HeadingPannelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(HeadingPannelLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(Heading, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Data.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Data.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Data.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Data.setEnabled(false);
        Data.setFillsViewportHeight(true);
        Data.setGridColor(new java.awt.Color(254, 254, 254));
        Data.setName(""); // NOI18N
        Data.setRowHeight(23);
        Data.setRowMargin(3);
        jScrollPane1.setViewportView(Data);

        Quantity.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QuantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantityKeyReleased(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(58, 46, 211));
        SearchButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(8, 1, 1));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SearchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchField1ActionPerformed(evt);
            }
        });
        SearchField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchField1KeyReleased(evt);
            }
        });

        Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nonr(evt);
            }
        });

        Price.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PriceKeyReleased(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(58, 46, 211));
        ADD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ADD.setForeground(new java.awt.Color(8, 1, 1));
        ADD.setText("ADD");
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        PriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PriceLabel.setText("Price:");

        NameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        NameLabel.setText("Name:");

        QuantityLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        QuantityLabel.setText("Quantity:");

        org.jdesktop.layout.GroupLayout bgLayout = new org.jdesktop.layout.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, bgLayout.createSequentialGroup()
                .add(menu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(HeadingPannel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, bgLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Name)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Quantity)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Price)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, ADD, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(PriceLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(NameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .add(QuantityLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(bgLayout.createSequentialGroup()
                                .add(SearchField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 508, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(SearchButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 653, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(138, 138, 138))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(menu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(bgLayout.createSequentialGroup()
                .add(40, 40, 40)
                .add(HeadingPannel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32)
                .add(bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(SearchField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(SearchButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(bgLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(bgLayout.createSequentialGroup()
                        .add(NameLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(Name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PriceLabel)
                        .add(7, 7, 7)
                        .add(Price, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(QuantityLabel)
                        .add(10, 10, 10)
                        .add(Quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(ADD))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 380, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, bg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


////	
  private void MenuOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOrderMouseEntered
    // TODO add your handling code here:
//		MenuOrder.setBackground(now);
  }//GEN-LAST:event_MenuOrderMouseEntered

  private void MenuStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuStockMouseEntered
    // TODO add your handling code here:
//	MenuStock.setBackground(now);
  }//GEN-LAST:event_MenuStockMouseEntered

  private void MenuExpiryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExpiryMouseEntered
    // TODO add your handling code here:
//	MenuExpiry.setBackground(now);
  }//GEN-LAST:event_MenuExpiryMouseEntered

  private void MenuSuppliersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSuppliersMouseEntered
    // TODO add your handling code here:
//	MenuSuppliers.setBackground(now);

  }//GEN-LAST:event_MenuSuppliersMouseEntered

  private void MenuSuppliersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSuppliersMouseExited
    // TODO add your handling code here:
//	MenuSuppliers.setBackground(notNow);
  }//GEN-LAST:event_MenuSuppliersMouseExited

  private void MenuExpiryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExpiryMouseExited
    // TODO add your handling code here:
//	MenuExpiry.setBackground(notNow);

  }//GEN-LAST:event_MenuExpiryMouseExited

  private void MenuOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOrderMouseExited
    // TODO add your handling code here:
//	MenuOrder.setBackground(notNow);

  }//GEN-LAST:event_MenuOrderMouseExited

  private void MenuStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuStockMouseExited
    // TODO add your handling code here:
//	MenuStock.setBackground(notNow);

  }//GEN-LAST:event_MenuStockMouseExited

  void doThis(boolean flag) {
        Name.setVisible(flag);
        Quantity.setVisible(flag);
        Price.setVisible(flag);
        ADD.setVisible(flag);
        SearchButton.setVisible(!flag);
        SearchField1.setVisible(!flag);
        NameLabel.setVisible(flag);
        PriceLabel.setVisible(flag);
        QuantityLabel.setVisible(flag);

  }
  
  void AddtoStocks(String searcher) {
    try {
            doThis(false);
            DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
            StocksTable.setColumnCount(0);
            StocksTable.setRowCount(0);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedERP","root","root");
            Statement s = c.createStatement();
            ResultSet rs;
            if(searcher.equals("")) rs = s.executeQuery("select * from Stocks;");
            else rs = s.executeQuery("select * from Stocks where TabName like '"+searcher+"%'");
            StocksTable.addColumn("Tablet Name");
            StocksTable.addColumn("Price");
            StocksTable.addColumn("Quantity");

            while(rs.next()) { 
                    Object[] row={rs.getString(1),rs.getInt(2),rs.getInt(3)};
                    StocksTable.addRow(row);

            }
            c.close();
    } catch(Exception e) {
    }
	}

        public void WorkingOnOrders() {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost/MedERP","root","root");
                Statement s = c.createStatement();
                Statement ss=c.createStatement();
                ResultSet rs = s.executeQuery("select TabName from Stocks where Quantity < 90");

                while(rs.next()) {
                    ss.executeUpdate("Insert into OrderList values('"+rs.getString(1)+"',50)");
                }
                c.close();
            }catch(Exception e) {

            }
        }
        
        void AddtoOrders(String searcher) {
            try {
                        doThis(false);
                    DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
                    StocksTable.setColumnCount(0);
                    StocksTable.setRowCount(0);
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MedERP","root","root");
                    Statement s = c.createStatement();
                    ResultSet rs;
                    if(searcher.equals("")) rs=s.executeQuery("select * from OrderList");
                    else rs = s.executeQuery("select * from OrderList where TabName like '"+searcher+"%'");
                    StocksTable.addColumn("Tablet Name");
                    StocksTable.addColumn("Quantity");
                    while(rs.next()) { 

                            Object[] row={rs.getString(1),rs.getInt(2)};
                            StocksTable.addRow(row);
                    }
                    c.close();
            } catch(Exception e) {

            }
        }
		
	void AddtoSuppliers(String searcher) {
		try {
                        doThis(false);
			DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
			StocksTable.setColumnCount(0);
			StocksTable.setRowCount(0);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MedERP","root","root");
			Statement s = c.createStatement();
			ResultSet rs;
                        if(searcher.equals(""))rs= s.executeQuery("select * from Supplier");
                        else rs=s.executeQuery("select * from Supplier where TabName like '" + searcher+"%'");
			StocksTable.addColumn("Tablet Name");
			StocksTable.addColumn("Distributor");
			StocksTable.addColumn("Contact No.");
			
			while(rs.next()) { 

				Object[] row={rs.getString(1),rs.getString(2),rs.getString(3)};
				StocksTable.addRow(row);
			}
			c.close();
		} catch(Exception e) {
			
		}
	}
	void AddtoExpDt() {
		try {
                        doThis(false);
			DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
			StocksTable.setColumnCount(0);
			StocksTable.setRowCount(0);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MedERP","root","root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from ExpDt where ExpDate < date_add(now(),interval 1 month)");
			StocksTable.addColumn("Tablet Name");
			StocksTable.addColumn("Expiry Date");
			
			while(rs.next()) { 

				Object[] row={rs.getString(1),rs.getDate(2)};
				StocksTable.addRow(row);
			}
			c.close();
		} catch(Exception e) {
			
		}
	}
        void AddNewTab() {
            try {
                doThis(true);
                DefaultTableModel StocksTable = (DefaultTableModel)  Data.getModel();
                StocksTable.setColumnCount(0);
                StocksTable.setRowCount(0);
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MedERP","root","root");
                Statement s = c.createStatement();
                s.executeUpdate("Insert into Stocks values('"+Name.getText()+"',"+Price.getText()+","+Quantity.getText()+")");
//                while(rs.next()) { 
//
//                        Object[] row={rs.getString(1),rs.getDate(2)};
//                        StocksTable.addRow(row);
//                }
                c.close();
                
            }catch(Exception e) {
                System.out.println("Connection Failed");
                e.printStackTrace();
            }
                
        }
	

  
  private void MenuStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuStockMouseClicked
    // TODO add your handling code here:
	Heading.setText("Stock Availability");
	MenuStock.setBackground(now);
	MenuSuppliers.setBackground(notNow);
	MenuNew.setBackground(notNow);
	MenuExpiry.setBackground(notNow);
	MenuOrder.setBackground(notNow);
	StocksFlag=true;
        OrderFlag=ExpiryFlag=SupplierFlag=NewFlag=false;
//            try {
//                Connection con = c.request("1", "");
             	AddtoStocks("");
//
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }
  }//GEN-LAST:event_MenuStockMouseClicked

  private void MenuOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOrderMouseClicked
    // TODO add your handling code here:
	Heading.setText("Order List");
	MenuStock.setBackground(notNow);
	MenuSuppliers.setBackground(notNow);
	MenuNew.setBackground(notNow);
	MenuExpiry.setBackground(notNow);
	MenuOrder.setBackground(now);
	OrderFlag=true;
        StocksFlag=ExpiryFlag=SupplierFlag=NewFlag=false;	
	AddtoOrders("");
  }//GEN-LAST:event_MenuOrderMouseClicked

  private void MenuExpiryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExpiryMouseClicked
    // TODO add your handling code here:
	Heading.setText("Expiring Soon !!");
	MenuStock.setBackground(notNow);
	MenuSuppliers.setBackground(notNow);
	MenuNew.setBackground(notNow);        
	MenuExpiry.setBackground(now);
	MenuOrder.setBackground(notNow);
	ExpiryFlag=true;
        OrderFlag=StocksFlag=SupplierFlag=NewFlag=false; 
        AddtoExpDt();
  }//GEN-LAST:event_MenuExpiryMouseClicked

  private void MenuSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSuppliersMouseClicked
    // TODO add your handling code here:
	Heading.setText("Supplier's Details");
	MenuStock.setBackground(notNow);
	MenuSuppliers.setBackground(now);
        MenuNew.setBackground(notNow);
	MenuExpiry.setBackground(notNow);
	MenuOrder.setBackground(notNow);
	SupplierFlag=true;
        OrderFlag=ExpiryFlag=StocksFlag=NewFlag=false;
        AddtoSuppliers("");
  }//GEN-LAST:event_MenuSuppliersMouseClicked

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed

        

    }//GEN-LAST:event_QuantityActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String searcher = Quantity.getText();
        if(StocksFlag) {
            AddtoStocks(searcher);
        }
        else if(OrderFlag) {
            AddtoOrders(searcher);
        }
        else if(SupplierFlag) {
            AddtoSuppliers(searcher);
        }
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void QuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyPressed
        
    }//GEN-LAST:event_QuantityKeyPressed

    private void QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityKeyReleased

    private void MenuNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuNewMouseClicked
        Heading.setText("New Tablets");
	MenuStock.setBackground(notNow);
	MenuSuppliers.setBackground(notNow);
	MenuNew.setBackground(now);
        MenuExpiry.setBackground(notNow);
	MenuOrder.setBackground(notNow);
	NewFlag=true;
        OrderFlag=StocksFlag=SupplierFlag=ExpiryFlag=false; 
        AddNewTab();
    }//GEN-LAST:event_MenuNewMouseClicked

    private void SearchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchField1ActionPerformed

    private void SearchField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchField1KeyPressed

    private void SearchField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchField1KeyReleased

        // TODO add your handling code here:
        String searcher = SearchField1.getText();
        if(StocksFlag) {
            AddtoStocks(searcher);
        }
        else if(OrderFlag) {
            AddtoOrders(searcher);
        }
        else if(SupplierFlag) {
            AddtoSuppliers(searcher);
        }
        
    }//GEN-LAST:event_SearchField1KeyReleased

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameKeyPressed

    private void nonr(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nonr
        // TODO add your handling code here:
    }//GEN-LAST:event_nonr

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void PriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceKeyPressed

    private void PriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceKeyReleased

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked

        // TODO add your handling code here:
        AddNewTab();
        JOptionPane.showMessageDialog(this,"Added Sucessfully !!\nName: "+Name.getText()+"\nPrice: "+Price.getText()+"\nQuantity: "+Quantity.getText()+"\n","ohGajab !!",JOptionPane.INFORMATION_MESSAGE);
        Name.setText("");
        Price.setText("");
        Quantity.setText("");
    }//GEN-LAST:event_ADDMouseClicked
	public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LogIn l = new LogIn();
		l.setVisible(true);
            }
        });
	}


		
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTable Data;
    private javax.swing.JLabel ExpiryImg;
    private javax.swing.JLabel ExpiryTitle;
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel HeadingPannel;
    private javax.swing.JPanel MenuExpiry;
    private javax.swing.JPanel MenuNew;
    private javax.swing.JPanel MenuOrder;
    private javax.swing.JPanel MenuStock;
    private javax.swing.JPanel MenuSuppliers;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NewImg;
    private javax.swing.JLabel NewTitle;
    private javax.swing.JLabel OrderImg;
    private javax.swing.JLabel OrderTitle;
    private javax.swing.JTextField Price;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField Quantity;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField1;
    private javax.swing.JLabel StockImg;
    private javax.swing.JLabel StockTitle;
    private javax.swing.JLabel SupplierImg;
    private javax.swing.JLabel SupplierTitle;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        AddtoExpDt();
        WorkingOnOrders();
//        Heading.setBackground(Color.BLACK);
        String searcher = Quantity.getText();
        if(StocksFlag) {
            AddtoStocks(searcher);
        }
        else if(OrderFlag) {
            AddtoOrders(searcher);
        }
        else if(SupplierFlag) {
            AddtoSuppliers(searcher);
        }


            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}

