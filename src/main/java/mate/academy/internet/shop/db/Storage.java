package mate.academy.internet.shop.db;

import java.util.ArrayList;
import java.util.List;
import mate.academy.internet.shop.model.Bucket;
import mate.academy.internet.shop.model.Item;
import mate.academy.internet.shop.model.Order;
import mate.academy.internet.shop.model.User;

public class Storage {
    public static final List<Item> items = new ArrayList<>();
    public static final List<Bucket> buckets = new ArrayList<>();
    public static final List<User> users = new ArrayList<>();
    public static final List<Order> orders = new ArrayList<>();
    private static Long userId = 0L;
    private static Long bucketId = 0L;
    private static Long orderId = 0L;
    private static Long itemId = 0L;

    public static void addItem(Item item) {
        itemId++;
        item.setId(itemId);
        items.add(item);
    }

    public static void addBucket(Bucket bucket) {
        bucketId++;
        bucket.setId(itemId);
        buckets.add(bucket);
    }

    public static void addUser(User user) {
        userId++;
        user.setId(itemId);
        users.add(user);
    }

    public static void addOrder(Order order) {
        orderId++;
        order.setId(itemId);
        orders.add(order);
    }
}
