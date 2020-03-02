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
    }
    
    //Generate closing tag
    public void generateOpeningTag(String tagIn)
    {
        parts = tag.split("/");
        openingTag =  parts[0] + parts[1];
    }
}
