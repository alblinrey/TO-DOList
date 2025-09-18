# 📝 TO-DOList

Aplicación **To-Do List** construida con **Spring Boot**, que permite gestionar usuarios y sus tareas pendientes.  
Este proyecto tiene como objetivo ser una base sólida para practicar conceptos de **Java + Spring**, documentación con **Swagger**, y diseño de entidades simples como **Usuario** y **Tarea**.

---

## 🚀 Tecnologías usadas

- **Java 21**  
- **Spring Boot** (Web, Data JPA, Validation)
- **Lombok** (para reducir boilerplate en entidades y servicios)
- **Swagger / Springdoc OpenAPI**  
- **H2 Database** (en memoria para desarrollo)  
- **Maven** como gestor de dependencias  

---

## 📂 Estructura del proyecto

```plaintext
├── controller        # Controladores REST
├── entity             # Clases de entidad (Usuario, Tarea)
├── repository        # Interfaces de acceso a datos (JPA)
├── service           # Lógica de negocio
└── SpringToDoApplication.java
```

## 📖 Endpoints principales

La API se documenta automáticamente con **Swagger**.  
Una vez corriendo la app, puedes acceder a:

👉 `http://localhost:8080/swagger-ui/index.html`

Ejemplo de endpoints:
- `POST /usuarios` → Crear un nuevo usuario  
- `GET /usuarios` → Listar usuarios  
- `POST /tareas` → Crear tarea  
- `GET /tareas?usuarioId={id}` → Listar tareas por usuario  
- `PUT /tareas/{id}` → Actualizar tarea  
- `DELETE /tareas/{id}` → Eliminar tarea  

---

## 🚧 Proyecto en proceso de creación 🙂 🏗️
