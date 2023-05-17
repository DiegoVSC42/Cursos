import 'package:alura_flutter_curso_1/components/task.dart';
import 'package:alura_flutter_curso_1/data/task_dao.dart';
import 'package:alura_flutter_curso_1/data/task_inherited.dart';
import 'package:alura_flutter_curso_1/screens/form_screen.dart';
import 'package:flutter/material.dart';

class InitialScreen extends StatefulWidget {
  const InitialScreen({Key? key}) : super(key: key);

  @override
  State<InitialScreen> createState() => _InitialScreenState();
}

class _InitialScreenState extends State<InitialScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Tarefas'),
        leading: Container(),
        actions: [
          IconButton(
            onPressed: () {
              setState(() {});
            },
            icon: Icon(Icons.refresh),
          ),
        ],
      ),
      body: Padding(
        padding: EdgeInsets.only(top: 8, bottom: 70),
        child: FutureBuilder<List<Task>>(
          future: TaskDao().findAll(),
          builder: (context, snapshot) {
            List<Task>? items = snapshot.data;
            switch (snapshot.connectionState) {
              case ConnectionState.none:
                return Center(
                  child: Column(children: [
                    CircularProgressIndicator(),
                    Text(
                      "Carregando",
                    )
                  ]),
                );
                break;
              case ConnectionState.waiting:
                return Center(
                  child: Column(children: [
                    CircularProgressIndicator(),
                    Text(
                      "Carregando",
                    )
                  ]),
                );
                break;
              case ConnectionState.active:
                return Center(
                  child: Column(children: [
                    CircularProgressIndicator(),
                    Text(
                      "Carregando",
                    )
                  ]),
                );
                break;
              case ConnectionState.done:
                if (snapshot.hasData && items != null) {
                  if (items.isNotEmpty) {
                    return ListView.builder(
                      itemCount: items.length,
                      itemBuilder: (BuildContext context, int index) {
                        final Task tarefa = items[index];
                        return tarefa;
                      },
                    );
                  }
                  return Center(
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(
                          Icons.error_outline,
                          size: 128,
                        ),
                        Text(
                          "Não há nenhuma Tarefa",
                          style: TextStyle(
                            fontSize: 32,
                          ),
                        )
                      ],
                    ),
                  );
                }
                return Text("Erro ao carregar Tarefas");
                break;
            }
            return Text("Erro desconhecido");
          },
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.push(
            context,
            MaterialPageRoute(
              builder: (context) => FormScreen(
                taskContext: context,
              ),
            ),
          ).then(
            (value) => setState(
              () {
                print("Recarregando tela inicial");
              },
            ),
          );
        },
        child: const Icon(Icons.add),
      ),
    );
  }
}
