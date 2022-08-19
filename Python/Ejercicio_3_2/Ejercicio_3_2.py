from decimal import Decimal
peso=Decimal(input("Ingrese el peso de la persona: "))
estatura=Decimal(input("Ingrese la estatura de la persona: "))

imc=peso//(estatura*estatura)
print(Decimal(imc))
a=.23+.07
print(type(peso))
print(.23+.07)
print("El indice de masa corporal es: "+ str(round(imc,2)))
