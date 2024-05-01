'''
miVariable = 3
print(miVariable)
miVariable = "Hola a todooss los alumnos de la tecnicatura"
print(miVariable)
miVariable = True
print(miVariable)
x = 10
y = 2
z = x + y
print('z es iagual a',z)
print(id(x))
print(id(y))
print(id(z))
# las literales son las casillas de memeorias que ocupan los valores y 
# se escriben con sus ultimos 3 numeros de id -> x624
# a esto se conce como referencia de memoria o simplmente referencia

# Tipos, int, float, string, bool
x = 10
print(x)
print(type(x))

x= 14.5
print(x)
print(type(x))

x = "Hola a todos"
print(x)
print(type(x))

x = True
print(x)
print(type(x))

# Manejo de cadenas
miGrupoFavorito = 'Los palmeras:'
caracteristicas = 'son muy buenos'
print('Mi grupo favorito es: ', miGrupoFavorito, caracteristicas)

numero1 = '1'
numero2 = '2'
print(int(numero1) + int(numero2))

# Tipos boleanos (bool)
miBoleano = 3 > 4
print(miBoleano)

if miBoleano:
    print('Es verdadero')
else:
    print('Es falso')
    
# Procesar la entrada de valores desde el usuario
# funcion input
#resultado = input('Introduce un numero: ')  #input nos regresa un dato tipo cadena
#print(resultado)

# Conversion de la entrada de datos
numero1 = input('Introduce un numero: ')
numero2 = input('Introduce otro numero: ')
resultado = int(numero1) + int(numero2)
print('El resultado de la suma es: ',resultado)


operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print('Resultado de la suma: ', suma)
print(f'El resultado de la suma es: {suma}') #esto nos sirve si queremos imprimir el valor de varias variables

resta = operandoA - operandoB
print(f'el resultado de la resta es: {resta}')

multiplicacion = operandoA*operandoB
print(f'el resultado de la multiplicacion es: {multiplicacion}')

division = operandoA/ operandoB
print(f'el resultado de la division es: {division}')
division = operandoA//operandoA
print(f'el resulado de la division entera es: {division}')
modulo = operandoA % operandoB
print(f'el resultado de la division o residuo (modulo) es: {modulo}')

exponente = operandoA ** operandoB
print(f'el resultado del exponente es: {exponente}')
'''

alto = int(input('Proporcione el alto del rectangulo: '))
ancho = int(input('Proporcione el ancho del rectangulo: '))
area = alto*ancho
perimetro = (alto + ancho) * 2
print(f'El area es: {area} ')
print(f'El perimetro es: {perimetro} ')
