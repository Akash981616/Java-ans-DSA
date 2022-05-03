import java.util.*;
package Class.LLSD;
//Some Major Services
// 1) RestaurantService
// 2) OrderService
// 3) FoodMenuDisplayService
// 4) PricingService
// 5) CartService
// 6) PaymentService
// 7) NotificationService
// 8) DeliveryService
public class FoodDelieryApp {
    class Restaurant {
        int id;
        String name;
        Address address;
        FoodMenu foodMenu;
    }

    class Address {
        String street;
        String city;
        String state;
        String country;
        int zipCode;
    }

    class FoodMenu {
        int id;
        List<FoodItem> foodItems;
        String restaurantId;
    }

    class FoodItem {
        int id;
        String name;
        String description;
        double cost;
        CuisineType cuisinType;
        MealType mealType;
    }

    enum CuisineType {
        INDIAN, SOUTH_INDIAN, CHINESE, HYDERABADI
    }

    enum MealType {
        LUNCH, BREAKFAST, DINNER
    }

    class Order {
        int orderId;
        Date orderDate;
        Map<Integer, FoodItem> foodItems;
        OrderStatus orderStatus;
    }

    class Bill {
        int billId;
        int orderId;
        double totalAmount;
        double tax;
        double discount;
        double totalAmountToBePaid;
        Date currDate;
    }

    class Payment {
        int id;
        int billId;
        double amount;
        Date date;
        PaymentStatus status;
        PaymentMode mode;
        CouponCode code;
    }

    enum CouponCode {
        SIXTY_PERCENT_OFF, TWENTY_PERCENT_OFF
    }

    enum PaymentStatus {
        SUCCESS, FAILED, DECLINED
    }

    enum PaymentMode {
        CASH, CARD, UPI
    }

    class Delivery {
        int id;
        String orderId;
        Date startDateTime;
        Date endDateTime;
        String deliveryBoyId;
        String customerNumber;
        Address customerAddress;
        DeliveryStatus status;
    }
}

