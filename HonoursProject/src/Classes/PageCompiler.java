package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ross
 */
public class PageCompiler {
    
    //Attributes
   // private String headerTextHtml;
  //  private String imageHtml1;
   // private String bodyTextHtml1;
   // private String bodyTextHtml2;
   // private String fontSize1;
    //private String fontSize2;
    //private String FooterHtml;
    private String html;
    

    
    
    public boolean CompileTemplate1(String headerTextHtmlIn, HTMLImage imageIn, String bodyTextHtml1In, String bodyTextHtml2In, String fontSize1In, String fontSize2In, String pageNameIn)
    {
 
        try
        {   
        JFileChooser chooser = new JFileChooser();
        //Limits the file chooser to only finding jpegs
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        File saveFolder = chooser.getSelectedFile();
        String saveFolderPath = saveFolder.getAbsolutePath();
        
        //File d = new File(saveFolderPath + "\\Webpage");
       // d.mkdir();
        File d = new File(saveFolderPath + "\\Images");
        d.mkdir();
        
        File image = new File(imageIn.getImageURL());
        File destination = new File(saveFolderPath + "\\Images\\" + imageIn.getName() + ".jpg");
        Files.deleteIfExists(destination.toPath());
        Files.copy(image.toPath(), destination.toPath());
        imageIn = new HTMLImage(destination.getAbsolutePath(), "the-image", imageIn.getWidth(), imageIn.getHeight(), imageIn.getName());
            
        html = "<!DOCTYPE html>\n" +
                "\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "p1 {\n" +
                    "font-family: verdana;\n" +
                    "font-size: " + fontSize1In + "px;\n" +
                "}\n" +
                "\n" +
                "p2 {\n" +
                    "font-family: verdana;\n" +
                    "font-size: " +  fontSize2In + "px;\n" +
                "}\n" +
                "\n" +
                "header1 {\n" +
                    "font-weight: bold;\n" +
                    "font-size: 72px;\n" +
                "}\n " +
                "\n" +
                ".headerContainer {\n" +
                    "text-align: center;\n" +
                    "padding-top: 15px;\n" +
                    "padding-bottom: 15px;\n" +
                "}\n" +
                "\n" +
                ".centeredTextContainer {\n" +
                    "text-align: center;\n" +
                "}\n" +
                "\n" +
                "img{\n" +
                    "display: block;\n" +
                    "margin-left: auto;\n" +
                    "margin-right: auto;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"headerContainer\">" +
                headerTextHtmlIn + "\n" +
                "</div>" +
                "\n" +
                "<br>\n" +
                "<div class=\"centeredTextContainer\">" +
                bodyTextHtml1In + "\n" +
                "</div>" +
                "<br>\n" +
                "\n" +
                imageIn.getFullHtml() + "\n" +
                "<br>\n" +
                "<div class=\"centeredTextContainer\">" +
                bodyTextHtml2In + "\n" +
                "</div>" +
                "\n" +
                "</body>\n" +
                "</html>";
        
        
        String pageName = pageNameIn;
        
        File f = new File(saveFolderPath + "\\" + pageName + ".html");
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();

            //Send success message
            return true;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    
    
    //Constructor
    public PageCompiler()
    {
      //  headerTextHtml = "";
      //  imageHtml1 = "";
       // bodyTextHtml1 = "";
      //  bodyTextHtml2 = "";
       // fontSize1 = "";
        //fontSize2 = "";
        //FooterHtml = "";
        html = "";
    }
    
    /*Template1 Constructor
    public PageCompiler(String headerTextHtmlIn, String imageHtmlIn, String bodyTextHtml1In, String bodyTextHtml2In, String fontSize1In, String fontSize2In)
    {
        headerTextHtml = headerTextHtmlIn;
        imageHtml1 = imageHtmlIn;
        bodyTextHtml1 = bodyTextHtml1In;
        bodyTextHtml2 = bodyTextHtml2In;
        fontSize1 = fontSize1In;
        fontSize2 = fontSize2In;
    }*/
    
}
