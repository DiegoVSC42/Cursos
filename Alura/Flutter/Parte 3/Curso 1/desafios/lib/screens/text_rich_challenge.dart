import 'package:flutter/material.dart';

class TextRichChallenge extends StatelessWidget {
  const TextRichChallenge({super.key});

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body: Center(
        child: Text.rich(
          TextSpan(
              text: "Oie",
              style: TextStyle(
                fontWeight: FontWeight.bold,
              ),
              children: [
                TextSpan(
                  text: ", mundo Flutter",
                  style: TextStyle(
                    fontStyle: FontStyle.italic,
                    fontWeight: FontWeight.normal,
                  ),
                ),
              ]),
        ),
      ),
    );
  }
}
