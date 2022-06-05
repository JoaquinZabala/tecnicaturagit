'''
Haremos un programa que cuando el usuario ingrese su edad le diga, o imprima la etapa de su vida en una breve oracion:
0 a 10 = La infancia es increible y bella
11 a 19 = Tienes muchos cambios, mucho que estudiar
20 a 29 = Amor y comienza el trabajo
'''
edad = int(input("Digite su edad: "))
oracion = None
if 0 <= edad < 10: #Sitaxis simplificada
    oracion = "La infancia es increible y bella"
elif 10 <= edad < 20:
    oracion = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad < 30:
    oracion = "Amor y comienza el trabajo"
elif 30 <= edad < 50:
    oracion = "Comienza "
elif 50 <= edad < 70:
    oracion = "Amor y comienza el trabajo"
elif 70 <= edad < 100:
    oracion = "Amor y comienza el trabajo"
else:
    oracion = "Error, etapa de vida no reconocida"
print(f"Tu edad es: {edad}, {oracion} ")