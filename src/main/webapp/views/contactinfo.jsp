<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='pink' align='center'>
	<h3 style="color: #C62FD1; font-size: 40px;">save contact Here</h3>

	<font color='green'> ${success} </font>
	<font color='red'> ${fail} </font>


	<form:form action="SaveContact? contactId=${contactInfo.contactId}"
		modelAttribute="contactInfo" method="POST">


		<table align='center' border='3'>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName" /></td>
			</tr>

			<tr>
				<td>Contact Number</td>
				<td><form:input path="contactNumber" /></td>
			</tr>

			<tr>
				<td>Contact Email</td>
				<td><form:input path="contactEmail" /></td>
			</tr>

			<tr>
				<td><input style="color: darkgreen; align: center;"
					type="submit" value="Save" /></td>
			</tr>


		</table>
		<a href="viewContact" style="color: yellow; font-size: 20px;">
			View All Contact</a>
	</form:form>
</body>
</html>