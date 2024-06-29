n = int(input("ingrese la cantidad de  numeros a ingresar "))

suma_pares = 0
conteo_pares = 0
suma_inpares = 0
conteo_inpares = 0

for i in range(n):
  num = int(input("ingrese un numero "))

  if num % 2 == 0:
     print("el numero es par")
     suma_pares = suma_pares + num
     conteo_pares = conteo_pares +1

  else:
     print("el numero es inpar")
     suma_inpares= suma_inpares+num
     conteo_inpares = conteo_inpares+1
#//////////////////////////////////////////////////////////
  print("")
  if conteo_pares > 0:

      print(f" la suma de los numero pares es {suma_pares}")
      print(f"el conteo de los numeros pares es {conteo_pares}")

  else:
      print(" no se digitaron numeros pares")

#///////////////////////////////////////////////////////////

if conteo_inpares > 0:
    print(f" la suma de los numero inpares es {suma_inpares}")
    print(f"el conteo de los numeros inpares es {conteo_inpares}")

else:
    print(" no se digitaron numeros inpares")