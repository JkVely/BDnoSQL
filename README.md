<div align="center">

<img src="https://img.shields.io/badge/NoSQL-Database%20Manager-89b4fa?style=for-the-badge&labelColor=1e1e2e" alt="NoSQL Database Manager"/>

<br/><br/>

<h1>Gestor de Bases de Datos No Relacional</h1>

<h4>Sistema de almacenamiento de documentos JSON con indexacion mediante arboles AVL autobalanceados</h4>

<br/>

<a href="https://maven.apache.org/"><img src="https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven"></a>
<a href="https://www.oracle.com/java/technologies/downloads/"><img src="https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21"/></a>
<a href="https://openjfx.io/"><img src="https://img.shields.io/badge/JavaFX-21-3a75b0?style=for-the-badge&logo=java&logoColor=white" alt="JavaFX 21"/></a>
<a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-a6e3a1?style=for-the-badge" alt="License"></a>

<br/><br/>

<img src="https://img.shields.io/badge/Universidad%20Nacional%20de%20Colombia-Ciencias%20de%20la%20Computacion-f9e2af?style=flat-square&labelColor=1e1e2e" alt="UNAL"/>

<br/><br/>

<a href="#acerca-del-proyecto">Acerca</a>
<span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
<a href="#caracteristicas">Caracteristicas</a>
<span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
<a href="#arquitectura">Arquitectura</a>
<span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
<a href="#instalacion">Instalacion</a>
<span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
<a href="#uso">Uso</a>
<span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
<a href="#api-del-arbol-avl">API</a>
<span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
<a href="#autores">Autores</a>

</div>

<br/>

<div align="center">
<pre>
┌─────────────────────────────────────────────────────────────────┐
│                                                                 │
│     ██████╗ ██████╗ ███╗   ██╗ ██████╗ ███████╗ ██████╗ ██╗     │
│     ██╔══██╗██╔══██╗████╗  ██║██╔═══██╗██╔════╝██╔═══██╗██║     │
│     ██████╔╝██║  ██║██╔██╗ ██║██║   ██║███████╗██║   ██║██║     │
│     ██╔══██╗██║  ██║██║╚██╗██║██║   ██║╚════██║██║▄▄ ██║██║     │
│     ██████╔╝██████╔╝██║ ╚████║╚██████╔╝███████║╚██████╔╝███████╗│
│     ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚══════╝ ╚══▀▀═╝ ╚══════╝│
│                                                                 │
│              AVL Tree Indexed Document Storage                  │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘
</pre>
</div>

---

## Acerca del Proyecto

> **NoSQL Database Manager** es un gestor de bases de datos no relacional desarrollado en Java, que utiliza **arboles AVL autobalanceados** como estructura de indexacion primaria.

El sistema almacena documentos en formato JSON y proporciona una interfaz grafica moderna construida con JavaFX. Fue desarrollado como parte del curso de **Ciencias de la Computacion** de la Universidad Nacional de Colombia.

<br/>

<div align="center">
<table>
<tr>
<td align="center"><strong>Complejidad O(log n)</strong></td>
<td align="center"><strong>Persistencia JSON</strong></td>
<td align="center"><strong>Interfaz Moderna</strong></td>
<td align="center"><strong>100% Java</strong></td>
</tr>
<tr>
<td align="center">Operaciones CRUD eficientes<br/>con arbol autobalanceado</td>
<td align="center">Almacenamiento en archivos<br/>de texto plano</td>
<td align="center">Visualizacion interactiva<br/>del arbol AVL</td>
<td align="center">Sin dependencias<br/>externas de BD</td>
</tr>
</table>
</div>

---

## Caracteristicas

<table>
<tr>
<td width="50%" valign="top">

### Motor de Base de Datos

| Caracteristica | Descripcion |
|:--------------|:------------|
| **Documentos JSON** | Almacenamiento flexible de datos |
| **Arbol AVL** | Indexacion O(log n) garantizada |
| **Persistencia** | Guardado automatico en .json |
| **CRUD Completo** | Create, Read, Update, Delete |
| **Busqueda Avanzada** | Por campo o predicado |

</td>
<td width="50%" valign="top">

### Interfaz Grafica

| Caracteristica | Descripcion |
|:--------------|:------------|
| **Visualizacion** | Arbol AVL interactivo |
| **Zoom/Pan** | Navegacion fluida |
| **Animaciones** | Feedback visual de operaciones |
| **Detalles** | Panel informativo del nodo |
| **Validacion** | Sintaxis JSON en tiempo real |

</td>
</tr>
</table>

---

## Arquitectura

<details>
<summary><strong>Ver estructura del proyecto</strong></summary>

<br/>

```
src/main/java/com/nosqlmanager/
│
├── App.java                     # Punto de entrada
│
├── tree/                        # Arbol AVL
│   ├── AVLTree.java            # Implementacion generica
│   └── AVLNode.java            # Nodo con altura y balance
│
├── model/                       # Modelos
│   └── JsonDocument.java       # Documento JSON
│
├── manager/                     # Logica de negocio
│   └── DatabaseManager.java    # Gestor principal
│
├── repository/                  # Acceso a datos
│   └── DocumentRepository.java # Interfaz
│
├── storage/                     # Persistencia
│   └── JsonFileStorage.java    # Almacenamiento
│
└── gui/                         # Interfaz grafica
    ├── MainView.java           # Vista principal
    └── TreeVisualizer.java     # Visualizador
```

