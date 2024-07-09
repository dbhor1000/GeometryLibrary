Данный проект представляет из себя библиотеку классов и методов для работы с геометрическими
фигурами. Библиотека доступна для подключения к другим проектам через
pom.xml:

    <dependencies>
        <dependency>
            <groupId>GeometryDev</groupId>
            <artifactId>GeometryLibraryBase</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>GeometryDev</groupId>
            <artifactId>GeometryUtils</artifactId>
            <version>1.1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>

Установка в локальный репозиторий <USER>/.m2/repository/GeometryDev с помощью
стандартной команды mvn clean install.

или же, при наличии файлов .JAR через -> Project Structure -> Modules.
При добавлении в новый проект, библиотека работоспособна.

Текущая версяя приложения: 1.0-SNAPSHOT
Модуль GeometryLibraryBase: 1.0-SNAPSHOT
Модуль GeometryUtils: 1.0-SNAPSHOT -> 1.1.0-SNAPSHOT.