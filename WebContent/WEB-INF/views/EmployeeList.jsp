<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<h1>Employee List</h1>
${message}<br/>


<h1>Employee Maintenance</h1>
<form:form method="post" action="add" commandName="employee">
  
    <table>
    <tr>
        <td>Name</td>
        
        <td><form:input path="name" /></td>
        <td>
        
    </tr>
    

  <tr>
        <td colspan="2">
            <input type="submit" value="Add Employee"/>
        </td>
    </tr>
</table> 
<form:errors path="*"/>
</form:form>

  	
  
<h3>Employees</h3>
<c:if  test="${!empty empList}">
<table class="data">
<tr>
    <th>Name</th>
    
   
</tr>
<c:forEach items="${empList}" var="emp">
    <tr>
        <td>${emp.name}</td>
        
       
        <td><a href="delete/${emp.name}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>

</body>
</html>