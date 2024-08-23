def main():
    # Solicitar información al usuario
    nombre = input("Ingrese el nombre: ")
    apellido = input("Ingrese el apellido: ")
    edad = int(input("Ingrese la edad: "))
    sexo = input("Ingrese el sexo (Masculino/Femenino): ").strip().lower()

    # Evaluar la edad
    if edad >= 18:
        print("Es mayor de edad.")
    else:
        print("Es menor de edad.")
    
    # Evaluar el sexo
    if sexo == "masculino":
        print("Es un Hombre.")
    elif sexo == "femenino":
        print("Es una Mujer.")
    else:
        print("Sexo no reconocido.")

if __name__ == "__main__":
    main()
