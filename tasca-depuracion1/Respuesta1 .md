# Tarea-Depuración 1

## 1. En la función1. Qué hacen estas líneas de código?

El código crea una cadena, le elimina el último carácter y le añade un "1".  
Resultado final: `string2 = "string1"`.

## 2. Qué valen las variables string1 y string2 antes de ejecutar el código de comprobación siguiente?

Antes del `if` el valor de las variables quedarían:
- string1 = **"string1"**
- string2 = **"string1"**
 
## 3. Por que no funciona el operador == ?. Qué operador se tiene que  usar en lugar de este?

El operador `==` no compara el contenido de los Strings, solo la referencia a los objetos.  

Se debe usar `string1.equals(string2)`.

## 4. Esta función como la tengo que declarar en el método MAIN para que funcione. Existen 2 posibilidades. Explicalas.

La función no va porque existen dos formas de hacer la llamada y , no se esta haciendo ninguna.

Formas de hacerlo:

1. Crear un objeto de la clase y llamar a `obj.funcion2();`

2. Hacer que la función sea estática y llamar directamente a `funcion2();`

## 5. URL REPOSITORIO
 https://github.com/neivajg96/EntornosDesarrollo/tree/main/Tasca-Depuracion1