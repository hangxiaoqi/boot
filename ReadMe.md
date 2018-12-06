### 创建流程

#### 1. 构建内嵌的tomcat 容器

```java
首先根据WebApplicationType#deduceFromClasspath()决定是哪一种应用类型，根据此创建不同的webApplicationContext 
```

```java
然后调用 SpringApplication#createApplicationContext() ，根据webApplicationType 返回的类型创建对应的context ，一般来说，web应用都是org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext 
```

```java
AnnotationConfigServletWebServerApplicationContext,继承了 ServletWebApplicationContext ， 初始化时调用父类的refresh 方法进行初始化，
在ServletWebApplicationContext#onRefresh()中，创建了一个web容器


 
```



#### 2. 构建 ApplicationContext
#### 3. 构建 SpringMVCContext




