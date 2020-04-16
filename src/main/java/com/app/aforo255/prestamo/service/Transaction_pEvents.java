package com.app.aforo255.prestamo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.prestamo.model.entity.Prestamo;
import com.app.aforo255.prestamo.model.entity.Transaction_p;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.*;

@Service
public class Transaction_pEvents {
		
	private Logger log = LoggerFactory.getLogger(Transaction_pEvents.class);
	@Autowired
	private IPrestamoService repository;
	@Autowired
	ObjectMapper objectMapper;

	public void processTransacctionEvent(ConsumerRecord<Integer, String> consumerRecord)
			throws JsonMappingException, JsonProcessingException {
		
		//double newmonto = 0;		
	
		boolean pagado = false;
		double importe_cuota_pagado = 0;
		
		Prestamo objPrestamo = new Prestamo();
		Transaction_p transaction_pEvent = objectMapper.readValue(consumerRecord.value(), Transaction_p.class);
		//log.info("transaction_pEvent : {} ", transaction_pEvent.getId());
		//objPrestamo = repository.findById(transaction_pEvent.getId());
		
		log.info("transaction_pEvent : {} ", transaction_pEvent.getCuota());
		objPrestamo = repository.findById(transaction_pEvent.getCuota());
		
		
		//log.info("get amount : ", objPrestamo.getId());

		importe_cuota_pagado = objPrestamo.getImporte_cuota();
		
		if ((transaction_pEvent.getCuota() > 0) && (transaction_pEvent.getImporte_cuota() == importe_cuota_pagado)) {					
			pagado = true;
		}
		
		
		
		/*
		switch (transaction_pEvent.getType()) {
		case "deposito":
			newmonto = objPrestamo.getTotalAmount() + transaction_pEvent.getAmount();
			break;
		case "retiro":
			newmonto = objPrestamo.getTotalAmount() - transaction_pEvent.getAmount();
			break;
		default:
			log.info("Invalid Library Event type");
		}*/
					
		
		//log.info("set new cuota {}",newmonto);
		log.info("esta pagado ? {}",pagado);		
		log.info("el importe de cuota es {} : ",importe_cuota_pagado);
		objPrestamo.setPagado(pagado);		
		repository.save(objPrestamo);
	}

}
