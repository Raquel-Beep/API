🏠 TAREFA DE CASA (individual)

📅  Entrega: início da próxima aula | Trabalho individual | Envie prints do Postman e do H2 Console comprovando cada etapa.


T1
@JsonCreator no enum TipoCliente
💻 Individual
🏠 Casa



☐
Criar a classe EnumValidationException estendendo Exception com construtor que recebe String.
☐
Adicionar @JsonCreator no enum TipoCliente para validar entradas inválidas.


☐
A mensagem da exceção deve listar os valores aceitos.
☐
Testar no Postman: tipo válido → 201 | tipo inválido → 400 | campo ausente → 400.
☐
Entregar prints dos 3 cenários.


T2
Segunda subclasse
💻 Individual
🏠 Casa



☐
Criar uma segunda subclasse da entidade Cliente (exemplo: ClienteVip com atributo consultorResponsavel).


☐
Criar CRUD completo para a nova entidade.
☐
Comparar @MappedSuperclass com SINGLE_TABLE.
☐
Preencher a tabela abaixo com os resultados:


Estratégia
Tabelas criadas
Coluna DTYPE existe?
Campos nulos possíveis?
Sua avaliação
@MappedSuperclass








SINGLE_TABLE


T3 🌟
BÔNUS — Estratégia JOINED e análise de queries SQL
💡 Bônus
🏠 Casa


Explore a estratégia mais normalizada e analise as queries geradas.

☐
Alterar a hierarquia para @Inheritance(strategy=InheritanceType.JOINED) 
☐
Habilitar spring.jpa.show-sql=true no application.properties.
☐
Subir a aplicação e verificar no H2 Console: quantas tabelas foram criadas? Quais são?
☐
Fazer um GET por id de um  ClientePremium e copiar o SQL e observar o sql
☐
Responder: em qual cenário real você escolheria JOINED em vez de @MappedSuperclass ou SINGLE_TABLE?
