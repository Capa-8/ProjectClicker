ClickCoin-1.0

REQUISITOS
	-Tener Java instalado en tu computadora (Java Runtime Environment)

INSTRUCCIONES DE EJECUCION
	1.Doble click sobre el archivo ClickCoin-1.0.jar


DEFECTOS CORREGIDOS

	GRAVES

	- Cuando se cambiaba de ventanas de minado el juego producía un error. Esto era debido a que al hacer el cambio de ventanas en tiempos de ejecución, las imágenes proporcionaban problemas.
	- Se debieron quitar mejoras pasivas planeadas para esta entrega debido que presentaban errores que hacían que el juego se cierra solo.

	LEVES

	- La aparición de enemigos era más habitual de lo que habíamos planeado. Se corrigieron las probabilidades y se negó la aparición mientras se está comprando mejoras.
	- Se negó la existencia de valores negativos de BTC y ETH debido al robo de los enemigos. De esta manera, la existencia de números de esta naturaleza no trae problemas dentro del juego 
	- Las mejoras eran “infinitas”. Se disminuyó el tiempo de uso de estas.
	- Se corrigió el precio de las mejoras. Cuando se adquiere una, el precio de esta se actualiza.

DEFECTOS CONOCIDOS

	- Cuando se cambia de nivel, hay casos que no vuelven a aparecer enemigos.
	- A medida que se avanza en el juego y se adquieren mejoras puede que el juego crashee debido a la gran cantidad de mejoras adquiridas.
	- Existe la posibilidad de que aparezcan más de un enemigo a la vez.
	- Si se cambia muchas veces de moneda, la ponderación del click aumenta demasiado sin razón alguna.
