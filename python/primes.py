# import Operations
from operations import Operations
class PrimeNumbers:
    # Constructor
    def __init__(self) -> None:

        pass
    # Generar un nuevo primo usando el teorema de Euclides
    def new_prime_Euclides(self, P) -> int:
        # prod = Operations.Operations()
        prod = Operations()
        x = prod.product_PI(P)
        y = x + 1
        d = 2
        while y % d != 0:
            d += 1
        return d

    # Generar un nuevo primo sin usar Euclides
    def new_prime(self, P) -> int:
        x = max(P) + 1
        while (not self.prime(x)):
            x = x + 1
        return x
    
    # Determinar si un número es primo
    def prime(self, n) -> bool:
        i = 2
        sw = True
        while i <= n ** 0.5 and sw:
            # while i <= n / 2 and sw:
            if n % i == 0:
                sw = False
            else:
                i = i + 1
        return sw
    
    def prime_improved(self, n) -> bool:
        if n % 2 == 0:
            sw = False
        else:
            i = 3
            sw = True # Supuesto: n es primo
        while i < n ** (1/2) and sw:
            if n % i == 0:
                sw = False
            else:
                i+=2
        return sw
