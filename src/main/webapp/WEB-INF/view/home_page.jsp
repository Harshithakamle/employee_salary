<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h3>Home Page</h3>
        <form action="singleDetails" method="post">
        <pre>
        
        ID: <input type="text" name="id"/>
        Ename:  <input type="text" name="ename"/>
        NetSalary: <input type="text" name="netSalary"/>
        Deduction: <input type="text" name="deduction"/>
        Gross Salary:<input type="text" name="grossSalary"/>
        <input type="submit" value="save"/>
        </pre>    
        </form>
</body>
</html>