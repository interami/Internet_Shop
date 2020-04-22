package mate.academy.internet.shop.service.impl;

import java.util.List;
import mate.academy.internet.shop.dao.ItemDao;
import mate.academy.internet.shop.db.Storage;
import mate.academy.internet.shop.lib.Inject;
import mate.academy.internet.shop.lib.Service;
import mate.academy.internet.shop.model.Item;
import mate.academy.internet.shop.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
    @Inject
    private ItemDao itemDao;

    @Override
    public Item create(Item item) {
        return itemDao.create(item);
    }

    @Override
    public Item get(Long id) {
        return itemDao.get(id).get();
    }

    @Override
    public List<Item> getAll() {
        return Storage.items;
    }

    @Override
    public Item update(Item item) {
        return itemDao.update(item);
    }

    @Override
    public void delete(Long id) {
        itemDao.delete(id);
    }

    @Override
    public void delete(Item item) {
        itemDao.delete(item);
    }
}
