# -*- coding: utf-8 -*-
#Задача 9
x = int(input("Введите длину шоколадки "))
y = int(input("Введите ширину шоколадки "))
z = int(input("введите колличество оставшейся шоколадки "))
if x != y:
    if (x * y > z) and  (z % x == 0 or z % y == 0):
        print("Да")
    else:
        print("Нет")