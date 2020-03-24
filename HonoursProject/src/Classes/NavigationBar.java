/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashMap;
import java.util.Map;

/** Navigation Bar Class
 * @author Ross Duncan
 */
public class NavigationBar {
    
    //Attributes
    private HashMap<String, String> links;
    private String HTML;
    private String CSS;
    
    
    
    //GETTERS
    public HashMap<String, String> getLinks()
    {
        return links;
    }
    
    public String getHTML()
    {
        return HTML;
    }
    
    public String getCSS()
    {
        return CSS;
    }
    
    //SETTERS
    public void setLinks(HashMap<String, String> linksIn)
    {
        links = linksIn;
    }
    
    public void setHTML(String HTMLIn)
    {
        HTML = HTMLIn;
    }
    
    public void setCSS(String CSSIn)
    {
        CSS = CSSIn;
    }
    
    //Constructor
    public NavigationBar()
    {
        links = new HashMap<>();
        HTML = "";
        CSS = "";
    }
    
    //Overloaded Constructor
    public NavigationBar(HashMap<String, String> linksIn)
    {
        links = linksIn;
        GenerateHtml();
        GenerateCss();
    }
    
    //METHODS
    //Generate the full html string for the navigation bar
    public void GenerateHtml()
    {
        HTML = "<ul> \n";
        
        for(Map.Entry<String, String> linksEntry : links.entrySet())
        {
            HTML = HTML + linksEntry.getValue() + "\n";
        }
        
        HTML = HTML + "</ul> \n";
    }
    
    //Generate the full CSS string for the navigation bar
    public void GenerateCss()
    {
        CSS = "ul {\n" +
                "  list-style-type: none;\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "  overflow: hidden;\n" +
                "  background-color: #333;\n" +
                "}\n" +
                "\n" +
                "li {\n" +
                "  float: left;\n" +
                "  /* Add a gray right border to all list items, except the last item (last-child) */\n" +
                "  border-right: 1px solid #bbb;\n" +
                "}\n" +
                "\n" +
                "li a {\n" +
                "  display: block;\n" +
                "  color: white;\n" +
                "  text-align: center;\n" +
                "  padding: 14px 16px;\n" +
                "  text-decoration: none;\n" +
                "}\n" +
                "\n" +
                "/* Change the link color to #111 (black) on hover */\n" +
                "li a:hover {\n" +
                "  background-color: #111;\n" +
                "} \n";
    }
}
