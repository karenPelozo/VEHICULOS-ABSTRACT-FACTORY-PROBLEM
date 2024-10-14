package consecionariaVehiculos.main;

public class Main {

	public static void main(String[] args) {
		System.out.print("----------CONSECIONARIA VEHICULOS DATOS AUTOS--------------");
		Auto auto = new Auto(new MotorAuto(), new RuedasAuto(), new CarroceriaAuto());
		System.out.print("\n"+auto.datos());
		System.out.print("\n----------CONSECIONARIA VEHICULOS DATOS MOTOS--------------");
		Moto moto = new Moto(new MotorMoto(), new RuedasMoto(), new CarroceriaMoto());
		System.out.print("\n"+moto.datos());;
	}

}
/*¡Claro! No te preocupes, aquí te lo explico de una manera más sencilla.

### 1. **Agregar Nuevos Tipos de Vehículos**

Imagina que tienes un sistema que solo maneja autos y motos. Si un día decides agregar bicicletas, 
en el enfoque sin Abstract Factory tendrías que:
- **Crear nuevas clases** para las partes de las bicicletas (como `MotorBicicleta`, `RuedasBicicleta`, etc.).
- **Modificar el código principal (Main)** para que ahora también pueda crear bicicletas.

Con el Abstract Factory, solo necesitarías crear una nueva fábrica (`BicicletaFactory`) que sepa cómo crear
 todos los componentes de las bicicletas. No necesitas tocar el `Main`, lo que hace que sea más fácil y rápido
  agregar nuevas funcionalidades.

### 2. **Acoplamiento**

En el enfoque directo, el código principal tiene que saber mucho sobre cómo se construyen los vehículos. 
Si cambias algo (por ejemplo, decides usar un nuevo tipo de motor), tendrás que modificar varias partes del código.

Con el Abstract Factory, el `Main` solo se comunica con la fábrica. Si la fábrica cambia la forma en que
 crea los componentes, el `Main` no necesita saber nada. Esto significa que si algo cambia, hay menos cosas que modificar,
  y eso reduce errores.

### 3. **Mantenimiento y Comprensión del Código**

A medida que tu sistema crece y agregas más tipos de vehículos, el código puede volverse complicado si tienes
 todo en el `Main`. Es más difícil de entender y mantener.

Con el Abstract Factory, el código está más organizado. Cada tipo de vehículo y sus partes están separados y 
gestionados por fábricas, lo que facilita la comprensión del código y su mantenimiento.

### 4. **Cambios en la Configuración**

Si decides cambiar cómo funcionan algunos vehículos (por ejemplo, ofrecer diferentes tamaños de motor), en el 
enfoque directo, tendrías que ir a cada lugar donde se crea un vehículo y hacer cambios.

Con el Abstract Factory, podrías gestionar esos cambios dentro de la fábrica. Así, cualquier cambio se hace en 
un solo lugar, lo que simplifica las cosas.

### 5. **Responsabilidad Única**

El patrón Abstract Factory hace que cada parte del código tenga una sola responsabilidad. Por ejemplo:
- La fábrica se encarga de crear las partes de los vehículos.
- Las clases de vehículos se centran solo en sus propias características.

Sin el patrón, el código puede mezclar diferentes responsabilidades, lo que puede llevar a confusión y errores.

### Resumen Simple

El uso del patrón Abstract Factory hace que tu sistema sea:
- **Más fácil de extender** (puedes agregar nuevos tipos de vehículos sin mucho esfuerzo).
- **Más organizado** (menos confusión sobre qué hace cada parte del código).
- **Más seguro** (menos probabilidades de cometer errores al hacer cambios).

Espero que esta explicación te haya aclarado las cosas. Si tienes más preguntas, ¡pregunta sin problema!*/



/*Claro, aquí te explico por qué este enfoque es menos flexible en comparación con el patrón Abstract Factory:

### 1. **Dificultad para Agregar Nuevos Tipos de Vehículos**

En el enfoque sin el Abstract Factory, si quisieras agregar un nuevo tipo de vehículo (por ejemplo, una bicicleta),
 tendrías que:
- Crear nuevas clases para `MotorBicicleta`, `RuedasBicicleta` y `CarroceriaBicicleta`.
- Modificar la clase `Main` para crear instancias de estas nuevas clases.

Con el Abstract Factory, solo tendrías que crear una nueva fábrica (por ejemplo, `BicicletaFactory`) y no tendrías 
que cambiar el código del `Main` o de otras partes del sistema. Esto hace que el sistema sea más escalable.

### 2. **Acoplamiento**

El enfoque directo hace que el `Main` esté más acoplado a las implementaciones específicas de las clases de vehículos.
 Esto significa que si decides cambiar la implementación de un componente (por ejemplo, usar una nueva clase de motor), tendrás que modificar el código en muchos lugares.

Con el Abstract Factory, el `Main` interactúa con la fábrica, que es responsable de crear los componentes. Esto reduce
 el acoplamiento porque el `Main` no necesita conocer los detalles de cada implementación.

### 3. **Mantenimiento y Comprensión del Código**

A medida que el sistema crece y se añaden más vehículos y configuraciones, el código sin el patrón Abstract Factory
 puede volverse más difícil de mantener y entender. Todas las dependencias están en el `Main`, lo que puede hacer que 
 el código sea más complicado y propenso a errores.

### 4. **Modificaciones y Cambios en la Configuración**

Si decides que ciertos vehículos necesitan diferentes configuraciones (por ejemplo, una variante de motor),
 tendrás que hacer cambios en cada instancia donde se crea un vehículo. Con el Abstract Factory, podrías crear
  variantes de productos dentro de una misma fábrica sin modificar el código cliente.

### 5. **Principio de Responsabilidad Única**

El patrón Abstract Factory ayuda a adherirse al principio de responsabilidad única, ya que cada clase tiene una
 responsabilidad bien definida: la fábrica se encarga de crear productos, mientras que las clases de vehículos se enfocan
  en sus propias características. Sin este patrón, el código tiende a mezclar responsabilidades.

### Resumen

El uso del patrón Abstract Factory proporciona una mayor flexibilidad y escalabilidad a medida que el sistema crece.
 Permite manejar cambios y extensiones sin necesidad de modificar el código existente, lo que resulta en un mantenimiento
  más sencillo y menos propenso a errores a largo plazo.*/