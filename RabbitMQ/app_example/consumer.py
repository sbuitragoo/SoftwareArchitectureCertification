from basic_client import BasicClient

class Consumer(BasicClient):
    """RabbitMQ consumer class
    """
    def __init__(self, host: str) -> None:
        super().__init__(host)
        self.__received_messages__ = []

    def callback(self, ch, method, properties, body):
        print("Message received, appending...")
        self.__received_messages__.append(body)

    def get_messages(self):
        messages_copy = self.__received_messages__.copy()
        self.__received_messages__.clear()
        return messages_copy

    def subscribe(self, queue_name: str):
        """Creates a subscription to the given queue and associates a callback

        Args:
            queue_name (str): Name of the queue to subscribe to
        """
        self._channel_.basic_consume(queue=queue_name, on_message_callback=self.callback, auto_ack=True)

    
    def start_single_queue(self, queue_name: str):
        """Executes the basic steps for creating and subscribing to a single queue

        Args:
            queue_name (str): Name of the queue to create/subscribe
        """
        self.create_connection()
        self.create_queue(queue_name)
        self.subscribe(queue_name)

        print(' [*] Waiting for messages. To exit press CTRL+C')

        self._channel_.start_consuming()

if __name__ == '__main__':
    pass