# Practica5Spring
Miriam Colino Ruiperez- 201804334

- El formulario que he usado para implementar Spring-Boot ha sido el de registro del usuario. En http://localhost:8080/ se le pide nombre, apellidos, edad, identificación y contraseña. Se comprueba cuando el usuario da al submit que ninguno sea null, que la edad sea > 18 y que todos los campos menos la edad tengan de 2 a 30 caracteres. Si todo es correcto, se le redirige a result.html (http://localhost:8080/info) y le muestra el JSON creado con la información. En cambio, si hay algun error de los mencionados, muestra la misma página (regisrarse.html) para que el usuario corrija los errores junto a los mensajes de error correspondientes. 
- He hecho uso Thymeleaf: https://www.thymeleaf.org/ en registrarse.html.
- He usado Java Bean Validation’s @Valid constraint para validar los campos introducidos.
- Si algo ha ido mal en el funcionamiento de esta práctica, salta a la pagina error.html mostrando un mensaje.
