# -*- coding: utf-8 -*-
a = -1
b = 0
N = 0
element = int(input("введите ряд чисел "))
while element != 0:
    if a == element:
        b += 1
    else:
        a = element
        N = max(N, b)
        b = 1
    element = int(input())
N = max(N, b)
print(N)