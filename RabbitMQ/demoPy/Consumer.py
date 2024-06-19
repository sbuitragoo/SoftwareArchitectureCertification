import pika

def main():
    # conectar con RabbitMQ
    connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
    channel = connection.channel()

    # Declarar la cola
    channel.queue_declare(queue='hello')

    # Definir una función de callback
    def callback(ch, method, properties, body):
        print(f" [x] Received {body}")

    # Suscribirse a la cola
    channel.basic_consume(queue='hello', on_message_callback=callback, auto_ack=True)

    print(' [*] Waiting for messages. To exit press CTRL+C')
    channel.start_consuming()

if __name__ == '__main__':
    main()