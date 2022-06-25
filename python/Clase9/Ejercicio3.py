#Leer 10 números e indicar cuántos son positivos, cuántos negativos y cuántos neutros.
neutro = 0
positivo = 0
negativo = 0

for i in range (1, 10+1):
    num = int(input("Digite un número: "))
    if num == 0:
        neutro += 1
    elif num > 0:
        positivo += 1
    else:
        num < 0
        negativo += 1
print(f"Hay {neutro} números neutros.")
print(f"Hay {positivo} números positivos.")
print(f"Hay {negativo} números negativos.")