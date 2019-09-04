# demo-mqtt-listener
mqtt listener with issue
## enviroment
```
docker-compose up -d
```
## issue
```
org.springframework.jmx.export.UnableToRegisterMBeanException: Unable to register MBean [mqttInbound.mqtt:inbound-channel-adapter#0] with key 'mqttInbound.mqtt:inbound-channel-adapter#0'; nested exception is javax.management.MalformedObjectNameException: Invalid character `:' in value
	at org.springframework.jmx.export.MBeanExporter.registerBeanNameOrInstance(MBeanExporter.java:625) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.jmx.export.MBeanExporter.lambda$registerBeans$2(MBeanExporter.java:551) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at java.base/java.util.HashMap.forEach(HashMap.java:1333) ~[na:na]
	at org.springframework.jmx.export.MBeanExporter.registerBeans(MBeanExporter.java:551) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.jmx.export.MBeanExporter.afterSingletonsInstantiated(MBeanExporter.java:434) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:862) ~[spring-beans-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:877) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:549) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:743) ~[spring-boot-2.1.7.RELEASE.jar:2.1.7.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:390) ~[spring-boot-2.1.7.RELEASE.jar:2.1.7.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:312) ~[spring-boot-2.1.7.RELEASE.jar:2.1.7.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1214) ~[spring-boot-2.1.7.RELEASE.jar:2.1.7.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1203) ~[spring-boot-2.1.7.RELEASE.jar:2.1.7.RELEASE]
	at com.example.demomqttlistener.DemoMqttListenerApplication.main(DemoMqttListenerApplication.java:14) ~[classes/:na]
Caused by: javax.management.MalformedObjectNameException: Invalid character `:' in value
	at java.management/javax.management.ObjectName.parseValue(ObjectName.java:978) ~[na:na]
	at java.management/javax.management.ObjectName.checkValue(ObjectName.java:1010) ~[na:na]
	at java.management/javax.management.ObjectName.construct(ObjectName.java:729) ~[na:na]
	at java.management/javax.management.ObjectName.<init>(ObjectName.java:1450) ~[na:na]
	at java.management/javax.management.ObjectName.getInstance(ObjectName.java:1356) ~[na:na]
	at org.springframework.jmx.support.ObjectNameManager.getInstance(ObjectNameManager.java:99) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.jmx.export.naming.MetadataNamingStrategy.getObjectName(MetadataNamingStrategy.java:135) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.boot.autoconfigure.jmx.ParentAwareNamingStrategy.getObjectName(ParentAwareNamingStrategy.java:59) ~[spring-boot-autoconfigure-2.1.7.RELEASE.jar:2.1.7.RELEASE]
	at org.springframework.jmx.export.MBeanExporter.getObjectName(MBeanExporter.java:755) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.jmx.export.MBeanExporter.registerBeanInstance(MBeanExporter.java:654) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	at org.springframework.jmx.export.MBeanExporter.registerBeanNameOrInstance(MBeanExporter.java:615) ~[spring-context-5.1.9.RELEASE.jar:5.1.9.RELEASE]
	... 13 common frames omitted
```
