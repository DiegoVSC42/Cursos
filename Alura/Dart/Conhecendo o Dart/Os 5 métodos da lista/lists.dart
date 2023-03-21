void main(List<String> args) {
  //1: Sublist
  List<String> list = ["Diego", "Vieira", "Santos"];
  List<String> sublist = list.sublist(1, 2);
  print(list);
  print(sublist);
  print("\n");

  //2:forEach
  list.forEach((element) {
    print(element);
  });
  print("Acabou!");
  print("\n");

  //3:contains
  String procurandoF = "Silva";
  list.contains(procurandoF) ? print("Sim") : print("Não");
  String procurandoT = "Vieira";
  list.contains(procurandoT) ? print("Sim") : print("Não");
  print("\n");

  //4:reduce
  String myName = list.reduce((value, element) {
    return value + " " + element;
  });
  print(list);
  print(myName);
  print("\n");

  //5:where
  Iterable maior = list.where((element) => element.length > 5);
  print(maior);
  print(maior.toList());
  String primeiroMaior =
      list.firstWhere((element) => element.length > 5).toString();
  print(primeiroMaior);
  print("\n");
}
