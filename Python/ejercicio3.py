mes = ''
mes = int(input("Ingrese el numero del mes: "))

if (mes >= 1 and mes <=3):
    print("Verano")
elif (mes >= 4 and mes <=6):
    print("Otoño")
elif (mes >= 7 and mes <=9):
    print("Invierno")
elif (mes >= 10 and mes <=12):
    print("Primavera")
else:
    print("Ingrese un numero de Mes válido")