# -*- coding: utf-8 -*-
sum =0
len =0
element = int(input("введите ряд чисел "))
while element !=0:
    sum += element
    len +=1
    element = int(input())
print(sum / len)