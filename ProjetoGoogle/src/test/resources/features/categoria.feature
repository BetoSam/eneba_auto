
@tagCtegoria
 Feature: validar categoria
Como usuario 
quero acessar o site eneba
Para validar o campo categorias
  
  Scenario: validar campo categorias
    Given que esteja no site eneba
    When escolher uma categoria
    Then o sistema devera apresenta a categoria escolhida
  
Scenario: validar produto no carrinho de compras
           Given que esteja na categoria selecionada
           When escolher um produto
           And e clicar no campo comprar agora
           Then o produto devera ser enviado para o carrinho