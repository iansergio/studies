n = int(input("Quantas pessoas sera digitadas? "))
altura = []
genero = []

for i in range(0, n):
    height = float(input(f"Digite a altura da {i+1}° pessoa: "))
    altura.append(height)
    gender = input(f"Digite o genero da {i+1}° pessoa [M/F]: ")
    genero.append(gender)

# Maior e menor altura
maior = altura[0]
menor = altura[0]

for i in range(0, n):
    if altura[i] > maior:
        maior = altura[i]
    elif altura[i] < menor:
        menor = altura[i]

print(f"maior: {maior:.2f}")
print(f"menor: {menor:.2f}")

# Média de altura das mulheres
soma = 0
c = 0
for i in range(0, n):
    if genero[i] == "F":
        soma = soma + altura[i]
        c = c + 1

media = soma / c
print(f"media das alturas das mulheres: {media:.2f}")

# Número de homens
q = 0
for i in range(0, n):
    if genero[i] == "M":
        q = q + 1
print(f"numero de homens: {q}")
