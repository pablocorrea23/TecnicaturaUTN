suma = 0 
for i in range(5):
    print(f'El salario del empleado: {i}')
    horas = int(input('Ingrese la cantidad de horas trabajadas: '))
    tarifa = float(input('Ingrese la tarifa del empleado: '))
    salario = horas*tarifa
    print(f'El salario del empleado {i + 1} es: ${salario}')
    
    suma += salario
    
print(f'El total de salarios es ${suma}')