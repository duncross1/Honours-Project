/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;

import Classes.HTMLImage;
import Classes.HTMLText;
import Classes.PageCompiler;
import Classes.Site;
import Classes.Templates;
import java.io.File;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/** Template 1 Editor Form
 * @author Ross Duncan
 */
public class Template1Editor extends javax.swing.JFrame {
    
    //Attributes
    private Site thisSite;
    
    /** Creates new form Template1 */
    public Template1Editor(Site siteIn) {
        
        initComponents();
        //Assign passed in site
        thisSite = siteIn;
        
        //Clear message label
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

        jPanel1 = new javax.swing.JPanel();
        btnCreateHtmlPage = new javax.swing.JButton();
        btnChooseFilePath = new javax.swing.JButton();
        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBodyText1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBodyText2 = new javax.swing.JTextArea();
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
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        btnCreateHtmlPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddPageButtonLong.png"))); // NOI18N
        btnCreateHtmlPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHtmlPageActionPerformed(evt);
            }
        });

        btnChooseFilePath.setText("Select Image");
        btnChooseFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFilePathActionPerformed(evt);
            }
        });

        txtTitle.setText("Insert Title");
        txtTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtBodyText1.setColumns(20);
        txtBodyText1.setLineWrap(true);
        txtBodyText1.setRows(10);
        txtBodyText1.setText("Insert Body Text");
        txtBodyText1.setWrapStyleWord(true);
        txtBodyText1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(txtBodyText1);

        txtBodyText2.setColumns(20);
        txtBodyText2.setLineWrap(true);
        txtBodyText2.setRows(5);
        txtBodyText2.setText("Inser Body Text 2");
        txtBodyText2.setWrapStyleWord(true);
        txtBodyText2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(txtBodyText2);

        txtImagePath.setEditable(false);
        txtImagePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Select Font Size:");

        jLabel2.setText("Select Font Size:");

        lblMessage.setText("message");

        txtImageWidth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblImageWidth.setText("Image Width:");

        jLabel3.setText("Image Height:");

        txtImageHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Template 1");

        txtFontSize1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtFontSize2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtPageName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setText("Page Name:");

        jLabel6.setText("Image Name:");

        txtImageName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFontSize1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(66, 66, 66))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnChooseFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btnCreateHtmlPage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMessage)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFontSize2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFontSize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnChooseFilePath)
                        .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblImageWidth)
                        .addComponent(txtImageWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtImageHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtImageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFontSize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCreateHtmlPage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(lblMessage)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHtmlPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHtmlPageActionPerformed
        
        //If none of the required textboxes are empty
        if(!txtTitle.getText().isEmpty() && !txtBodyText1.getText().isEmpty() && !txtBodyText2.getText().isEmpty() 
        && !txtImagePath.getText().isEmpty() && !txtImageWidth.getText().isEmpty() && !txtImageHeight.getText().isEmpty()
        && !txtFontSize1.getText().isEmpty() && !txtFontSize2.getText().isEmpty() && !txtImageName.getText().isEmpty()
        && !txtPageName.getText().isEmpty())
        {
            try
            {
                //Check if number fields where given a number
                int numTest = Integer.parseInt(txtFontSize1.getText());
                numTest = Integer.parseInt(txtFontSize2.getText());
                numTest = Integer.parseInt(txtImageWidth.getText());
                numTest = Integer.parseInt(txtImageHeight.getText());
                
                //Assign user inputs to classes
                HTMLText newHeader = new HTMLText("</header1>", txtTitle.getText());
                HTMLText newPara = new HTMLText("</p1>", txtBodyText1.getText());
                HTMLImage newImage = new HTMLImage(txtImagePath.getText(), "the-image", txtImageWidth.getText(), txtImageHeight.getText(), txtImageName.getText());
                HTMLText newPara2 = new HTMLText("</p2>", txtBodyText2.getText());


                //Pass the user inputs on to the templates class where they will be used to
                //fill out the attributes nessacery for generating template 1
                Templates newPage = new Templates();
                newPage.fillTemplate1(newHeader, newPara, newPara2, newImage, txtFontSize1.getText(), txtFontSize2.getText(), txtPageName.getText());

                //Add the new page (Templates class) to the sites pages hashmap
                HashMap<String, Templates> newPages = new HashMap<>();
                if(!thisSite.getPages().isEmpty()) //if the pages hashmap is not empty
                {
                    newPages = thisSite.getPages();
                }
                newPages.put(txtPageName.getText(), newPage);
                thisSite.setPages(newPages);

                //If site is not a single page site
                if(thisSite.getIsSinglePageSite() == false)
                {
                    //Open new website form, passing in the thisSite
                    NewWebsite nw = new NewWebsite(thisSite);
                    this.dispose();
                    nw.setVisible(true);
                }
                else//If site is a single page site
                {
                    //Set site name to equal page name
                    thisSite.setSiteName(txtPageName.getText());
                    //Run the page compiler, passing in the current site
                    PageCompiler pc = new PageCompiler();
                    boolean pageCompiled = pc.CompilePages(thisSite);

                    if (pageCompiled == true) //If the site was succesfully created
                    {
                        lblMessage.setText("Site Created");
                    }
                    else //if something caused an error when created the site
                    {
                        lblMessage.setText("An Error Occured");
                    }
                }
                
            }
            catch(NumberFormatException ex) //If the number fields don't contain a number (or another unexpected error occurs)
            {
                //Set message label to display an error message
                lblMessage.setText("Font Sizes and Image Dimensions must be a number");
            }
            
        }
        else //If a required field is not filled out
        {
            //Set message label to display an error message
            lblMessage.setText("Please fill out all required fields");
        }
    }//GEN-LAST:event_btnCreateHtmlPageActionPerformed

    private void btnChooseFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFilePathActionPerformed
        //Opens a file chooser for choosing the image
        JFileChooser chooser = new JFileChooser();
        //Limits the file chooser to only finding jpegs
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg");
        chooser.setFileFilter(imageFilter);
        chooser.showOpenDialog(null);
        //Assigns chosen image to a file
        File imageFile = chooser.getSelectedFile();
        //Assign chosen image file path to a string and sends it to a textfield
        String imageFilePath = imageFile.getAbsolutePath();
        txtImagePath.setText(imageFilePath);
    }//GEN-LAST:event_btnChooseFilePathActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //If site is not a single page site
        if(thisSite.getIsSinglePageSite() == false)
        {
            //Open new website form, passing in the thisSite
            NewWebsite nw = new NewWebsite(thisSite);
            this.dispose();
            nw.setVisible(true);
        }
        else//If site is a single page site
        {
            //Open the template select form
            TemplateSelect ts = new TemplateSelect(thisSite);
            this.dispose();
            ts.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Template1Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template1Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template1Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template1Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Template1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChooseFilePath;
    private javax.swing.JButton btnCreateHtmlPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImageWidth;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextArea txtBodyText1;
    private javax.swing.JTextArea txtBodyText2;
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
