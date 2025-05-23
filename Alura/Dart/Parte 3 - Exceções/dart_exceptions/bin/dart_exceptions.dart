import 'dart:io';
import 'dart:math';

import 'controllers/bank_controller.dart';
import 'exceptions/bank_controller_exceptions.dart';
import 'models/account.dart';

void main(List<String> args) {
  /*
  // Criando o banco
  BankController bankController = BankController();

  // Adicionando contas
  //Account accountTest = Account(name: "", balance: 200, isAuthenticated: true);
  bankController.addAccount(
      id: "Ricarth",
      account:
          Account(name: "Ricarth Lima", balance: 400, isAuthenticated: true));

  bankController.addAccount(
      id: "Kako",
      account:
          Account(name: "Caio Couto", balance: 600, isAuthenticated: true));

  // Fazendo transferência
  try {
    bool result = bankController.makeTransfer(
        idSender: "Kako", idReceiver: "Ricarth", amount: 600);
    // Observando resultado
    if (result) {
      print("Transação concluida com sucesso!");
    }
    // print(result);
  } on SenderIdInvalidException catch (e) {
    print(e);
    print("O ID '${e.idSender}' do remetente não é um ID válido");
  } on ReceiverIdInvalidException catch (e) {
    print(e);
    print("O ID '${e.idReceiver}' do destinatário não é um ID válido");
  } on SenderNotAuthenticatedException catch (e) {
    print(e);
    print("O usuário remetente de ID '${e.idSender}' não está autenticado");
  } on SenderBalanceLowerThanAmountException catch (e) {
    print(e);
    print(
        "O usuário de ID '${e.idSender}' tentou enviar ${e.amount} sendo que na sua conta tem apenas ${e.senderBalance}");
  } on Exception {
    print("Algo deu errado");
  }
  */
  testingNullSafety();
}

void testingNullSafety() {
  Account? myAccount =
      Account(name: "Ricarth", balance: 200, isAuthenticated: true);
  ;
  //Simulando uma comunicação externia
  Random rng = Random();
  int randomNumber = rng.nextInt(10);
  print(randomNumber);
  if (randomNumber <= 5) {
    myAccount.createdAt = DateTime.now();
  }

  print(myAccount.runtimeType);

  print(myAccount.createdAt);
  //print(myAccount.createdAt.day);
  //print(myAccount.createdAt!.day);

  // FORMAS DE TRATAR NULL SAFETY

  //MÁ PRATICA
  // print(myAccount!.balance);

  if (myAccount != null) {
    print(myAccount.balance);
    if (myAccount.createdAt != null) {
      print(myAccount.createdAt!.day);
    }
  } else {
    print("Conta nula");
  }
  //OPERADOR TERNARIO
  // print(myAccount != null ? "$myAccount.balance" : "Conta nula");
  //CHAMADA SEGURA
  print(myAccount.balance);
}
