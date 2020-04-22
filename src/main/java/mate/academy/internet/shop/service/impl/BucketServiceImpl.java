package mate.academy.internet.shop.service.impl;

import mate.academy.internet.shop.dao.BucketDao;
import mate.academy.internet.shop.dao.ItemDao;
import mate.academy.internet.shop.model.Bucket;
import mate.academy.internet.shop.model.Item;
import mate.academy.internet.shop.service.BucketServuce;

public class BucketServiceImpl implements BucketServuce {
    private BucketDao bucketDao;
    private ItemDao itemDao;

    @Override
    public Bucket addItem(Long bucketId, Long itemId) {
        Bucket bucket = bucketDao.get(bucketId);
        Item item = itemDao.get(itemId).get();
        bucket.getItems().add(item);
        return bucketDao.update(bucket);
    }
}
