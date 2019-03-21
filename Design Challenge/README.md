Highlevel solution is based on Lambda Architecture:

1. Apache Spark, Cassandra and Kafka will be deployed on Kubernetes cluster which will provide lower downtime, scalability and load balancing (Design Requirement 4)
2. ClickStream Data API and Raw Data/Event API produces kafka message on kafka topic
3. Kafka writes to HDFS as raw deduped data which can be used for reprocessing (Design Requirement 5, 1)
4. Spark Streaming consumer after receiving message will processes data in small batches based on smaller time window and performing analytics on the data. Also, Saving the aggregated data to Cassandra cluster
5. Spark batch processing will process data as per bigger time window which will provide better insights about data. Also, Saving the data to Cassandra
6. Using Cassandra and Spark SQL for time series related read/query
7. Different metrics can be provided to merchants using cassandra streaming and spark sql queries (Design Requirement 2, 3)
8. Reports can be provided to customers within one hour window, by setting spark streaming processing window to 15 minutes 
   and providing insights within one hour for moving window for every 15 minutes (Design Requirement 2, 3)

