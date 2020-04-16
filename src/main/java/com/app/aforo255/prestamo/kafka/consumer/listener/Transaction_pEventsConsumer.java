package com.app.aforo255.prestamo.kafka.consumer.listener;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.app.aforo255.prestamo.service.Transaction_pEvents;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class Transaction_pEventsConsumer {

	@Autowired
	private Transaction_pEvents transaction_pEvents;
	private Logger log =LoggerFactory.getLogger(Transaction_pEventsConsumer.class) ;
	
	@KafkaListener(topics= {"transaction_p-events"})
	public void onMessage(ConsumerRecord<Integer,String> consumerRecord) throws  JsonProcessingException {
		
		log.info("ConsumerRecord account : {} ",consumerRecord);
		transaction_pEvents.processTransacctionEvent(consumerRecord);
	}
}
