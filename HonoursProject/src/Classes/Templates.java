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
public class Templates {
    private int template;
    
    private HTMLText header;
    private HTMLText bodyText1;
    private HTMLText bodyText2;
    private HTMLImage image;
    
    private String fontSize1;
    private String fontSize2;
    private String pageName;
    
    private String html;
    
    
    
    //Getters
    public int getTemplate()
    {
        return template;
    }
    
    public HTMLText getHeader()
    {
        return header;
    }
    
    public HTMLText getBodyText1()
    {
        return bodyText1;
    }
    
    public HTMLText getBodyText2()
    {
        return bodyText2;
    }
    
    public HTMLImage getImage()
    {
        return image;
    }
    
    public String getFontSize1()
    {
        return fontSize1;
    }
    
    public String getFontSize2()
    {
        return fontSize2;
    }
    
    public String getPageName()
    {
        return pageName;
    }
    
    public String getHTML()
    {
        return html;
    }
    
    //Setters
    public void setTemplate(int templateIn)
    {
        template = templateIn;
    }
    
    public void setHeader(HTMLText headerIn)
    {
        header = headerIn;
    }
    
    public void setBodyText1(HTMLText bodyText1In)
    {
        bodyText1 = bodyText1In; 
    }
    
    public void setBodyText2(HTMLText bodyText2In)
    {
        bodyText2 = bodyText2In;
    }
    
    public void setImage(HTMLImage imageIn)
    {
        image = imageIn;
    }
    
    public void setFontSize1(String fontSize1In)
    {
        fontSize1 = fontSize1In;
    }
    
    public void setFontSize2(String fontSize2In)
    {
        fontSize2 = fontSize2In;
    }
    
    public void setPageName(String pageNameIn)
    {
        pageName = pageNameIn;
    }
    
    public void setHTML(String htmlIn)
    {
        html = htmlIn;
    }
    
    //Constructor
    public Templates()
    {
        template = 0;
        header = new HTMLText();
        bodyText1 = new HTMLText();
        bodyText2 = new HTMLText();
        image = new HTMLImage();
        fontSize1 = "";
        fontSize2 = "";
        pageName = "";
    }
    
    //Overloaded Constructor
    public void fillTemplate1(HTMLText headerIn, HTMLText bodyText1In, HTMLText bodyText2In, HTMLImage imageIn, String fontSize1In, String fontSize2In, String pageNameIn)
    {
        //TEMPLATE 1 Constructor
        template = 1;
        header = headerIn;
        bodyText1 = bodyText1In;
        bodyText2 = bodyText2In;
        image = imageIn;
        fontSize1 = fontSize1In;
        fontSize2 = fontSize2In;
        pageName = pageNameIn;
        html = CompileTemplate1HTML();
    }
    
    
    public String CompileTemplate1HTML()
    {
        html = "<!DOCTYPE html>\n" +
                "\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "p1 {\n" +
                    "font-family: verdana;\n" +
                    "font-size: " + fontSize1 + "px;\n" +
                "}\n" +
                "\n" +
                "p2 {\n" +
                    "font-family: verdana;\n" +
                    "font-size: " +  fontSize2 + "px;\n" +
                "}\n" +
                "\n" +
                "header1 {\n" +
                    "font-weight: bold;\n" +
                    "font-size: 72px;\n" +
                "}\n " +
                "\n" +
                ".headerContainer {\n" +
                    "text-align: center;\n" +
                    "padding-top: 15px;\n" +
                    "padding-bottom: 15px;\n" +
                "}\n" +
                "\n" +
                ".centeredTextContainer {\n" +
                    "text-align: center;\n" +
                "}\n" +
                "\n" +
                "img{\n" +
                    "display: block;\n" +
                    "margin-left: auto;\n" +
                    "margin-right: auto;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"headerContainer\">" +
                header.getFullHtml() + "\n" +
                "</div>" +
                "\n" +
                "<br>\n" +
                "<div class=\"centeredTextContainer\">" +
                bodyText1.getFullHtml() + "\n" +
                "</div>" +
                "<br>\n" +
                "\n" +
                image.getFullHtml() + "\n" +
                "<br>\n" +
                "<div class=\"centeredTextContainer\">" +
                bodyText2.getFullHtml() + "\n" +
                "</div>" +
                "\n" +
                "</body>\n" +
                "</html>";
        
        return html;
    }
    
}
