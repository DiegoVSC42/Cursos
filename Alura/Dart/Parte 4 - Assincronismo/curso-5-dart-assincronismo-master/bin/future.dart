void main() {
  // Future myFuture = Future(() {
  //   print("Going back to the future");
  //   return 21;
  // }).then((value) => print("The value is $value"));

  //Future.delayed(Duration(seconds: 5));

  Future<int> myFutureFunc() async {
    print("I have a function in the future");
    await Future.delayed(Duration(seconds: 5));
    throw Exception();
    return 12;
  }

  // myFutureFunc()
  //     .then((value) => print("My function value is: $value"))
  //     .onError((error, stackTrace) => print("An error occurred"))
  //     .whenComplete(() => print("The Future is Over"));

  Future<int> myFutureErrorFunc(int a, int b) async {
    try {
      if (a > b) {
        throw Exception();
      }
      print("I have functional Function");
      await Future.delayed(Duration(seconds: 5));
      return 42;
    } catch (e) {
      print("An error occurred: $e");
      return 24;
    } finally {
      print("The Future is finally Over");
    }
  }

  myFutureErrorFunc(1, 2).then((value) => print("The value is: $value"));

  print("Done with main");
}
