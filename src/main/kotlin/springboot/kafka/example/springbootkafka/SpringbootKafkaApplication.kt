package springboot.kafka.example.springbootkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootKafkaApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKafkaApplication>(*args)
}
