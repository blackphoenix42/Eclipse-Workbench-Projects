<jsp:useBean id="u" class="com.admin.User" scope="session">
</jsp:useBean>  
 <center><h2>Record:</h2></center>
<table align="center" border="1px">
<tr><td><h3>Name:  <jsp:getProperty property="name" name="u"/></h3></td> </tr> 
<tr><td><h3>Password:  <jsp:getProperty property="password" name="u"/></h3></td></tr>
<tr><td><h3>Email:  <jsp:getProperty property="email" name="u" /></h3></td></tr>  
<tr><td><h3>City:  <jsp:getProperty property="city" name="u"/></h3></td></tr>  
<tr><td><h3>Country:  <jsp:getProperty property="country" name="u"/></h3> </td></tr> 
</table>
 