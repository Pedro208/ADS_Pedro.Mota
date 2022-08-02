import math
from unittest import result

val = input("Digite a letra a ser elevado ao cubo: ")
val = int(val)

calc = math.pow(val, 2)

result = ""
if calc < 100:
    result = "menor que 100"
else:
    result = "maior que 100"

print(f"O numero {val} elevado ao cubo é {calc} logo {result}")

