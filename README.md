# JogoDeXadrez

# Chess Game Application

Este projeto implementa um jogo de xadrez jogável via terminal. O código principal está contido na classe `Program`, que gerencia a lógica principal do jogo e a interação com o usuário.

## Visão Geral

O programa utiliza várias classes para encapsular a lógica do jogo de xadrez, incluindo a movimentação das peças, verificação de xeque-mate, e promoção de peças. Ele também lida com a entrada do usuário e exibe o estado atual do jogo no terminal.

## Estrutura do Código

### Classes Principais

1. **Program**: Contém o método `main` e gerencia o fluxo principal do jogo.
2. **ChessMatch**: Representa uma partida de xadrez. Contém a lógica do jogo, incluindo o estado atual das peças, movimentações e regras.
3. **ChessPiece**: Representa uma peça de xadrez.
4. **ChessPosition**: Representa uma posição no tabuleiro de xadrez.
5. **UI**: Contém métodos utilitários para exibir o tabuleiro e outras informações no terminal, além de ler entradas do usuário.

### Fluxo Principal

1. Inicializa o scanner para leitura de entrada do usuário.
2. Cria uma nova partida de xadrez (`ChessMatch`).
3. Cria uma lista para armazenar peças capturadas.
4. Executa um loop até que o jogo termine (quando ocorre xeque-mate):
   - Limpa a tela e imprime o estado atual da partida.
   - Solicita ao usuário a posição da peça que deseja mover (posição de origem).
   - Exibe os movimentos possíveis para a peça selecionada.
   - Solicita ao usuário a posição de destino para a peça.
   - Executa o movimento e captura a peça, se aplicável.
   - Verifica se há promoção de peça e solicita ao usuário a peça para promoção.
5. Trata exceções de xadrez (`ChessException`) e de entrada inválida (`InputMismatchException`).
6. Ao término do jogo, exibe o estado final da partida.

### Promoção de Peça

Se uma peça é promovida (por exemplo, um peão alcança a última fileira), o usuário é solicitado a escolher a nova peça (Bispo, Cavalo, Torre ou Rainha).

## Como Executar

1. Compile todas as classes.
2. Execute a classe `Program`.
3. Siga as instruções no terminal para jogar o jogo de xadrez.

## Exceções

O programa trata duas exceções principais:
- **ChessException**: Lança mensagens de erro relacionadas às regras do xadrez.
- **InputMismatchException**: Lança mensagens de erro para entradas inválidas do usuário.

## Dependências

O código depende de outras classes (`ChessMatch`, `ChessPiece`, `ChessPosition`, `UI`, etc.) que devem estar presentes no pacote `chess`.

