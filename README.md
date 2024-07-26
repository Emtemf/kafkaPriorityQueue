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

1. 克隆仓库：
   ```bash
   git clone https://github.com/Emtemf/kafkaPriorityQueue.git

