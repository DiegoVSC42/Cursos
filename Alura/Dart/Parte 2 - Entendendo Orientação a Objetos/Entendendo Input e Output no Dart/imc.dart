import 'dart:io';

void main(List<String> args) {
  double altura = 0;
  double peso = 0;
  print("Digite seu nome");
  String? nome = stdin.readLineSync();
  print("Digite sua altura");
  String? alturaLida = stdin.readLineSync();
  if (alturaLida != null) {
    altura = double.parse(alturaLida);
  }
  print("Digite seu peso");
  String? pesoLido = stdin.readLineSync();
  if (pesoLido != null) {
    peso = double.parse(pesoLido);
  }
  double imc = (peso / (altura * altura));
  print("roundToDouble = ${imc.roundToDouble()}");
  print("truncateToDouble = ${imc.truncateToDouble()}");
  print("toStringAsFixed = ${imc.toStringAsFixed(2)}");
  print("$nome, o seu imc é de: $imc");
}
