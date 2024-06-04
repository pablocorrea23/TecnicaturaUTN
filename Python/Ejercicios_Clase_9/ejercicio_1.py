#Ejercicio año bisiesto

print("Introduce un año")

opcion = 0

while opcion !=1: 
    num = int(input("Año: "))
    if num % 4 == 0 and num % 100 != 0 or num % 400 == 0:    
        print("El año es bisiesto")
    else: 
        print("El año no es bisiesto")
    
    opcion = int(input("si quieres salir digite 1:  "))
    if opcion == 1:
        opcion == 1 
else:
    print("Fin")