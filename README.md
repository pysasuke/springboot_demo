# springboot
## 项目介绍
单纯的springboot整合mybatis、thymeleaf、freemarker、swagger实例
## 项目结构
### main
- base:基础类包，包含统一的返回对象BaseResult
- dao:数据库交互层
- entity:实体对象层
- enums:枚举类，包含状态码枚举类
- service:业务处理层，包含一个impl包，Service以接口类型存在，impl包下存放Service接口的实现类
- web:控制层，HelloController展示了返回类型情况：页面跳转；UserController展示了返回类型情况:返回对象  
- SpringbootApplication:springboot启动类
- Swagger2：swagger相关类
### resources
- mapper:mybatis实体类映射文件存放包
- templates:页面文件存放包
- application.properties:springboot配置文件
- log4j.properties:日志相关配置
### deploy
- update.sql:数据库sql文件
### logs
- error.log:error级别日志
- log.log：其他级别日志
  

  

  


