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
    private int width;
    private int height;
    
    //GETTERS
    public String getImageURL()
    {
        return URL;
    }
    
    public String getAlt()
    {
        return alt;   
    }
    
    public int getWidth()
    {
        return width;   
    }
    
    public int getHeight()
    {
        return height;   
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
    
    public void setWidth(int widthIn)
    {
        width = widthIn;
    }
    
    public void setHeight(int heightIn)
    {
        height = heightIn;
    }
    
    //Constructor
    public HTMLImage()
    {
        URL = "";
        alt = "";
        width = 0;
        height = 0;
    }
    
    //Overloaded Constructor
    public HTMLImage(String URLIn, String altIn, int widthIn, int heightIn)
    {
        URL = URLIn;
        alt = altIn;
        width = widthIn;
        height = heightIn;
    }
}


