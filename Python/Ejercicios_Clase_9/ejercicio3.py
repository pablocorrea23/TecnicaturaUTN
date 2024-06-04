#ejercicio 3

positivos = 0
negativos = 0
neutros = 0

for i in range(10):
    numero = int(input("ingrese un numero: "))
    if numero > 0:
        positivos +=1
    elif numero < 0:
        negativos +=1
    else:
        neutros +=1

print(f"el numero de positivos es: {positivos}")
print(f"el numero de negativos es: {negativos}")
print(f"el numero de neutros es: {neutros}")
    