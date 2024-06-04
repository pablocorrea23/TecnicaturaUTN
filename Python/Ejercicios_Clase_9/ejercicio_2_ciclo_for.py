#ciclo for

num = int(input("Ingrese la catidad de vueltas del ciclo: "))

total = 0

for num in range(num):
    total += num

print(f"El total es {total} ")