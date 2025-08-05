ordem = int(input("Digite a ordem da matriz: "))
matriz = []
diagonal = []
negativos = []

# Criando matriz
for i in range(0, ordem):
    linha = []
    for j in range(0, ordem):
        numero = int(input(f"Elemento [{i}, {j}]: "))
        linha.append(numero)
    matriz.append(linha)

# Imprimindo a matriz
for linha in matriz:
    print(linha)    

# Verificando as diagonais e imprimindo-as 
for i in range(0, ordem):
    for j in range(0, ordem):
        if i == j:
            diagonal.append(matriz[i][j])
        if matriz[i][j] < 0:
            negativos.append(matriz[i][j])

# Imprimindo a lista com as diagonais
print(f"Diagonal principal: {diagonal}")
print(f"Negativos: {negativos}")