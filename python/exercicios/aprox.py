# Lendo um conjunto de N nomes:
n = int(input("Quantos alunos serão digitados? "))
listanomes = []
listaNota1 = []
listaNota2 = []

for i in range(0, n):
    nomes = input(f"Digite o nome do {i+1}° aluno: ")
    listanomes.append(nomes)
    nota1 = float(input(f"Digite a primeira nota do {i+1}° aluno: "))
    listaNota1.append(nota1)
    nota2 = float(input(f"Digite a segunda nota do {i+1}° aluno: "))
    listaNota2.append(nota2)
    
# Calculando a média das notas e Imprimindo os nomes dos aprovados
print("ALUNOS ARPOVADOS:")
for i in range(0, n):
    if (listaNota1[i] + listaNota2[i]) / 2 >= 6.0:
        print(listanomes[i])