class Pessoa(object):
    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade
    
class Cidadao(Pessoa):
    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf

print("Digite os dados do Cidadão")

nome = input("Nome: ")
sexo = input("Sexo: ")
idade = input("Idade: ")
cpf = input("CPF: ")

cidadao_1 = Cidadao(nome, sexo, idade, cpf)

print("\nDados do Cidadão:")
print(cidadao_1.nome)
print(cidadao_1.sexo)
print(cidadao_1.idade)
print(cidadao_1.cpf)
