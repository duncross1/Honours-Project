/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ross
 */
public class HTMLImage {
    
    //Attributes
    private String URL;
    private String alt;
    private String width;
    private String height;
    private String name;
    private String fullHtml;
    
    //GETTERS
    public String getImageURL()
    {
        return URL;
    }
    
    public String getAlt()
    {
        return alt;   
    }
    
    public String getWidth()
    {
        return width;   
    }
    
    public String getHeight()
    {
        return height;   
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getFullHtml()
    {
        return fullHtml;
    }
    
    //SETTERS
    public void setImageURL(String URLIn)
    {
        URL = URLIn;
    }
    
    public void setAlt(String altIn)
    {
        alt = altIn;
    }
    
    public void setWidth(String widthIn)
    {
        width = widthIn;
    }
    
    public void setHeight(String heightIn)
    {
        height = heightIn;
    }
    
    public void setName(String nameIn)
    {
        name = nameIn;
    }
    
    public void setFullHtml(String fullHtmlIn)
    {
        fullHtml = fullHtmlIn;
    }
    
    //Constructor
    public HTMLImage()
    {
        URL = "";
        alt = "";
        width = "";
        height = "";
        name = "";
    }
    
    //Overloaded Constructor
    public HTMLImage(String URLIn, String altIn, String widthIn, String heightIn, String nameIn)
    {
        URL = URLIn;
        alt = altIn;
        width = widthIn;
        height = heightIn;
        name = nameIn;
        generateFullHtml();
    }
    
    public void generateFullHtml()
    {
        fullHtml = "<img src=\"" + URL + "\"alt=\"" + alt + "\" width=\"" + width + "\" height=\"" + height + "\">";
    }
    
}