</details>

<br/>

<div align="center">

```
┌──────────────────┐         ┌──────────────────┐         ┌──────────────────┐
│                  │         │                  │         │                  │
│     MainView     │────────▶│ DatabaseManager  │────────▶│     AVLTree      │
│    (JavaFX)      │         │    (CRUD)        │         │   (Indexacion)   │
│                  │         │                  │         │                  │
└──────────────────┘         └────────┬─────────┘         └──────────────────┘
                                      │
                                      ▼
                             ┌──────────────────┐
                             │                  │
                             │ JsonFileStorage  │
                             │  (Persistencia)  │
                             │                  │
                             └──────────────────┘
```

</div>

---

## Instalacion

### Requisitos Previos

<div align="center">

| | Requisito | Version | Descarga |
|:---:|:----------|:-------:|:--------:|
| <img src="https://img.shields.io/badge/-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white"/> | Java JDK | `21+` | [oracle.com](https://www.oracle.com/java/technologies/downloads/) |
| <img src="https://img.shields.io/badge/-Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white"/> | Apache Maven | `3.8+` | [maven.apache.org](https://maven.apache.org/download.cgi) |
| <img src="https://img.shields.io/badge/-Git-F05032?style=flat-square&logo=git&logoColor=white"/> | Git | `2.0+` | [git-scm.com](https://git-scm.com/downloads) |

</div>

<br/>

### Pasos de Instalacion

**1. Clonar el repositorio**

```bash
git clone https://github.com/JkVely/BDnoSQL.git
cd BDnoSQL
```

**2. Verificar requisitos**

```bash
java --version    # Debe mostrar version 21 o superior
mvn --version     # Debe mostrar version 3.8 o superior
```

**3. Compilar el proyecto**

```bash
mvn clean compile
```

**4. Ejecutar las pruebas**

```bash
mvn test
```

---

## Uso

### Ejecutar la Aplicacion

```bash
mvn javafx:run
```

### Interfaz Grafica

![Interfaz Grafica](docs/img/screenshot.png)

### Controles de Navegacion

<div align="center">

| Accion | Control | Descripcion |
|:------:|:-------:|:------------|
| Zoom | `Ctrl` + `Scroll` | Acercar o alejar la vista del arbol |
| Mover | `Click Derecho` + `Arrastrar` | Desplazar el canvas |
| Seleccionar | `Click Izquierdo` | Ver detalles del nodo |
| Reset | Boton `⟲` | Restablecer zoom y posicion |

</div>

---

## Estructura JSON

<center>
<table>
<tr>
<td width="50%">

### Documento Individual

```json
{
    "nombre": "Juan",
    "edad": 25,
    "activo": true
}
```

</td>
<td width="50%">

### Base de Datos

```json
[ {
  "id" : 2,
  "data" : {
    "nombre" : "gio",
    "codigo" : 180
  }
},
...
]
```

</td>
</tr>
</table>
</center>

---

## Pruebas

```bash
mvn test                              # Ejecutar pruebas
mvn test -Dsurefire.useFile=false     # Con reporte detallado
```

<div align="center">

| Componente | Tests | Estado |
|:-----------|:-----:|:------:|
| AVLTree - Insercion | 5 | ![Passed](https://img.shields.io/badge/-Passed-a6e3a1?style=flat-square) |
| AVLTree - Eliminacion | 4 | ![Passed](https://img.shields.io/badge/-Passed-a6e3a1?style=flat-square) |
| AVLTree - Balanceo | 3 | ![Passed](https://img.shields.io/badge/-Passed-a6e3a1?style=flat-square) |
| DatabaseManager - CRUD | 4 | ![Passed](https://img.shields.io/badge/-Passed-a6e3a1?style=flat-square) |
| DatabaseManager - Busqueda | 3 | ![Passed](https://img.shields.io/badge/-Passed-a6e3a1?style=flat-square) |

</div>

---

## Stack Tecnologico

<div align="center">

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/JavaFX-3a75b0?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white"/>
<img src="https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white"/>

<img src="https://img.shields.io/badge/Jackson-000000?style=for-the-badge&logo=json&logoColor=white"/>
<img src="https://img.shields.io/badge/Lombok-BC4521?style=for-the-badge&logo=lombok&logoColor=white"/>
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white"/>
<img src="https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white"/>

</div>

---

## Autores

<div align="center">

| | Nombre | codigo |
|:---:|:---:|:---:|
| ![Nicole Daza badge](https://img.shields.io/badge/-ND-89b4fa?style=for-the-badge&logoColor=white) | **Nicole Daza** | |
| [![Juan Carlos Quintero badge](https://img.shields.io/badge/-JQ-a6e3a1?style=for-the-badge&logoColor=white)](https://www.github.com/JkVely) | **Juan Carlos Quintero** | `20232020172` |
| ![Juan David Avila badge](https://img.shields.io/badge/-JA-f9e2af?style=for-the-badge&logoColor=white) | **Juan David Avila** | |
| ![Brayan Castro badge](https://img.shields.io/badge/-BC-f38ba8?style=for-the-badge&logoColor=white) | **Brayan Castro** | |

</div>

---
