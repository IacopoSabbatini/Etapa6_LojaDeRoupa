package roupas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes unitários para a classe CalculadoraFinanceira
 */
public class CalculadoraFinanceiraTest {
    
    /**
     * Teste do método calcularNovoSaldo para operação de entrada
     */
    @Test
    public void testCalcularNovoSaldoEntrada() {
        double saldoAtual = 1000.0;
        double valor = 500.0;
        String tipoOperacao = "entrada";
        
        double resultado = CalculadoraFinanceira.calcularNovoSaldo(saldoAtual, valor, tipoOperacao);
        
        assertEquals(1500.0, resultado, 0.001);
    }
    
    /**
     * Teste do método calcularNovoSaldo para operação de saída
     */
    @Test
    public void testCalcularNovoSaldoSaida() {
        double saldoAtual = 1000.0;
        double valor = 300.0;
        String tipoOperacao = "saida";
        
        double resultado = CalculadoraFinanceira.calcularNovoSaldo(saldoAtual, valor, tipoOperacao);
        
        assertEquals(700.0, resultado, 0.001);
    }
    
    /**
     * Teste do método calcularNovoSaldo com valor negativo (deve lançar exceção)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularNovoSaldoValorNegativo() {
        double saldoAtual = 1000.0;
        double valor = -100.0;
        String tipoOperacao = "entrada";
        
        CalculadoraFinanceira.calcularNovoSaldo(saldoAtual, valor, tipoOperacao);
    }
    
    /**
     * Teste do método calcularNovoSaldo com tipo de operação inválido (deve lançar exceção)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularNovoSaldoTipoInvalido() {
        double saldoAtual = 1000.0;
        double valor = 100.0;
        String tipoOperacao = "transferencia";
        
        CalculadoraFinanceira.calcularNovoSaldo(saldoAtual, valor, tipoOperacao);
    }
    
    /**
     * Teste do método calcularTotalEntradas
     */
    @Test
    public void testCalcularTotalEntradas() {
        double[] valores = {100.0, 200.0, 300.0, 400.0};
        String[] tiposOperacao = {"entrada", "saida", "entrada", "saida"};
        
        double resultado = CalculadoraFinanceira.calcularTotalEntradas(valores, tiposOperacao);
        
        assertEquals(400.0, resultado, 0.001);
    }
    
    /**
     * Teste do método calcularTotalSaidas
     */
    @Test
    public void testCalcularTotalSaidas() {
        double[] valores = {100.0, 200.0, 300.0, 400.0};
        String[] tiposOperacao = {"entrada", "saida", "entrada", "saida"};
        
        double resultado = CalculadoraFinanceira.calcularTotalSaidas(valores, tiposOperacao);
        
        assertEquals(600.0, resultado, 0.001);
    }
    
    /**
     * Teste do método calcularSaldoFinal
     */
    @Test
    public void testCalcularSaldoFinal() {
        double saldoInicial = 1000.0;
        double[] valores = {100.0, 200.0, 300.0, 400.0};
        String[] tiposOperacao = {"entrada", "saida", "entrada", "saida"};
        
        double resultado = CalculadoraFinanceira.calcularSaldoFinal(saldoInicial, valores, tiposOperacao);
        
        // 1000 + 100 - 200 + 300 - 400 = 800
        assertEquals(800.0, resultado, 0.001);
    }
    
    /**
     * Teste do método calcularTotalEntradas com arrays de tamanhos diferentes (deve lançar exceção)
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularTotalEntradasArraysDiferentes() {
        double[] valores = {100.0, 200.0, 300.0};
        String[] tiposOperacao = {"entrada", "saida"};
        
        CalculadoraFinanceira.calcularTotalEntradas(valores, tiposOperacao);
    }
}
