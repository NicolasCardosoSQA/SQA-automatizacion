Feature: CallCenterMTH

  Scenario Outline: Consultar Numeros en Call center
    Given Ingreso a MTH
    When Escribo las credenciales de logeo
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Then Ingreso el numero a consultar
      | numero   |
      | <Numero> |

    Examples: 
      | Usuario     | Clave      | Numero     |
      | nacardosoda | Exito2021@ | 3152311339 |
