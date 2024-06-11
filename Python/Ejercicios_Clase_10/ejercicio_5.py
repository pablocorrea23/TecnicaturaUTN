num = int(input('Ingrese un numero: '))

if num >= 0:
        factorial = 1
        for i in range(num):
            i= i + 1
            factorial *= i
            

print(f'el factorial de {num} es: {factorial}')
    