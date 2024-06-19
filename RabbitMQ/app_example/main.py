import json
import time
import threading
from order import Order
from consumer import Consumer
from oder_manager import OrderManager

def MainOderManager(order_manager: OrderManager, consumer: Consumer):
    while(1):
        messages = consumer.get_messages()

        if len(messages) > 0:
            for message in messages:
                json_message = json.loads(message)
                print(f"Order received: {json_message}")
                order = Order(json_message["id"], json_message["order_type"], json_message["products"])
                order_manager.add_order(order)
            
        print(f"Orders: {order_manager.get_orders()}")
        
        time.sleep(1)


if __name__ == "__main__":
    host = "localhost"
    queue_name = "main_queue"
    consumer = Consumer(host)

    order_manager = OrderManager()

    order_manager_thread = threading.Thread(target=MainOderManager, args=(order_manager, consumer))

    consumer_thread = threading.Thread(target=consumer.start_single_queue, args=(queue_name,))

    order_manager_thread.start()
    consumer_thread.start()
    
