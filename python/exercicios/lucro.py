n = int(input("Serão digitados dados de quantos produtos? "))

produto = []
compra = []
venda = []

# Lendo os dados iniciais
for i in range(0, n):
    print(f"Produto {i+1}:")
    product = (input("Nome: "))
    produto.append(product)
    buy = float(input("Preco de compra: "))
    compra.append(buy)
    sell = float(input("Preco de venda: "))
    venda.append(sell)

# Calculando a porcentagem de lucro
abaixo = 0
entre = 0
acima = 0

for i in range(0, n):
    lucro = venda[i] - compra[i]
    p = lucro * 100 / compra[i]
    
    # Verificando se o lucro é menor que 10%
    if p < 10:
        abaixo = abaixo + 1 
        print(f"{p:.2f}")

    # Verificando se o lucro é maior que 10% ou menor que 20%
    elif p >= 10 and p <= 20:
        print(f"{p:.2f}")
        entre = entre + 1

    # Lucro acima de 20%
    else:
        acima = acima + 1
        print(f"{p:.2f}")

print(f"abaixo de 10%: {abaixo}")
print(f"entre 10% e 20%: {entre}")
print(f"acima de 20%: {acima}")

