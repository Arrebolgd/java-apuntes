# Examen 1ª Evaluación 2024 - Programación Java

## Contexto

La **Agencia Nacional de Ciberseguridad (ANC)** se enfrenta a un aumento de ciberataques y necesita mejorar sus métodos de protección. Como parte del equipo de desarrollo, tu tarea es crear un sistema de seguridad para analizar los intentos de acceso y otros parámetros.

El programa debe mostrar un menú principal indefinidamente hasta que se elija **Salir**.

### Menú Principal

```text
Bienvenid@ al Sistema de la ANC
Selecciona una opción:
1. Iniciar Sesión
2. Cifrar un Mensaje (Cifrado César)
3. Generar una Contraseña Segura
4. Informe de actividades sospechosas
5. Salir
> 
```

---

## Funcionalidades Detalladas

### 1. Iniciar Sesión
Esta función permite realizar un inicio de sesión con una contraseña predefinida.

* **Contraseña correcta:** `D6a1M24` (este valor debes guardarlo en una constante).
* Si el agente introduce la contraseña correcta, podrá acceder al sistema.
* Se permiten hasta **tres intentos fallidos**, indicando cada vez los intentos que restan.
* Si los intentos se agotan, se bloquea el acceso y se vuelve al menú.

**Ejemplo de ejecución (Bloqueo):**

```text
Introduce la contraseña: 12345
Contraseña incorrecta. Intentos restantes: 2
Introduce la contraseña:
Contraseña incorrecta. Intentos restantes: 1
Acceso bloqueado. Contacte con el administrador.
```

---

### 2. Cifrar un Mensaje (Cifrado César)
El cifrado de César mueve cada letra un número de posiciones en el alfabeto.

* **Alfabeto:** `ABCDEFGHIJKLMNOPQRSTUVWXYZ`.
* **Restricción:** El programa debe realizarse **sin utilizar arrays**.
* Se pide el texto y la clave de desplazamiento (entero positivo).
* Si el desplazamiento excede la 'z', debe continuar desde la 'a'.
* Los caracteres que no sean letras (como espacios o puntuación) deben permanecer sin cambios.

**Ejemplo de ejecución:**

```text
Introduce el texto que vas a encriptar:
hola
Introduce el desplazamiento
3
El mensaje cifrado: KROD
```

---

### 3. Generar una Contraseña Segura
El programa debe generar una contraseña aleatoria.

* **Caracteres permitidos:**
    * Mayúsculas: `ABCDEFGHIJKLMNOPQRSTUVWXYZ`.
    * Minúsculas: `abcdefghijklmnopqrstuvwxyz`.
    * Números: `123456789`.
    * Especiales: `@#$%&!`.
* **Requisito:** Debe tener al menos una letra mayúscula, un número y un carácter especial.
* **Longitud:** Entre 8 y 20 caracteres (introducido por el usuario).

**Ejemplo de ejecución:**

```text
Introduce la longitud de la contraseña (8-20): 10
Contraseña generada: E415Fz8d8U
```

---

### 4. Informe de actividades sospechosas
El sistema registra intentos de acceso fallidos. Debes procesar los siguientes datos fijos (disponibles en el momento):

| Agente | Intentos fallidos |
| :--- | :--- |
| Hermione | 2 |
| Harry | 3 |
| Draco | 6 |
| Ron | 4 |
| Luna | 3 |
| Sirius | 1 |
| Dobby | 3 |

[cite: 117]

**El programa debe realizar lo siguiente:**
1.  Mostrar el **total** de intentos fallidos.
2.  Mostrar la **media** de intentos y cuántos agentes están por encima de ella.
3.  Clasificar la actividad de cada agente:
    * **Normal:** Menos de 3 intentos fallidos.
    * **Sospechosa:** Entre 3 y 5 intentos fallidos.
    * **Crítica:** Más de 5 intentos fallidos.

**Ejemplo de Salida:**

```text
Se han realizado un total de 22 intentos fallidos. La media es de 3.14 intentos fallidos por persona.
2 usuarios están por encima de esa media

Intentos normales:
[Hermione 2 intentos, Sirius 1 intentos]

Intentos sospechosos:
[Harry 3 intentos, Ron 4 intentos, Luna 3 intentos, Dobby 3 intentos]

Intentos críticos:
[Draco 6 intentos]
```

---

### 5. Salir
Se mostrará mensaje de cierre y dejará de mostrarse el menú.

**Ejemplo:**

```text
> 5
Se ha salido del sistema de manera segura.
```