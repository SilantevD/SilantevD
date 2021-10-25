# -*- coding: utf-8 -*-
x=input("введите два слова через пробел ")
y = int(x.find(' '))+1
a = int(len(x))
b = str(x[y:a])+str(' ')+str(x[:y])
print(b)