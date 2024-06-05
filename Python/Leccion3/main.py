#ciclo while (mientras o durante)

# contador = 0

# while contador < 78:
#     print(f'ejecutamos el contador: {contador}')
#     contador += 1
# else: 
#     print('Fin ciclo while')

# maximo = 5
# contador = 0

# while contador < maximo:
#     print(f'ejecutamos el contador: {contador}')
#     contador += 1

# minimo = 1
# contador = 5

# while contador >= minimo:
#     print(f'ejecutamos el contador: {contador}')
#     contador -= 1

######### ciclo for ########

# cadena = 'Hello'

# for letra in cadena:
#     print(letra)
# else:
#     print('Fin ciclo for')

# for letra in 'Alemania':
#     if letra == 'a':
#         print(f'Se encontro la {letra}')
#         break
# else:
#     print('Fin ciclo for')

###### palabra reservada continue ######

for i in range(6):
    if i % 2 == 0:
        print(f'El numero {i} es par')

for i in range(6):
    if i % 2 != 0:
        continue
    print(f'El numero {i} es par')
    
    