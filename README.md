# FitFocus 

FitFocus es una aplicación móvil para Android diseñada para ayudar a los usuarios a planificar, seguir y realizar sus rutinas de ejercicio de manera optimizada. 
La aplicación proporciona guías detalladas mediante imágenes y videos explicativos paso a paso para cada ejercicio, garantizando una técnica correcta en cada sesión de entrenamiento.

### Estructura del Proyecto

El proyecto sigue la arquitectura nativa de Android, manteniendo la separación entre la lógica de negocio y la interfaz gráfica:

```text
FitFocus/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/diseofitfocuss/
│           │   ├── LoginActivity.kt        # Vista de inicio de sesión de usuarios
│           │   ├── RegisterActivity.kt     # Vista de registro de nuevos usuarios
│           │   ├── MainActivity.kt         # Pantalla principal (Dashboard y accesos rápidos)
│           │   ├── RoutinesActivity.kt     # Listado y gestión de rutinas de entrenamiento
│           │   ├── CalendarActivity.kt     # Calendario y programación de sesiones
│           │   └── ProfileActivity.kt      # Perfil de usuario, estadísticas y cierre de sesión
│           │
│           ├── res/                        # Recursos de la interfaz gráfica
│           │   ├── drawable/               # Botones, bordes, fondos neón e íconos personalizados
│           │   │   ├── bg_bottom_nav.xml
│           │   │   ├── bg_button_danger_border.xml
│           │   │   ├── bg_button_green.xml
│           │   │   ├── bg_card_border.xml
│           │   │   ├── bg_card_subtle.xml
│           │   │   └── bg_input.xml
│           │   ├── layout/                 # Vistas XML de la interfaz gráfica
│           │   │   ├── activity_login.xml
│           │   │   ├── activity_register.xml
│           │   │   ├── activity_main.xml
│           │   │   ├── activity_routines.xml
│           │   │   ├── activity_routine_detail.xml
│           │   │   ├── activity_add_routine.xml
│           │   │   ├── activity_calendar.xml
│           │   │   ├── activity_profile.xml
│           │   │   └── layout_bottom_nav.xml
│           │   ├── values/                 # Paleta de colores (tema neón oscuro), estilos y fuentes
│           │   └── mipmap/                 # Íconos y assets del lanzador de la aplicación
│           │
│           └── AndroidManifest.xml         # Configuración global de la app y registro de actividades
