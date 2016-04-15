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
	<g:set var="entityName" value="${message(code: 'campeonato.label', default: 'Campeonato')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>
<div class="nav" role="navigation">
	<ul>
		<li><a class="home" href="${createLink(uri: '/')}">Index</a></li>
		<li><g:link class="create" action="create">Criar Campeonato</g:link></li>
		<li><g:link action="edit" id="${campeonatoInstance.id}">Editar</g:link></li>
	</ul>
</div>
<ol class="property-list">
	<g:hiddenField name="id" value="${campeonatoInstance.id}"></g:hiddenField>
	<li class="fieldcontain">
		<span class="property-label">Nome do campeonato</span>
		<span class="property-value" aria-labelledby="nomeCampeonato-label"><g:fieldValue bean="${campeonatoInstance}" field="nomeCampeonato"/></span>
	</li>
	<li class="fieldcontain">
		<span class="property-label">Quantidade de Rodadas</span>
		<span class="property-value" aria-labelledby="quantRodadas-label"><g:fieldValue bean="${campeonatoInstance}" field="quantRodadas"/></span>
	</li>
</ol>




</body>
</html>