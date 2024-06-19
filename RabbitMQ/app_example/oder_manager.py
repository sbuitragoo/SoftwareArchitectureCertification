from order import Order, OrderStatus
from typing import List, Dict

class OrderManager:
    def __init__(self) -> None:
        self.__orders__: Dict[int, Order] = {}

    def add_order(self, order: Order):
        self.__orders__[order.id] = Order

    def set_order_in_progress(self, order_id: int):
        try:
            self.__orders__[order_id].set_status(OrderStatus.IN_PROGRESS)
            return True
        except:
            return False

    def dispatch_order(self, order_id: int):
        try:
            self.__orders__[order_id].set_status(OrderStatus.SOLVED)
            return True
        except:
            return False
        
    def get_orders(self):
        return self.__orders__
