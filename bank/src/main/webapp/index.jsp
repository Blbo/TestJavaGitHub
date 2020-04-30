<%@ page import="com.iut.as.modele.Client" %>
<%@ page import="com.iut.as.modele.Banque" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <title>BANK OF IUT</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
</head>
<body>
<h2>BANK OF IUT</h2>

<form method="get">
<label for="client">Client:</label><br>
<select id="client" name="numclient">
    <%
        //Client test = new Client("numijijl", "chanpaul", "Metz");
        //System.out.println(test.getAdresse());
        //out.println(test.getNomClient());
        Banque banque = new Banque();
        ArrayList<Client> listeClient=banque.getListeClient();
        for (int i = 0; i < listeClient.size(); i++) {
    %>
    <option value="<%= listeClient.get(i).getNumClient() %>"><%= listeClient.get(i).getNumClient() %> - <%= listeClient.get(i).getNomClient() %></option>
    <%
        }
    %>
</select>
<input type="submit">
</form>
<br>
<% String[] numcompte = request.getParameterValues("numclient");
if (numcompte != null ){
%>
Le numéro de compte est <%= numcompte[0] %>
<%
}
%>
<!-- À afficher une fois le client sélectionné-->
<!--<form>

    <label for="client">Compte:</label><br>
    <select id="client" name="client">
        <option value="1919">N°1919 / +4000€</option>
    </select>
    <br>
    <label for="credit">Montant:</label><br>
    <input type="number" name="montant" id="montant"><br>
    <input type="submit" name="credit" Value="Créditer">
    <input type="submit" name="debit" Value="Débiter">
</form>-->
</body>
</html>
