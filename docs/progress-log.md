# Resumo dos Aprendizados

## DIA 1

- Defini as stacks a serem utilizadas no projeto.

## DIA 2

### Instalação do Setup

Já possuía o Java 21 instalado, então precisei apenas instalar o Node.js para auxiliar no desenvolvimento do front-end com React. Também instalei o Docker, porém enfrentei algumas dificuldades, pois a virtualização estava desativada na BIOS. Além disso, instalei o PostgreSQL, mas precisarei reinstalá-lo amanhã, pois está apresentando erro de autenticação entre o nome de usuário e a senha.

### Criação do Sistema Base

Acessei o site [https://start.spring.io/ ](https://start.spring.io/ ) para gerar o sistema base da aplicação. Foram definidas três dependências: **Spring Web**, **JPA** e **Driver do PostgreSQL**.

## Pontos a Melhorar

- **Documentar o progresso em detalhes**: Tive diversas dificuldades durante o processo e não registrei todas, pois estava focado em resolver os problemas. Para próximos passos, é importante anotar cada etapa e solução encontrada para facilitar revisões futuras e compartilhamento do conhecimento.

## DIA 3
### Reinstalação PostgreSQL

- **Erro encontrado:**
    - Falha na autenticação ao logar usuário e senha.
  
- **Solução encontrada:**
    - Desinstalação do postegreSQL
    - Download do postgreSQL
    - Instalação instalação padrão não concluida
  
### Criação do projecto-java "Novamente"

- **Erro encontrado:**
    - Após abrir a pasta do ficheiro base com o Intelij, e fazer o teste do localhost:8080, apresentava um erro diferente do not found, 404.
- **Solução encontrada**
    - Recriei o projecto base criando-o no Spring Initialzr,start.spring.io
    - Gerou uma pasta zipada onde depois de estraida e inserida no directório plataforma-full-stack-portfolio, abri no Intelij
    - Foi gerado um conjunto de ficheiro, sendo que as caracteristicas ou elementos do projecto podem ser consultadas no arquivo *pom.xml*
    - uma vez que o projecto em java foi inserido no repositorio, tive a necessidade de actualiza-la no github, usando os seguintes comandos no terminal:
        - git status : para verificar se há elementos novos a serem adicionados ao repositório.
        - git add . : para adicionar a actualização ao repositorio.
        - git commit -m "adicionar projecto-java Intelij e actualizar o progress-log" : para detalhar a actualização
        - git push origin main : para enviar para o repositório remoto.

- **Aprendizado**
    - Usando a versão paga do Intelij, a criação do projecto base pode ser feita directamente na IDE ou no Initiaz, mas para as versões frees, como o community apenas no site.
    - Já tendo o Docker desktop instalado no meu computador, não preciso instalar o PostgreSQL.


