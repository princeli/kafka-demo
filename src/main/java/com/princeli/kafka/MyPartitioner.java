package com.princeli.kafka;

import kafka.producer.Partitioner;  
import kafka.utils.VerifiableProperties;  
  
  
public class MyPartitioner implements Partitioner {  
    public MyPartitioner(VerifiableProperties props) {  
  
  
    }  
  
  
    /* 
     * @see kafka.producer.Partitioner#partition(java.lang.Object, int) 
     */  
    @Override  
    public int partition(Object key, int partitionCount) {  
    	int partition = Integer.valueOf((String) key) % partitionCount;
        return partition;  
    }  
}  
