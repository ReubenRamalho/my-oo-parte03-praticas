# oo-parte03-praticas
Práticas de sala de aula valendo alguns pontinhos de ajuda para a segunda prova.

# Orientações para Realização da Prática
# Leia com ATENÇÃO

- A atividade pode ser feita em DUPLA, porém os nomes precisam estar identificados no cabeçalho da classe corretamente.

- Para cada prática deve ser criado um pacote correspondente. Dentro deste pacote deve-se criar pelo menos mais dois pacotes – um que conterá a classe principal que implementa o método main, e outro pacote que conterá as classes que representam os conceitos envolvidos com o problema da questão. 
 
- Todos as práticas necessitam de um programa principal (classe com método main) para testar as classes implementadas para o problema sendo resolvido.

- Apliquem os conceitos de abstração e encapsulamento usando corretamente o nível de acesso das classes e em seus respectivos membros.

- Busquem oportunidades para reduzir  a complexidade de código e possibilidades de reuso usando herança e/ou composição.

- Defina nomes de classes e membros de forma significativa e que possibilitem legibilidade de código.

- Não use apenas o construtor default, desenvolvam novos construtores para as classes criadas.

# Prática 01. Agenda Simples.
Suponha que vocês foram contratados para modelar e implementar uma solução para o seguinte problema:
Uma escola estava com dificuldade de manter os contatos de pais, responsáveis e alunos para realizar um pequena gincana com os alunos do nono ano. Eles precisavam de um sistema simples que ajudasse a armazenar o contato dessas pessoas com informações de nome, contato de e-mail, contato de telefone, data de nascimento e idade. Além dessas informações, para o aluno, era preciso armazenar também seu número de matrícula que é composto por 5 dígitos, por exemplo, 18101 ou 22201, a restrição para esse número de matrícula é ter apenas dígitos númericos. A turma do nono ano é pequena, e possui apenas 05 alunos. O sistema precisa cadastrar a pessoa e imprimir a lista a lista de informações de todas as pessoas cadastradas, mas também possibilitar a opção de imprimir apenas a lista de responsáveis ou apenas a lista de informações dos alunos.
- a)	Identifique quais classes serão necessárias para modelar a solução do problema. Para cada classe indique seus membros (atributos e métodos). Indique também o relacionamento entre elas.
- b)	Implemente a solução. 
- c)	Considerando a solução desenvolvida em (b) adicione um método que possibilita ao usuário também imprimir as informações específicas de um contato armazenado no sistema usando seu índice ou seu nome. Por exemplo, imprimir contato de índice 4 ou de nome “Maria da Silva”.
- d)	Caso fosse necessário também adicionar os contatos dos 5 professores da turma no nono ano, como a modelagem do problema estabelecida no item (a) seria impactada. Considere que o professor tem também uma matrícula com formada por 5 dígitos númericos, e está associada a uma disciplina específica.

# Prática 02. Controle Remoto.
Suponha agora que vocês estão sendo convocados para implementar um sistema doméstico de automação. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:
•	aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
•	aumentar e diminuir o número do canal em uma unidade
•	trocar para um canal indicado;
•	consultar o valor do volume de som e o canal selecionado.
- a)	Identifique quais classes serão necessárias para modelar a solução do problema. Para cada classe indique seus membros (atributos e métodos). Indique também o relacionamento entre elas.
- b)	Implemente a solução. 
- c)	Foi solicitado agora um ControleRemoto para o ar-condicionado e um som, como a modelagem do problema definida no item (a) poderia ser remodelada para conter também essas novas especificações.