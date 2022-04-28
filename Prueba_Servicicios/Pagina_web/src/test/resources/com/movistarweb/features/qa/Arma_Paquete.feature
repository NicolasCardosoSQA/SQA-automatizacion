Feature: Compra de Arma tu paquete

  Scenario: Compra de Arma tu Paquete
    Given que estoy en la pagina de movistar web
    When ingreso a modulo arma tu paquete
    And ingreso el numero de abonado
      | numero     |
      | 3152311339 |
    Then se redirige a epayco.
