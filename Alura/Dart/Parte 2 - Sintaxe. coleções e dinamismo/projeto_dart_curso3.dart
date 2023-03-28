void main() {
  //escolherMeioTransporteEnumSwitch(Transporte.trem);
  Set<String> registrosVisitados = <String>{};
  registrosVisitados = registrarDestindos("São paulo", registrosVisitados);
  registrosVisitados = registrarDestindos("Recife", registrosVisitados);
  registrosVisitados = registrarDestindos("Rio de Janeiro", registrosVisitados);
  registrosVisitados = registrarDestindos("São paulo", registrosVisitados);
  /*print(registrosVisitados);
  print(registrosVisitados.first);
  print(registrosVisitados.last);
  print(registrosVisitados.isEmpty);*/
  Map<String, double> registrarPrecos = {};

  registrarPrecos["São Paulo"] = 1200;
  registrarPrecos["Rio de Janeiro"] = 1500;
  registrarPrecos.remove("São Paulo");
  print(registrarPrecos);
}

registrarDestindos(String destino, Set<String> banco) {
  banco.add(destino);
  return banco;
}

void escolherMeioTransporte(int locomocao) {
  if (locomocao == 0) {
    print("Vou de CARRO para aventura!");
  } else {
    if (locomocao == 1) {
      print("Vou de BIKE para aventura!");
    } else {
      print("Vou para aventura!");
    }
  }
}

void escolherMeioTransporteEnum(Transporte locomocao) {
  if (locomocao == Transporte.carro) {
    print("Vou de CARRO para aventura!");
  } else {
    if (locomocao == Transporte.bike) {
      print("Vou de BIKE para aventura!");
    } else {
      print("Vou para aventura!");
    }
  }
}

void escolherMeioTransporteEnumSwitch(Transporte locomocao) {
  switch (locomocao) {
    case Transporte.carro:
      print("Vou de CARRO para aventura!");
      break;
    case Transporte.bike:
      print("Vou de CARRO para aventura!");
      break;
    case Transporte.onibus:
      print("Vou de BUSÃO para aventura!");
      break;
    default:
      print("Vou para aventura!");
      break;
  }
}

enum Transporte { carro, bike, andando, onibus, skate, aviao, patins, trem }
