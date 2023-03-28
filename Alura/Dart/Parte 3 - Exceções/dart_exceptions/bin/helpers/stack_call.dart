void stackStart() {
  print("Started Main");
  functionOne();
  print("Finished Main");
}

void functionOne() {
  print("Started F01");
  try {
    functionTwo();
    /*} on FormatException catch (e) {
    print("Foi capturada dentro da FuntionOne");
    print(e.toString());
    print(e.message);
    print(e.source);
  } on HttpException catch (e) {
    e.toString();
  } on IOException catch (e) {
    print("Uma IOexception foi encontrada.");
  } on Exception catch (e) {
    print(e.toString());*/
  } catch (exception, stackTrace) {
    print(stackTrace);
    print(exception.runtimeType);
    //rethrow;
  } finally {
    print("Chegou no Finally!");
  }
  print("Finished F01");
}

void functionTwo() {
  print("Started F02");
  for (int i = 1; i <= 5; i++) {
    print(i);
    double amount = double.parse("Not a number");
  }
  print("Finished F02");
}
