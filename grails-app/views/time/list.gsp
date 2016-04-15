<%--
  Created by IntelliJ IDEA.
  User: diegoalves
  Date: 13/04/16
  Time: 09:29
--%>

<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main">
	<g:set var="entityName" value="${message(code: 'time.label', default: 'Time')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<a href="#list-time" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
	<ul>
		<li><a class="home" href="${createLink(uri: '/')}">Index</a></li>
		<li><g:link class="create" action="create">Criar Time</g:link></li>
	</ul>
</div>
<div id="list-time" class="content scaffold-list" role="main">
	<h1><g:message code="default.list.label" args="[entityName]" /></h1>
	<table>
		<thead>
		<tr>

			<td>Nome do Time</td>

			<td>Campeonato</td>

			<td>Editar</td>

		</tr>
		</thead>
		<tbody>
		<g:each in="${timeListInstance}" status="i" var="timeInstance">
			<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

				<td><g:link action="show" id="${timeInstance.id}">${fieldValue(bean: timeInstance, field: "nomeTime")}</g:link></td>

				<td>${fieldValue(bean: timeInstance, field: "campeonato.nomeCampeonato")}</td>

				<td><g:link action="edit" id="${timeInstance.id}">Editar</g:link> </td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div class="pagination">
		<g:paginate total="${timeInstanceTotal}" />
	</div>
</div>
</body>
</html>
