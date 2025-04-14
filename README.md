# Projeto BIBLIOTECA com API
---
## Introdução
Esse é um projeto de alocação e devolução de livros de uma biblioteca. Eu ainda não tenho um diagrama de classe bem definido, com todos os métodos que minha classe precisa. Conforme eu for desenvolvendo o projeto vou atualizando essa página.  
Eu pretendo utilizar uma API de livros, da Open Library, a fim de ser minha base de livros. Para ler essa API eu utilizarei as bibliotecas de Gson, da google, e Spring Boot como framework.  
Além disso, utilizarei o gerenciador de projetos Maven e a IDE da JetBrains IntelliJ IDEA.
Esse é meu primeiro projeto de portifólio e espero conseguir entregar tudo que planejo com ele. Ainda não tenho uma data de conclusão, mas dá para dizer que comecei a desenvolve-lo no dia 11/4/2025

## Passo a passo no desenvolvimento
1. O primeiro passo da aplicação seria ter começado a desenvolver os diagramas. Porém eu tinha achado um projeto em Java chamado [Library-Management-System](https://github.com/harismuneer/Library-Management-System-JAVA/tree/master), que é de código aberto, para me inspirar e fazer um código parecido com algumas modificações.  
   Entretanto, percebi que o diagrama era incompleto e o código que a pessoa desenvolvera era consideravelmente diferente. Portanto decidi utilizar algumas coisas de base, como nomes das classes e a relação base delas, e por fim desenvolver minhas próprias operações básicas (métodos) que cada uma deveria ter.
2. Segundo passo foi começar a desenvolver o projeto de fato. Eu estou aprendendo ainda a utilizar Spring Boot e principalmente como fazer a conexão do meu código com a API na web via requisição HTTP. Então comecei com o que eu já domino (o básico) que foi a construção das classes.
   Nesse meio tempo eu fui tentando estudar algumas coisas de Gson para fazer as requisições, e até agora nada feito, pois tive alguns problemas com a API. O problema é que, toda vez que eu faço uma busca de algum livro, ele me retorna centenas de valores de todas as edições que o livro já teve, todos os outros autores. Eu até pensei em utilizar a API da Google Boook, mas aparentemente tem o mesmo resultado. Então verei como irei fazer.


## Atualizações
_14/4_ 10:01: Vou ver como vou fazer pra conseguir puxar o primeiro valor que a API retorna. Tanto o Books API da google e o Open Libray estão retornando vários valores, mesmo se tento nichar o máximo a pesquisa com Nome do livro e autoria. Mesmo assim retorna valores de outros autores e de várias edições e derivados dos livros.  
Ex: O Hobbit - J. R. R. Tolkien. (Todas as informações referente)  
   O Hobbit anotado - Douglas A. Anderson (Todas as informações referentes)  
Esse pequeno problema que me complica, pois se tento pegar o valor referente à chave "Autor", a API me retorna centenas de valores e mesmo que eu tente pegar o primeiro destes, pode ser que ele esteja errado e seja de outro autor.
_14/4 11:11 11🕦: Vou focar em fazer as relações entre as classes antes de começar com as APIs

