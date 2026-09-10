from os import system
import time
from primes import PrimeNumbers
from operations import Operations

oper = Operations()
op = ""
while op != "0":
    print("-----Menú de opciones-----")
    print("0. Terminar")
    print("1. Números pares e impares")
    print("2. Serie armónica")
    print("3. MCD (sin Euclides)")
    print("4. MCD Euclides")
    print("5. Desconocido")
    print("6. Descifrar clave")
    op = input("Ingrese opción: ")
    match op:
        case "0":
            print("Programa finalizado")
        case "1":
            n = int(input("Número n: "))
            if oper.odd_even(n):
                print(f"{n} es par")
            else:
                print(f"{n} es impar")
        case "2":
            print(f"Serie armónica de 1 a {n}: {oper.harmonic_series(n)}")
        case "3":
            a = int(input("Número 1: "))
            b = int(input("Número 2: "))
            print(f"MCD({a}, {b}) = {oper.mcd(a, b)}")
        case "4":
            a = int(input("Número 1: "))
            b = int(input("Número 2: "))
            print(f"MCD Euclides({a}, {b}) = {oper.mcd_Euclides(a, b)}")
        case "5":
            a = int(input("Ingrese número: "))
            print(f"Resultado desconocido: {oper.desconocido(a)}")
        case "6":
            key = input("Ingrese clave: ")
            oper.key_decrypt(key)
        case _:
            print("Opción no válida")

# prime = PrimeNumbers()
# start = time.time()
# prime_numbers = [2]
# # prime_numbers = {2}
# print(f"Números primos Euclides 1: {prime_numbers}")
# for i in range(1, 9, 1):
#     prime_numbers.append(
#     prime.new_prime_Euclides(prime_numbers))
#     # prime_numbers.add(prime.new_prime_Euclides(prime_numbers))
#     print(f"Números primos Euclides {i + 1}: {prime_numbers}")
#     end = time.time()
#     print(f"Tiempo empleado: {end - start}\033[32ms\033[97m")
#     print("-" * 50)

# start = time.time()
# prime_numbers2 = [2]
# # prime_numbers2 = {2}
# # print(f"Números primos 1: {prime_numbers2}")
# for i in range(1, 200, 1):
#     prime_numbers2.append(prime.new_prime(prime_numbers2))
#     # prime_numbers2.add(prime.new_prime(prime_numbers2))
#     print(f"Números primos ({i + 1}): {prime_numbers2}")
# end = time.time()
# print(f"Tiempo empleado: {end - start}\033[32ms\033[97m")

