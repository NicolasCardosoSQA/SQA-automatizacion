Feature: Consulta de Saldo

  Scenario Outline: Consulta de Saldo
    Given Dentro de la pagina de altamira busco opcion saldo
    And ingreso crendeciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    And busco menu
    When ingreso el dato de insumo
      | 3178429510 |
      | <Insumo>   |
    Then Capturo dato de saldo

    Examples: 
      | Usuario | Clave    |
      | bocl    | B0c1boC. |
      
