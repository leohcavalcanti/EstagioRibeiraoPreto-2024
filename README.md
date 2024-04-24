1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? Resposta: 49

_____________________________________________________________________________________

2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre 
será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente 
definido no código;

_____________________________________________________________________________________

3) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___
Resposta : 9

b) 2, 4, 8, 16, 32, 64, ____
Resposta : 128

c) 0, 1, 4, 9, 16, 25, 36, ____
Resposta : 49

d) 4, 16, 36, 64, ____
Resposta : 100

e) 1, 1, 2, 3, 5, 8, ____
Resposta : 13

f) 2,10, 12, 16, 17, 18, 19, ____
Resposta : 20

_____________________________________________________________________________________

4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Resposta:

Primeira ida:

Ação: Ligue o interruptor 1 por um minuto e depois desligue-o.
Observação: Vá para a sala das lâmpadas. 
- Caso 1: A lâmpada 1 está acesa: O interruptor 1 controla a lâmpada 1. Anote essa informação.
- Caso 2: A lâmpada 1 está apagada: Prossiga para o próximo passo.
- Ação: Ligue o interruptor 2 e deixe-o ligado.
    Retorno: Volte para a sala inicial.

Segunda ida:

Observação: Após alguns minutos (tempo suficiente para que a lâmpada 2, se estiver acesa, esfrie), vá novamente para a sala das lâmpadas.
- Caso 1: A lâmpada 2 está acesa: O interruptor 2 controla a lâmpada 2. Anote essa informação.
Subcaso 1a: A lâmpada 1 também está acesa: O interruptor 3 controla a lâmpada 3 (por dedução, já que os outros dois interruptores já estão controlando suas respectivas lâmpadas).
Subcaso 1b: A lâmpada 1 continua apagada: O interruptor 3 controla a lâmpada 1 (já que o interruptor 1 não a acendeu na primeira ida e o interruptor 2 a acendeu agora).
- Caso 2: A lâmpada 2 está apagada: O interruptor 3 controla a lâmpada 2. Anote essa informação.
Subcaso 2a: A lâmpada 1 está acesa: O interruptor 1 controla a lâmpada 1 (já que o interruptor 2 não a acendeu agora e o interruptor 3 a acendeu na primeira ida).
Subcaso 2b: A lâmpada 1 continua apagada: O interruptor 1 controla a lâmpada 3 (por dedução, já que os outros dois interruptores já estão controlando suas respectivas lâmpadas).

_____________________________________________________________________________________

5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;