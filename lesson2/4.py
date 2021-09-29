# -*- coding: utf-8 -*-
#Задача 5
def min(a,b,c):
	if a<b and a<c:
		print (a)
	if b<a and b<c:
		print (b)
	if c<a and c<b:
		print (c)
a=int(input("введите первое число "))
b=int(input("введите второе число "))
c=int(input("введите третье число "))
min(a,b,c)