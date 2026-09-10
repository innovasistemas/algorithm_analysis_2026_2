class Operations:
# Constructor
    def __init__(self) -> None:
        pass

    # Sumatoria
    def sum_naturals_iterative(self, n) -> int:
        s = 0
        for i in range(1, n + 1, 1):
            s += i
        return s

    def sum_naturals_Gauss(self, n) -> int:
        s = n * (n + 1) / 2
        return s

    def sum_naturals_recursive(self, n) -> int:
        s = n
        if n == 1:
            return n;
        else:
            return s + sum_naturals_recursive(n - 1)

    # Productoria
    def product_PI(self, P) -> int:
        prod = 1
        for i in P:
            prod *= i
        return prod

    def odd_even(self, n) -> bool:
        k = 1
        while 2 * k < n:
            k += 1
        if 2 * k == n:
            return True
        else:
            return False

    def harmonic_series(self, m) -> float:
        s = 0
        for i in range(1, m + 1, 1):
            s += 1 / i
        return s

    # Encontrar el MCD (sin Euclides)
    def mcd(self, a, b) -> int:
        # maximum = max(a, b)
        maximum = a if a > b else b 
        i = maximum
        print(i)
        while a % i != 0 or b % i != 0:
            i -= 1
        return i

    # Encontrar el MCD (Euclides)
    def mcd_Euclides(self, a, b) -> int:
        while b > 0:
            aux = a
            a = b
            b = aux % b
        return a

    def desconocido(self, n):
        i = 1
        s = 0
        while i <= n:
            j = n
            while j >= 1:
                print(f"{i} * {j} = {i * j}")
                j = j / 3
                s = s + i + j
            i = i + 1
        return s

    def key_decrypt(self, key) -> None:
        c = 0
        i = 0
        while i < 10:
            j = 0
            while j < 10:
                k = 0
                while k < 10:
                    l = 0
                    while l < 10: 
                        c = c + 1
                        test_key = str(i) + str(j) + str(k) + str(l)
                        if test_key == key:
                            print(f"Clave encontrada a los {c} intentos")
                        l+=1
                    k+=1
                j+=1
            i+=1

