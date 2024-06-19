import pika

class BasicClient:
    def __init__(self, host: str) -> None:
        self.host = host

    def create_connection(self):
        """Creates a RabbitMQ connection to a host
        """
        self._connection_ = pika.BlockingConnection(pika.ConnectionParameters(self.host))
        self._channel_ = self._connection_.channel()

    def create_queue(self, queue_name: str):
        """Created a queue with a given name

        Args:
            queue_name (str): The name of the queue
        """
        self._channel_.queue_declare(queue=queue_name)

if __name__ == "__main__":
    pass