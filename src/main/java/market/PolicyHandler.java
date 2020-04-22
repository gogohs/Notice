package market;

import market.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{


    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservationCanceled_Notice(@Payload  ReservationCanceled reservationCanceled){

        if(reservationCanceled.isMe()){
            System.out.println("##### Reservation Canceled : " + reservationCanceled.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaid_Notice(@Payload Paid paid){

        if(paid.isMe()){
            System.out.println("##### Product Paid : " + paid.toJson());
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_Notice(@Payload Reserved reserved){

        if(reserved.isMe()){
            System.out.println("##### Product Reserved : " + reserved.toJson());
        }
    }
    

}
