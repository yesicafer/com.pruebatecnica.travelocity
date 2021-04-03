## serenity-cucumber-maven-screenplay

Proyecto de automatización con  screenplay de la pagina Travelocity
Los test se incian automáticamente en el navegador de Chrome, por lo que es necesario tener instalada la ùltima versiòn de Chrome

# Detalles del proyecto


1. __Nombre del proyecto automatizado__

> com.pruebatecnica.travelocity


2. __El modelamiento del proyecto se encuentra en la ruta src/main/java realizado así__

> Questions: Se encuentran los Asserts o el resultado esperado del proyecto
> Task: Las acciones que realiza el actor
> userInterface:  Se encuentra el mapeo de los objetos de la pagina de prueba


3. __Las Historias de usuario se encuentran en "Feature", para el proyecto se diseño "Travelocity.feature" donde encuentra en la ruta src/test/resources__

> travelocity.feature: Los diseños se enfocaron únicamente al menú de Viajes, Las Hu se crearon con el idioma Ingles, ya que la pagina Travelocity por default se encuentra en ese idioma

Se crean 6 escenarios de pruebas, dejando un caso en stand by, el cual encuentra nombrado con tag viaje6.

lo 5 casos diseñados se encuentran nombrados con el Tag"@viaje", ejecutandose de manera exitosa.

> hotels.feature: Se escriben 15 escenarios estan en stand by para su construcción.  

4. __Ejecucion del proyecto se encuentra en el paquete Runner en la ruta src/test/java__

> RunnerTags: Para ejecutar el proyecto se debe abrir la clase "RunnerTags" y ejecutarlo dando click derecho seleccionando la opcion "Run As"-Junit
> Tag: Para ejecutar los 5 casos se debe colocar el tag "@viaje", si requieren ejecutar los 6 casos creados deben configurar el tag"@generalSomokeTest"


5. __Casos de pruebas manuales en excel se encuentra en la ruta testcasesmanual__

# Requerimientos de instalacion 

* Se recomienda tener las siguientes herramientas instaladas:

>Eclipse Oxigen o Neon

>Java 1.8 y Jdk
Instalación
Configurar variables de Entorno

>Cucumber

>Maven 
Instalación 
Configurar variables de Entorno

>Git


# Descargar proyecto en github  

* https://github.com/yesicafer/com.pruebatecnica.travelocity.git
> Se ubica en la carpeta en el equipo para clonar el proyecto con Git bash
> Git bash se ingresa el siguiente comando git clone https://github.com/yesicafer/com.pruebatecnica.travelocity.git



