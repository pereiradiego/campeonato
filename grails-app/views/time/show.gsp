<%--
  Created by IntelliJ IDEA.
  User: diegoalves
  Date: 13/04/16
  Time: 09:22
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<g:set var="entityName" value="${message(code: 'time.label', default: 'Time')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>
<div class="nav" role="navigation">
	<ul>
		<li><a class="home" href="${createLink(uri: '/')}">Index</a></li>
		<li><g:link class="create" action="create">Criar Time</g:link></li>
		<li><g:link action="edit" id="${timeInstance.id}">Editar</g:link></li>
	</ul>
</div>
<ol class="property-list">
	<g:hiddenField name="id" value="${timeInstance.id}"></g:hiddenField>
	<li class="fieldcontain">
		<span class="property-label">Nome do Time</span>
		<span class="property-value" aria-labelledby="nomeTime-label"><g:fieldValue bean="${timeInstance}" field="nomeTime"/></span>
	</li>
	<li class="fieldcontain">
		<span class="property-label">Quantidade de Vitórias</span>
		<span class="property-value" aria-labelledby="quantVitoria-label"><g:fieldValue bean="${timeInstance}" field="quantVitoria"/></span>
	</li>
	<li class="fieldcontain">
		<span class="property-label">Quantidade de Empates</span>
		<span class="property-value" aria-labelledby="quantEmpate-label"><g:fieldValue bean="${timeInstance}" field="quantEmpate"/></span>
	</li>
	<li class="fieldcontain">
		<span class="property-label">Quantidade de Derrotas</span>
		<span class="property-value" aria-labelledby="quantDerrota-label"><g:fieldValue bean="${timeInstance}" field="quantDerrota"/></span>
	</li>
	<li class="fieldcontain">
		<span class="property-label">Quantidade de Gols Pro</span>
		<span class="property-value" aria-labelledby="quantGolPro-label"><g:fieldValue bean="${timeInstance}" field="quantGolPro"/></span>
	<li class="fieldcontain">
		<span class="property-label">Quantidade de Gol Contra</span>
		<span class="property-value" aria-labelledby="quantGolContra-label"><g:fieldValue bean="${timeInstance}" field="quantGolContra"/></span>
	</li>
	</li>
</ol>




</body>
</html>