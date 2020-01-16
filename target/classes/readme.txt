Spring + MyBatis

整体项目架构
1.新建Spring Maven项目（Spring基本底层的Jar）

2.加载第三方的类库（MySQL驱动，MyBatis，MyBatis-Spring，Spring-JDBC）

  （注意：所有jar包版本的一致性）



数据访问层的开发
3.选择数据库中的特定表

4.根据表结构创建JavaBean类（数据模型）

5.创建Mapper接口（DAO）

6.创建MyBatis映射文件（Mapper.xml）封装SQL

7.创建编写MyBatis核心配置文件（Configuration.xml） JavaBean别名配置+管理加载所有Mapper映射文件

业务逻辑层的开发
8.创建业务逻辑层的接口与实现类（AoP进行事物管理）

表示层的开发
9.表示层的开发（WEB、Swing）

整合
10.创建配置Spring核心配置文件（数据源，事物管理器，MyBatis（Session工厂），注册Mapper接口，注册Biz）

表示层依赖于业务逻辑层
业务逻辑层依赖于数据访问层