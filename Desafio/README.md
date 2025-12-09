🐾 PetCare Manager

O PetCare Manager é um sistema simples em Java que simula a administração de uma pequena clínica veterinária.
O projeto foi criado com foco em Orientação a Objetos e uso de ArrayLists, sendo ideal para estudos e aprendizado de boas práticas de Java.

🎯 Objetivo do Projeto

Demonstrar o uso de:

Classes, objetos e encapsulamento

Herança e polimorfismo

Estruturação de pastas em um projeto Java

ArrayList como estrutura dinâmica de dados

Composição entre objetos

📌 Funcionalidades

O sistema permite:

Cadastrar donos da clínica

Cadastrar diferentes tipos de pets (cães e gatos)

Associar pets aos seus respectivos donos

Registrar serviços realizados em pets (banho, tosa, consulta etc.)

Listar donos cadastrados

Listar serviços já realizados

🧱 Arquitetura do Sistema

O projeto é dividido em três camadas:

1. Camada de Modelo (model/)

Contém todas as classes principais do sistema:

Pet – classe abstrata para representar um animal

Dog e Cat – subclasses específicas

Owner – representa o dono do pet

Service – representa um serviço realizado na clínica

2. Camada de Serviço (service/)

ClinicManager – gerencia donos, pets e serviços

Armazena listas (ArrayList) de donos e serviços

Fornece métodos para registrar tudo no sistema

3. Camada Principal

Main – executa uma simulação básica utilizando as classes e métodos do sistema

🧠 Conceitos de Programação Aplicados

Orientação a Objetos

Herança (Dog e Cat herdam de Pet)

Polimorfismo (método exibirInfo)

Encapsulamento dos atributos

Composição (owners possuem pets)

Coleções Java

Uso de ArrayList para armazenar listas dinâmicas

Organização de projeto

Separação por pacotes (model/, service/)

Classe principal isolada