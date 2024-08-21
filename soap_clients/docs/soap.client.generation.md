This document describes topics, related to soap client generation and WS SPI provider choice. 
The tasks, controlled via the configuration in `pom.xml`

### Issues to consider for soap client generation

1. [Find wsdl file, provided by the soap service.](#find-wsdl-file-provided-by-the-soap-service)
2. [Ways to generate soap code based on wsdl file](#ways-to-generate-soap-code-based-on-wsdl-file)
3. [Generated code location](#generated-code-location)
4. [Fluent Api generation](#fluent-api-generation)
5. [Several soap clients generating based on different wsdl files](#several-soap-clients-generating-based-on-different-wsdl-files)
6. [Jakarta Ws Api support](#jakarta-ws-api-support)
7. [WS SPI Provider choice](#ws-spi-provider)

### Find wsdl file, provided by the soap service.

The WSDL acts as a guide to understand the service’s offerings and generate implementation code for the client.

1. To generate soap client from wsdl located in the `resources` folder, configure:

  ```xml
  <configuration>
    <wsdlDirectory>${project.basedir}/src/main/resources/META-INF/wsdl</wsdlDirectory>
    <wsdlFiles>
      <wsdlFile>mediapool.68.wsdl</wsdlFile>
    </wsdlFiles>
  </configuration>
  ```
  
  Note: this is a preferable option, cause:
  - for the client generation you do not need the available system with wsdl.
  - if there are server on the server side, you identify the changes explicitly

2. If you want to generate soap client from wsdl available via url, use:
  ```xml
  <wsdlUrls>
    <wsdlUrl>https://example.com/webservices/myservice/v2/?wsdl</wsdlUrl>
  </wsdlUrls>
  ```
  instead of:
  ```xml
  <wsdlFiles>
    <wsdlFile>mediapool.68.wsdl</wsdlFile>
  </wsdlFiles>
  ```

### Ways to generate soap code based on wsdl file

You have several tools to generate:
1. [Using `wsimport` for Java 11 and above with `com.sun.xml.ws:jaxws-maven-plugin` plugin](../soap_client_oracle/pom.xml)

  Starting JDK 11, wsimport was removed as part of the JDK and no longer comes out of the box with the standard distribution.

2. Using `wsimport` as part of JDK 8 with `org.codehaus.mojo:jaxws-maven-plugin` plugin from
   [JAX-WS Maven Plugin](https://www.mojohaus.org/jaxws-maven-plugin/)

  Note: the configuration of `org.codehaus.mojo:jaxws-maven-plugin` is exactly the same as for `com.sun.xml.ws:jaxws-maven-plugin`
  
    ```xml
    <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>jaxws-maven-plugin</artifactId>
      <version>${jaxws-maven-plugin.version}</version>
    </plugin>
    ```

3. `wsimport` as part of JDK 8 executed via command line:
  ```bash
  wsimport -s src/main/java/ -keep -p com.baeldung.soap.ws.client.generated "http://localhost:8888/ws/country?wsdl"
  ```

  [See also `Invoking a SOAP Web Service in Java`](https://www.baeldung.com/java-soap-web-service)

### Generated code location

1. Generate directly into the main source code.

    [How to generate classes from wsdl using Maven and wsimport?](https://stackoverflow.com/questions/18338196/how-to-generate-classes-from-wsdl-using-maven-and-wsimport/52221231#52221231)
    > I see some people prefer to generate sources into the target via `jaxws-maven-plugin`
    > AND make this classes visible in source via `build-helper-maven-plugin`.
    > As an argument for this structure they mention:
    >
    > `the version management system (svn/etc.) would always notice changed sources`
    >
    > With git it is not true. So you can just configure `jaxws-maven-plugin` to put the generated code into your sources,
    > but not under the `target` folder. Each time you build your project, git does not mark these generated files as changed.
    
    Another benefit of storing the generated files in the main source:
    
    If wsdl file is changed, for a developer it is easier to identify exact changes
    looking at the java code stored in a git repository.


2. into the `target` folder, to avoid keeping the generated code in the git repository. 

  You need additional `build-helper-maven-plugin` plugin to make those files available from your sources.

### Fluent Api generation

Fluent API allows us to create types in the following way:
```java
A a = new A()
  .withField1(value1)
  .withField2(value2);
```

Add the `org.jvnet.jaxb2_commons:jaxb2-fluent-api` dependency and `-Xfluent-api` into `jaxws-maven-plugin` plugin to generate fluent api:
```xml
<plugin>
  <groupId>com.sun.xml.ws</groupId>
  <artifactId>jaxws-maven-plugin</artifactId>
  <dependencies>
    <!-- https://mvnrepository.com/artifact/org.jvnet.jaxb2_commons/jaxb2-fluent-api -->
    <dependency>
      <groupId>org.jvnet.jaxb2_commons</groupId>
      <artifactId>jaxb2-fluent-api</artifactId>
      <version>3.0</version>
    </dependency>
  </dependencies>
  <configuration>
    <xjcArgs>
      <xjcArg>-Xfluent-api</xjcArg>
    </xjcArgs>
  </configuration>
</plugin>
```

### Several soap clients generating based on different wsdl files

[See `execution/configuration` and `plugin/configuration` elements](../soap_client_oracle/pom.xml)

Idea - you move specific to soap service configurations - `packageName` and `wsdlFiles`,
under the `execution/configuration` elements,
and the common configuration, under the `plugin/configuration` element:

```xml
<plugin>
  <executions>
    <execution>
      <id>gen-soap-client-1</id>
      <goals>
        <goal>wsimport</goal>
      </goals>
      <configuration>
        <packageName>com.example.soap.client.generated1</packageName>
        <wsdlFiles>
          <wsdlFile>service1.wsdl</wsdlFile>
        </wsdlFiles>
      </configuration>
    </execution>
    <execution>
      <id>gen-soap-client-2</id>
      <goals>
        <goal>wsimport</goal>
      </goals>
      <configuration>
        <packageName>com.example.soap.client.generated2</packageName>
        <wsdlFiles>
          <wsdlFile>service2.wsdl</wsdlFile>
        </wsdlFiles>
      </configuration>
    </execution>
  </executions>
  <configuration>
    <wsdlDirectory>${project.basedir}/src/main/resources/META-INF/wsdl</wsdlDirectory>
    <sourceDestDir>${project.build.sourceDirectory}</sourceDestDir>
    <xjcArgs>
      <xjcArg>-Xfluent-api</xjcArg>
    </xjcArgs>
    <verbose>true</verbose>
    <keep>true</keep> <!--used by default-->
  </configuration>
</plugin>
```

### Jakarta Ws Api support

To support Jakarta Ws Api in the generated code:

1. Add `jakarta.xml.bind:jakarta.xml.bind-api` and `jakarta.xml.ws:jakarta.xml.ws-api` into the project dependencies
  ```xml
      <dependencyManagement>
      <dependencies>
        <!-- https://mvnrepository.com/artifact/jakarta.xml.bind/jakarta.xml.bind-api-parent -->
        <dependency>
          <groupId>jakarta.xml.bind</groupId>
          <artifactId>jakarta.xml.bind-api-parent</artifactId>
          <version>4.0.2</version>
          <type>pom</type>
        </dependency>
      </dependencies>
    </dependencyManagement>

    <dependencies>
      <!-- https://mvnrepository.com/artifact/jakarta.xml.bind/jakarta.xml.bind-api -->
      <dependency>
        <groupId>jakarta.xml.bind</groupId>
        <artifactId>jakarta.xml.bind-api</artifactId>
      </dependency>
      <!-- https://mvnrepository.com/artifact/jakarta.xml.ws/jakarta.xml.ws-api -->
      <dependency>
        <groupId>jakarta.xml.ws</groupId>
        <artifactId>jakarta.xml.ws-api</artifactId>
      </dependency>
    </dependencies>
  ```
2. If you use `org.codehaus.mojo:jaxws-maven-plugin` plugin add `com.sun.xml.ws:jaxws-tools` to its dependencies:

Note: for `com.sun.xml.ws:jaxws-maven-plugin` it is not needed.

  ```xml
  <build>
    <plugins>
      <!-- https://mvnrepository.com/artifact/org.codehaus.mojo/jaxws-maven-plugin -->
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>jaxws-maven-plugin</artifactId>
        <version>${jaxws-maven-plugin.version}</version>
        <dependencies>
          <dependency>
            <!-- without this dependency, `javax` instead of `jakarta` package is used -->
            <!-- https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-tools -->
            <groupId>com.sun.xml.ws</groupId>
            <artifactId>jaxws-tools</artifactId>
            <version>4.0.3</version>
          </dependency>
        </dependencies>
      </plugin>
    </plugins>
  </build>
  ```

### WS SPI Provider

SPI - [Java Service Provider Interface](https://www.baeldung.com/java-spi)
- An interface or abstract class that acts as a proxy or an endpoint to the service.

- For ws soap clients it is `jakarta.xml.ws.spi.Provider` abstract class, located in:
```xml
<!-- https://mvnrepository.com/artifact/jakarta.xml.ws/jakarta.xml.ws-api -->
<dependency>
  <groupId>jakarta.xml.ws</groupId>
  <artifactId>jakarta.xml.ws-api</artifactId>
  <version>4.0.2</version>
</dependency>
```
In this abstract class `com.sun.xml.ws.spi.ProviderImpl` is marked as a default implementation:
```java
package jakarta.xml.ws.spi;

public abstract class Provider {
  private static final String DEFAULT_JAXWSPROVIDER = "com.sun.xml.ws.spi.ProviderImpl";
}
```

#### Actually you could choose either:
- [How to use Apache Cxf as WS SPI Provider](../soap_client_apache_cxf/README.md) or
- [How to use default WS SPI Provider from Oracle](../soap_client_oracle/README.md)

