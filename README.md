Adaptado do curso Android Developer Fundamentals

[https://developer.android.com/courses/fundamentals-training/overview-v2](https://developer.android.com/courses/fundamentals-training/overview-v2)

# Intents Explicitas
Uma intenção é uma  descrição de uma  operação a ser realizada, um objeto  usado para solicitar  uma  ação de outro componente do aplicativo  através do sistema Android.

- Intent Explícita
	- Inicia uma Activity especifica
		- Main activity inicia a ComprasActivity
- Implicit Intent
	- Pede ao sistema para encontrar uma Activity que pode lidar com essa  solicitação
		- Compartilhar uma imagem
		- Clicar  em  Compartilhar  abre um seletor com uma lista de aplicativos  compativeis

## Etapas para implementar uma intent explicita

 Seguem detalhadas as etapas da implementação
 

### Para iniciar a Intent e enviar uma informação

 - Definir a origem da ação através da interface (clique do botão por exemplo)
 - Definir o método de ação através do código
 - Dentro do método, Instanciar  uma intent
	 -  `•Intent intent = new Intent(this, DisplayMessageActivity.class);`
	 - Onde  os  parâmetros, nessa  ordem  são:
		 - Um Context  como  seu  primeiro  parâmetro (this é usado  porque a classe Activity é uma subclasse de Contexto).
		 - A classe  class do componente do app para o qual o sistema  deve  entregar  a  intenção (neste  caso, a activity que deve ser iniciada).
 - Definir uma constante de texto que receberá o texto a ser enviado ( outros formatos também são aceitos)
	 - Por convenção, constantes  são  definidas com todas as letras  em Caixa alta
 - Para enviar um conteúdo para a activity de destino utilizar o método putExtra
	 - 	 `EditText  editText = (EditText) findViewById(R.id.edit_message);
	String message = editText.getText().toString();
	 intent.putExtra(EXTRA_MESSAGE, message); ` 
		 - findViewById(): permite  buscar um elemento  pelo  seu id na  classe R (Resources), que é gerada  pelo Android e contém o ID de cada  recurso da aplicação.
		 -  Uma Intent pode  levar  uma  coleção de vários  tipos de dados como pares de chave-valor chamados Extras. O método  putExtra () leva o nome da chave no primeiro  parâmetro e o valor a ser enviado no segundo  parâmetro.
 - Definidos os parâmetros, iniciar a Activity passando a Intent como parâmetro: `startActivity(intent);`
 
 ### Para Receber uma intent Na activity de destino
 No método onCreate:
	 
 - utilizar o getIntent() para receber uma intent
	 - `Intent  intent = getIntent();`
 - Receber a informação enviada e a armazena em uma String para ser utilizada na aplicação, utilizando o getStringExtra
	 - `String  message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);`
 - O valor recebido pode ser utilizado da forma mais conveniente pelo usuário, no exemplo é criado programaticamente um novo elemento TextView e adicionado ao layout

    
    
   

> Written with [StackEdit](https://stackedit.io/).
