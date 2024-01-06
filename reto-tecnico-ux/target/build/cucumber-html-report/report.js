$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/demoblaze/features/login.feature");
formatter.feature({
  "name": "Realizar pedido en Demoblaze",
  "description": "Como usuario comprador\nQuiero realizar pedido\nPara poder comprar productos",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@demoblaze"
    }
  ]
});
formatter.scenarioOutline({
  "name": "E2E Realizar pedido utilizando lenguaje gherkin imperativo",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@gherkin_imperativo"
    }
  ]
});
formatter.step({
  "name": "abro pagina de demoblaze",
  "keyword": "Dado "
});
formatter.step({
  "name": "selecciono la categoria \u0027\u003ccategory_1\u003e\u0027",
  "keyword": "Cuando "
});
formatter.step({
  "name": "selecciono el producto \u0027\u003cproduct_1\u003e\u0027",
  "keyword": "Y "
});
formatter.step({
  "name": "agrego el producto al carrito",
  "keyword": "Y "
});
formatter.step({
  "name": "voy al menu \u0027home\u0027",
  "keyword": "Y "
});
formatter.step({
  "name": "selecciono la categoria \u0027\u003ccategory_2\u003e\u0027",
  "keyword": "Y "
});
formatter.step({
  "name": "selecciono el producto \u0027\u003cproduct_2\u003e\u0027",
  "keyword": "Y "
});
formatter.step({
  "name": "agrego el producto al carrito",
  "keyword": "Y "
});
formatter.step({
  "name": "voy al menu \u0027cart\u0027",
  "keyword": "Y "
});
formatter.step({
  "name": "doy clic a realizar pedido",
  "keyword": "Y "
});
formatter.step({
  "name": "ingreso el nombre \u0027\u003cnombre\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "ingreso el country \u0027\u003ccountry\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "ingreso el city \u0027\u003ccity\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "ingreso el card number \u0027\u003ccard_number\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "ingreso el month \u0027\u003cmonth\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "ingreso el year \u0027\u003cyear\u003e\u0027",
  "keyword": "E "
});
formatter.step({
  "name": "doy clic a purchase",
  "keyword": "Y "
});
formatter.step({
  "name": "muestra mensaje \u0027Thank you for your purchase!\u0027",
  "keyword": "Entonces "
});
formatter.step({
  "name": "valida que el monto total sea el correcto",
  "keyword": "Y "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "category_1",
        "product_1",
        "category_2",
        "product_2",
        "nombre",
        "country",
        "city",
        "card_number",
        "month",
        "year"
      ]
    },
    {
      "cells": [
        "Laptops",
        "MacBook air",
        "Phones",
        "Iphone 6 32gb",
        "Jose Quispe",
        "Perú",
        "Lima",
        "7454115541415241",
        "12",
        "2024"
      ]
    }
  ]
});
formatter.scenario({
  "name": "E2E Realizar pedido utilizando lenguaje gherkin imperativo",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@demoblaze"
    },
    {
      "name": "@gherkin_imperativo"
    }
  ]
});
formatter.step({
  "name": "abro pagina de demoblaze",
  "keyword": "Dado "
});
formatter.match({
  "location": "MenuStepDefinition.abro_pagina_de_login_de_demoblaze()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono la categoria \u0027Laptops\u0027",
  "keyword": "Cuando "
});
formatter.match({
  "location": "ProductStepDefinition.selecciono_la_categoria(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono el producto \u0027MacBook air\u0027",
  "keyword": "Y "
});
formatter.match({
  "location": "ProductStepDefinition.selecciono_el_producto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrego el producto al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "ProductStepDefinition.agrego_el_producto_al_carrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voy al menu \u0027home\u0027",
  "keyword": "Y "
});
formatter.match({
  "location": "MenuStepDefinition.voy_al_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono la categoria \u0027Phones\u0027",
  "keyword": "Y "
});
formatter.match({
  "location": "ProductStepDefinition.selecciono_la_categoria(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono el producto \u0027Iphone 6 32gb\u0027",
  "keyword": "Y "
});
formatter.match({
  "location": "ProductStepDefinition.selecciono_el_producto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrego el producto al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "ProductStepDefinition.agrego_el_producto_al_carrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voy al menu \u0027cart\u0027",
  "keyword": "Y "
});
formatter.match({
  "location": "MenuStepDefinition.voy_al_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "doy clic a realizar pedido",
  "keyword": "Y "
});
formatter.match({
  "location": "CartStepDefinition.selecciono_la_categoria()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el nombre \u0027Jose Quispe\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "CartStepDefinition.IngresarNombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el country \u0027Perú\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "CartStepDefinition.IngresarCountry(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el city \u0027Lima\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "CartStepDefinition.IngresarCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el card number \u00277454115541415241\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "CartStepDefinition.IngresarCardNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el month \u002712\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "CartStepDefinition.IngresarMonth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso el year \u00272024\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "CartStepDefinition.IngresarYear(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "doy clic a purchase",
  "keyword": "Y "
});
formatter.match({
  "location": "CartStepDefinition.DarClicAPurchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "muestra mensaje \u0027Thank you for your purchase!\u0027",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CartStepDefinition.muestra_mensaje(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que el monto total sea el correcto",
  "keyword": "Y "
});
formatter.match({
  "location": "CartStepDefinition.valida_que_el_monto_total_sea_el_correcto()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "E2E Realizar pedido utilizando lenguaje gherkin declarativo",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@demoblaze"
    },
    {
      "name": "@gherkin_declarativo"
    }
  ]
});
formatter.step({
  "name": "abro pagina de demoblaze",
  "keyword": "Dado "
});
formatter.match({
  "location": "MenuStepDefinition.abro_pagina_de_login_de_demoblaze()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrego productos al carrito",
  "rows": [
    {
      "cells": [
        "category",
        "product"
      ]
    },
    {
      "cells": [
        "Laptops",
        "MacBook air"
      ]
    },
    {
      "cells": [
        "Phones",
        "Iphone 6 32gb"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "ProductStepDefinition.agrego_productos_al_carrito(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completo los datos para realizar pedido",
  "rows": [
    {
      "cells": [
        "nombre",
        "country",
        "city",
        "card_number",
        "month",
        "year"
      ]
    },
    {
      "cells": [
        "Jose Quispe",
        "Perú",
        "Lima",
        "7454115541415241",
        "12",
        "2024"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "CartStepDefinition.completo_los_datos_para_realizar_pedido(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "doy clic a purchase",
  "keyword": "Cuando "
});
formatter.match({
  "location": "CartStepDefinition.DarClicAPurchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "muestra mensaje \u0027Thank you for your purchase!\u0027",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CartStepDefinition.muestra_mensaje(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que el monto total sea el correcto",
  "keyword": "Y "
});
formatter.match({
  "location": "CartStepDefinition.valida_que_el_monto_total_sea_el_correcto()"
});
formatter.result({
  "status": "passed"
});
});