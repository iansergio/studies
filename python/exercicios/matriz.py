l = int(input("Digite o número de linhas da matriz: "))
c = int(input("Digite o número de colunas da matriz: "))

matriz = []

for i in range(0, l):
    linha = []
    for j in range(0, c):
        numero = int(input(f"Elemento [{i}, {j}]: "))
        linha.append(numero)
    matriz.append(linha)

# Imprimindo a matriz
for linha in matriz:
    print(linha)
