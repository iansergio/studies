# 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
def verificaEmFibonnaci(n):
    primeiroValor = 0
    segundoValor = 1
    # print(primeiroValor)
    while segundoValor < n:
        # print(segundoValor)
        # Atribuindo a um valor auxiliar a soma dos dois valores
        aux = primeiroValor + segundoValor
        # Atribuindo o valor do segundo valor ao primeiro e o do valor auxiliar ao segundo 
        primeiroValor = segundoValor
        segundoValor = aux
        if segundoValor == n:
            print(f"O número {n} faz parte da sequência de Fibonacci.")
        elif segundoValor > n and segundoValor != n:
            print(f"O número {n} não pertence à sequência de Fibonacci.")    
print("1) Fibonacci")
verificaEmFibonnaci(7778742049)

# 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
def verificaString(letra, texto):
    return "Sim" if letra.lower() in texto.lower() else "Não"

print("2 Verificar existência da letra 'a')")
print(verificaString("O", "Sou uma string a ser verificada"))

# 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
# Resposta: 77

# 4) Descubra a lógica e complete o próximo elemento:
# Respostas entre colchetes "[ ]"
# a) 1, 3, 5, 7, [9]
# b) 2, 4, 8, 16, 32, 64, [128]
# c) 0, 1, 4, 9, 16, 25, 36, [49]
# d) 4, 16, 36, 64, [100]
# e) 1, 1, 2, 3, 5, 8, [13]
# f) 2, 10, 12, 16, 17, 18, 19, [200]

# 5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
# Resposta: Com o calor gerado pela lâmpada. Na primeira ida eu deixaria ligado o primeiro interruptor por alguns minutos e depois desligaria o primeiro e ligaria o segundo interruptor, então iria até a primeira sala, se a lâmpada estivesse ligada: a sala 1 tem conexão com o interruptor 2, se estivesse desligada porém ao tocar a lâmpada ela estivesse morna: a sala 1 tem conexão com o interruptor 1, e se ao tocar a lâmpada ela estivesse fria: a sala 1 tem conexão com o interruptor 3. E na segunda ida seria da mesma forma.