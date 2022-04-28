Feature: Inicio de sesion

  Scenario Outline: Inicio de sesion
    Given que estoy en la pagina de inicio de AltamirA
    When ingreso mis credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Then Ingreso a la pagina

    Examples: 
      | Usuario | Clave    |
      | bocl    | B0c1boC. |
