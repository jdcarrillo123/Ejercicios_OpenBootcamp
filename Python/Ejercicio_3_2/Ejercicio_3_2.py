peso=input("Ingrese el peso de la persona: ")
estatura=input("Ingrese la estatura de la persona: ")
imc=float(peso)/float(estatura)**2
print("El indice de masa corporal es: "+ str(round(imc,2)))
