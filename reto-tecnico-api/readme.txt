reto-tecnico-api

- Está corriendo sobre jdk11 y maven 3.6.3
- Instalar dependencias: mvn install
- Ubicarse en el proyecto reto-tecnico-api: cd reto-tecnico-api
- Instalar las dependencias: mvn install -DskipTests
- Ejecutar test a demanda: mvn clean verify -Dkarate.env=qa -Dkarate.options="--tags @testAll"
- Se esta cargando al repositorio el reporte generado por el proyecto

