# -*- coding: utf-8 -*-
x=input("введите строку в которой h встречается минимум 2 раза ")
y=x[:x.find('f')]
z=x[x.rfind('f')+1:]
print(y+z)