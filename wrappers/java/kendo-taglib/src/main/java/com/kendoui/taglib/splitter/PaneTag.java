
package com.kendoui.taglib.splitter;


import java.io.IOException;

import com.kendoui.taglib.BaseTag;
import com.kendoui.taglib.html.Div;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class PaneTag extends  BaseTag  /* interfaces *//* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        PanesTag parent = (PanesTag)findParentWithClass(PanesTag.class);

        parent.addPane(this);

//<< doEndTag

        String html = body();
        Div div = new Div();
        
        if (!html.isEmpty()) {                
            div.html(html);
        }
        
        try {
            div.write(pageContext.getOut());                
        } catch (IOException exception) {
            throw new JspException(exception);
        }
        
        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "splitter-pane";
    }

    public boolean getCollapsed() {
        return (boolean)getProperty("collapsed");
    }

    public void setCollapsed(boolean value) {
        setProperty("collapsed", value);
    }

    public boolean getCollapsible() {
        return (boolean)getProperty("collapsible");
    }

    public void setCollapsible(boolean value) {
        setProperty("collapsible", value);
    }

    public String getContentUrl() {
        return (String)getProperty("contentUrl");
    }

    public void setContentUrl(String value) {
        setProperty("contentUrl", value);
    }

    public String getMax() {
        return (String)getProperty("max");
    }

    public void setMax(String value) {
        setProperty("max", value);
    }

    public String getMin() {
        return (String)getProperty("min");
    }

    public void setMin(String value) {
        setProperty("min", value);
    }

    public boolean getResizable() {
        return (boolean)getProperty("resizable");
    }

    public void setResizable(boolean value) {
        setProperty("resizable", value);
    }

    public boolean getScrollable() {
        return (boolean)getProperty("scrollable");
    }

    public void setScrollable(boolean value) {
        setProperty("scrollable", value);
    }

    public String getSize() {
        return (String)getProperty("size");
    }

    public void setSize(String value) {
        setProperty("size", value);
    }

//<< Attributes

}
