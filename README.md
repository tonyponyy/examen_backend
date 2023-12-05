# examen_backend

## Requisitos Funcionales

### RF.1 Registro de Usuarios
Los usuarios deben poder registrarse en la aplicación proporcionando un nombre de usuario y contraseña.

- **Endpoint:** `POST http://localhost:8080/auth/signup`
  
  ```json
  {
      "name": "tony",
      "email": "test@test.com",
      "password": "12345678"
  }
  ```

  **Respuesta:**
  El mismo objeto.

### RF.2 Autenticación de Usuarios
Los usuarios deben poder iniciar sesión en la aplicación.

- **Endpoint:** `POST http://localhost:8080/auth/login`
  
  ```json
  {
      "userName": "test@test.com",
      "password": "12345678"
  }
  ```

  **Respuesta:**
  ```json
  {
      "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0QHRlc3QuY29tIiwiaWF0IjoxNzAxNzk0NDQ1LCJleHAiOjE3MDE5NzQ0NDV9.NLJkR9NDYfEC37rUi-jIumWjX2NL4K0aHZYSqb-gWzI"
  }
  ```

### RF.3 Creación de Partidas (Grupos)
Los usuarios deben poder crear partidas (grupos) para un videojuego específico.

- **Endpoint:** `POST http://localhost:8080/partys/add`
  
  ```json
  {
    "title": "Zelda 2",
    "creator": {
      "id": 1
    },
    "game": {
      "id": 1,
      "name": "Zelda"
    },
    "description": "las aventuras de zelda"
  }
  ```

  **Respuesta:**
  El mismo objeto.

### RF.8 Modificación de Datos de Perfil
Los usuarios pueden introducir y modificar sus datos de perfil, como su usuario de Steam.

- **Endpoint:** `POST http://localhost:8080/users/update`
  
  ```json
  {
    "id": 0,
    "name": "string",
    "password": "string",
    "email": "string",
    "role": "string",
    "id_steam": "string"
  }
  ```

  **Respuesta:**
  El mismo objeto.
