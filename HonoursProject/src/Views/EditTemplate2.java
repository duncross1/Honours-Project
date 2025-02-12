/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.HTMLText;
import Classes.HTMLVideo;
import Classes.PageCompiler;
import Classes.Site;
import Classes.Templates;
import java.util.HashMap;
import java.util.Map;

/** Template 2 Editor Form
 * @author Ross Duncan
 */
public class EditTemplate2 extends javax.swing.JFrame {

    //Attributes
    private Site thisSite;
    private Templates thisPage;
    
    public EditTemplate2(Site siteIn, Templates pageIn) {
        initComponents();
        
        //Assign passed in site & page
        thisSite = siteIn;
        thisPage = pageIn;
        
        //Fill boxes
        txtTitle.setText(thisPage.getHeader().getText());
        txtVideoLink.setText(thisPage.getVideo1().getVideoURL());
        txtVideoWidth.setText(String.valueOf(thisPage.getVideo1().getWidth()));
        txtVideoHeight.setText(String.valueOf(thisPage.getVideo1().getHeight()));
        txtPageName.setText(thisPage.getPageName());
        
        //Clear message label
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVideoLink = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVideoWidth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVideoHeight = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        btnAddPage = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        lblPageName = new javax.swing.JLabel();
        txtPageName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Template 2");

        txtTitle.setText("Insert Title");
        txtTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setText("youtube Video Link:");

        txtVideoLink.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setText("Video Width:");

        txtVideoWidth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setText("Video Height:");

        txtVideoHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblMessage.setText("Message");

        btnAddPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddPageButtonLong.png"))); // NOI18N
        btnAddPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPageActionPerformed(evt);
            }
        });

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        lblPageName.setText("Page Name:");

        txtPageName.setEditable(false);
        txtPageName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Warning: Some Youtube videos do not support being embedded (this is decided by the video uploader)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPageName)
                                .addGap(9, 9, 9)
                                .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMessage)
                                    .addComponent(btnAddPage, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVideoWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVideoHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVideoLink, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(jLabel1)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBack)
                .addGap(46, 46, 46)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVideoLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVideoWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtVideoHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPageName))
                .addGap(9, 9, 9)
                .addComponent(btnAddPage, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        //Open new website form, passing in the thisSite
        NewWebsite nw = new NewWebsite(thisSite);
        this.dispose();
        nw.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void btnAddPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPageActionPerformed
        //If none of the required textboxes are empty
        if(!txtTitle.getText().isEmpty() && !txtVideoLink.getText().isEmpty() && !txtVideoWidth.getText().isEmpty() && 
           !txtVideoHeight.getText().isEmpty() && !txtPageName.getText().isEmpty())
        {
            try
            {
                //Check if number fields where given a number
                int numTest = Integer.parseInt(txtVideoWidth.getText());
                numTest = Integer.parseInt(txtVideoHeight.getText());
                String videoURL = txtVideoLink.getText();
                //If video link is not a youtube link
                if(videoURL.contains("youtube.com/"))
                    {
                    //If link is not an embed link convert it to one
                    if(!videoURL.contains("/embed/"))
                    {
                        videoURL = videoURL.replace("watch?v=", "embed/");
                    }

                    //Assign user inputs to classes
                    HTMLText newHeader = new HTMLText("</header1>", txtTitle.getText());
                    HTMLVideo newVideo = new HTMLVideo(videoURL, Integer.parseInt(txtVideoWidth.getText()), Integer.parseInt(txtVideoHeight.getText()));

                    //Pass the user inputs on to the templates class where they will be used to
                    //fill out the attributes nessacery for generating template 2
                    Templates newPage = new Templates();
                    newPage.fillTemplate2(newHeader, newVideo, txtPageName.getText());

                    //Loop through hashmap of pages on this site and find the one being edited and update it
                    for(Map.Entry<String, Templates> pagesEntry : thisSite.getPages().entrySet())
                    {
                        HashMap<String, Templates> newPages = new HashMap<>();
                        if (pagesEntry.getKey().equals(thisPage.getPageName()))
                        {
                           newPages = thisSite.getPages();
                           newPages.put(pagesEntry.getKey(), newPage);

                           thisSite.setPages(newPages);
                        }
                    }

                    //Open new website form, passing in the thisSite
                    NewWebsite nw = new NewWebsite(thisSite);
                    this.dispose();
                    nw.setVisible(true);
                
                }
                else //If video link is not a youtube link
                {
                    //Set message label to display an error message
                    lblMessage.setText("Please enter a youtube link");
                }
            }
            catch(NumberFormatException ex) //If the number fields don't contain a number (or another unexpected error occurs)
            {
                //Set message label to display an error message
                lblMessage.setText("Video Dimensions must be a number");
            }
        }
        else //If a required field is not filled out
        {
            //Set message label to display an error message
            lblMessage.setText("Please fill out all required fields");
        }
    }//GEN-LAST:event_btnAddPageActionPerformed

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
            java.util.logging.Logger.getLogger(EditTemplate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTemplate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTemplate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTemplate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Template2Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton btnAddPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPageName;
    private javax.swing.JTextField txtPageName;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtVideoHeight;
    private javax.swing.JTextField txtVideoLink;
    private javax.swing.JTextField txtVideoWidth;
    // End of variables declaration//GEN-END:variables
}
