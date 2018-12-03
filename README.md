# 顺序
1. 启动eureka-server
2. 查看网页`http://localhost:8761` 中的`Instances currently registered with Eureka`
3. 启动provider 查看网页`http://localhost:8761` 中的Instance
4. 启动provider2 查看网页`http://localhost:8761` 中的Instance
5. 启动ribbon 查看网页`http://localhost:8761` 中的Instance
6. 浏览器请求`http://localhost:8080/test` 会输出 `provider: echo 'Hello World'` 或 `provider2: echo 'Hello World'`
7. 启动feign， 请求`http://localhost:8088/test`，会输出 `provider: echo 'Hello World'` 或 `provider2: echo 'Hello World'`
8. 启动zuul， 请求`http://localhost:9000/test`，会输出 `provider: echo 'Hello World'` 或 `provider2: echo 'Hello World'`
9. 启动zipkin-server，使用默认9411端口，`http://localhost:9411/zipkin`
10. 启动hystrix，占用端口10000，访问`http://localhost:10000/hystrix`，然后在监控中输入`http://localhost:8080/hystrix.stream`

# eureka-server
| Path             | Description  |
|------------------|--------------|
| /                | Home page (HTML UI) listing service registrations    |
| /eureka/apps     | Raw registration metadata |

