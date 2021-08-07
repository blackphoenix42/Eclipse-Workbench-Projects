<jsp:useBean id="c" class="MyBean.RegisterBean" scope="request" />

<jsp:setProperty name = "c" property = "name" value = "${param.name}"/>

<jsp:setProperty name = "c" property = "age" value = "${param.age}"/>

<jsp:setProperty name = "c" property = "address" value = "${param.address}"/>

<jsp:setProperty name = "c" property = "phone" value = "${param.phone}"/>

<html>
<body>
    <h1>EL and Complex JavaBeans</h1>
    <table border="1" width="800">
    <tr>
    <th>Name</th>
    <th>Age</th>
    <th>Address</th>   
    <th>Phone No</th>
    </tr>
      <tr>
        <td>${c.name}</td><% //<jsp:getProperty name="c"> %>
        <td>${c.age}</td>
        <td>${c.address}</td>
        <td>${c.phone}</td>
      </tr>    
	  </table>
  </body>
</html>