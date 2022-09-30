#Comenzamos con Funciones
# Definimos una funcion
#mi_funcion() # No se puede llamar antes de definir a una funcion porque nos dara error
def mi_funcion (): # Para identificar a la funcion utilizamos parentesis
    print("Saludos a todos los alumnos de la tecnicatura")

mi_funcion()#Estamos llamando a la funcion
mi_funcion() # Se puede llamar a una funcion N cantidad de veces, osea la cantidad de veces que querramos

# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+" "+lastName)
person = ["Ariel", "Betancud"]
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la funcion /lista
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto /lista
person2 = ("Osvaldo", "Giordanini") # Desempaquetamos a traves de una tupla /tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"} # Desempaquetamos a traves de un diccionario /Diccionario
show(**person3)

numbers = [1, 2, 3, 4, 5] # Aun con la lista vacia se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 5:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print("Proceso finalizado")

# List comprehension, lista de comprension
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mex"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a traves del canal de YouTube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Joaquin", "Zabala")

# La palabra return en funciones
# Creamos una funcion para sumar
def sumar (a, b):
    return a + b
#resultado = sumar(78, 22)
#print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55,45)}")

def sumar2(a = 0, b = 0): # Le damos un valor por default para no tener errores
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22,66)}")

# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listarNombres("Lucas", "Jose", "Joaquin", "Ariel", "Rosa")
listarNombres("Marcos", "Juan", "Pedro", "Marcela", "Carlos")

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # kwargs significa: key word argument
        print(f"{llave} : {valor}")

listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE = "Integrated Develoment Enviroment", PK="Primary Key")
listarTerminos(Nombre="Lionel Messi")
listarTerminos(Nombre="Ariel Betancud")
listarTerminos(Nombre="Joaquín Zabala")

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito","Pedro","Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
#desplegarNombres(10) # No es un objeto iterable
desplegarNombres((10,11)) # Para poder recorrer los numeros los convertimos en una tupla
desplegarNombres([22,55]) # Aqui lo transformamos en una lista para poder observarlos

# Funciones Recursivas
def factorial(numero):
    if numero == 1: # Caso Base
        return 1
    else:
        return numero * factorial(numero-1)
resultado = factorial(5) # Lo hacemos en codigo duro
print(f"El factorial del numero 5 es: {resultado}") # Tarea que el usuario ingrese el numero para calcular el factorial
