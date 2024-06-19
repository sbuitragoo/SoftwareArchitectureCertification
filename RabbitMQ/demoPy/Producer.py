import pika

def main():
    # conectar con RabbitMQ
    connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
    channel = connection.channel()

    # Declarar la cola
    channel.queue_declare(queue='hello')

    # Publicar un mensaje
    channel.basic_publish(exchange='', routing_key='hello', body='Hello RabbitMQ!')

    print(" [x] Sent 'Hello RabbitMQ!'")

    # Cerrar la conexión
    connection.close()

if __name__ == '__main__':
    main()