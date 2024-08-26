import "package:flutter/material.dart";
import "package:grimorio/screens/dashboard.dart";
import "package:grimorio/theme.dart";

class SplashScreen extends StatefulWidget {
  const SplashScreen({super.key});

  @override
  State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  double imageOpacity = 0;
  int timeToAnimationInMilliseconds = 2000;
  @override
  void initState() {
    waitAndShow();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: AppColors.modalBackgroundGradient[2],
      body: Center(
        child: Stack(
          children: [
            Padding(
              padding: const EdgeInsets.only(top: 16.0),
              child: Image.asset(
                "assets/images/grimorio_1152.png",
                width: 300,
              ),
            ),
            AnimatedOpacity(
              duration: Duration(milliseconds: timeToAnimationInMilliseconds),
              opacity: imageOpacity,
              curve: Curves.ease,
              child: Padding(
                padding: const EdgeInsets.only(top: 16.0),
                child: Image.asset(
                  "assets/images/grimorio_titulo_1152.png",
                  width: 300,
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  waitAndShow() {
    Future.delayed(Duration(milliseconds: 700)).then((value) {
      setState(() {
        imageOpacity = 1;
      });
      waitAndNextScreen();
    });
  }

  waitAndNextScreen() {
    Future.delayed(Duration(milliseconds: timeToAnimationInMilliseconds + 300))
        .then((value) {
      setState(() {
        Navigator.pushReplacement(
            context,
            MaterialPageRoute(
              builder: (context) => Dashboard(),
            ));
      });
    });
  }
}
