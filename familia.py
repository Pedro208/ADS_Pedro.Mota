class Pai(object):
    nome = "Carlos"
    sobrenome = "Oliveira"
    residencia = "Ilha Bela"
    olhos = "azuis"

class Filha(Pai):
    nome = "Luciana"
    olhos = "castanhos"

class Neta(Filha):
    nome = "Maria"

print("nomes: ")
print(Pai.nome)
print(Filha.nome)
print(Neta.nome)


print("Residência: ")
print(Pai.residencia)
print(Filha.residencia)
print(Neta.residencia)

print("Olhos: ")
print(Pai.olhos)
print(Filha.olhos)
print(Neta.olhos)

