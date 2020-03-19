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
public class HTMLVideo {
    
    //Attributes
    private String URL;
    private int width;
    private int height;
    private String fullHtml;
    
    
    //GETTERS
    public String getVideoURL()
    {
        return URL;
    }
    
    public int getWidth()
    {
        return width;   
    }
    
    public int getHeight()
    {
        return height;   
    }
    
    public String getFullHtml()
    {
        return fullHtml;
    }
    
    
    //SETTERS
    public void setVideoURL(String URLIn)
    {
        URL = URLIn;
    }
    
    public void setWidth(int widthIn)
    {
        width = widthIn;
    }
    
    public void setHeight(int heightIn)
    {
        height = heightIn;
    }
    
    public void setFullHtml(String fullHtmlIn)
    {
        fullHtml = fullHtmlIn;
    }
    
    //Constructor
    public HTMLVideo()
    {
        URL = "";
        width = 0;
        height = 0;
    }
    
    //Overloaded constructor
    public HTMLVideo(String URLIn, int widthIn, int heightIn)
    {
        URL = URLIn;
        width = widthIn;
        height = heightIn;
        generateFullHtml();
    }
    
    public void generateFullHtml()
    {
        fullHtml = "<div align=\"center\">\n" +
                    "<iframe width=\"" + String.valueOf(width) + "\" height=\"" + String.valueOf(height) + "\"\n" +
                    "src=\"" + URL +"\">\n" +
                    "</iframe>\n" +
                    "</div>";
    }
}
