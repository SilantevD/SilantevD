# -*- coding: utf-8 -*-
x=input("введите строку из букв ")
y=x.count('f')
if y==1:
    print("-1")
if y==0:
    print("-2")
else:
    z=x.find('f',x.find('f')+1)+1
print(z)    
