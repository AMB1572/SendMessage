# Registro de Cambios (Changelog)

Todos los cambios notables en este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/es-ES/1.0.0/) y este proyecto adhiere a [Semantic Versioning](https://semver.org/lang/es/).

---

## [1.0.0] - 2026-09-29

### Añadido
- **Paso de Datos Completo**: Implementación de la transferencia de mensajes mediante `Intent` con `Bundle` entre `SendMessageActivity` y `ViewMessageActivity`.
- **Clave de Mensaje Consistente**: Definición de la constante/clave `"KEY_MESSAGE"` para el intercambio seguro de cadenas de texto.
- **Documentación Técnica Generada**:
  - Creación del archivo `README.md` con explicación detallada de arquitectura, decisiones de diseño, evidencias de Logcat y acceso a `/data/data/`.
  - Creación del archivo `CHANGELOG.md` documentando el historial de versiones del proyecto.
  - Enlaces a la documentación oficial de Android Developer.

### Cambios
- Ajustes de diseño e integración de la interfaz `ViewMessageActivity` para presentar correctamente el texto recibido.

---

## [0.1.0] - 2026-09-29

### Añadido
- **Configuración Inicial del Proyecto**:
  - Estructura base del proyecto Gradle en Kotlin (`com.example.sendmessage`).
  - Creación de la clase `SendMessageApplication` heredada de `Application`.
- **Diseño de Pantallas (UI Layouts)**:
  - `SendMessageActivity`: Actividad principal configurada en `AndroidManifest.xml` como vista de inicio (`LAUNCHER`).
  - `ViewMessageActivity`: Actividad secundaria para visualización de contenidos.
  - Diseños XML creados (`activity_send_message.xml` y `activity_view_message.xml`) utilizando componentes `LinearLayout`, `TextView`, `EditText`, `ImageView` y `Button`.
- **Recursos del Proyecto**:
  - Definición de cadenas localizables en `strings.xml`.
  - Inclusión de fuente tipográfica personalizada `bright_sunlist.otf`.
  - Iconos y recursos vectoriales (`ic_settings`, `ic_launcher`).
