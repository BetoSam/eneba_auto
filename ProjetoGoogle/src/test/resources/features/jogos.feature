
@tag
Feature: Validar produto no carrinho site eneba
  Como usuario 
  Quero entrar no site eneba
  Para validar produto no carrinho de compras
  
  Scenario: validar categoria home page
    Given que esteja na homepage do site eneba
    When clicar na categoria desejada  
    Then o sistema devera apresenta a categoria desejada
    

  
  Scenario: validar produto na categoria action
    Given que esteja na categoria acao
    When clicar no produto
    Then o sistema devera abrir o produto desejado

   
 
  Scenario: validar pais de ip
    Given que esteja na categoria acao
    When clicar no produto
    And clicar no botao de pais de origem 
    Then o site devera atualizar o site para o idioma escolhido
    

    
     
  Scenario: validar cockies
    Given que esteja na categoria acao
    When clicar no produto
    And clicar no botao de pais de origem 
    And aceitar cookies
    Then os coockies devera ser aceito pelo sistema
    
      
   
  Scenario:  validar produto no carrinho
    Given que esteja na categoria acao
    When clicar no produto
    And clicar no botao de pais de origem 
    And clicar no botao aceitar cookies
    And comprar agora 
    Then o produto desejado devera ser enviado para o carrinho 
    
    
