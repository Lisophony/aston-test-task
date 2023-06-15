# aston-test-task

## Описание
Проект представляет собой решение тестового задания
## Структура
Данный проект содержит два варианта решения 1-3 задач тестового задания : консльный и оконный. 
Консольное решение лежит в пакете "console", оконное - в пакете "gui". 
В каждом из этих пакетов лежит класс Main для запуска приложения. Файл с ответами на 4-ую задачу находится рядом с этими пакетами.
## Как запустить
Для работы программы у вас должен быть установлен Maven и Java 11 версии
### Способ 1
1 Склонируйте проект : git clone https://github.com/Lisophony/aston-test-task.git 

2 Откройте консоль в папке проекта, где лежит файл pom.xml 

3 Для запуска консольного варианта введите maven команду : mvn compile exec:java -Dexec.mainClass="com.aston.tasks.console.Main" 

4 Для запуска оконного приложения введите кманду : mvn compile exec:java -Dexec.mainClass="com.aston.tasks.gui.Main"

### Способ 2
1 Склонируйте проект : git clone https://github.com/Lisophony/aston-test-task.git 

2 Откройте проект в удобной для вас IDE (например, IntelliJ IDEA) 

3 Запустите функцию в классе Main, который находится в пакетах console и gui.