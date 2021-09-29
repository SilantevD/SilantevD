# -*- coding: utf-8 -*-
#Задача 8
x = int(input("Первое число: "))
y = int(input("Второе число: "))
z = int(input("Третье число: "))
if (x == y == z):
    print("3") 
elif x == y or y == z or x == z:
    print("2")
else:
    print("0")
