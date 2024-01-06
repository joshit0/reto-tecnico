# language: es
@demoblaze
Característica: Realizar pedido en Demoblaze
Como usuario comprador
Quiero realizar pedido
Para poder comprar productos

    #Escenario escrito de forma imperativa
    @gherkin_imperativo
    Esquema del escenario: E2E Realizar pedido utilizando lenguaje gherkin imperativo
    Dado abro pagina de demoblaze
    Cuando selecciono la categoria '<category_1>'
    Y selecciono el producto '<product_1>'
    Y agrego el producto al carrito
    Y voy al menu 'home'
    Y selecciono la categoria '<category_2>'
    Y selecciono el producto '<product_2>'
    Y agrego el producto al carrito
    Y voy al menu 'cart'
    Y doy clic a realizar pedido
    E ingreso el nombre '<nombre>'
    E ingreso el country '<country>'
    E ingreso el city '<city>'
    E ingreso el card number '<card_number>'
    E ingreso el month '<month>'
    E ingreso el year '<year>'
    Y doy clic a purchase
    Entonces muestra mensaje 'Thank you for your purchase!'
    Y valida que el monto total sea el correcto
    Ejemplos:
    | category_1 | product_1   | category_2 | product_2     | nombre      | country | city | card_number      | month | year |
    | Laptops    | MacBook air | Phones     | Iphone 6 32gb | Jose Quispe | Perú    | Lima | 7454115541415241 | 12    | 2024 |


    #Escenario escrito de forma declarativa
    @gherkin_declarativo
    Escenario: E2E Realizar pedido utilizando lenguaje gherkin declarativo
    Dado abro pagina de demoblaze
    Y agrego productos al carrito
    | category | product       |
    | Laptops  | MacBook air   |
    | Phones   | Iphone 6 32gb |
    Y completo los datos para realizar pedido
    | nombre      | country | city | card_number      | month | year |
    | Jose Quispe | Perú    | Lima | 7454115541415241 | 12    | 2024 |
    Cuando doy clic a purchase
    Entonces muestra mensaje 'Thank you for your purchase!'
    Y valida que el monto total sea el correcto
