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
	<g:set var="entityName" value="${message(code: 'campeonato.label', default: 'Campeonato')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<a href="#list-campeonato" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
	<ul>
		<li><a class="home" href="${createLink(uri: '/')}">Index</a></li>
		<li><g:link class="create" action="create">Criar Campeonato</g:link></li>
	</ul>
</div>
<div id="list-campeonato" class="content scaffold-list" role="main">
	<h1><g:message code="default.list.label" args="[entityName]" /></h1>
	<table>
		<thead>
		<tr>

			<td>Nome do Campeonato</td>

			<td>Quant. Rodadas</td>

			<td>Editar</td>

		</tr>
		</thead>
		<tbody>
		<g:each in="${campeonatoInstanceList}" status="i" var="campeonatoInstance">
			<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

				<td><g:link action="show" id="${campeonatoInstance.id}">${fieldValue(bean: campeonatoInstance, field: "nomeCampeonato")}</g:link></td>

				<td>${fieldValue(bean: campeonatoInstance, field: "quantRodadas")}</td>

				<td><g:link action="edit" id="${campeonatoInstance.id}">Editar</g:link> </td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div class="pagination">
		<g:paginate total="${campeonatoInstanceTotal}" />
	</div>
</div>
</body>
</html>
