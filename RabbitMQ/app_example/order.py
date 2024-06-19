from enum import Enum
from typing import List, Dict

class OrderType(Enum):
    SELL = 0
    BUY = 1

class OrderStatus(Enum):
    REQUESTED = 0
    IN_PROGRESS = 1
    SOLVED = 2

class Order:
    def __init__(self, order_id: int, order_type: OrderType, products: List[str]) -> None:
        self.id = order_id
        self.type = order_type
        self.products = products
        self.status = OrderStatus.REQUESTED

    def set_status(self, status: OrderStatus):
        self.status = status