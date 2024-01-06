reto-tecnico-ux

- Está corriendo sobre jdk11 y maven 3.6.3
- Instalar dependencias: mvn install
- Hay 2 test e2e creados, los 2 hacen el mismo flujo pero se han escrito de diferente manera(imperativo y declarativo)
- Ubicarse en el proyecto reto-tecnico-api: cd reto-tecnico-ux
- Instalar las dependencias: mvn install -DskipTests
- Ejecutar test a demanda: mvn clean verify -Dcucumber.options="--tags @gherkin_declarativo"
- Para fines de revisión, se esta cargando al repositorio el reporte generado por el proyecto (Carpeta target)

