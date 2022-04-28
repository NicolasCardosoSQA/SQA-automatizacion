Feature: Inicio de sesion

  Scenario Outline: Inicio de sesion
    Given que estoy en la pagina de inicio de MTH
    When ingreso mis credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    And busco abonado
      | numero   |
      | <Numero> |
    Then Ingreso a la pagina

    Examples: 
      | Usuario      | Clave      | Numero     |
      | ADMINPRUEBAS | Exito2021@ | 3152311339 |
