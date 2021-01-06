logback包含三个模块：logback-core, logback-classic, logback-access.

logback-core 是其它两个模块的基础。logback-classic 模块可以看作是 log4j 的一个优化版本，它天然的支持 SLF4J，所以你可以随意的从其它日志框架（例如：log4j 或者 java.util.logging）切回到 logack。

logback-access 可以与 Servlet 容器进行整合，例如：Tomcat、Jetty。它提供了 http 访问日志的功能。 
 
        Logback's basic architecture is sufficiently generic so as to apply under different circumstances. 
        At the present time, logback is divided into three modules, logback-core, logback-classic and logback-access.
        The core module lays the groundwork for the other two modules. The classic module extends core. 
        The classic module corresponds to a significantly improved version of log4j. 
        Logback-classic natively implements the SLF4J API so that you can readily switch back and forth between logback and other logging systems such as log4j or java.util.logging (JUL) introduced in JDK 1.4. 
        The third module called access integrates with Servlet containers to provide HTTP-access log functionality. A separate document covers access module documentation.    
        In the remainder of this document, we will write "logback" to refer to the logback-classic module. 
        
logback 继承自 log4j，它建立在有十年工业经验的日志系统之上。它比其它所有的日志系统更快并且更小，包含了许多独特并且有用的特性。


# logback 性能