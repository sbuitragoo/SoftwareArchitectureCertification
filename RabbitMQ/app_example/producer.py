from basic_client import BasicClient
import json

class Producer(BasicClient):
    def __init__(self, host) -> None:
        super().__init__(host)

    def publish(self, queue_name: str, message: str):
        self._channel_.basic_publish(exchange='', routing_key=queue_name, body=message)

    def close(self):
        self._connection_.close()

    def start(self, queue_name: str):
        self.create_connection()
        self.create_queue(queue_name)
 
if __name__ == '__main__':
    host = "localhost"
    queue_name = "main_queue"
    producer = Producer(host)
    producer.start(queue_name)

    messages = [
        {
            "id": 1,
            "order_type": 0,
            "products": ["Coca-cola", "Sprite", "Premio", "Uva"]
        },
        {
            "id": 2,
            "order_type": 0,
            "products": ["Coca-cola", "Sprite", "Premio"]
        },
        {
            "id": 3,
            "order_type": 1,
            "products": ["Coca-cola", "Sprite", "Premio", "Naranja", "Manzana", "Pepsi", "Aguila"]
        }
    ]

    for message in messages:
        str_message = json.dumps(message)
        print(f"Publishing: {str_message}")
        producer.publish(queue_name, str_message)