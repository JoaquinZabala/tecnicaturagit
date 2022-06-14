'''
miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = "3.5"
print(miVariable)
miVariable = "Laboratorio Clase 2 UTN"
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x928
print(id(y))
print(id(z))
a = "Hola chicos"
print(type(a))

b = 10
print(type(b))
c = 10.78
print(type(c))
d = True
print(type(d))
e = False
print(type(e))
# Tipos int, Float, String, Bool
j = "Separacion"
print(j)
print(type(x))
x = 10
print(type(x))
x = 10.78
print(type(x))
x = True
print(type(x))
x = False
print(type(x))
j = "Separacion"
print(j)
numero1 = 5
numero2 = 10
print(numero1 + numero2)
numero3 = "5"
numero4 = "8"
print(int(numero3) + int(numero4))
j = "Separacion"
print(j)
# Manejo de cadenas (String)
miGrupoFavorito = "Hola123"
print("Mi grupo favorito es:", miGrupoFavorito, )
j = "Separacion"
print(j)
# Tipos Boleanos (bool)
miBooleano = 3 > 5
print(miBooleano)
if miBooleano:
    print("El resultado es Verdadero")
else:
    print("El resultado es Falso")
miBooleano2 = 3 > 2
print(miBooleano2)
if miBooleano2:
    print("El resultado es Verdadero")
else:
    print("El resultado es Falso")
# Procesar la entrada del usuario
#Funcion imput

resultado = input("Digite un numero: ")
print(resultado)
# Conversion de la entrada de datos
numero5 = int(input("Escribe el primer numero: "))
numero6 = int(input("Escribe el segundo numero: "))
resultado = numero5 + numero6
print("El resultado de la suma es: ",resultado)
j = "Separacion"
print(j)


operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("Resultado de la suma:",suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoA - operandoB
print(f"El resultado de la resta es:{resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es:{multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")

division = operandoA // operandoB
print(f"El resultado de la division (int) es: {division}")

modulo = operandoA % operandoB
print(f"El resultado de la division o residuo (modulo) es: {modulo}")

exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")


alto1 = input("Digite el alto")
ancho1 = input("Digite el ancho")

area = alto1 * ancho1
perimetro = (alto1 + ancho1)*2
print(f"El area es de:{area}")
print(f"El perimetro es de:{perimetro}")

alto = 5
ancho = 3

area = alto * ancho
perimetro = (alto + ancho)*2
print(f"El area es de:{area}")
print(f"El perimetro es de:{perimetro}")


alto: int = int(input("Escribe el alto del rectangulo: "))
ancho: int = int(input("Escribe el ancho del rectangulo: "))
area = ancho * alto
print(f"El area del rectangualo es: {area}")
perimetro = (ancho+alto)*2
print(f"El perimetro del rectangulo es: {perimetro}")

mivariable3 = 2
print(mivariable3)

mivariable3 = mivariable3 + 1
print(mivariable3)
mivariable3 = mivariable3 + 1
print(mivariable3)
mivariable3 = mivariable3 * 2
print(mivariable3)


#operadores de comparacion

a = 4
b = 5
resultado = a == b
print(f"Resultado: {resultado}")

resultado = a!=b
print(resultado)

resultado = a > b
print(resultado)

resultado = a < b
print(resultado)

resultado = a >= b
print(resultado)

resultado = a <= b
print(resultado)

a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un numero PAR")
else:
    print(f"El valor de a es: {a} es un numero IMPAR")


edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Usted es mayor de edad")
else:
    print(f"Usted es menor de edad")
'''