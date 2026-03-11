# -Prueba-tecnica---Curso-2-
Lista de vuelos
Se requiere desarrollar una programa en Java que permita filtrar una lista de vuelos según distintos criterios de búsqueda basados en fechas y que se puedan ver en la terminal.

Requisitos


**1.Definir constantes de fecha en Main:**

Se deben definir dos constantes de fecha en la Clase Main. Te serviran para declarar la fecha de inicio y la fecha fin (fechaInicio, fechaFin ), ten en cuenta que podrian ser nulas tambien.



**2.Estructura del objeto Vuelo:**


id (int) - No importa el orden de la secuencia

nombreVuelo (String) - Nombres que tu quieras. Ej. (H001-V)

empresa (String) - Aerolineas Reales que tu quieras. Ej. (Iberia, Turkish)

lugarSalida (String) - Ciudades más importantes Ej. (Madrid, Barcelona)

lugarLlegada (String) - Ciudades más importantes Ej. (Buenos Aires, New York)

fechaSalida (LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. LocalDate.of(2025, 5, 20)

fechaLlegada (LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. LocalDate.of(2025, 5, 20)



**3. Función de filtrado (comprobar solo la fechaSalida del vuelo):**

Si no se envía la fechaInicio, el filtro debe devolver todos los vuelos hasta la fecha fechaFin.
Si no se envía la fechaFin, el filtro debe devolver todos los vuelos desde la fecha fechaInicio en adelante.
Si se envían ambas fechas, debe devolver los vuelos que se encuentren dentro de ese rango de fechas.
Si no se envía ninguna fecha, debe devolver todos los vuelos.
Devolver siempre los vuelos ordenados por fechaSalida.



**4. Crear en Main una lista de 10 vuelos de prueba.**


**5. Imprimir los vuelos en Main.**


**6 .Recomendaciones:**

Crear un package llamado entities para que crees tu entidad Vuelo.
Crear un package llamado utils para que crees tu clase utilitaria para la función de filtro.

**Consideraciones extras de corrección**
Durante la corrección de cada prueba técnica se considerarán/tendrán en cuenta los siguientes aspectos:


Estructura del Proyecto: Organización del proyecto de manera lógica y estructurada.

Nombres de Variables y Métodos Significativos: Utilización de nombres de variables y métodos descriptivos que reflejen su propósito.

División de Responsabilidades: Seguir el principio de responsabilidad única, donde cada clase o método realiza una tarea específica. Evita la creación de clases o métodos excesivamente grandes y complejos.

Comentarios Significativos: Proporcionar comentarios en el código para explicar la lógica compleja o las decisiones importantes. Los comentarios deben ser claros y concisos.

Refactorización: Evitar código duplicado o estructuras redundantes. Realizar refactorizaciones para mantener el código limpio y eficiente.

Cumplimiento de Convenciones de Codificación: Seguir las convenciones de codificación de Java, incluyendo el estilo de nombres de variables (camelCase), y las reglas de organización de código.

Documentación de Métodos y Clases: Proporciona documentación para los métodos y clases públicos, explicando su propósito y cómo se utilizan.