# FitFocus 

FitFocus es una aplicación móvil para Android diseñada para ayudar a los usuarios a planificar, seguir y realizar sus rutinas de ejercicio de manera optimizada. 
La aplicación proporciona guías detalladas mediante imágenes y videos explicativos paso a paso para cada ejercicio, garantizando una técnica correcta en cada sesión de entrenamiento.

---------------
## Estructura del Proyecto

El proyecto sigue la arquitectura nativa de Android, manteniendo la separación entre la lógica de negocio y la interfaz gráfica:

```text
FitFocus/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/disenofitfocuss/
│   │       │   ├── RegisterActivity.kt    # Vista inicial: registro de nuevos usuarios
│   │       │   ├── LoginActivity.kt       # Inicio de sesión de usuarios existentes
│   │       │   └── MainActivity.kt        # Pantalla principal (Dashboard y menú de navegación)
│   │       │
│   │       └── res/                       # Recursos de la interfaz gráfica
│   │           ├── drawable/              # Botones, fondos personalizados e ícono de la app
│   │           ├── layout/                # Vistas XML (activity_register, activity_login, activity_main)
│   │           ├── values/                # Paleta de colores, estilos del tema neón y fuentes
│   │           └── mipmap/                # Assets del lanzador de la aplicación
│   │
│   └── AndroidManifest.xml                # Configuración global de la app y flujo de pantallas
