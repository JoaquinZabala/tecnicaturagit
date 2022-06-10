"""
#Ciclo while (Significa Mientras o Durante)
contador = 0
while contador < 78:
    print("Ejecutando el ciclo while ", contador)
    contador += 1
else:
    print("Fin del ciclo while")

#Imprimir numeros del 0 al 5 con el ciclo while
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1

#Imprimir numeros del 5 al 1 con el ciclo while
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1

#Ciclo for
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")

#Palabra reservada break
for letra in "Argentina":
    if letra == "a":
        print(f"Letra Encontrada: {letra}")
        break
else:
    print("Fin del ciclo for")
"""
#Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")
for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor: {i}")