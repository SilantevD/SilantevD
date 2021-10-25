# -*- coding: utf-8 -*-
s=input("введите строку ")
x=(len(s)//2+len(s)%2)
y=s[0:x]
z=s[x:]
print(z+y)