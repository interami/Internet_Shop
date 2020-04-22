package mate.academy.internet.shop.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import mate.academy.internet.shop.dao.ItemDao;
import mate.academy.internet.shop.db.Storage;
import mate.academy.internet.shop.lib.Dao;
import mate.academy.internet.shop.model.Item;

@Dao
public class ItemDaoImpl implements ItemDao {
    @Override
    public Item create(Item item) {
        Storage.addItem(item);
        return item;
    }

    @Override
    public Optional<Item> get(Long id) {
        return Storage.items
                .stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Item> getAll() {
        return Storage.items;
    }

    @Override
    public Item update(Item item) {
        IntStream.range(0, Storage.items.size())
                .filter(index -> item.getId().equals(Storage.items.get(index).getId()))
                .forEach(index -> Storage.items.set(index, item));
        return item;
    }

    @Override
    public void delete(Long id) {
        Item item = get(id).orElseThrow();
        Storage.items.remove(item);
    }

    @Override
    public void delete(Item item) {
        Storage.items.remove(item);
    }
}
