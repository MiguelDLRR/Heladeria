# Heladeria
Creación de programa para la gestión de pedidos en una Heladería, precios, productos, modificación de parámetros.

1 Dentro del package definir una interface Vendible que contenga los métodos:
  -getPrecio()
  -setPrecio(double precio)

2 Añade al package una clase Loteria que implemente Vendible y que estructure la siguiente
información:
  - Precio
  - Número de lotería
Sobreescribe a toString para que retorne una string con la información del número.

3 Añade al package una clase Comida de tipo abstracta y que implemente Vendible. Debe
permitir estructurar la siguiente información de una comida:
  - una variable estática que almacene el tipo de datos que estructura la clase. Por defecto
  su valor ha de ser “comida”
  - Nombre
  - precio
Añade como mínimo los siguientes métodos:
  - Getters/Setters para los atributos.
  - Sobrescribe toString para que retorne una string con la información de la comida.

4 Añade al package una clase Horchata que herede de Comida y que permita estructurar la
siguiente información:
  - cantidad.
  - % de chufa.

5 Añade al package una clase Cucurucho que herede de Comida y que permita estructurar la
siguiente información:
  - Un array de SaborHelado, para almacenar los sabores del cucurucho.
  - Constructor que establezca el nombre, precio base , kcal y número de bolas de helado
  que puede tener como máximo el cucurucho.
Añade como mínimo los siguientes métodos:
  - Debe llamar al superconstructor correspondiente para establecer que el tipo es
  "cucurucho".
  - Sobrescribe toString para que retorne una string con la información del cucurucho y de
  cada una de las bolas de helado que tiene.
  - addBolaHelado() debe recibir por parámetro una bola de helado , en qué posición de
  las bolas de helado que tiene el cucurucho se quiere añadir y añadirla si la posición es
  correcta.
  - calculaPrecioTotal() retorna la suma del precio base del cucurucho más el de todas las
  bolas de helado que tenga.

6 Añade al package una clase Heladeria con el método main que inicialmente contenga un array
de nombre “pedido” con los siguientes valores:
- El numero de loteria "119383939" de 3.5€
- Una horchata de 250ml, 20kcal, 30% de chufa y 2.5€.
- Un cucurucho de galleta de 20kcal y precio 1€. El cucurucho tiene dos sabores:
  -de vainilla de 30kcal , 1€ , 15% grasa con azúcar
  -de chocolate de 15kcal, 1€ , 15% grasa con aspartamo
- Un cucurucho de galleta de chocolate de 25kcal y precio 1.5€. El cucurucho tiene dos
  sabores:
  -de cookies de 35kcal , 1€ , 20% grasa con azúcar
  -de fresa de 10 kcal, 1€ , 5% grasa con aspartamo.

7 Muestra la información de todos los productos que forman el “pedido” por consola.

8 Muestra un menú al dependiente para que hasta que no elija salir, pueda ver el pedido actual
y/o sustituir tantas veces como se desee un elemento del pedido por una horchata con los
valores que él indique.



  
