'''
#En esta clase veremos la sentencia if/else
condicion = True
if condicion == True:
    print('condicion verdadera')
elif condicion == False:
    print('condicion falsa')
else:
    print('condicion sin especificar')


#conversion de numero a texto
num = int(input('digite un numero en el rango del 1 al 3: '))
numTexto =''
if num == 1:
    numTexto = 'Numero uno'
elif num == 2:
    numTexto = 'Numero dos'
elif num == 3:
    numTexto = 'Numero tres'
else:
    numTexto = 'Has ingresado un numero fuera de rango'
    
print(f'El numero ingresado es: {num} - {numTexto}')

'''


