# Лабораторная работа 4

Выполнила студентка группы ПИН-222 Кох Виктория
Разработать страницу, отображающую список объектов, с хранением их на сервере файле. передача данных осуществляется по JSON, клиент и сервер общаются по средством передачи данных. Применить шаблон проектирования MVC. На странице предусмотреть форму добавления объектов в список.
### Основные условия выполнения

- Сформировать строку JSON
- Передать строку JSON на сервер
- Должно быть не менее 5 свойств у объекта (Например: Список студентов 1 - Имя, 2 - Фамилия,  3- группа, 4 - возраст,  5- изучаемый предмет)
- Дессериализовать в объект (POJO) строку json
- Записать полученную объект в файл на сервере
- Вернуть строки JSON с сервера
- Создать из строки JSON объект
- Получить список всех объектов хранящихся на сервере в файле (можно в виде таблицы, в виде карточек, в виде контейнеров и т.д.)

Скришоты работы программы:
**Заполнение формы**
![image](https://github.com/kokhvics/OOP_LB4/assets/124901945/aad85d22-9ee1-4eaa-ae52-70dbbd33cc75)
![image](https://github.com/kokhvics/OOP_LB4/assets/124901945/88a1af8e-f219-4071-9a14-89e51cd997fa)

**Итоговая таблица**
![image](https://github.com/kokhvics/OOP_LB4/assets/124901945/c9b40a97-dc8d-4547-9611-8709bf490fb0)

_Примечание: для всех лабораторных работ 3-5 итоговый JSON файл tutors.json хранится по адресу D:\STUDY\apache-tomcat-10.1.20\apache-tomcat-10.1.20\bin\tutors.json_
