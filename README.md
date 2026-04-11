**1ª Classe Criada -RECEPTOR SIMPLES-**

**Classe:**
Criei uma classe chamada ReceptorController.

**Anotação dentro da Classe:**
Neste exercício explorei uma nova anotação que é o @PostMapping, que é o que vai que é responsável por indicar 
que um método será executado quando o sistema receber uma requisição HTTP do tipo POST. Esse tipo de requisição
é geralmente utilizado para enviar dados ao servidor, como no cadastro de um usuário. Com isso, consegui entender 
melhor como o sistema recebe informações externas e processa essas entradas por meio de um endpoint.

**Anotação Acima da Classe:**
Continuei usando @RestController  para ser um agente do HTTP para trocar dados entre os sistemas e manipular requisições http. 

**Parâmetros:**
Usei o @RequestBody pela primeira vez no meu parâmetro (receber), é uma anotação que serve para pegar os dados enviados no corpo (body) da requisição 
HTTP e transformar em um objeto Java dentro do método. Para que isso aconteça, estou usando Postman, para que eu tenha
o ambiente do servidor e o ambiente do cliente.

**2ª Classe Criada -Sensor Controller-:**

Essa classe tem como objetivo identificar temperaturas acima de 30º graus. Ela retorna diferentes mensagens sendo para temperaturas
acima do limite e abaixo deste marco.

