# En esta clase veremos la sentencia if/else
'''
condicion = 10
if condicion == True:
    print("Condicion verdadera")
elif condicion == False:
    print ("Condicion falsa")
else:
    print("Condicion sin especificar")
'''
num = int(input("Digite un numero del rango del 1 al 3: "))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else:
    numTexto = "Has ingresado un numero fuera del rango"
print (f'El numero ingresado es: {num} - {numTexto}')

