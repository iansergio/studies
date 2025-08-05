import random

# Exercícios
# Valor do peixe se passar de 50kg cada kg a mais é 4 reais
# Preço 58.05 por 1kg 
def calcPreco(peso):
    c = 0
    if peso > 50.0:
        peso = peso - 50.0
        peso = peso * 4.0
    return peso    

x = 57
calc = calcPreco(x)
print(f"Multa sobre excesso de peso: R${calc:.2f} ")
print()

# Números pares entre dois números
def paresEntre(n1, n2):
    lista = []
    x = n2 - n1 
    for i in range(0, x):
        i = i + n1
        lista.append(i + 1)

    pares = []
    for x in lista:
        if x % 2 == 0 and x != lista[-1]:
            pares.append(x)
    return pares
print(paresEntre(2, 10))
print()

# Mostrar quantas notas de 100, 50, 20, 10, 5, 2 estão em
# R$ 787.00
def notasEm(notas, valor):
    c = 0
    for x in notas:
        while x <= valor:
            valor = valor - x
            c += 1
        print(f"Nota de R${x}.0: {c}")
        c = 0
notas = [100, 50, 20, 10, 5, 2]
notasEm(notas, 787)
print()

# Descobrir um número
def adivinharNumero():
    c = 0
    print("Tente adivinhar o número que estou pensando (digite [OK] para continuar)")
    input("")
    n = random.randint(1, 20)
    while True:
        chute = int(input("Digite seu chute: "))
        if chute == n:
            print("Você venceu!")
            break
        elif chute > n:
            print("O número é menor")
        elif chute < n:
            print("O número é maior")
        else:
            print("Valor inválido")

adivinharNumero()