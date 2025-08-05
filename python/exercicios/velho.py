nome = []
idade = []

n = int(input("Quantas pessoas voce vai digitar? "))

for i in range(0, n):
    print(f"Dados da {i+1} pessoa")
    nome.append(str(input("Nome: ")))
    idade.append(int(input("Idade: ")))

maior = idade[0]
posicaoMaior = 0

for i in range(0, n):
    if idade[i] > maior:
        posicaoMaior = i
        
print(f"{nome[posicaoMaior]} é o(a) mais velho(a)")
