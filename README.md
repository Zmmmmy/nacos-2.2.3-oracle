# nacos-2.2.3-oracle
nacos 2.2.3-oracle版本，支持集群

[下载链接](https://github.com/Zmmmmy/nacos-2.2.3-oracle/releases/download/2.2.3/nacos2.2.3-oracle.zip)

### 配置文件
conf目录下application.properties文件修改
~~~yaml
db.url.0=jdbc:oracle:thin:@127.0.0.1:1521:orcl
db.user=zmy
db.password=zmy
db.jdbcDriverName=oracle.jdbc.driver.OracleDriver
db.testQuery=select 1 from dual
~~~

