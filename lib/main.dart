import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp(
    entryPoint: 'main',
  ));
}

@pragma('vm:entry-point')
void mainTwo() {
  runApp(const MainApp(
    entryPoint: 'mainTwo',
  ));
}

class MainApp extends StatelessWidget {
  const MainApp({
    super.key,
    required this.entryPoint,
  });

  final String entryPoint;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Center(
          child: Text('Hello World from $entryPoint!'),
        ),
      ),
    );
  }
}
