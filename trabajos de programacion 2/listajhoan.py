def menu():
    personas = []

    while True:
        print("Seleccione una opción:")
        print("1. Crear persona")
        print("2. Eliminar persona")
        print("3. Listar persona")
        print("4. Buscar persona")
        print("0. Salir")
        
        opcion = input("Ingrese la opción deseada: ")

        if opcion == "1":
            nombre = input("Ingrese el nombre de la persona: ")
            personas.append(nombre)
            print("Lista de personas:", personas)

        elif opcion == "2":
            if personas:
                print("Lista de personas:", personas)
                try:
                    indice_eliminar = int(input("Ingrese el índice de la persona a eliminar: "))
                    if 0 <= indice_eliminar < len(personas):
                        personas.pop(indice_eliminar)
                        print("Lista actualizada:", personas)
                    else:
                        print("Índice inválido.")
                except ValueError:
                    print("Entrada inválida. Debe ingresar un número.")
            else:
                print("La lista está vacía.")

        elif opcion == "3":
            print("Lista de personas:", personas)

        elif opcion == "4":
            nombre_buscar = input("Ingrese el nombre de la persona a buscar: ")
            if nombre_buscar in personas:
                print("La persona fue encontrada.")
            else:
                print("La persona no fue encontrada.")

        elif opcion == "0":
            print("Saliendo...")
            break

        else:
            print("Opción inválida.")

if __name__ == "__main__":
    menu()