from tkinter import *
from tkinter.ttk import Radiobutton 

win=Tk()
def clicked():
    if (selected.get() == 1):
        prm.configure(text="код задачи №1:\n# -- coding: utf-8 --\nn = int(input())\ni = 1\nwhile i**2 < n:\nprint(i**2)\n  i = i + 1\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            y = ''
            n = int(a.get())
            i = 1
            while i**2 <= n :
              print(i**2)
              i = i + 1
              y = y + str(i**2) + " "
            lbl2.config(text="Ответ: "+y)
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)

    elif (selected.get() == 2):
        prm.configure(text="код задачи №2:\n# -- coding: utf-8 --\nn = int(input())\ni = 2\nprint(':;;:')\nwhile n % i != 0:\n    i += 1\nprint(i)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            n = int(a.get())
            i = 2
            while n % i != 0:
                i += 1
            lbl2.config(text="Ответ: "+str(i))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
    elif (selected.get() == 3):
        prm.configure(text="код задачи №3:\n# -- coding: utf-8 --\nn = int(input())\ni = 1\nl = 0\nprint(':;;:')\nwhile i < n:\n    i *= 2\n    l += 1\n    if i <= n:\n        print(i, l)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            n = int(a.get())
            i = 1
            l = 0
            while i <= n:
                i *= 2
                l += 1
                if i <= n:
                    lbl2.config(text="Ответ: "+str(i)+' '+str(l))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
    elif (selected.get() == 4):
        prm.configure(text="код задачи №4:\n# -- coding: utf-8 --\nx=int(input())\ny=int(input())\ni=1\nwhile x<=y:\n    if x==y:\n        break\n    x+=x/10\n    i+=1\nprint(i)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            x = int(a.get())
            y = int(b.get())
            i=1
            while x<=y:
                if x==y:
                    break
            x+=x/10
            i+=1
            lbl2.config(text="Ответ: "+str(i))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)
        b=Entry(win, width=10)
        b.grid(column=3, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
    elif (selected.get() == 5):
        prm.configure(text="код задачи №5:\n# -- coding: utf-8 --\nl = 0\nwhile int(input()) != 0:\n    l += 1\nprint(':;;:')\nprint(l)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            l = 0
            while int(a.get()) != 0:
                l += 1
            lbl2.config(text="Ответ: "+str(l))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
    elif (selected.get() == 6):
        prm.configure(text="код задачи №6:\n# -- coding: utf-8 --\ns = 0\nl = 0\nn= int(input())\nwhile n != 0:\n    s += n\n    l += 1\n    n = int(input())\nprint(':;;:')\nprint(s / l)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            s = 0
            l = 0
            n= int(a.get())
            while n != 0:
                s += n
                l += 1
                n = int(a.get())
            lbl2.config(text="Ответ: "+str(s / l))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
    elif (selected.get() == 7):
        prm.configure(text="код задачи №7:\n# -- coding: utf-8 --\nn = int(input())\ni = 0\nwhile n != 0:\n    z = int(input())\n    if (z != 0) and (n < z):\n        i += 1\n    n = z\nprint(':;;:')\nprint(i)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            n = int(a.get())
            i = 0
            while n != 0:
                z = int(b.get())
                if (z != 0) and (n < z):
                    i += 1
                n = z
            lbl2.config(text="Ответ: "+str(i))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)
        b=Entry(win, width=10)
        b.grid(column=3, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
    elif (selected.get() == 8):
        prm.configure(text="код задачи №8:\n# -- coding: utf-8 --\np = -1\nc = 0\nm = 0\nn = int(input())\nwhile n != 0:\n    if p == n:\n        c += 1\n    else:\n        p = n\n        m = max(m, c)\n        c = 1\n    n = int(input())\nm = max(m, c)\nprint(':;;:')\nprint(m)\n")
        prm.grid(column=0, row=7)
        def cal_sum():
            p = -1
            c = 0
            m = 0
            n = int(a.get())
            while n != 0:
                if p == n:
                    c += 1
                else:
                    p = n
                    m = max(m, c)
                    c = 1
                n = int(a.get())
            m = max(m, c)
            lbl2.config(text="Ответ: "+str(m))
        btn1 = Button(win, text="Посчитать.", command=cal_sum)
        btn1.grid(column=0, row=8)
        
        lbl1 = Label(win, text="Введите число/а:")
        lbl1.grid(column=1, row=8)
        a=Entry(win, width=10)
        a.grid(column=2, row=8)

        lbl2=Label(win, text="Ответ: ")
        lbl2.grid(column=1, row=9, pady=20)
        
        

menu = Menu(win)
menu.add_command(label='Практическая работа 5.')
win.config(menu=menu)
win.title("Практическая работа 6 Силантьев Д.А. У-215")
win.geometry('1000x800')
selected = IntVar()
rad1 = Radiobutton(win,text='1', value=1,
variable=selected)
rad2 = Radiobutton(win,text='2', value=2,
variable=selected)
rad3 = Radiobutton(win,text='3', value=3,
variable=selected)
rad4 = Radiobutton(win,text='4', value=4,
variable=selected)
rad5 = Radiobutton(win,text='5', value=5,
variable=selected)
rad6 = Radiobutton(win,text='6', value=6,
variable=selected)
rad7 = Radiobutton(win,text='7', value=7,
variable=selected)
rad8 = Radiobutton(win,text='8', value=8,
variable=selected)
btn = Button(win, text="Показать решение.", command=clicked)
lbl = Label(win, text="Выберите номер задания:↘")
prm = Label(win)
otv = Label(win)
rad1.grid(column=1, row=2)
rad2.grid(column=2, row=2)
rad3.grid(column=3, row=2)
rad4.grid(column=1, row=3)
rad5.grid(column=2, row=3)
rad6.grid(column=3, row=3)
rad7.grid(column=1, row=4)
rad8.grid(column=2, row=4)
btn.grid(column=0, row=6)
lbl.grid(column=0, row=1)
otv.grid(column=0, row=10)

win.mainloop()