# Spring 工作流程

> #### 在研读 Spring 源码之前，我们很有必要了解 Spring 启动流程以及工作流程，这样我们才清楚 spring 各个类的作用以及这个类在整个框架中充当的
> #### 角色，并且梳理出 spring 如此设计的意图。

[spring boot 启动流程及其原理](https://www.cnblogs.com/theRhyme/p/11057233.html)

---

### 一、 Spring Boot、Spring MVC 和 Spring 有什么区别？

分别描述各自的特征：

Spring 框架就像一个家族，有众多衍生产品例如 boot、security、jpa等等；但他们的基础都是Spring 的ioc和 aop，ioc 提供了依赖注入的容器， 
aop解决了面向切面编程，然后在此两者的基础上实现了其他延伸产品的高级功能。

Spring MVC提供了一种轻度耦合的方式来开发web应用；它是Spring的一个模块，是一个web框架；通过DispatcherServlet, ModelAndView 和 
View Resolver，开发web应用变得很容易；解决的问题领域是网站应用程序或者服务开发——URL路由、Session、模板引擎、静态Web资源等等。

Spring Boot实现了auto-configuration自动配置（另外三大神器actuator监控，cli命令行接口，starter依赖），降低了项目搭建的复杂度。它主要是为
了解决使用Spring框架需要进行大量的配置太麻烦的问题，所以它并不是用来替代Spring的解决方案，而是和Spring框架紧密结合用于提升Spring开发者体验的工
具；同时它集成了大量常用的第三方库配置(例如Jackson, JDBC, Mongo, Redis, Mail等等)，Spring Boot应用中这些第三方库几乎可以零配置的开箱即用(out-of-the-box)。

所以，用最简练的语言概括就是:

Spring 是一个“引擎”;

Spring MVC 是基于Spring的一个 MVC 框架;

Spring Boot 是基于Spring4的条件注册的一套快速开发整合包。

#### 二、 spring boot 的启动流程


---
### *术语解释*  
**实例化：**
> 实例化是指在面向对象的编程中，把用类创建对象的过程称为实例化。是将一个抽象的概念类，具体到该类实物的过程。实例化过程中一般由类名 对象名 = new 类名（参数1，参数2…参数n）构成。1  
> 例如，如果有一个类叫做Person，它有一个属性name和一个方法sayHello，那么可以通过以下代码来实例化一个Person对象，并给它赋值和调用它的方法：  
> Person p = new Person(); //实例化一个Person对象 p.name = “张三”; //给对象的属性赋值 p.sayHello(); //调用对象的方法  
> 实例化是面向对象编程的基本操作，它可以让我们使用已经定义好的类来创建具体的对象，从而实现代码的复用和扩展。不同的编程语言可能有不同的实例化方式，但是基本的思想和原理都是相同的

---
*相关资料：*
- [SpringBoot执行流程](https://www.cnblogs.com/theRhyme/p/11057233.html)
