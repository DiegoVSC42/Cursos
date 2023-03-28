void main() {
  String nome = "Laranja";
  double peso = 100.2;
  String cor = "Verde e Amarela";
  String sabor = "Doce e cítrica";
  int diasDesdeColheita = 40;
  bool isMadura = funcEstaMadura(diasDesdeColheita);
  /*
  print("Posicionais Obrigatórios");
  mostrarMadura1(nome, diasDesdeColheita);
  print("Nomeados Posicionais");
  mostrarMadura2(nome, diasDesdeColheita, cor: cor);
  print("Parametros com padrão");
  mostrarMadura3(nome, diasDesdeColheita);
  print(funcQuantosDiasMadura(diasDesdeColheita));*/

  Fruta melancia = Fruta("melancia", 1500, "Verde", "Doce", 40);
  melancia.estaMadura(43);
  Legumes mandioca1 = Legumes("Macaxeira", 1200, "Marrom", true);
  Fruta banana1 = Fruta("Banana", 75, "Amarela", "Doce", 12);
  Nozes macadamia1 = Nozes("Macadâmia", 2, "Branco Amarelado", "Doce", 20, 35);
  Citricas limao1 = Citricas("Limão", 100, "Verde", "Azedo", 5, 9);

  mandioca1.printAlimento();
  banana1.printAlimento();
  macadamia1.printAlimento();
  limao1.printAlimento();

  mandioca1.cozinhar();

  banana1.separarIngredientes();
}

funcQuantosDiasMadura(int dias) {
  int diasParaMadura = 30;
  int quantosDiasFaltam = diasParaMadura - dias;
  return quantosDiasFaltam;
}

//1 - Posicionais Obrigatórios
void mostrarMadura1(String nome, int dias) {
  if (dias >= 30) {
    print("A $nome está madura.");
  } else {
    print("A $nome não está madura.");
  }
}

//2 - Nomeados Opcionais
//OBS- os {} servem para dizer se os parametros que estao dentro dele sao opcionais
void mostrarMadura2(String nome, int dias, {String? cor}) {
  if (dias >= 30) {
    print("A $nome está madura.");
  } else {
    print("A $nome não está madura.");
  }

  if (cor != null) {
    print("A $nome é $cor");
  }
}

//3 - Parâmetros com "padrão" ou "default"
//OBS- nao precisa do ? em String pois nao tem como ser nula
void mostrarMadura3(String nome, int dias, {String cor = "sem cor"}) {
  if (dias >= 30) {
    print("A $nome está madura.");
  } else {
    print("A $nome não está madura.");
  }
  //Nao precisa do if pois nao tem como a cor ser nula
  if (cor != null) {
    print("A $nome é $cor");
  }
}

//4 - Modificador "required"
//OBS- pode passar em qualquer ordem mas precisa passar obrigatoriamente quem possui "required"
void mostrarMadura4(int dias, {String? nome, required String cor}) {
  if (dias >= 30) {
    print("A $nome está madura.");
  } else {
    print("A $nome não está madura.");
  }
  //Nao precisa do if pois nao tem como a cor ser nula
  if (cor != null) {
    print("A $nome é $cor");
  }
}

bool funcEstaMadura(int dias) {
  if (dias >= 30) {
    return true;
  } else {
    return false;
  }
}

class Alimento implements Bolo {
  String nome;
  double peso;
  String cor;
  Alimento(this.nome, this.peso, this.cor);
  void printAlimento() {
    print("Este(a) $nome pesa $peso gramas e é $cor.");
  }

  @override
  separarIngredientes() {
    // TODO: implement separarIngradientes
    throw UnimplementedError();
  }

  @override
  fazerMassa() {
    // TODO: implement fazerMassa
    throw UnimplementedError();
  }

  @override
  assar() {
    // TODO: implement assar
    throw UnimplementedError();
  }
}

class Legumes extends Alimento {
  bool? isPrecisaCozinhar;

  Legumes(String nome, double peso, String cor, this.isPrecisaCozinhar)
      : super(nome, peso, cor);

  void cozinhar() {
    isPrecisaCozinhar == true
        ? print("Pronto, o $nome está cozinhando!")
        : print("Nem precisa cozinhar");
  }
}

class Fruta extends Alimento implements Bolo {
  String sabor;
  int diasDesdeColheita;
  bool? isMadura;

  //Construtor
  Fruta(
      String nome, double peso, String cor, this.sabor, this.diasDesdeColheita,
      {this.isMadura})
      : super(nome, peso, cor);

  estaMadura(int diasParaMadura) {
    isMadura = diasDesdeColheita >= diasParaMadura;
    print(
        "A sua $nome foi colhida a $diasDesdeColheita dias, e precisa de $diasParaMadura dias para amadurecer. Ela está madura ? $isMadura.");
  }

  fazerSuco() {
    print("Você fez um ótimo suco de $nome");
  }

  @override
  separarIngredientes() {
    print("Catar a %nome");
  }

  @override
  fazerMassa() {
    print("Misturar a fruta com farinha,açucar,ovos");
  }

  @override
  assar() {
    print("Colocar no forno");
  }
}

class Citricas extends Fruta {
  double nivelAzedo;

  Citricas(String nome, double peso, String cor, String sabor,
      int diasDesdeColheita, this.nivelAzedo)
      : super(nome, peso, cor, sabor, diasDesdeColheita);

  existeRefri(bool existe) {
    existe == true
        ? print("Existe refrigerante de $nome")
        : print("Não existe refrigerante de $nome");
  }
}

class Nozes extends Fruta {
  double porcentagemOleoNatural;

  Nozes(String nome, double peso, String cor, String sabor,
      int diasDesdeColheita, this.porcentagemOleoNatural)
      : super(nome, peso, cor, sabor, diasDesdeColheita);

  @override
  fazerMassa() {
    print("Tirar a casca");
    super.fazerMassa();
  }
}

abstract class Bolo {
  separarIngredientes();

  fazerMassa();

  assar();
}
