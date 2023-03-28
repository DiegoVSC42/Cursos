import 'dart:io';

void main(List<String> args) {
  print("Digite sua idade");
  String? input = stdin.readLineSync();
  print('Idade: $input');
  if (input != null) {
    int idade = int.parse(input);
    print("Sua idade ano que vem será ${idade + 1}");
  }
}
