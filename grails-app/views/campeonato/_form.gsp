
<div class="fieldcontain ${hasErrors(bean: campeonatoInstance, field: 'nomeCampeonato', 'error')} ">
	<label>Nome do campeonato</label>
	<g:textField name="nomeCampeonato" value="${campeonatoInstance?.nomeCampeonato}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: campeonatoInstance, field: 'quantRodadas', 'error')} required">
	<label>Quantidade de Rodadas</label>
	<g:field name="quantRodadas" type="number" value="${campeonatoInstance.quantRodadas}" required=""/>
</div>

