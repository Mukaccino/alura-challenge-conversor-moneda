# Conversor de Monedas en Java

## Interacciones Disponibles

### 1. Seleccion de Moneda de Origen

Al iniciar se solicitara elegir (usando el codigo de moneda) una moneda de las siguientes disponibles:

- ARS - Peso argentino
- BOB - Boliviano boliviano
- BRL - Real brasileño
- CLP - Peso chileno
- COP - Peso colombiano
- USD - Dólar estadounidense
- SALIR - Termina la aplicacion

### 2. Ingreso de la Cantidad a Convertir

Luego se solicitara la cantidad de la divisa de origen que desea convertir.

### 3. Selección de la Moneda de Destino

Una vez ingresada la cantidad, se solicitara elegir (usando el codigo de moneda) una moneda de las siguientes disponibles:

- ARS - Peso argentino
- BOB - Boliviano boliviano
- BRL - Real brasileño
- CLP - Peso chileno
- COP - Peso colombiano
- USD - Dólar estadounidense
- SALIR - Termina la aplicacion

### 4. Cálculo y Resultado

La aplicacion enviara la peticion a la API para luego calcular los valores respuesta y mostrar el siguiente resultado:

- Moneda de origen
- Moneda de destino
- Valor de la moneda de destino
- Cantidad ingresada
- Valor total de la conversión

### 5. Manejo de Errores

La aplicacion realiza las siguientes validaciones:

- Si la moneda de origen o destino no está en el listado, la aplicacion imprimira "Moneda incorrecta."
- Si el usuario ingresa un valor vacío, la aplicacion imprimirá "Entrada vacia."
- Si ocurre algún error en la consulta hacia la API, la aplicacion imprimira "Ocurrio un error" con el mensaje de la excepcion.

### 6. Finalización de la aplicacion

Si en cualquier momento el usuario selecciona la opcion `SALIR`, la aplicacion finalizara.
