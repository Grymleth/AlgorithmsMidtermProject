
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aevan
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Instance variables
     */
    private final ArrayList<JLabel> valuesLbl;
    private final ArrayList<Integer> values;
    
    //GridBagConstraints for values panel
    private GridBagConstraints valuesGBC;
    
    /**
     * Creates new form MainUI
     */
    public MainUI() {
        super("Sorting Algorithms");
        valuesLbl = new ArrayList<>();
        values = new ArrayList<>();
        
        valuesGBC = new GridBagConstraints();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        algoPane = new javax.swing.JTabbedPane();
        insertionScroll = new javax.swing.JScrollPane();
        insertionPane = new javax.swing.JPanel();
        combScroll = new javax.swing.JScrollPane();
        combPane = new javax.swing.JPanel();
        selectionScroll = new javax.swing.JScrollPane();
        selectionPane = new javax.swing.JPanel();
        bubbleScroll = new javax.swing.JScrollPane();
        bubblePane = new javax.swing.JPanel();
        inputLbl = new javax.swing.JLabel();
        inputFld = new javax.swing.JTextField();
        insertBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        valuesScroll = new javax.swing.JScrollPane();
        valuesPane = new javax.swing.JPanel();
        sortBtn = new javax.swing.JButton();
        aboutBar = new javax.swing.JMenuBar();
        aboutItem = new javax.swing.JMenu();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout insertionPaneLayout = new javax.swing.GroupLayout(insertionPane);
        insertionPane.setLayout(insertionPaneLayout);
        insertionPaneLayout.setHorizontalGroup(
            insertionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        insertionPaneLayout.setVerticalGroup(
            insertionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        insertionScroll.setViewportView(insertionPane);

        algoPane.addTab("Insertion Sort", insertionScroll);

        javax.swing.GroupLayout combPaneLayout = new javax.swing.GroupLayout(combPane);
        combPane.setLayout(combPaneLayout);
        combPaneLayout.setHorizontalGroup(
            combPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        combPaneLayout.setVerticalGroup(
            combPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        combScroll.setViewportView(combPane);

        algoPane.addTab("Comb Sort", combScroll);

        javax.swing.GroupLayout selectionPaneLayout = new javax.swing.GroupLayout(selectionPane);
        selectionPane.setLayout(selectionPaneLayout);
        selectionPaneLayout.setHorizontalGroup(
            selectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        selectionPaneLayout.setVerticalGroup(
            selectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        selectionScroll.setViewportView(selectionPane);

        algoPane.addTab("Selection Sort", selectionScroll);

        javax.swing.GroupLayout bubblePaneLayout = new javax.swing.GroupLayout(bubblePane);
        bubblePane.setLayout(bubblePaneLayout);
        bubblePaneLayout.setHorizontalGroup(
            bubblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        bubblePaneLayout.setVerticalGroup(
            bubblePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        bubbleScroll.setViewportView(bubblePane);

        algoPane.addTab("Bubble Sort", bubbleScroll);

        inputLbl.setText("Input:");

        inputFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputFldKeyPressed(evt);
            }
        });

        insertBtn.setText("INSERT");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        valuesPane.setLayout(new java.awt.GridBagLayout());
        valuesScroll.setViewportView(valuesPane);

        sortBtn.setText("SORT");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        aboutItem.setText("About");
        aboutBar.add(aboutItem);

        setJMenuBar(aboutBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(inputLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertBtn)
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addGap(18, 18, 18)
                .addComponent(sortBtn)
                .addContainerGap(201, Short.MAX_VALUE))
            .addComponent(valuesScroll)
            .addComponent(algoPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLbl)
                    .addComponent(inputFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertBtn)
                    .addComponent(clearBtn)
                    .addComponent(sortBtn))
                .addGap(18, 18, 18)
                .addComponent(valuesScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(algoPane, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        valuesGBC.gridy=0;
        valuesGBC.gridx=0;
        valuesPane.removeAll();
        valuesPane.setLayout(new java.awt.GridBagLayout());
        valuesPane.revalidate();
        valuesPane.repaint();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        addValue();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed
        int[][] passes;
        
        if(insertionScroll.equals(algoPane.getComponent(algoPane.getSelectedIndex()))){
            passes = getInsertion(values);
            
            layoutSortPanel(insertionPane, passes);
            print2d(passes);
            insertionPane.revalidate();
            insertionPane.repaint();
        }
            
        
    }//GEN-LAST:event_sortBtnActionPerformed

    private void inputFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFldKeyPressed
        if(evt.getKeyChar() == '\n')
            addValue();
    }//GEN-LAST:event_inputFldKeyPressed

    /**
     * @param label the label to be added to the container
     * @param container the container that will receive the label
     * @param gbc the constraints for GridBagLayout
     */
    public static void insertValue(JLabel label, Container container, GridBagConstraints gbc){
        
        gbc.insets = new Insets(5,5,5,5);
        
        gbc.gridx++;
        if(gbc.gridx % 10 == 0){
            gbc.gridx = 0;
            gbc.gridy++;
        }
        
        container.add(label,gbc);
    }
    
    /**
     * 
     * @param values array of values to be sorted
     * @return a 2d array that contains all the algorithms passes
     */
    public int[][] getInsertion(ArrayList<Integer> values){
        final int col = values.size();
        int row;
        Integer [] pass = new Integer[col];
        
        for (int i = 0; i < col; i++) {
            pass[i] = values.get(i);
        }
        
        ArrayList<Integer[]> passes = new ArrayList<>();
        
        int i, j, temp;

        for (i = 1; i < col; ++i) { 
            temp = pass[i]; 
            j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && pass[j] > temp) { 
                pass[j + 1] = pass[j]; 
                j = j - 1; 
            } 
            pass[j + 1] = temp; 
            passes.add(pass.clone());
            printArray(pass);
        } 
        
        row = passes.size();

        int [][] array = new int[row][col];
        
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                array[i][j] = passes.get(i)[j];
            }
        }
        
        return array;
    }
    
    /**
     * 
     * @param panel the JPanel that the components will be added to
     * @param passes the values we need to add to the components
     */
    public void layoutSortPanel(JPanel panel, int[][] passes){
        JPanel values;
        panel.removeAll();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        int row = passes.length;
        int col = passes[1].length;
        JLabel label;
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK);
        gbc.insets = new Insets(4,4,4,4);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //gbc.anchor = GridBagConstraints.NORTHWEST;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        label = new JLabel("Passes");
        panel.add(label);
        gbc.gridx = 1;
        gbc.gridy = 0;
        label = new JLabel("Values");
        panel.add(label ,gbc);
        
        for(int i=0;i<row;i++){
            gbc.weightx = 0;
            gbc.weighty = 0;
            gbc.gridx = 0;
            gbc.gridy += 1;
            label = new JLabel("Pass "+(i+1)+": ");
            panel.add(label,gbc);
            values = new JPanel();
            gbc.weightx = 1;
            gbc.weighty = 1;
            for(int j=0;j<col;j++){
                label = new JLabel(""+passes[i][j]);
                values.add(label);
            }
            values.revalidate();
            values.repaint();
            values.setBorder(border);
            gbc.gridx = 1;
            panel.add(values,gbc);
        }
    }
    
    public void addValue(){
        Integer newValue = Integer.parseInt(inputFld.getText());
        JLabel newLbl = new JLabel(newValue.toString());
        values.add(newValue);
        inputFld.setText("");
        System.out.println("Grid X: " + valuesGBC.gridx);
        insertValue(newLbl, valuesPane, valuesGBC);
        valuesPane.revalidate();
        valuesPane.repaint();
    }
    
    public static void print2d(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%d, ",array[i][j]);
                
            }
            System.out.println("");
        }
    }
    
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        System.out.println("");
    }
    
    public static void printArray(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar aboutBar;
    private javax.swing.JMenu aboutItem;
    private javax.swing.JTabbedPane algoPane;
    private javax.swing.JPanel bubblePane;
    private javax.swing.JScrollPane bubbleScroll;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel combPane;
    private javax.swing.JScrollPane combScroll;
    private javax.swing.JTextField inputFld;
    private javax.swing.JLabel inputLbl;
    private javax.swing.JButton insertBtn;
    private javax.swing.JPanel insertionPane;
    private javax.swing.JScrollPane insertionScroll;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel selectionPane;
    private javax.swing.JScrollPane selectionScroll;
    private javax.swing.JButton sortBtn;
    private javax.swing.JPanel valuesPane;
    private javax.swing.JScrollPane valuesScroll;
    // End of variables declaration//GEN-END:variables
}
