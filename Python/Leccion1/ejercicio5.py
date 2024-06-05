valor = float(input('Ingrese un valor del 0 al 10: '))

if(valor == 9 or valor == 10):
    print('A')
elif(valor >= 8 and valor < 9):
    print('B')
elif(valor >= 7 and valor < 8):
    print('C')
elif(valor >= 6 and valor < 7):
    print('D')
elif(valor >= 0 and valor < 6):
    print('F')
else: 
    print('El valor ingresado es incorrecto')