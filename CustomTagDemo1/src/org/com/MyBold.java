package org.com;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
public class MyBold extends TagSupport
{
	@Override
	public int doStartTag() throws JspException
	{
		try
		{
			pageContext.getOut().write("<b style='font-family: cursive;color: blue;'>");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
//		return EVAL_BODY_INCLUDE;
		return SKIP_BODY;

	}
	@Override
	public int doEndTag() throws JspException 
	{
		try
		{
			pageContext.getOut().write("</b>");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		//return SKIP_PAGE;
		return EVAL_PAGE;
	}
}

