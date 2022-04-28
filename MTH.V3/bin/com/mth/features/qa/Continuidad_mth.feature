Feature: Continuidad de MTH

  Scenario Outline: Continuidad mth
    Given Estoy en la pagina de mth
    And ingreso credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    And Ingreso a la pagina test
    When ingreso los datos del request Agrandado
      | fuente   | codigocorto | numerosuscriptor   | mensajetexto  |
      | <Source> | <Shortcut>  | <SubscriberNumber> | <RequestText> |
    And ingreso los datos del request Transpaso Saldo
      | fuente   | codigocorto | numerosuscriptor   | mensajetexto  |
      | <Source> | <Shortcut>  | <SubscriberNumber> | <RequestText> |
    And ingreso los datos del request Confirmacion transpaso
      | fuente   | codigocorto | numerosuscriptor   | mensajetexto  |
      | <Source> | <Shortcut>  | <SubscriberNumber> | <RequestText> |
    And ingreso los datos del request Pide Saldo
      | fuente   | codigocorto | numerosuscriptor   | mensajetexto  |
      | <Source> | <Shortcut>  | <SubscriberNumber> | <RequestText> |
    And ingreso los datos del request Confirmacion pide
      | fuente   | codigocorto | numerosuscriptor   | mensajetexto  |
      | <Source> | <Shortcut>  | <SubscriberNumber> | <RequestText> |
    And ingreso los datos del request Reactiva
      | fuente   | codigocorto | numerosuscriptor   | mensajetexto  |
      | <Source> | <Shortcut>  | <SubscriberNumber> | <RequestText> |
      
    Then Enviar request

    Examples: 
      | Usuario      | Clave  | Source | Shortcut | SubscriberNumber | RequestText     |
      | ADMINPRUEBAS | 643251 | SMS    |      646 |       3152311339 | CLN6101         |
      | ADMINPRUEBAS | 643251 | SMS    |     3690 |       3152311339 | 3178429243 1000 |
      | ADMINPRUEBAS | 643251 | SMS    |     3690 |       3152311339 | si              |
      
