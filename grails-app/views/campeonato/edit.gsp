<%--
  Created by IntelliJ IDEA.
  User: diegoalves
  Date: 13/04/16
  Time: 09:22
--%>
<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main">
	<title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>
<body>
<div>
	<g:form action="update" >
		<g:hiddenField name="id" value="${campeonatoInstance?.id}" />
		<g:hiddenField name="version" value="${campeonatoInstance?.version}" />
		<fieldset class="form">
			<g:render template="form"/>
		</fieldset>
		<fieldset class="buttons">
			<g:submitButton name="edit" class="save" value="${message(code: 'default.button.edit.label',default: 'Update')}"/>
			<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" />
		</fieldset>
	</g:form>
</div>
</body>
</html>