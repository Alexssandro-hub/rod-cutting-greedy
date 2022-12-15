public class RodCutting {
  // Função para encontrar o valor máximo de
  // p(i)/i usando método guloso
  public static int findMaxValue(int n, int[] p) {
    // Array para armazenar o valor máximo de
    // p(i)/i para cada i
    int[] dp = new int[n + 1];

    // Iterar em todos os comprimentos possíveis da barra de ferro
    for (int i = 1; i <= n; i++) {
      // Procura o valor máximo p(j)/j para todo
      // j de tal forma que j <= i
      int maxValue = Integer.MIN_VALUE;
      for (int j = 1; j <= i; j++) {
        maxValue = Math.max(maxValue, p[j] / j);
      }

      // Armazena o valor máximo de p(j)/j no array dp
      dp[i] = maxValue;
    }

    // Retorna o valor máximo de p(i)/i for i = n
    return dp[n];
  }

  public static void main(String[] args) {
    int n = 8;
    int[] p = {0, 1, 5, 8, 9, 10, 17, 17, 20};

    System.out.println(findMaxValue(n, p));
  }
}
