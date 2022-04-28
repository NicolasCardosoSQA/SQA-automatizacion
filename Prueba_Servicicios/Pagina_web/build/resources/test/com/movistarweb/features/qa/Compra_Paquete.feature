Feature: Compra de paquetes web

  Scenario: Compra de paquetes web
    Given que estoy en la pagina de movistar web
    When ingreso el numero del abonado
      | numeros    |
      | 3152311339 |
    Then se redirige a epayco
