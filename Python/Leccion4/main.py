################# A PARTIR DE ACÁ EMPIEZA EL SEGUNDO SEMESTRE ###################

#Lista = Ariel, Liliana, Natalia, Osvaldo (es similar a un array, se usan los corchetes)

nombres = ["Ariel", "Liliana", "Natalia", "Osvaldo"]

print(nombres[2])
print(nombres[-1])

print (nombres[0:3]) #imprime los elementos desde la posición 0 hasta la 2 (sin incluir la 3)

#modificamos un valor
nombres[0] = "Pablo"
nombres[3] = "Miguel"
print(nombres)

#Iteramos una lista
for nombre in nombres: #nombre es singular, la lista "nombres" es plural(donde estan los nombres)
    print(nombre)
else: #es opcional
    print("se acabaron los elementos de la lista")