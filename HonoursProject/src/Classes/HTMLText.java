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
public class HTMLText {
    
    //Attributes
    private String tag;
    private String text;
    private String openingTag;
    private String[] parts; //used for generating opening tag
    private String fullHtml;
    
    //Getters
    public String getTag()
    {
        return tag;
    }
    
    public String getText()
    {
        return text;
    }
    
    public String getOpeningTag()
    {
        return openingTag;
    }
    
    public String getFullHtml()
    {
        return fullHtml;
    }
    
    //Setters
    public void setTag(String tagIn)
    {
        tag = tagIn;
        generateOpeningTag(tag);
    }
    
    public void setText(String textIn)
    {
        text = textIn;
    }
    
    public void setFullHtml(String fullHtmlIn)
    {
        fullHtml = fullHtmlIn; 
    }
    
    
    //Constructor
    public HTMLText()
    {
        tag = "";
        text = "";
    }
    
    //Overloaded Constructor
    public HTMLText(String TagIn, String TextIn)
    {
        tag = TagIn;
        text = TextIn;
        generateOpeningTag(tag);
        generateFullHtml();
    }
    
    //Generate closing tag
    public void generateOpeningTag(String tagIn)
    {
        parts = tag.split("/");
        openingTag =  parts[0] + parts[1];
    }
    
    //Generate full html
    public void generateFullHtml()
    {
        fullHtml = openingTag + text + tag;
    }
}
