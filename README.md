# 📱 Laboratorio Calificado 03 - Lista de Profesores

## 📋 Descripción

Aplicación Android desarrollada en **Kotlin** que consume una API REST para mostrar una lista de profesores. La aplicación permite visualizar información detallada de cada profesor y realizar acciones como hacer llamadas telefónicas y enviar correos electrónicos.

## 🎯 Características Principales

- ✅ **Consumo de API REST** usando Retrofit
- ✅ **Lista dinámica** con RecyclerView
- ✅ **ViewBinding** para manejo seguro de vistas
- ✅ **Interfaz responsiva** y moderna
- ✅ **Funcionalidades interactivas**:
  - Click simple: Realizar llamada telefónica
  - Click largo: Enviar correo electrónico
- ✅ **Carga de imágenes** desde URL
- ✅ **Manejo de errores** en peticiones HTTP

## 🛠️ Tecnologías Utilizadas

### Lenguaje de Programación
- **Kotlin** - Lenguaje principal de desarrollo

### Librerías y Dependencias
- **Retrofit 2** - Cliente HTTP para consumo de APIs
- **Gson** - Serialización/deserialización JSON
- **RecyclerView** - Componente de lista eficiente
- **ViewBinding** - Vinculación de vistas type-safe
- **Material Design Components** - Componentes de diseño

### Herramientas de Desarrollo
- **Android Studio** - IDE de desarrollo
- **Gradle** - Sistema de construcción
- **Git** - Control de versiones

## 📊 API Utilizada

**Endpoint:** `https://private-effe28-tecsup1.apiary-mock.com/list/teacher`

### Estructura de Respuesta
```json
{
  "teachers": [
    {
      "id": 1,
      "name": "Nombre",
      "lastname": "Apellido",
      "phone": "999999999",
      "email": "profesor@email.com",
      "imageUrl": "https://ejemplo.com/imagen.jpg"
    }
  ]
}
```

## 🏗️ Arquitectura del Proyecto

```
app/
├── src/main/java/com/apellido/nombre/laboratoriocalificado03/
│   ├── Ejercicio01.kt                 # Activity principal
│   ├── models/
│   │   ├── Teacher.kt                 # Modelo de datos del profesor
│   │   └── TeacherResponse.kt         # Modelo de respuesta de la API
│   ├── adapters/
│   │   └── TeacherAdapter.kt          # Adaptador del RecyclerView
│   └── network/
│       └── RetrofitInstance.kt        # Configuración de Retrofit
├── src/main/res/
│   ├── layout/
│   │   ├── activity_ejercicio01.xml   # Layout principal
│   │   └── item_teacher.xml           # Layout de cada item
│   └── values/
│       └── strings.xml                # Strings encapsulados
```

## 🚀 Instalación y Configuración

### Prerrequisitos
- **Android Studio** 4.0 o superior
- **SDK de Android** API 24 (Android 7.0) o superior
- **Kotlin** 1.5 o superior
- **Gradle** 7.0 o superior

### Pasos de Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Vania-0731/lab3-PM-calificado.git
   ```

2. **Abrir en Android Studio:**
   - File → Open → Seleccionar la carpeta del proyecto

3. **Sincronizar dependencias:**
   - Android Studio sincronizará automáticamente las dependencias de Gradle

4. **Configurar dispositivo:**
   - Conectar dispositivo Android físico, o
   - Configurar emulador Android (API 24+)

5. **Ejecutar la aplicación:**
   - Clic en el botón "Run" o usar `Shift + F10`

## 📱 Funcionalidades

### 1. Lista de Profesores
- Muestra todos los profesores obtenidos de la API
- Cada item contiene: foto, nombre, apellido
- Diseño responsivo y moderno

### 2. Interacciones
- **Click Simple**: Abre el marcador telefónico con el número del profesor
- **Click Largo**: Abre el cliente de correo con el email del profesor prellenado

### 3. Manejo de Errores
- Validación de conexión a internet
- Manejo de errores de la API
- Feedback visual al usuario

## 🎨 Diseño de Interfaz

### Componentes Utilizados
- **RecyclerView** - Lista eficiente y reciclable
- **CardView** - Tarjetas para cada profesor
- **ImageView** - Visualización de fotos
- **TextView** - Información textual
- **Material Design** - Siguiendo las guías de diseño de Google

### Características de Diseño
- **Responsivo** - Se adapta a diferentes tamaños de pantalla
- **Moderno** - Uso de Material Design
- **Intuitivo** - Navegación clara y accesible

## 🧪 Testing

### Dispositivos Probados
- **Emulador Android** (API 24, 28, 30)
- **Dispositivos físicos** con Android 7.0+

### Casos de Prueba
- ✅ Consumo exitoso de API
- ✅ Manejo de errores de red
- ✅ Funcionalidad de llamadas
- ✅ Funcionalidad de correos
- ✅ Interfaz responsiva

## 📋 Requisitos del Sistema

### Mínimos
- **Android 7.0** (API 24) o superior
- **RAM:** 2GB mínimo
- **Almacenamiento:** 50MB disponibles
- **Conexión a Internet** para cargar datos

### Recomendados
- **Android 9.0** (API 28) o superior
- **RAM:** 4GB o más
- **Conexión WiFi** para mejor rendimiento

## 🤝 Contribuciones

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -m 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto es parte del **Laboratorio Calificado 03** del curso de Programación Móvil - TECSUP.

## 👨‍💻 Desarrollador

**Estudiante:** Sifuentes Carranza Sonaly Vania 
**Curso:** Programación Móvil  
**Institución:** TECSUP  
**Ciclo:** 4

## 📞 Contacto

Si tienes dudas o sugerencias sobre el proyecto:
- **Email:** sonaly.sifuentes@tecsup.edu.pe
- **GitHub:** [Vania-0731](https://github.com/Vania-0731)

---

⭐ **¡No olvides dar una estrella al proyecto si te fue útil!** ⭐
