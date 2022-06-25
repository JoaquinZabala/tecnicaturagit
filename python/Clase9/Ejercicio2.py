#Calcular la suma de N primeros números.

total = int(input("Ingrese la cantidad de números a sumar: "))
suma = 0
for i in range (1, total+1):
    print(i)
    suma += i
print(f"La suma es: {suma}")