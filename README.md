# Loja de Roupas - PI

🛠️ **Status do projeto:** Em desenvolvimento 🚧  

## 📌 Tecnologias utilizadas:
- Java (Swing)
- MySQL (JDBC)
- Git/GitHub
- VS Visual Studio
- JUnit (Testes Unitários)

## 👥 Time de Desenvolvimento:
- [Iacopo Sabbatini] 

## 🎯 Objetivo do Software:
Criar um sistema de gerenciamento de loja de roupas, permitindo cadastros, vendas e controle de estoque.

## 🚀 Funcionalidades:
✅ Cadastro de clientes e produtos  
✅ Registro de vendas  
✅ Controle de caixa  
✅ Relatórios financeiros  
✅ Cálculos financeiros com testes unitários 

## 📊 Sobre esta Versão Refatorada ##
Este código é uma refatoração do projeto original PI ATV5, com foco na aplicação dos princípios SOLID e na melhoria da estrutura para facilitar a manutenção e futuras evoluções (como uma migração para web).
Principais alterações da refatoração:
- Introdução de Interfaces para DAOs (Padrão Repositório).
- Desacoplamento entre as Telas (UI) e a lógica de acesso a dados.
- Organização do código visando maior clareza e manutenibilidade.
- Para detalhes completos sobre as refatorações aplicadas, princípios SOLID e justificativas, consulte o relatorio_refatoracao.md (enviado separadamente).

## 📊 Sobre esta Versão (PI_ETAPA7) ##
Esta versão expande o projeto refatorado da Etapa 6, adicionando testes unitários com JUnit e um plano de testes estruturado. As principais adições incluem:
- Classe CalculadoraFinanceira: Implementação de uma classe utilitária para cálculos financeiros relacionados ao caixa
- Testes Unitários JUnit: Conjunto completo de testes para validar os métodos de cálculo financeiro
- Plano de Testes: Documento detalhado com estratégia, casos de teste e critérios de aceitação

## 🧪 Testes Implementados: 
- Cálculo de novo saldo após operações de entrada e saída
- Validação de entradas inválidas (valores negativos, tipos de operação incorretos)
- Cálculo de totais de entradas e saídas
- Cálculo de saldo final após múltiplas operações
- Validação de arrays de tamanhos diferentes