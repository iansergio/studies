# Declarando uma matriz de tamanho 5x5 com números 0
linhaColuna = int(input("Qual a ordem da matriz? (máximo 5): "))

matriz = [[0,0,0,0,0],
          [0,0,0,0,0],
          [0,0,0,0,0],
          [0,0,0,0,0],
          [0,0,0,0,0]]    

# Informando os valores da matriz
for i in range(0, linhaColuna):
    for j in range(0, linhaColuna):
        matriz[i][j] = int(input(f"Elemento [{i},{j}]"))

# Imprimindo a matriz
for i in range(0, linhaColuna):
    for j in range(0, linhaColuna):
        print(f"{matriz[i][j]}", end=" ")
    print()

