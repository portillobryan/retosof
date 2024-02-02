# Sofka

Se realiza la entrega de 4 Features, de los cuales se muestra a continuación:

## searchUser
### Pestaña del excel que se debe modificar: escenario1
### Parámetros de Entrada:
Id: Id delusuario

Code: código de respuesta



## updateUser
### Pestaña del excel que se debe modificar: escenario2
### Parámetros de Entrada:
Id: Id delusuario

Code: código de respuesta

first_name: Nombre de la persona

last_name: Apellido de la persona


## deleteUser
### Pestaña del excel que se debe modificar: escenario3
### Parámetros de Entrada:
Id: Id delusuario

Code: código de respuesta


## searchAllUser
### Pestaña del excel que se debe modificar: escenario4
### Parámetros de Entrada:
Id: Id delusuario

Code: código de respuesta



## Configuración de Ambiente:

Configurar la variable de Entorno JAVA_HOME apuntando al Java JDK versión 11

Agregar la ruta del Maven que se encuentra en la raiz del proyecto a la variable de entorno Path



## Comando de ejecución:
mvn test -Dtest=com.co.sofka.runners.UserDeleteRunner

Nota: se debe cambiar el nombre del runner que se deba ejecutar
