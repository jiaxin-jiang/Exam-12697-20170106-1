#	Exam-12697-20170106-1

##	1说明

一个简单的电影租赁系统

##	2功能

* 登陆、查看电影、修改电影信息、删除电影、新增电影

##	3数据库信息

* 数据库配置文件在：src\main\resources\dbconfig.properties
* driver=com.mysql.jdbc.Driver
* url=jdbc:mysql://localhost:3306/sakila?&serverTimezone=GMT
* username=root
* password=123456

##	4启动命令

* mvn clean compile
* mvn jetty:run

##	5访问页面

* 登陆页面（欢迎页）：http://localhost:8080/
* 输入：mary 登陆成功，跳转至显示所有电影页面
* 输入：1 登陆失败，提示失败

## 6操作说明

* 在手动输入页码进行跳转时，输入超过最大页则跳转至最大页，不输则为最小页
* 在更新/新增成功后，请跳转至后面接进行查看
* 在进行删除时，有级联的不能被删除，如要测试删除，选择自己插入的数据进行删除即可




