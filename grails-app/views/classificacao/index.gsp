<%--
  Created by IntelliJ IDEA.
  User: diegoalves
  Date: 13/04/16
  Time: 14:46
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Campeonato</title>
	<meta name="layout" content="main"/>
</head>

<body>
<div class="nav" role="navigation">
	<ul>
		<li><span>Selecione um campeonato e uma opção</span></li>
	</ul>
</div>

<g:form>
<div class="content fieldcontain">
	<label>Campeonato</label>
	<g:select id="campeonato" class="combo-box-popup" optionKey="id" value="${campeonatoInstance?.id}" optionValue="nomeCampeonato"
	          name="campeonatoId" from="${campeonatoListInstance}" />
</div>
<div class="nav">
	<label>
		<g:actionSubmit action="classificacao" value="Classificação"/>
	</label>
	<label>
		<g:actionSubmit action="campeao" value="Campeão"/>
	</label>
	<label>
		<g:actionSubmit action="lanterna" value="Lanterna"/>
	</label>
</div>
</g:form>




</body>
</html>