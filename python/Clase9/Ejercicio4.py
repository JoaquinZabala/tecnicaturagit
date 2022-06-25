#De 10 calificaciones, sacar el promedio y el menor valor.
suma = 0
promedio = 0
baja = 999.99
for i in range (1, 10 + 1):
    nota = float(input("Digite calificación: "))
    suma = suma + nota
    if nota < baja:
        baja = nota
    else:
        promedio = suma / 10
print(f"La calificación promedio es: {promedio}")
print(f"La menor calificación es: {baja}")