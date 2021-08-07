package org.com;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyDate extends  TagSupport
{
	@Override
	public int doStartTag() throws JspException
	{
		try
		{
			pageContext.getOut().write("<h3>Today's Date is ="+new Date()+"</h3>");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException
	{
		return EVAL_PAGE;
	}
}
