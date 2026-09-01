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
