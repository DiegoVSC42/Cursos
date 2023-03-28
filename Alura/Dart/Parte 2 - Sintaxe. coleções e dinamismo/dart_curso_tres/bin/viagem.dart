import 'transporte.dart';

class Viagem {
  static String codigoTrabalho = "DJNADS12";
  double dinheiro = 0;
  Transporte locomocao;
  Set<String> registrosVisitados = <String>{};
  Map<String, dynamic> registrarPrecos = {};

  int _totalLocaisVisitados = 0;

  Viagem({required this.locomocao});

  printCodigo() {
    print(codigoTrabalho);
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

  void visitar(String localVisita) {
    registrosVisitados.add(localVisita);
    _totalLocaisVisitados++;
  }

  void registrarPrecoVisita(String local, dynamic preco) {
    registrarPrecos[local] = preco;
  }

  int get consultarTotalLocaisVisitados {
    return _totalLocaisVisitados;
  }

  void set alterarLocaisVisitados(int novaQtd) {
    if (novaQtd < 10) {
      _totalLocaisVisitados = novaQtd;
    } else {
      print("Não é possível!");
    }
  }
}
