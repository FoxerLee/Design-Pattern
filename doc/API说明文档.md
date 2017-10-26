# API 说明文档



## 3.1 Decorator

### 3.3.1 一套实现

#### 3.1.1.1 API描述

Facility是一个定义装饰ConcreteFacility的接口，定义了getDecription()方法，Decorator类的子类，如Awning和Fence，可以装饰ConcreteFacility类及其子类。

#### 3.1.1.2 class diagram

 ![Decorator](image/Decorator.png)









## 3.2 Adapter

### 3.2.1 一套实现

#### 3.2.1.1 API描述

 需求是Lamppost类，但是我们目前只有Desklamp类。我们希望有一个类能自动将Desklamp类转为Lamppost类，这个类中有一个成员变量是Desklamp类型的。使用Desklamp提供的方法实现Lamppost接口，这就是适配器做的事情。

#### 3.2.1.2 class diagram

![Adapter](image/Adapter.png)



