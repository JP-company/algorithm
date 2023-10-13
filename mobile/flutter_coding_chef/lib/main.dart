import 'package:flutter/material.dart';
import 'package:fluttertoast/fluttertoast.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'BBANTO',
      theme: ThemeData(primarySwatch: Colors.amber),
      home: const Grade(),
    );
  }
}

class Grade extends StatelessWidget {
  const Grade({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Colors.teal,
        appBar: AppBar(
          title: const Text('Appbar icon menu'),
          centerTitle: true,
          elevation: 0.0,
          actions: [
            IconButton(
              onPressed: () {
                print('shopping_cart button is clicked');
              },
              icon: Icon(Icons.shopping_cart),
            ),
            IconButton(
              onPressed: () {
                print('search button is clicked');
              },
              icon: Icon(Icons.search),
            ),
          ],
        ),
        drawer: Drawer(
          child: ListView(
            padding: EdgeInsets.zero,
            children: <Widget>[
              UserAccountsDrawerHeader(
                currentAccountPicture: CircleAvatar(
                  backgroundImage: AssetImage('assets/d.png'),
                  backgroundColor: Colors.white,
                ),
                otherAccountsPictures: <Widget>[
                  CircleAvatar(
                    backgroundImage: AssetImage('assets/d.png'),
                    backgroundColor: Colors.white,
                  ),
                  // CircleAvatar(
                  //   backgroundImage: AssetImage('assets/d.png'),
                  //   backgroundColor: Colors.white,
                  // ),
                ],
                accountName: Text('BBANTO'),
                accountEmail: Text('wjsdj2008@gmail.com'),
                onDetailsPressed: () {
                  print('arrow is clicked');
                },
                decoration: BoxDecoration(
                    color: Colors.amber[200],
                    borderRadius: BorderRadius.only(
                      bottomLeft: Radius.circular(40.0),
                      bottomRight: Radius.circular(40.0),
                    )),
              ),
              ListTile(
                leading: Icon(
                  Icons.home,
                  color: Colors.grey[850],
                ),
                title: Text('Home'),
                onTap: () {
                  print("Home is clicked");
                },
                trailing: Icon(Icons.add),
              ),
              ListTile(
                leading: Icon(
                  Icons.settings,
                  color: Colors.grey[850],
                ),
                title: Text('Setting'),
                onTap: () {
                  print("Setting is clicked");
                },
                trailing: Icon(Icons.add),
              ),
              ListTile(
                leading: Icon(
                  Icons.question_answer,
                  color: Colors.grey[850],
                ),
                title: Text('Q&A'),
                onTap: () {
                  print("Q&A is clicked");
                },
                trailing: Icon(Icons.add),
              ),
            ],
          ),
        ),
        body: Column(
          children: [
            TextButton(
              onPressed: () {
                print('text button');
              },
              onLongPress: () {
                print('long text button');
              },
              child: Text(
                'Text button',
                style: TextStyle(fontSize: 20.0),
              ),
              style: TextButton.styleFrom(
                primary: Colors.red,
              ),
            ),
            ElevatedButton(
              onPressed: () {
                print('Elevated Button');
              },
              child: Text("Elvated button"),
              style: ElevatedButton.styleFrom(
                  primary: Colors.orangeAccent,
                  shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10)),
                  elevation: 0.0),
            ),

            ButtonBar(
              alignment: MainAxisAlignment.center,
              buttonPadding: EdgeInsets.all(20),
              children: [
                OutlinedButton(
                  onPressed: () {
                    print('Outlined Button');
                  },
                  child: Text('Outlined button'),
                  style: OutlinedButton.styleFrom(
                      primary: Colors.green,
                      side: BorderSide(color: Colors.black87, width: 2.0)),
                ),
                TextButton.icon(
                  onPressed: () {
                    print('Icon button');
                  },
                  icon: Icon(Icons.home),
                  label: Text('Go to home'),
                  style: TextButton.styleFrom(
                      primary: Colors.purple,
                      minimumSize: Size(200, 50)
                  ),
                ),
              ],
            )
          ],
        ));
  }
}

class SecondPage extends StatelessWidget {
  const SecondPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: Colors.teal,
        appBar: AppBar(
          title: const Text('Second Page'),
          centerTitle: true,
          elevation: 0.0,
          actions: [
            IconButton(
              onPressed: () {
                print('shopping_cart button is clicked');
              },
              icon: Icon(Icons.shopping_cart),
            ),
            IconButton(
              onPressed: () {
                print('search button is clicked');
              },
              icon: Icon(Icons.search),
            ),
          ],
        ),
        body: Center(
          child: ElevatedButton(
            child: Text('Go to the First page'),
            onPressed: () {
              Navigator.pop(context);
            },
          ),
        ));
  }
}

void flutterToast() {
  Fluttertoast.showToast(
      msg: "Flutter",
      gravity: ToastGravity.BOTTOM,
      backgroundColor: Colors.redAccent,
      fontSize: 20.0,
      textColor: Colors.white,
      toastLength: Toast.LENGTH_SHORT);
}

class MySnackBar extends StatelessWidget {
  const MySnackBar({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Center(
      child: ElevatedButton(
        onPressed: () {
          ScaffoldMessenger.of(context).showSnackBar(SnackBar(
            content: Text(
              'Hello',
              textAlign: TextAlign.center,
              style: TextStyle(
                color: Colors.white,
              ),
            ),
            backgroundColor: Colors.teal,
            duration: Duration(milliseconds: 1000),
          ));
        },
        child: Text('Show me'),
      ),
    );
  }
}
