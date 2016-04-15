<%--
  Created by IntelliJ IDEA.
  User: diegoalves
  Date: 14/04/16
  Time: 11:05
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>

	<title>Classificacao</title>
	<meta name="layout" content="main"/>
</head>

<body>
<div id="list-campeonato" class="content scaffold-list" role="main">
	<h1><g:message code="default.list.label" args="[entityName]" /></h1>
	<table>
		<thead>
		<tr>

			<td>Nome do Time</td>

			<td>Vitórias</td>

			<td>Empates</td>

			<td>Derrotas</td>

		</tr>
		</thead>
		<tbody>
		<g:each in="${timeInstanceList}" status="i" var="timeInstance">
			<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

				<td><g:link controller="time" action="show" id="${timeInstance.id}">${fieldValue(bean: timeInstance, field: "nomeTime")}</g:link></td>

				<td>${fieldValue(bean: timeInstance, field: "quantVitoria")}</td>

				<td>${fieldValue(bean: timeInstance, field: "quantEmpate")}</td>

				<td>${fieldValue(bean: timeInstance, field: "quantDerrota")}</td>

				<td>${fieldValue(bean: timeInstance, field: "quantGolPro")}</td>

				<td>${fieldValue(bean: timeInstance, field: "quantGolContra")}</td>

			</tr>
		</g:each>
		</tbody>
	</table>

</div>

</body>
</html>