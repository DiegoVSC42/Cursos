void main(List<String> arguments) {
  const int idade = 22;
  double altura = 1.75;
  bool geek = true;
  const String nome = 'Diego Vieira';
  String apelido = "Duck";
  List<dynamic> diego = [idade, altura, geek, nome, apelido];
  //List<String> listanomes = ['Ricarth', 'Natália', 'Alex', 'Ândriu', 'André'];
  //TODO: Fazer outras personas da equipe de mobile
  bool maiorDeIdade;
  String frase;
  int energia = 100;
  int contadorRep = 0;
  if (idade >= 18) {
    maiorDeIdade = true;
  } else {
    maiorDeIdade = false;
  }
  frase = "Eu sou ${diego[3]}, \n"
      "meu apelido é ${diego[4]}, \n"
      "eu tenho ${diego[1]} de altura\n"
      "e tenho ${diego[0]} anos de idade\n"
      "Eu sou maior de idade? $maiorDeIdade\n";

  for (int i = 0; i < 5; i += 2) {
    print('Concluí ${i + 1} voltas');
  }

  while (energia > 0) {
    print('Mais uma repetição');
    energia = energia - 6;
    contadorRep++;
  }
  print(contadorRep);
  // print(frase);
}
