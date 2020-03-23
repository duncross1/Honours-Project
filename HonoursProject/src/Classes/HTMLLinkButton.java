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
public class HTMLLinkButton {
    private String URL;
    private String text;
    private String HTML;
    private String CSS;
    
    //Getters
    public String getURL()
    {
        return URL;
    }
    
    public String getText()
    {
        return text;
    }
    
    public String getHTML()
    {
        return HTML;
    }
    
    public String getCSS()
    {
        return CSS;
    }
    
    
    //Setters
    public void setURL(String URLIn)
    {
        URL = URLIn;
    }
    
    public void setText(String textIn)
    {
        text = textIn;
    }
     
    public void setHTML(String HTMLIn)
    {
        HTML = HTMLIn;
    }
    
    public void setCSS(String CSSIn)
    {
        CSS = CSSIn;
    }
    

    //Constructors
    public HTMLLinkButton()
    {
        URL = "";
        text = "";
        HTML = "";
        CSS = "";
    }
    
    public HTMLLinkButton(String URLIn, String textIn)
    {
        URL = URLIn;
        text = textIn;
        
        GenerateHtml();
        GenerateCSS();
    }
    
    public void GenerateHtml()
    {
        HTML = "<button class=\"LinkButton\" onclick=\"window.location.href = \'" + URL + "\'; \">" + text + "</button>";
    }
    
    public void GenerateCSS()
    {
        CSS= ".LinkButton {\n" +
                "  background-color: #333; \n" +
                "  border: none;\n" +
                "  color: white;\n" +
                "  padding: 15px 32px;\n" +
                "  text-align: center;\n" +
                "  text-decoration: none;\n" +
                "  display: inline-block;\n" +
                "  font-size: 16px;\n" +
                "  margin: 4px 2px;\n" +
                "  cursor: pointer;\n" +
                "  width: 95%;\n" +
                "}";
    }
}
