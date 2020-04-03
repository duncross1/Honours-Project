/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/** Templates Class
 * @author Ross Duncan
 */
public class Templates {
    
    //Attributes
    private int template;
    
    private HTMLText header;
    private HTMLText bodyText1;
    private HTMLText bodyText2;
    private HTMLImage image1;
    private HTMLImage image2;
    
    private HTMLVideo video1;
    
    private HTMLLinkButton lb1;
    private HTMLLinkButton lb2;
    
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
    
    public HTMLImage getImage1()
    {
        return image1;
    }
    
    public HTMLImage getImage2()
    {
        return image2;
    }
    
    public HTMLVideo getVideo1()
    {
        return video1;
    }
    
    public HTMLLinkButton getLb1()
    {
        return lb1;
    }
    
    public HTMLLinkButton getLb2()
    {
        return lb2;
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
    
    public void setImage1(HTMLImage image1In)
    {
        image1 = image1In;
    }
    
    public void setImage2(HTMLImage image2In)
    {
        image2 = image2In;
    }
    
    public void setVideo1(HTMLVideo video1In)
    {
        video1 = video1In;
    }
    
    public void setLb1(HTMLLinkButton lb1In)
    {
        lb1 = lb1In;
    }
    
    public void setLb2(HTMLLinkButton lb2In)
    {
        lb1 = lb2In;
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
        image1 = new HTMLImage();
        image2 = new HTMLImage();
        video1 = new HTMLVideo();
        lb1 = new HTMLLinkButton();
        fontSize1 = "";
        fontSize2 = "";
        pageName = "";
    }
    
    public void fillTemplate1(HTMLText headerIn, HTMLText bodyText1In, HTMLText bodyText2In, HTMLImage image1In, String fontSize1In, String fontSize2In, String pageNameIn)
    {
        //TEMPLATE 1 - fills attributes needed for template 1
        template = 1;
        header = headerIn;
        bodyText1 = bodyText1In;
        bodyText2 = bodyText2In;
        image1 = image1In;
        fontSize1 = fontSize1In;
        fontSize2 = fontSize2In;
        pageName = pageNameIn;
    }
    
    public void fillTemplate2(HTMLText headerIn, HTMLVideo videoIn, String pageNameIn)
    {
        //TEMPLATE 2 - fills attributes needed for template 2
        template = 2;
        header = headerIn;
        video1 = videoIn;
        pageName = pageNameIn;
    }
    
    public void fillTemplate3(HTMLText headerIn, HTMLText bodyText1In, HTMLText bodyText2In, HTMLImage image1In, HTMLImage image2In, String fontSize1In, String fontSize2In, String pageNameIn)
    {
        //TEMPLATE 3 - fills attributes needed for template 3
        template = 3;
        header = headerIn;
        bodyText1 = bodyText1In;
        bodyText2 = bodyText2In;
        image1 = image1In;
        image2 = image2In;
        fontSize1 = fontSize1In;
        fontSize2 = fontSize2In;
        pageName = pageNameIn;
    }
    
    public void fillTemplate4(HTMLText headerIn, HTMLText bodyText1In, String fontSize1In, HTMLLinkButton lb1In, String pageNameIn)
    {
        //TEMPLATE 4 - fills attributes needed for template 4
        template = 4;
        header = headerIn;
        bodyText1 = bodyText1In;
        fontSize1 = fontSize1In;
        lb1 = lb1In;
        pageName = pageNameIn;
    }
    
    public void fillTemplate5(HTMLText headerIn, HTMLImage image1In, HTMLText bodyText1In, String fontSize1In, HTMLLinkButton lb1In,
            HTMLImage image2In, HTMLText bodyText2In, String fontSize2In, HTMLLinkButton lb2In, String pageNameIn)
    {
        //TEMPLATE 5 - fills attributes needed for template 5
        template = 5;
        header = headerIn;
        image1 = image1In;
        bodyText1 = bodyText1In;
        fontSize1 = fontSize1In;
        lb1 = lb1In;
        image2 = image2In;
        bodyText2 = bodyText2In;
        fontSize2 = fontSize2In;
        lb2 = lb2In;
        pageName = pageNameIn;
    }
    
    //HTML generators
    //Generates the HTML String for template 1
    public String CompileTemplate1HTML()
    {
        html = "<!DOCTYPE html>\n" +
                "\n" +
                "<html>\n" +
                "<head>\n" +
                
                "<title>" + pageName + "</title> \n" +
                
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
                
                "£NavBarCSS£ \n" + 
                
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                
                "£NavBarHTML£ \n" +
                
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
                image1.getFullHtml() + "\n" +
                "<br>\n" +
                "<div class=\"centeredTextContainer\">" +
                bodyText2.getFullHtml() + "\n" +
                "</div>" +
                "\n" +
                "</body>\n" +
                "</html>";
        
        return html;
    }
    
    //Generates the HTML String for template 2
    public String CompileTemplate2HTML()
    {
        html = "<!DOCTYPE html>\n" +
        "\n" +
        "<html>\n" +
        "<head>\n" +
                
        "<title>" + pageName + "</title> \n" +
                
        "<style>\n" +
        "header1 {\n" +
        "font-weight: bold;\n" +
        "font-size: 72px;\n" +
        "}\n" +
        " \n" +
        ".headerContainer {\n" +
        "text-align: center;\n" +
        "padding-top: 15px;\n" +
        "padding-bottom: 15px;\n" +
        "}\n" +
                
        "£NavBarCSS£ \n" + 
                
        "</style>\n" +
        "</head>\n" +
        "\n" +
        "<body>\n" +
                
        "£NavBarHTML£ \n" +
                
        "<div class=\"headerContainer\">\n" +
        "<header1>" + header.getText() + "</header1>\n" +
        "</div>\n" +
        video1.getFullHtml() +
        "</body>\n" +
        "</html>";
                
                
        return html;
    }
    
    //Generates the HTML String for template 3
    public String CompileTemplate3HTML()
    {
        html = "<!DOCTYPE html>\n" +
                "\n" +
                "<head>\n" +
                
                "<title>" + pageName + "</title> \n" +
                
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
                "img.SideImg{\n" +
                "  margin-left: 30px;\n" +
                "  margin-right: 30px;\n" +
                "  \n" +
                "}\n" +
                "\n" +
                "header1 {\n" +
                "font-weight: bold;\n" +
                "font-size: 72px;\n" +
                "}\n" +
                " \n" +
                ".headerContainer {\n" +
                "text-align: center;\n" +
                "padding-top: 15px;\n" +
                "padding-bottom: 15px;\n" +
                "}\n" +
                "\n" +
                
                "£NavBarCSS£ \n" + 
                
                "</style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                
                "£NavBarHTML£ \n" +
                
                "\n" +
                "<div class=\"headerContainer\">\n" +
                "<header1>" + header.getText() + "</header1>\n" +
                "</div>\n" +
                "\n" +
                "<div>\n" +
                "<img class=\"SideImg\" src=\"" + image1.getImageURL() + "\"alt=\"Trulli\" width=\"500\" height=\"333\" align=\"right\">\n" +
                bodyText1.getFullHtml() + "\n" +
                "</div>\n" +
                "<br>\n" +
                "<div>\n" +
                "<img class=\"SideImg\" src=\"" + image2.getImageURL() + "\"alt=\"Trulli\" + width=\"500\" height=\"333\" align=\"left\">\n" +
                bodyText2.getFullHtml() + "\n" +
                "</div>\n" +
                "<br>\n" +
                "<br>\n" +
                "</body>";
        
        return html;
    }
    
    //Generates the HTML String for template 4
    public String CompileTemplate4HTML()
    {
        html = "<!DOCTYPE html>\n" +
                "\n" +
                "<head>\n" +
                
                "<title>" + pageName + "</title> \n" +
                
                "<style>\n" +
                "p1 {\n" +
                    "font-family: verdana;\n" +
                    "font-size: " + fontSize1 + "px;\n" +
                "}\n" +
                "\n" +
                "header1 {\n" +
                "font-weight: bold;\n" +
                "font-size: 72px;\n" +
                "}\n" +
                " \n" +
                ".headerContainer {\n" +
                "text-align: center;\n" +
                "padding-top: 15px;\n" +
                "padding-bottom: 15px;\n" +
                "}\n" +
                "\n" +
                lb1.getCSS() + "\n" +
                "\n" +
                
                "£NavBarCSS£ \n" + 
                
                "</style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                
                "£NavBarHTML£ \n" +
                
                "\n" +
                "<div class=\"headerContainer\">\n" +
                header.getFullHtml() + "\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"headerContainer\"> \n" +
                bodyText1.getFullHtml() + "\n" +
                "</div>\n" +
                "<br>\n" +
                "<div class=\"headerContainer\">\n" +
                lb1.getHTML() + "\n" +
                "</div>\n" +
                "<br>\n" +
                "<br>\n" +
                "</body>";
        
        return html;
    }
    
    //Generates the HTML String for template 5
    public String CompileTemplate5HTML()
    {
        html = "<!DOCTYPE html>\n" +
                "\n" +
                "<head>\n" +
                
                "<title>" + pageName + "</title> \n" +
                
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
                "}\n" +
                " \n" +
                ".headerContainer {\n" +
                "text-align: center;\n" +
                "padding-top: 15px;\n" +
                "padding-bottom: 15px;\n" +
                "}\n" +
                "\n" +
                "* {\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                ".column {\n" +
                "  float: left;\n" +
                "  width: 50%;\n" +
                "  padding: 5px;\n" +
                "}\n" +
                "\n" +
                ".row::after {\n" +
                "  content: \"\";\n" +
                "  clear: both;\n" +
                "  display: table;\n" +
                "}\n" +
                "\n" +
                lb1.getCSS() + "\n" +
                "\n" +
                
                "£NavBarCSS£ \n" + 
                
                "</style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                
                "£NavBarHTML£ \n" +
                
                "\n" +
                "<div class=\"headerContainer\">\n" +
                header.getFullHtml() + "\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"row\">\n" +
                "  <div class=\"column\">\n" +
                "    " + image1.getFullHtml() + "\n" +
                "	<div class=\"headerContainer\">\n" +
                "	" + bodyText1.getFullHtml() + "\n" +    
                "        " + lb1.getHTML() + "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"column\">\n" +
                "    " + image2.getFullHtml() + "\n" +
                "	<div class=\"headerContainer\">\n" +
                "	" + bodyText2.getFullHtml() + "\n" +
                "        " + lb2.getHTML() + "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  \n" +
                "<br>\n" +
                "<br>\n" +
                "</body>";
        
        return html;
    }
    
}
