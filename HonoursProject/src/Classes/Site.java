/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashMap;

/** Site Class
 * @author Ross Duncan
 */
public class Site {
    
    //Attributes
    private String siteName; //name of site (will probably be used to name folder create upon site creation)
    private HashMap<String, Templates> pages;//A hashmap of strings that will contain the full html/ccs/javascript for each page created, with a key pairing of the pages name

    //getters
    public HashMap<String, Templates> getPages()
    {
        return pages;
    }
    
    public String getSiteName()
    {
        return siteName;
    }
    
    //setters
    public void setPages(HashMap<String, Templates> pagesIn)
    {
        pages = pagesIn;
    }
    
    //constructor
    public Site()
    {
        pages = new HashMap<>();
        siteName = "";
    }
    
    //overloaded constructor
    public Site(HashMap<String, Templates> pagesIn, String siteNameIn)
    {
        pages = new HashMap<>();
        siteName = siteNameIn; 
    }
}
