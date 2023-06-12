import 'package:flutter/material.dart';
import 'package:desafios/screens/text_rich_challenge.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: "Desafios",
      home: TextRichChallenge(),
      debugShowCheckedModeBanner: false,
    );
  }
}
