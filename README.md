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
```
@Configuration
@EnableSwagger2 //启动swagger2
//请求地址http://localhost:8080/swagger-ui.html
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //需要扫描api的包路径
                .apis(RequestHandlerSelectors.basePackage("com.py.springboot.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("这只是一个demo")
                .contact("PySasuke")
                .version("1.0")
                .build();
    }

}
```
### resources
- mapper:mybatis实体类映射文件存放包
- templates:页面文件存放包
- application.properties:springboot配置文件
```
## 数据源配置
spring.datasource.url=jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=utf8
spring.datasource.username=root
spring.datasource.password=py123456
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

## Mybatis 配置
##指向实体类包路径
mybatis.typeAliasesPackage=com.py.springboot.entity
##配置为 classpath 路径下 mapper 包下，* 代表会扫描所有 xml 文件
mybatis.mapperLocations=classpath:mapper/*.xml
```
- log4j.properties:日志相关配置
### deploy
- update.sql:数据库sql文件
### logs
- error.log:error级别日志
- log.log：其他级别日志
  

  

  


