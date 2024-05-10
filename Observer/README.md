# Observer - Caso práctico

### Intención

Define una dependencia de un único objeto a muchos otros de tal manera que cuando el único objeto cambia su estado, todos los objetos dependientes son notificados y actualizados automáticamente.

### Clasificación

Patrón de Comportamiento

### Vista Estructural

![image](images/173487617-9f08d216-8cc1-4897-ace9-eb721af093fc.png)

### Vista Dinámica

![image](images/173487658-fec74e5e-f272-470f-9d4c-149f96722c6e.png)

### Ejemplo Real

Mediante la implementación del patrón de diseño Observer desarrollaremos una aplicación que cargue desde el inicio la configuración del sistema. Dicha configuración notificará de forma automática a todos los objetos que estén interesados en los cambios, todo esto con la finalidad de que los objetos interesados en la configuración no tengan que consultar cada momento si existe algún cambio importante para reflejarlo al usuario.

Solución, sin el patrón Observer:

![image](images/174158849-5c7e6f6a-e5ac-41e0-ac54-cf0a18a02467.png)

Solución, con el patrón Observer:

![image](images/173487730-02c4a10e-85d5-4ecf-84fa-365d004c0652.png)

### Ejecucion

```
gradle build
gradle run
```

## UML

![UML Model](./images/Observer.png)