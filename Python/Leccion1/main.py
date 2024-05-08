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


alto = int(input('Proporcione el alto del rectangulo: '))
ancho = int(input('Proporcione el ancho del rectangulo: '))
area = alto*ancho
perimetro = (alto + ancho) * 2
print(f'El area es: {area} ')
print(f'El perimetro es: {perimetro} ')


miVariable3 = 10
print(miVariable3)

#operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

#miVAriable3 = miVAriable3 -2
miVariable3 -=2
print(miVariable3)

miVariable3 *=3
print(miVariable3)

miVariable3 /= 2
print(int(miVariable3))

#operadores de comparacion

d = 4
b = 2
resultado = d == b #comprobamos si son iguales
print(resultado)

#operador diferente
resultado = d != b
print(resultado)

#operador mayor que
resultado = d > b
print(resultado)

#operador menor que
resultado =  d < b
print(resultado)

#operador menor o igual que
resultado = d <= b
print(resultado)

#operador mayor o igual que
resultado = d >= b
print(resultado)


#Ejercio: par o impar
#1. solicitamos que el usuario ingrese un numero
#2. este se asigna a una variable
#3. utilizaremos la estructura 'if else'
#4. la fomrula: <num> %2 == 0 -> esta operacion nos dice si el nuemro es par
#5. si es true imprimimos que es par
#6. si es false imporimimos que es impar

a = int(input('digite un numero: '))

print(f'el residuo de la operacion es: {a % 2}')

if a % 2 == 0:
    print(f'el valor de a es: {a} y es un numero PAR')
else:
    print(f'el valor de a es: {a} y es un numero IMPAR')


#Ejercio: determinar si es mayor de edad
#1. solicitamos que el usuario ingrese un numero
#2. este se asigna a una variable
#3. utilizaremos la estructura 'if else'
#4. la fomrula: <num> >=18
#5. si es true imprimimos que es mayor de edad
#6. si es false imprimimos que es menor de edad

edadAdulto = 18
edadPersona= int(input('digite su edad: '))
if edadPersona >= edadAdulto:
    print(f'su edad es: {edadPersona} años, es mayor de edad')
else: 
    print(f'su edad es: {edadPersona} años, es menor de edad')



#operadores logicos
a = True
b = False
resultado = a and b
print(resultado)

#operador or
resultado = a or b
print(resultado)

#operador not
resultado = not a
print(resultado)



#Ejercio: valor dentro de un rango
#1. solicitamos que el usuario ingrese un numero
#2. verificar si el valor ingresado se encuentra entra el rango de 0 a 5
#3. la fomrula es: <num> >=0 and <num> <=5

valor = int(input('Digite un numero: '))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f'el valor {valor} esta dentro del rango')
else: 
    print(f'el valor {valor} no esta dentro del rango') 
    
    
    
#Ejercio: operador or y not
# la pregunta si un padre puede asistir al juego de su hijo.
#1. verificamos si tiene vacaciones
#2. verificamos si tiene el dia libre
#3. utilizaremos la estructura 'if else' con el operador or
#4. imprimir

vacaciones = False
diaDescanso = True
if not (vacaciones or diaDescanso):
    print('Puede asistir al juego')
else: 
    print('Tiene trabajo que hacer')



#Ejercio: Rango entre las edades 20 y 30 años
#1. preguntar la edad al usuario
#2. si la edad esta dentro de los 20 o 30 años esta dentro del rango
#3. combinamos los operadores and y or para saber si el usuario esta dentro del rango o no
#4. imprimir

edad = int(input('ingrese su edad: '))
#veinte = edad >= 20 and edad < 30
#print(veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)

if (20 <= edad < 30) or (30 <= edad < 40): #sintaxis simplificada
    print('estas dentro del rango de 20 a 40 años')
else: 
    print('No estas dentro del rango de los 20 ni de los 30 años')
    
    
    
#Ejercicio: el mayor de dos numeros
#1. solicitar al usuario dos valores
    #numero1(int)
    #numero1(int)
#2. se debe imprimir el mayor de los dos numeros
#    la salida debe ser identica a la siguiente
#   Digite el valor para el numero 1:
#   digite el valor para el numero 2:
#   el numero mayor es: <numeroMayor>

numero1 = int(input('Digite el valor para el numero 1: '))
numero2 = int(input('Digite el valor para el numero 2: '))

if numero1 > numero2:
    print('el numero 1 es mayor')
else:
    print('el numero 2 es mayor')
'''
    
#Ejercicio: tineda de libros
#1. Mostrar: ingrese los siguientes datos del libro
#2. Digite el nombre del libro
#3. digite el id del libro
#4. digite el precio del libro
#5. Indicar si el envio es gratuito (true/false)
#6. mostrar
#  nombre:
#  ID:
#  Precio:
#  Envio gratuito:

print('digite los siguientes datos del libro')
nombre = input('digite el nombre del libro: ')
id = int(input('digite el id del libro: '))
precio = float(input('digite el precio del libro: '))
envioGratuito = (input('indicar si el envio es gratuito (True/False): '))
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = 'el valor es incorrecto, debe escribir True/False'
    
print(f'''
      Nombre: {nombre}
      id: {id}
      Precio: {precio}
      Envio Gratuito?: {envioGratuito}
      ''')