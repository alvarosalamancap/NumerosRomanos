
# API REST para Operaciones con Números Romanos 
Proyecto realizado por el estudiante Alvaro Salamanca Peña de IenCI.

Este proyecto es una API REST desarrollada en Java utilizando [Javalin](https://javalin.io/). La API permite realizar operaciones matemáticas (suma y multiplicación) con números romanos.

## Funcionalidades

La API expone las siguientes rutas vía métodos GET:

### 1. Suma de Números Romanos
- **Ruta**: `/romanos/suma/{a}/{b}`
- **Descripción**: Suma dos números romanos y devuelve el resultado también en números romanos.
- **Ejemplos**:
  - `/romanos/suma/xx/xxx` → `l`
  - `/romanos/suma/lxx/xx` → `xc`
  - `/romanos/suma/xx/-x` → `x`
  - `/romanos/suma/dccc/-ccl` → `dl`

### 2. Multiplicación de Números Romanos
- **Ruta**: `/romanos/multiplicacion/{a}/{b}`
- **Descripción**: Multiplica dos números romanos y devuelve el resultado también en números romanos.
- **Ejemplos**:
  - `/romanos/multiplicacion/xv/ii` → `xxx`
  - `/romanos/multiplicacion/d/ii` → `m`
  - `/romanos/multiplicacion/cl/iii` → `cdl`
  - `/romanos/multiplicacion/ii/l` → `c`

## Requisitos Técnicos

- **Lenguaje**: Java (compatible con Kotlin).
- **Framework**: [Javalin](https://javalin.io/).
- **IDE**: IntelliJ IDEA.
- **Control de Versiones**: Git (repositorio privado en GitHub).
- **Formato de Commits**: [Conventional Commits](https://www.conventionalcommits.org/).
- **Estándar de Código**: [Guía de Estilo de Java de Google](https://google.github.io/styleguide/javaguide.html).
- **Formato de Código**: [Plugin Google Java Format](https://plugins.jetbrains.com/plugin/8527-google-java-format).

## Instalación y Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/alvarosalamancap/NumerosRomanos

