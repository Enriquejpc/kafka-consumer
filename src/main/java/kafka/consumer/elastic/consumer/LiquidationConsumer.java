package kafka.consumer.elastic.consumer;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import kafka.consumer.elastic.domain.kafka.Liquidation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LiquidationConsumer {

  @KafkaListener(topics = {"liquidations"})
  public void eventConsumer(ConsumerRecord<String, Liquidation> liquidation) throws IOException {
    log.info("Message Received", liquidation.value());
  }
}
