# TesteJoaoJunior

Add this plugin:
```xml
<plugin>
	<groupId>com.zenjava</groupId>
	<artifactId>javafx-maven-plugin</artifactId>
	<version>8.8.3</version>
	<configuration>
	       <mainClass>com.test.MainWindow</mainClass>
		<nativeInstallers/>
	</configuration>
</plugin>
```
it serves to create javafx executable jar with maven, configure according to your need and when you want to run, use the goal jfx: run to execute and jfx: jar, to create your jar, it will meet in target / jfx / app / * .jar

