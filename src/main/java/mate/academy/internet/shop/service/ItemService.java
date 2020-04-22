package mate.academy.internet.shop.service;

import java.util.List;
import mate.academy.internet.shop.lib.Service;
import mate.academy.internet.shop.model.Item;

@Service
public interface ItemService {

    Item create(Item item);

    Item get(Long id);

    List<Item> getAll();

    Item update(Item item);

    void delete(Long id);

    void delete(Item item);
}
