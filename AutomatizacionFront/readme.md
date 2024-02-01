# Sofka

#Se realiza la entrega de tres Features, de los cuales se muestra a continuación:

userRegister
Pestaña del excel que se debe modificar: escenario1
Parámetros de Entrada:
Usuario: usuario que inicia sesión
password: password que inicia sesión
message: Mensaje que se valida si fue satisfactorio o no


userLogin
Pestaña del excel que se debe modificar: escenario2
Parámetros de Entrada:
Usuario: usuario que inicia sesión
password: password que inicia sesión

addPurcharseProduct
Pestaña del excel que se debe modificar: escenario3
Parámetros de Entrada:
Product: producto que busca para agregar al carrito
Nombre: nombre de la persona que realizará la compra
country: País
city: Ciudad
creditcard: numero de tarjeta
month: Mes
year: Año


Configuración de Ambiente:

Configurar la variable de Entorno JAVA_HOME apuntando al Java JDK versión 11
Agregar la ruta del Maven que se encuentra en la raiz del proyecto a la variable de entorno Path
Agregar la versión de Chrome dependiendo de la que se tenga localmente


Comando de ejecución:
mvn test -Dtest=com.co.sofka.runners.UserLoginRunner
Nota: se debe cambiar el nombre del runner que se deba ejecutar
