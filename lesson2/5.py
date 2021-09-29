# -*- coding: utf-8 -*-
#Задача 7
x = int(input("Введите год "))
if (x % 4 == 0 and x % 100 != 0) or x % 400 == 0:
    print("год весокосный")
else:
    print("год не весокосный")