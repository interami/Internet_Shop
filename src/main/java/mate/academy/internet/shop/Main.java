package mate.academy.internet.shop;

import java.util.List;
import mate.academy.internet.shop.lib.Injector;
import mate.academy.internet.shop.model.Item;
import mate.academy.internet.shop.service.ItemService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy.internet.shop");

    public static void main(String[] args) {
        ItemService itemService = (ItemService) injector.getInstance(ItemService.class);

        initDb(itemService);

        List<Item> allItems = itemService.getAll();
        for (Item item : allItems) {
            System.out.println(item.toString());
        }
    }

    private static void initDb(ItemService itemService) {
        Item item1 = new Item("BMW",110.0);
        Item item2 = new Item("Opel",20.0);
        Item item3 = new Item("Scoda",50.0);
        itemService.create(item1);
        itemService.create(item2);
        itemService.create(item3);

    }
}
