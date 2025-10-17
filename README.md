# Command Pattern (Патерн "Команда")

---

## Table of Contents
- [Project Description](#project-description)
- [Project Structure](#project-structure)
- [Run Instructions](#run-instructions)
- [Expected Output](#expected-output)
- [Principles Used](#principles-used)
- [Gitignore File](#gitignore-file)
- [Author](#author)

---

<a name="project-description"></a>
## Опис проєкту
Цей проєкт демонструє реалізацію шаблону **Command (Команда)**.  
Мета — створити простий **пульт керування**, який може **вмикати** та **вимикати** різні пристрої, наприклад:

- Світло  
- Телевізор  

Кожна дія інкапсульована в окремому класі-команді, що дозволяє легко додавати нові функції та підтримує чисту архітектуру.

---

<a name="project-structure"></a>
## Структура проєкту
E:\Univer\Java\Sr1
│
├── src/
│ ├── Command.java
│ ├── Light.java
│ ├── TV.java
│ ├── LightOnCommand.java
│ ├── LightOffCommand.java
│ ├── TVOnCommand.java
│ ├── TVOffCommand.java
│ ├── RemoteControl.java
│ └── Main.java
│
├── bin/
├── .gitignore
└── README.md

yaml
Копіювати код

---

<a name="run-instructions"></a>
## Інструкція з запуску
1. Відкрити **Command Prompt (CMD)**  
2. Перейти до теки проєкту:

```cmd
cd /d E:\Univer\Java\Sr1
Скомпілювати всі Java-файли:

c
Копіювати код
javac -d bin src\*.java
Запустити програму:

cmd
Копіювати код
java -cp bin Main
<a name="expected-output"></a>

Очікуваний результат
Копіювати код
Світло увімкнено
Світло вимкнено
Світло вимкнено
Світло увімкнено
Телевізор увімкнено
Телевізор вимкнено
Телевізор увімкнено
<a name="principles-used"></a>

Використані принципи
Інкапсуляція дій: кожна команда (LightOnCommand, TVOffCommand) окремо інкапсулює дію.

Розділення відповідальності:

Компонент	Відповідальність
Receiver	Виконує реальні дії (Light, TV)
Command	Інкапсулює виклик Receiver
Invoker	Ініціює виконання команд (RemoteControl)

Гнучкість і масштабованість: нові пристрої або команди можна додавати без зміни існуючого коду.

<a name="gitignore-file"></a>

Файл .gitignore
bash
Копіювати код
/bin/
/out/
/*.class
*.log
.idea/
/.vscode/
<a name="author"></a>

Автор
Ім’я студента: Данило

Група: ТЦР-32

Дата виконання: 13.10.2025
