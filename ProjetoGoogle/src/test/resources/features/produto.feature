
@tag3
Feature: validar produto Dmc no carrinho de compras
Como usuario
Quero navegar no site eneba
Para validar produto Dmc no carrinho de compras
  
  @tag1
   Scenario: validar categoria home page
    Given que esteja na homepage do site eneba
    When clicar na categoria desejada  
    Then o sistema devera apresenta a categoria desejada
    

  
  Scenario: validar produto na categoria action
    Given que esteja na categoria acao
    When clicar no produto Dmc
    Then o sistema devera abrir o produto desejado
    
   Scenario: validar produto no carrinho de compras
    Given que esteja na pagina do produto Dmc 
    When clicar no campo compra agora 
    Then o produto devere ser enviado para o carrinho
    
   
  
     
  
  