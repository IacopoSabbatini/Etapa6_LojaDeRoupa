package roupas;

/**
 * Classe utilitária para cálculos financeiros relacionados ao caixa
 */
public class CalculadoraFinanceira {
    
    /**
     * Calcula o saldo final após uma operação de entrada ou saída
     * @param saldoAtual O saldo atual antes da operação
     * @param valor O valor da operação
     * @param tipoOperacao "entrada" para depósitos ou "saida" para retiradas
     * @return O novo saldo após a operação
     * @throws IllegalArgumentException se o tipo de operação for inválido
     */
    public static double calcularNovoSaldo(double saldoAtual, double valor, String tipoOperacao) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da operação não pode ser negativo");
        }
        
        if ("entrada".equalsIgnoreCase(tipoOperacao)) {
            return saldoAtual + valor;
        } else if ("saida".equalsIgnoreCase(tipoOperacao)) {
            return saldoAtual - valor;
        } else {
            throw new IllegalArgumentException("Tipo de operação inválido. Use 'entrada' ou 'saida'");
        }
    }
    
    /**
     * Calcula o total de entradas a partir de uma lista de valores de caixa
     * @param valores Array de valores
     * @param tiposOperacao Array de tipos de operação correspondentes ("entrada" ou "saida")
     * @return O total de entradas
     * @throws IllegalArgumentException se os arrays tiverem tamanhos diferentes
     */
    public static double calcularTotalEntradas(double[] valores, String[] tiposOperacao) {
        if (valores.length != tiposOperacao.length) {
            throw new IllegalArgumentException("Os arrays de valores e tipos de operação devem ter o mesmo tamanho");
        }
        
        double totalEntradas = 0;
        for (int i = 0; i < valores.length; i++) {
            if ("entrada".equalsIgnoreCase(tiposOperacao[i])) {
                totalEntradas += valores[i];
            }
        }
        return totalEntradas;
    }
    
    /**
     * Calcula o total de saídas a partir de uma lista de valores de caixa
     * @param valores Array de valores
     * @param tiposOperacao Array de tipos de operação correspondentes ("entrada" ou "saida")
     * @return O total de saídas
     * @throws IllegalArgumentException se os arrays tiverem tamanhos diferentes
     */
    public static double calcularTotalSaidas(double[] valores, String[] tiposOperacao) {
        if (valores.length != tiposOperacao.length) {
            throw new IllegalArgumentException("Os arrays de valores e tipos de operação devem ter o mesmo tamanho");
        }
        
        double totalSaidas = 0;
        for (int i = 0; i < valores.length; i++) {
            if ("saida".equalsIgnoreCase(tiposOperacao[i])) {
                totalSaidas += valores[i];
            }
        }
        return totalSaidas;
    }
    
    /**
     * Calcula o saldo final após uma série de operações
     * @param saldoInicial O saldo inicial antes das operações
     * @param valores Array de valores das operações
     * @param tiposOperacao Array de tipos de operação correspondentes ("entrada" ou "saida")
     * @return O saldo final após todas as operações
     * @throws IllegalArgumentException se os arrays tiverem tamanhos diferentes
     */
    public static double calcularSaldoFinal(double saldoInicial, double[] valores, String[] tiposOperacao) {
        if (valores.length != tiposOperacao.length) {
            throw new IllegalArgumentException("Os arrays de valores e tipos de operação devem ter o mesmo tamanho");
        }
        
        double saldoFinal = saldoInicial;
        for (int i = 0; i < valores.length; i++) {
            saldoFinal = calcularNovoSaldo(saldoFinal, valores[i], tiposOperacao[i]);
        }
        return saldoFinal;
    }
}
