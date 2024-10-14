# **PROBLEMAS DE VEHICULOS SIN EL ABSTRACT FACTORY** #

* Si no utilizaramos el patron de diseño ABSTRACT FACTORY 
para crear vehiculos, tendriamos que crear varias clases por
cada vehiculo que quisieramos agregar y tendriamos que modificar
la clase main que funciona como la clase cliente en este caso,
corriendo el riesgo de implementar errores en el codigo. 

* Si se quisiera agregar bicicletas se deberia modificar el codigo para que acepte
  el vehiculo bicicleta, se tendria que crear una clase nueva bicicleta y se deberia decir
  que no tiene motor y que no tiene carroceria
