/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashMap;

/**
 *
 * @author Ross
 */
public class Site {
    private String siteName; //name of site (will probably be used to name folder create upon site creation)
    private HashMap<String, String> pages;//A hashmap of strings that will contain the full html/ccs/javascript for each page created, with a key pairing of the pages name

    //getters
    public HashMap<String, String> getPages()
    {
        return pages;
    }
    
    public String getSiteName()
    {
        return siteName;
    }
    
    //setters
    public void setPages(HashMap<String, String> pagesIn)
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
    public Site(HashMap<String, String> pagesIn, String siteNameIn)
    {
        pages = new HashMap<>();
        siteName = siteNameIn; 
    }
}
