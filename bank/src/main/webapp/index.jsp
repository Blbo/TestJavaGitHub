<%@ page import="com.iut.as.modele.Client" %>
<html>
<body>
<h2>Hello World - ICI BANK OF IUT !</h2>
<%
    Client test = new Client("numijijl", "chanpaul", "Metz");
    System.out.println(test.getAdresse());
    out.println(test.getAdresse());
%>

</body>
</html>
