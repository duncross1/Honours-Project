/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.HTMLImage;
import Classes.HTMLLinkButton;
import Classes.HTMLText;
import Classes.Site;
import Classes.Templates;
import java.io.File;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ross
 */
public class Template5Editor extends javax.swing.JFrame {

    private Site thisSite;
    
    public Template5Editor(Site siteIn) {
        initComponents();
        
        thisSite = siteIn;
        
        lblMessage.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        btnSelectImage1 = new javax.swing.JButton();
        txtImage1Path = new javax.swing.JTextField();
        btnSelectImage2 = new javax.swing.JButton();
        txtImage2Path = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBodyText1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBodyText2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtButton1Link = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtButton2Link = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtButton1Text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtButton2Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPageName = new javax.swing.JTextField();
        btnAddPage = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        lblFontSize1 = new javax.swing.JLabel();
        txtFontSize1 = new javax.swing.JTextField();
        lblFontSize2 = new javax.swing.JLabel();
        txtFontSize2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtImage1Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtImage2Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblTitle.setText("Template 5");

        txtTitle.setText("Insert Title");

        btnSelectImage1.setText("Select Image 1");
        btnSelectImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImage1ActionPerformed(evt);
            }
        });

        txtImage1Path.setEditable(false);

        btnSelectImage2.setText("Select Image 2");
        btnSelectImage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImage2ActionPerformed(evt);
            }
        });

        txtImage2Path.setEditable(false);

        txtBodyText1.setColumns(20);
        txtBodyText1.setRows(5);
        txtBodyText1.setText("Insert Body Text 1");
        jScrollPane1.setViewportView(txtBodyText1);

        txtBodyText2.setColumns(20);
        txtBodyText2.setRows(5);
        txtBodyText2.setText("Insert Body Text 2");
        jScrollPane2.setViewportView(txtBodyText2);

        jLabel2.setText("Button 1 Link:");

        jLabel3.setText("Button 2 Link:");

        jLabel4.setText("Button 1 Text:");

        jLabel5.setText("Button 2 Text:");

        jLabel1.setText("Page Name:");

        btnAddPage.setText("Add Page");
        btnAddPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPageActionPerformed(evt);
            }
        });

        lblMessage.setText("Message");

        lblFontSize1.setText("Font size 1:");

        lblFontSize2.setText("Font Size 2:");

        jLabel6.setText("Image 1 Name:");

        jLabel7.setText("Image 2 Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddPage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMessage))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtButton1Text))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtButton1Link, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSelectImage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImage1Name))
                            .addComponent(txtImage1Path, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFontSize1)
                            .addComponent(txtFontSize1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtButton2Text))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtButton2Link, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFontSize2)
                                    .addComponent(txtFontSize2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtImage2Path, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSelectImage2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtImage2Name)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lblTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectImage1)
                    .addComponent(btnSelectImage2)
                    .addComponent(jLabel6)
                    .addComponent(txtImage1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtImage2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImage1Path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImage2Path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFontSize2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFontSize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtButton1Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtButton2Link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtButton1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtButton2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFontSize1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFontSize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPage)
                    .addComponent(lblMessage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPageActionPerformed
        //If none of the required textboxes are empty
        if(!txtTitle.getText().isEmpty() && !txtImage1Path.getText().isEmpty() && !txtBodyText1.getText().isEmpty() 
        && !txtButton1Link.getText().isEmpty() && !txtButton1Text.getText().isEmpty() && !txtFontSize1.getText().isEmpty() 
        && !txtImage2Path.getText().isEmpty() && !txtBodyText2.getText().isEmpty() && !txtButton2Link.getText().isEmpty()
        && !txtButton2Text.getText().isEmpty() && !txtFontSize2.getText().isEmpty() && !txtImage1Name.getText().isEmpty()
        && !txtImage2Name.getText().isEmpty() && !txtPageName.getText().isEmpty())
        {
            HTMLText newHeader = new HTMLText("</header1>", txtTitle.getText());
            HTMLImage newImage1 = new HTMLImage(txtImage1Path.getText(), "the-image1", "100%", "472px", txtImage1Name.getText());
            HTMLImage newImage2 = new HTMLImage(txtImage2Path.getText(), "the-image2", "100%", "472px", txtImage2Name.getText());
            HTMLText newPara1 = new HTMLText("</p1>", txtBodyText1.getText());
            HTMLText newPara2 = new HTMLText("</p2>", txtBodyText2.getText());
            HTMLLinkButton newLb1 = new HTMLLinkButton(txtButton1Link.getText(), txtButton1Text.getText());
            HTMLLinkButton newLb2 = new HTMLLinkButton(txtButton2Link.getText(), txtButton2Text.getText());
            
            Templates newPage = new Templates();
            newPage.fillTemplate5(newHeader, newImage1, newPara1, txtFontSize1.getText(), newLb1, newImage2,
                                   newPara2, txtFontSize2.getText(), newLb2, txtPageName.getText());
            
            HashMap<String, Templates> newPages = new HashMap<>();
            if(!thisSite.getPages().isEmpty()) //if the pages hashmap is not empty
            {
                newPages = thisSite.getPages();
            }
            newPages.put(txtPageName.getText(), newPage);
            thisSite.setPages(newPages);
            
            NewWebsite nw = new NewWebsite(thisSite);
            this.dispose();
            nw.setVisible(true);
        }
        else //If a required field is not filled out
        {
            lblMessage.setText("Please fill out all required fields");
        }
    }//GEN-LAST:event_btnAddPageActionPerformed

    private void btnSelectImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImage1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        //Limits the file chooser to only finding jpegs
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg");
        chooser.setFileFilter(imageFilter);
        chooser.showOpenDialog(null);
        File imageFile = chooser.getSelectedFile();
        String imageFilePath = imageFile.getAbsolutePath();
        txtImage1Path.setText(imageFilePath);
    }//GEN-LAST:event_btnSelectImage1ActionPerformed

    private void btnSelectImage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImage2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        //Limits the file chooser to only finding jpegs
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg");
        chooser.setFileFilter(imageFilter);
        chooser.showOpenDialog(null);
        File imageFile2 = chooser.getSelectedFile();
        String imageFilePath2 = imageFile2.getAbsolutePath();
        txtImage2Path.setText(imageFilePath2);
    }//GEN-LAST:event_btnSelectImage2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Template5Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template5Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template5Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template5Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Template5Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPage;
    private javax.swing.JButton btnSelectImage1;
    private javax.swing.JButton btnSelectImage2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFontSize1;
    private javax.swing.JLabel lblFontSize2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtBodyText1;
    private javax.swing.JTextArea txtBodyText2;
    private javax.swing.JTextField txtButton1Link;
    private javax.swing.JTextField txtButton1Text;
    private javax.swing.JTextField txtButton2Link;
    private javax.swing.JTextField txtButton2Text;
    private javax.swing.JTextField txtFontSize1;
    private javax.swing.JTextField txtFontSize2;
    private javax.swing.JTextField txtImage1Name;
    private javax.swing.JTextField txtImage1Path;
    private javax.swing.JTextField txtImage2Name;
    private javax.swing.JTextField txtImage2Path;
    private javax.swing.JTextField txtPageName;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
