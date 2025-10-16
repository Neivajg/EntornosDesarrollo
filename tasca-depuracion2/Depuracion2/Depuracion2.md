# Tarea-Depuración 2

## 0. Importar el proyecto en *INTELLIJ.

Proyecto importado -> **OK**

## 1. Explicad QUE HACE EL MÉTODO *MAIN.

El método `main` es el punto de entrada del programa. Su función es crear varios objetos de la clase `Coche`, modificar sus velocidades y mostrar su estado en distintos momentos. Simula una carrera sencilla entre tres coches, mostrando sus velocidades y posiciones antes y después de frenar.

1. **Creación de coches:**  
   Se crean tres objetos `Coche` con diferentes marcas, modelos y colores:
   - `c` → Fiat 500 Rojo  
   - `c2` → Audi A4 Negro  
   - `c3` → Renault 4L Gris  

2. **Generación de velocidades aleatorias (0–79 km/h):**  
   Se usan tres variables (`velocidad_nueva1`, `velocidad_nueva2`, `velocidad_nueva3`) con valores aleatorios generados por la clase `Random`.

3. **Aceleración de los coches:**  
   Cada coche aumenta su velocidad usando el método `acelera(int vel)` con las velocidades aleatorias obtenidas.

4. **Primera impresión del estado de los coches:**  
   Con el método `pinta()`, se muestra cada coche en pantalla.cuanta más velocidad tiene el coche, más desplazado aparece en la consola.

5. **Nueva generación de velocidades aleatorias (0–99 km/h):**  
   Se generan nuevos valores aleatorios para simular el frenado.

6. **Frenado de los coches:**  
   Cada coche reduce su velocidad mediante el método `frena(int vel)`. Si el valor de frenado supera la velocidad actual, esta se pone a 0.

7. **Segunda impresión del estado de los coches:**  
   Se muestran de nuevo los coches con sus nuevas posiciones tras frenar, reflejando la reducción de velocidad o parada completa.


## 2. *Pon un punto de ruptura (*breakpoint) en la línea 27 del método *main de la clase Principal y averiguáis los valores de las variables velocidad_*nueva1, velocidad_*nueva2 y velocidad_*nueva3. Averiguáis también qué datos tienen en sus  parámetros los coches con variables c,*c2 y *c3.

![alt text](../../../../image-2.png)

## 3.*Pon un punto de ruptura (*breakpoint) en la línea 46 del método *main de la clase Principal y averiguáis los valores de las variables velocidad_*nueva1, velocidad_*nueva2 y velocidad_*nueva3. Averiguáis también qué datos tienen en sus  parámetros los coches con variables c,*c2 y *c3.

![alt text](../../../../image-3.png)


## 4. Imagen depuración adiccional : Pinta los coches el programa antes de frenar y después de frenar 

![alt text](../../../../image-7.png)

## 5. URL REPOSITORIO

[🔗 Repositorio en GitHub](https://github.com/Neivajg/EntornosDesarrollo/tree/main/tasca-depuracion2)