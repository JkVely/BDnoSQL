
<div align="center">
	<h1>Gestor de Bases de Datos No Relacional</h1>
	<b>Ciencias de la Computación, 2025</b>
    <br/><br/>
	<a href="https://maven.apache.org/"><img src="https://img.shields.io/badge/build-maven-blue.svg" alt="Maven Build"></a>
	<a href="https://www.oracle.com/java/technologies/downloads/"><img src="https://img.shields.io/badge/java-17%2B-blue.svg" alt="Java 17+"/></a>
	<a href="LICENSE"><img src="https://img.shields.io/badge/license-MIT-green.svg" alt="License"></a>
</div>

Este proyecto es un gestor de bases de datos NoSQL en Java, que almacena objetos en formato JSON y utiliza un árbol AVL autobalanceado para la indexación eficiente por clave principal. La persistencia se realiza en archivos de texto plano (.json).

## Características principales

- Almacenamiento, consulta, actualización y eliminación de objetos JSON.
- Indexación eficiente mediante árbol AVL implementado desde cero.
- Persistencia en archivos de texto plano.
- Operaciones CRUD y consultas por criterios.

## Estructura del Proyecto

<!--TODO: Diagrama-->

## Requisitos

- Java 21 (Ultimo LTS) o superior
- Maven 3.8 o superior

## Instrucciones de uso

1. Clona el repositorio:
	```sh
	git clone <url-del-repositorio>
	```
2. Accede a la carpeta del proyecto:
	```sh
	cd ProyectoFinal
	```
3. Compila y ejecuta las pruebas:
	```sh
	mvn clean install
	```

## Flujo de trabajo y buenas prácticas

- Cada nueva funcionalidad se implementa en una rama y se integra mediante un commit separado.
- Consulta `TODO.md` para ver el progreso y las siguientes etapas.
- Sigue las convenciones de nombres y mantén el código documentado.
- Realiza pruebas unitarias para cada módulo implementado.

## Dockerización

Al finalizar el desarrollo, el proyecto será dockerizado para facilitar su despliegue y pruebas en cualquier entorno.

---

## Autores

| Nombre | Código |
|---|---|
| Nicole Daza | |
| Juan Carlos Quintero | 20232020172 |
| Juan David Avila | |
| Brayan Castro | |

---
