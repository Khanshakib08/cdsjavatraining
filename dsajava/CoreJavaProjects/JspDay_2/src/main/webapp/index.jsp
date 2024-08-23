<html>
<body>
<h2>Hello World!</h2>
<%--Print the statement--%>
<%
out.print("This is JSP Page");
%>
<%--Print the statement without print statement--%>
<br>
<%="This is JSP Page"%>
<%
String name="Shakib Khan";
out.print("<br>"+"My name is: "+name);
%>
<%--Arithematic operation in JSP--%>
<%
int a=8;
int b=6;
out.print("<br>"+"SUM is : "+(a+b));
%>
<%--To get the data from the HTML page--%>
<%--
String aValue=request.getParameter("aID");
String bValue=request.getParameter("bID");
out.print("<br>"+"SUM is : "+(Integer.parseInt(aValue)+Integer.parseInt(bValue)));
--%>
<%--
int age=Integer.parseInt(request.getParameter("ageID"));
String gender=request.getParameter("genderID");
if((age>18 && gender.equalsIgnoreCase("Male")) || (age>16 && gender.equalsIgnoreCase("Female")))
{
out.print("Eligible");
}

else{
out.print("Not Eligible");
}
--%>
<%--
int age=Integer.parseInt(request.getParameter("ageID"));
String gender=request.getParameter("genderID");
String name=request.getParameter("nameID");
String result=((age>18 && gender.equalsIgnoreCase("Male")) || (age>16 && gender.equalsIgnoreCase("Female")))?"eligible" : "not eligible";
out.print(result);
--%>
<%--
public String printMyName(String x, int y, String z){
return ("My name is "+x+"\nMy age is "+y+"My gender is "+z);
}
%>
<%
int age=Integer.parseInt(request.getParameter("ageID"));
String gender=request.getParameter("genderID");
String name=request.getParameter("nameID");
String output=printMyName(name,age,gender);
out.print("Output of the method is "+output);
--%>

<%
String username=request.getParameter("nameID");
String password=request.getParameter("passID");
if(username.equals("bbd") && password.equals("123"))
{
response.sendRedirect("user.jsp");
}
else{
response.sendRedirect("pagenotfound.html");
}
%>
</body>
</html>
