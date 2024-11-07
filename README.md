# Sistema de Gerenciamento de Estacionamento

Este é um sistema simples de gerenciamento de estacionamento implementado em Java. O sistema permite o cadastro de vagas e veículos, controle da entrada e saída dos veículos, cálculo do valor a ser pago com base no tempo de permanência e geração de relatórios sobre vagas ocupadas e histórico de veículos.

## Funcionalidades

- **Cadastro de Vagas:** O sistema permite o cadastro de vagas com número, tamanho (pequeno, médio, grande) e disponibilidade.
- **Cadastro de Veículos:** O sistema permite o cadastro de veículos com informações como placa, modelo, tamanho e horários de entrada e saída.
- **Entrada de Veículos:** Os veículos são alocados nas vagas disponíveis, de acordo com o tamanho compatível da vaga e do veículo.
- **Saída de Veículos:** O sistema registra a saída do veículo, calcula o tempo de permanência e gera o valor a ser pago com base no tempo.
- **Relatórios:** O sistema gera relatórios de vagas ocupadas e histórico de permanência de veículos, com as informações de placa, horários de entrada e saída e valor pago.

## Requisitos

Para rodar o sistema, você precisará ter o **Java 8 ou superior** instalado no seu computador. Além disso, o sistema utiliza **Listas** para armazenar as vagas, veículos e registros de entrada/saída.

## Como Executar o Sistema

### 1. Clonar o Repositório

Primeiro, clone o repositório para o seu computador:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
