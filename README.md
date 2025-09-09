# O que é?

Fiz esse repositório seguindo a aula do professor Nelio Alves disponível no youtube nesse link : 
<a href="https://www.youtube.com/watch?v=KDGDN2zeYJI">JpaRepository - Interface boladona do Spring Repost editado</a>

<img width="800" height="400" alt="Captura de tela 2025-09-08 181417" src="https://github.com/user-attachments/assets/3a427671-2032-47b1-b637-9ab84600984a" />
<img width="800" height="400" alt="Captura de tela 2025-09-08 181428" src="https://github.com/user-attachments/assets/59d90908-f5e4-4ee2-b811-8971990adab7" />

🛠 Tecnologias

- Java 17

- Spring Boot

- Maven

- Postman (para testar)

# Como testar?

## 🚀 Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- [Java 17 ou superior (JDK)](https://www.oracle.com/java/technologies/downloads/?er=221886#jdk21-windows)
- (obs: essas são versões para desenvolvedores, eu recomendo baixar o java 21 por ser LTS (Long Term Support)
  
- [Maven](https://maven.apache.org/download.cgi)
- passo a passo de instalação do maven: [dicas de programação](https://dicasdeprogramacao.com.br/como-instalar-o-maven-no-windows/)
  
- [Git](https://git-scm.com/)
- para clonar o repositório caso não queira baixar o arquivo zip

⚠️ Para verificar se estão instalados, rode no terminal:
```bash
java -version
mvn -version
git --version
```

📥 Para caso não tenha baixado o arquivo zip e descompactado: <br>
Crie uma pasta, abra o terminal nela e rode os seguintes comandos
```bash
git clone https://github.com/Leturnos/JpaRepository.git
cd JpaRepository
```

▶️ Rodar o projeto
No terminal, dentro da pasta do projeto (ou da pasta com o arquivo descompactado, onde estiver o arquivo):
```bash
mvn spring-boot:run
```

🌐 Testando a API
Usando o navegador ou um testador de API, como o Postman

Abra no navegador:

GET http://localhost:8080/algum-endpoint

troque algum-endpoint pelos endpoints disponíveis:
- /users
- /users/page
- /users/search-salary
- /users/search-name

🔎 Parâmetros de paginação

A API suporta paginação automática.
Basta adicionar coisas como ?page= e &size= na URL:

page → número da página (começa em 0)

size → quantidade de registros por página

Exemplo:

GET http://localhost:8080/usuarios?page=1&size=12

👉 Isso retorna a segunda página de resultados (porque começa em 0) com 12 registros.

Se quiser, dá para complementar com parâmetros de ordenação (sort), que o Spring também entende:

GET http://localhost:8080/users/page?page=0&size=5&sort=name,asc

sort=name,asc → ordena pelo campo name em ordem crescente

sort=salary,desc → ordena pelo campo salary em ordem decrescente

Você também pode definir variáveis.
Basta adicionar coisas como ?minSalary={valor} e &maxSalary={valor} na URL:

Exemplo:

GET http://localhost:8080/users/search-salary?minSalary=5000&maxSalary=10000

GET http://localhost:8080/users/search-name?name=carlos

# Para parar o servidor
Aperte junto, no terminal:
CTRL + C
