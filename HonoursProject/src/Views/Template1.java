/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Classes.HTMLImage;
import Classes.HTMLText;
import Classes.PageCompiler;
import java.io.File;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ross
 */
public class Template1 extends javax.swing.JFrame {

    String imageURL;
    String html;
    String pageName;
    String filePath;
    
    
    /** Creates new form Template1 */
    public Template1() {
        
        initComponents();
        
        
        lblMessage.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateHtmlImage = new javax.swing.JButton();
        btnChooseFilePath = new javax.swing.JButton();
        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txbBodyText1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txbBodyText2 = new javax.swing.JTextArea();
        txtImagePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        txtImageWidth = new javax.swing.JTextField();
        lblImageWidth = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtImageHeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFontSize1 = new javax.swing.JTextField();
        txtFontSize2 = new javax.swing.JTextField();
        txtPageName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtImageName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreateHtmlImage.setText("Create HTML page");
        btnCreateHtmlImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHtmlImageActionPerformed(evt);
            }
        });

        btnChooseFilePath.setText("Select Image");
        btnChooseFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFilePathActionPerformed(evt);
            }
        });

        txtTitle.setText("Insert Title");

        txbBodyText1.setColumns(20);
        txbBodyText1.setRows(10);
        txbBodyText1.setText("Insert Body Text");
        jScrollPane1.setViewportView(txbBodyText1);

        txbBodyText2.setColumns(20);
        txbBodyText2.setRows(5);
        txbBodyText2.setText("Inser Body Text 2");
        jScrollPane2.setViewportView(txbBodyText2);

        txtImagePath.setEditable(false);

        jLabel1.setText("Select Font Size:");

        jLabel2.setText("Select Font Size:");

        lblMessage.setText("message");

        lblImageWidth.setText("Image Width:");

        jLabel3.setText("Image Height:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Template 1");

        jLabel5.setText("Page Name:");

        jLabel6.setText("Image Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFontSize1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFontSize2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateHtmlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMessage))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImageWidth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImageWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImageHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImageName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChooseFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFontSize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChooseFilePath)
                    .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImageWidth)
                    .addComponent(txtImageWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtImageHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtImageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFontSize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateHtmlImage)
                    .addComponent(lblMessage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHtmlImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHtmlImageActionPerformed
        
        //If none of the required textboxes are empty
        if(!txtTitle.getText().isEmpty() && !txbBodyText1.getText().isEmpty() && !txbBodyText2.getText().isEmpty() 
        && !txtImagePath.getText().isEmpty() && !txtImageWidth.getText().isEmpty() && !txtImageHeight.getText().isEmpty()
        && !txtFontSize1.getText().isEmpty() && !txtFontSize2.getText().isEmpty())
        {
            HTMLText newHeader = new HTMLText("</header1>", txtTitle.getText());
            HTMLText newPara = new HTMLText("</p1>", txbBodyText1.getText());
            HTMLImage newImage = new HTMLImage(txtImagePath.getText(), "the-image", Integer.parseInt(txtImageWidth.getText()), Integer.parseInt(txtImageHeight.getText()), txtImageName.getText());
            HTMLText newPara2 = new HTMLText("</p2>", txbBodyText2.getText());

            
            
            /*Copy image file and set copy path as image path
            try
            {
                File image = new File(txtImagePath.getText());
                File destination = new File("C:\\Users\\Ross\\Desktop\\HonoursTest\\webpage\\Images\\image1.jpg");
                Files.deleteIfExists(destination.toPath());
                Files.copy(image.toPath(), destination.toPath());
                newImage = new HTMLImage(destination.getAbsolutePath(), "the-image", Integer.parseInt(txtImageWidth.getText()), Integer.parseInt(txtImageHeight.getText()));
            }
            catch (Exception ex)
            {
                lblMessage.setText("Error copying Image");
            }*/
            
            PageCompiler pc = new PageCompiler();
            
            //Compile html into page and return true or false if it is successful or not
            if(pc.CompileTemplate1(newHeader.getFullHtml(), newImage, newPara.getFullHtml(), newPara2.getFullHtml(), txtFontSize1.getText(), txtFontSize2.getText(), txtPageName.getText()))
            {
                lblMessage.setText("Page Succesfully Created");
            }
            else
            {
                lblMessage.setText("Error Creating Page");
            }
            
        }
        else //If a required field is not filled out
        {
            lblMessage.setText("Please fill out all required fields");
        }
    }//GEN-LAST:event_btnCreateHtmlImageActionPerformed

    private void btnChooseFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFilePathActionPerformed
        JFileChooser chooser = new JFileChooser();
        //Limits the file chooser to only finding jpegs
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg");
        chooser.setFileFilter(imageFilter);
        chooser.showOpenDialog(null);
        File imageFile = chooser.getSelectedFile();
        String imageFilePath = imageFile.getAbsolutePath();
        txtImagePath.setText(imageFilePath);
    }//GEN-LAST:event_btnChooseFilePathActionPerformed

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
            java.util.logging.Logger.getLogger(Template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFilePath;
    private javax.swing.JButton btnCreateHtmlImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImageWidth;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextArea txbBodyText1;
    private javax.swing.JTextArea txbBodyText2;
    private javax.swing.JTextField txtFontSize1;
    private javax.swing.JTextField txtFontSize2;
    private javax.swing.JTextField txtImageHeight;
    private javax.swing.JTextField txtImageName;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtImageWidth;
    private javax.swing.JTextField txtPageName;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

}
