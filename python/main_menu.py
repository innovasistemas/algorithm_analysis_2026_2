from os import system
import time
from primes import PrimeNumbers
from operations import Operations

oper = Operations()
n = int(input("Número n: "))
if oper.odd_even(n):
    print(f"{n} es par")
else:
    print(f"{n} es impar")

print(f"Serie armónica de 1 a {n}: {oper.harmonic_series(n)}")


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

