
<div class="fieldcontain ${hasErrors(bean: timeInstance, field: 'nomeTime', 'error')} ">
	<label>Nome do Time</label>
	<g:textField name="nomeTime" value="${timeInstance?.nomeTime}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: timeInstance, field: 'quantVitoria', 'error')} required">
	<label>Quantidade de Vitórias</label>
	<g:field name="quantVitoria" type="number" value="${timeInstance.quantVitoria}" required=""/>
</div>


<div class="fieldcontain ${hasErrors(bean: timeInstance, field: 'quantEmpate', 'error')} required">
	<label>Quantidade de Empates</label>
	<g:field name="quantEmpate" type="number" value="${timeInstance.quantEmpate}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: timeInstance, field: 'quantDerrota', 'error')} required">
	<label>Quantidade de Derrotas</label>
	<g:field name="quantDerrota" type="number" value="${timeInstance.quantDerrota}" required=""/>
</div>


<div class="fieldcontain ${hasErrors(bean: timeInstance, field: 'quantGolPro', 'error')} required">
	<label>Quantidade de Gols Pro</label>
	<g:field name="quantGolPro" type="number" value="${timeInstance.quantGolPro}" required=""/>
</div>


<div class="fieldcontain ${hasErrors(bean: timeInstance, field: 'quantGolPro', 'error')} required">
	<label>Quantidade de Gol Contra</label>
	<g:field name="quantGolContra" type="number" value="${timeInstance.quantGolContra}" required=""/>
</div>

<div class="fieldcontain">
	<label>Campeonato</label>
	<g:select id="campeonato" optionKey="id" value="${timeInstance?.campeonato?.id}" optionValue="nomeCampeonato"
	          name="campeonato.id" from="${campeonatoListInstance}" />
</div>