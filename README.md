# MongodbSink
flume-ng-mongodbsink
An Apache Flume Sink that send JSON to MongoDB collection

## 配置文件 configuration properties

Property Name |Default| Description
---|--- |---
hostNames | -|host1:port1,host2,port2,...the mongodb host and port
database | -| the mongodb database
collection|-|the collection of database
user|- |the username of databse
password|-|the password of database
batchSize|100| the batchSize of sources
authentication_enabled|False| Whether u need a password and a user

如果没有密码和用户名 就不需要user password authentication_enabled T 
如果有密码，设置authentication_enabled =True 

## Example

'''
# 定义数据出口 
a1.sinks.s.type = com.kenshuchong.MongodbSink.MongoSinkSelf
a1.sinks.s.hostNames=127.0.0.1:27017
a1.sinks.s.authentication_enabled=True
a1.sinks.s.database = database
a1.sinks.s.password = password
a1.sinks.s.user     = user
a1.sinks.s.collection = collection
a1.sinks.s.batchSize = 100 
a1.sinks.s.channel = c 
'''
