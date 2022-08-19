nombre="José Alberto"
apellidos="Cardenas Guillen"
edad=25
email="jcardenas@outlook.com"
telefono="678-125-78-98"
casado=True
conHijos=False
listaAmigos=["José Luis","Daniel","Pamela","Estefania"]
peliculasVistas={
    "titulo1":"Titanic",
    "titulo2":"Depredador la presa",
    "titulo3":"Como si fuera la primera vez",
    "titulo4":"50 sombras de grey"
}
print("Nombre: "+nombre)
print("Apellidos: "+apellidos)
print("Edad: "+str(edad))
print("Correo electrónico: "+email)
print("Teléfono: "+telefono)
print("Casado: "+str(casado))
print("Con hijos: "+str(conHijos))
print("Amigos: "+", ".join(listaAmigos))
peliculas=peliculasVistas.values()
print("Peliculas vistas: "+", ".join(peliculas))
