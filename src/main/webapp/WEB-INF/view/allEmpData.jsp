<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form>
  <h2>all emp data</h2>
 ename: ${data.ename };<br>
 net salary: ${data.netSalary };<br>
  gross Salary:${data.grossSalary };<br>
  Deduction:${data.deduction };
  </form>
</body>
</html>