# kafkaPriorityQueue
KafkaPriorityQueue 是一个使用 Apache Kafka 实现优先级队列系统的项目。该项目旨在展示如何利用 Kafka 管理不同优先级的消息，确保高优先级的消息优先处理。
## 背景
1 项目中不同类型的数据优先级是明显不一致的。例如交易的数据是明显高于个人信息的。

2 当资源有限时，我们期望优先级高的数据可以优先被处理。实现一种逻辑上的弹性伸缩。

3 kafka对优先级的场景支持的并不好。我们期望对kafka做一层封装，让使用者可以自定义优先级来满足优先处理的需求。
## 特性
- 基于优先级的消息处理
- 多个优先级级别
- 容错和可扩展的架构
- 易于与现有 Kafka 设置集成
- 可插拔的 spring 组件
## 快速开始
要开始使用 KafkaPriorityQueue，请按照以下步骤操作：

1. win下使用kafka

1.1 下载kafka

```
https://kafka.apache.org/downloads
```

我本地下载的kafka_2.13-3.6.0版本。注意下载带着scala的

![image](https://github.com/user-attachments/assets/eb150676-1f97-4336-a964-a4a115717795)

1.2 解压 & 修改配置

注意去掉版本号，win10如果文件过长会报错

![image](https://github.com/user-attachments/assets/ac205872-89ca-48a1-a0b5-61508afa443a)

修改config文件夹里的zookeeper.properties文件

```
改成自定义的一个，随你喜欢
dataDir=D:\\idea\\workSpace\\kafka\\zk
```

修改config文件夹里的server.properties文件

```
改成自定义的一个，随你喜欢
log.dirs=D:\\idea\\workSpace\\kafka\logs
```

1.3 启动zk和kafka

如果是在kafka文件夹这个路径下，就执行这个，如果是在windows就去掉前面的路径

``` bash
 .\bin\windows\kafka-server-start.bat .\config\server.properties
 .\bin\windows\kafka-server-start.bat .\config\server.properties
```

1.4 创建一个topic

不同版本可能会有区别,kafka默认端口是9092，如果没改的话就是这个

```bash
 .\bin\windows\kafka-topics.bat --create --topic test --bootstrap-server localhost:9092
```

1.5 验证

请求http://localhost:8848/sendDemoMessage

得到

![image](https://github.com/user-attachments/assets/319417a7-7da9-4ee8-a054-2d49e361e20a)

后续版本删除demo文件。

2. 克隆仓库：
   ```bash
   git clone https://github.com/Emtemf/kafkaPriorityQueue.git

