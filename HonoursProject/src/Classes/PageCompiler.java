package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;

/** Page Compiler
 * @author Ross Duncan
 */
public class PageCompiler {
    
    //Attributes
    private String html;
    
    //Calls functions for creating the site
    public void CompilePages(Site siteIn)
    {
        Site creatingSite = siteIn;
        //Creates folders which returns a file path which is assigned as the save folder
        String saveFolderPath = CreateFolders(creatingSite);
        
        //Call function to create site navigation bar
        NavigationBar nb = CreateNavigationBar(creatingSite);
        
        //Loop through the site pages calling the create page function for each
        for(Map.Entry<String, Templates> pagesEntry : creatingSite.getPages().entrySet())
        {
            Templates page = pagesEntry.getValue();
            CreatePage(page, saveFolderPath, nb);
        }
    }
    
    //Creates the navigation bar for the site
    public NavigationBar CreateNavigationBar(Site siteIn)
    {
        NavigationBar nb = new NavigationBar();
        
        //Creates hashmap to contain html for links to each page on the site
        HashMap<String, String> links = new HashMap<>();
        //Populates the links hashmap with the page name as the Key and the html for the link as the Value
        for(Map.Entry<String, Templates> pagesEntry : siteIn.getPages().entrySet())
        {
            String pageName = pagesEntry.getKey();
            links.put(pageName, "<li><a href=\"" + pageName + ".html\">" + pageName + "</a></li>");
        }
        
        //Passes the links hashmap into the navigation bar class and calls the function in the class to generate the navaigation bar
        nb.setLinks(links);
        nb.GenerateHtml();
        nb.GenerateCss();
        
        //Return the now completed navigation bar
        return nb;
                    
    }
    
    //Creates each page of the site
    public void CreatePage(Templates pageIn, String saveFolderPathIn, NavigationBar nbIn)
    {
        Templates pageBeingCreated = pageIn;
        
        //Depending on what template the passed in page uses calls the required functions
        //For example a template with 2 images needs to run the copy Image function twice.
        switch(pageBeingCreated.getTemplate())
        {
            case 1:
                pageBeingCreated.setImage1(copyImage(pageBeingCreated.getImage1(), saveFolderPathIn));
                pageBeingCreated.CompileTemplate1HTML();
            break;
            case 2:
                pageBeingCreated.CompileTemplate2HTML();
            break;
            case 3:
                pageBeingCreated.setImage1(copyImage(pageBeingCreated.getImage1(), saveFolderPathIn));
                pageBeingCreated.setImage2(copyImage(pageBeingCreated.getImage2(), saveFolderPathIn));
                pageBeingCreated.CompileTemplate3HTML();
            break;
            case 4:
                pageBeingCreated.CompileTemplate4HTML();
            break;
            case 5:
                pageBeingCreated.setImage1(copyImage(pageBeingCreated.getImage1(), saveFolderPathIn));
                pageBeingCreated.setImage2(copyImage(pageBeingCreated.getImage2(), saveFolderPathIn));
                pageBeingCreated.CompileTemplate5HTML();
            break;
            default:
            // code block     
        }
        
        //Add the NavigationBar to the page before it is exported
        pageBeingCreated.setHTML(pageBeingCreated.getHTML().replace("£NavBarHTML£", nbIn.getHTML()));
        pageBeingCreated.setHTML(pageBeingCreated.getHTML().replace("£NavBarCSS£", nbIn.getCSS()));
        
        try
        {
            File newPage = new File(saveFolderPathIn + "\\" + pageIn.getPageName() + ".html");
                BufferedWriter bw = new BufferedWriter(new FileWriter(newPage));
                bw.write(pageIn.getHTML());
                bw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    //Creates folders to contain the site
    public String CreateFolders(Site siteIn)
    {
        try
        {   
            //Allows users to choose parent folder that will contain the site folder
            JFileChooser chooser = new JFileChooser();
            //Limits the file chooser to only finding directories
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.showOpenDialog(null);
            File saveFolder = chooser.getSelectedFile();
            //Sets saveFolderPath to the file path of the chosen folder
            String saveFolderPath = saveFolder.getAbsolutePath();

            //Creates folder using site name
            File newFolder = new File(saveFolderPath + "\\" + siteIn.getSiteName());
            newFolder.mkdir();
            //Creates folder for images inside of site folder
            newFolder = new File(saveFolderPath + "\\" + siteIn.getSiteName() + "\\Images");
            newFolder.mkdir();
            
            //Assigns the save folder path to the newly created website folder
            saveFolderPath = saveFolderPath + "\\" + siteIn.getSiteName();
            
            //returns the save folder path
            return saveFolderPath;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }  
    }
    
    //Copies images needed for the site to site folder
    public HTMLImage copyImage(HTMLImage imageIn, String saveFolderPathIn)
    {
        try
        {
            //Copies passed in image to a folder inside of the website folder called 'images'
            File image = new File(imageIn.getImageURL());
            File destination = new File(saveFolderPathIn + "\\Images\\" + imageIn.getName() + ".jpg");
            Files.deleteIfExists(destination.toPath());
            Files.copy(image.toPath(), destination.toPath());
            //Updates the images file path to the new file path
            imageIn = new HTMLImage(destination.getAbsolutePath(), imageIn.getName(), imageIn.getWidth(), imageIn.getHeight(), imageIn.getName());
        
            return imageIn;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    //Constructor
    public PageCompiler()
    {
        html = "";
    }
    
}
