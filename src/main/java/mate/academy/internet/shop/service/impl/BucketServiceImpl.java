package mate.academy.internet.shop.service.impl;

import mate.academy.internet.shop.dao.BucketDao;
import mate.academy.internet.shop.dao.ItemDao;
import mate.academy.internet.shop.lib.Inject;
import mate.academy.internet.shop.lib.Service;
import mate.academy.internet.shop.model.Bucket;
import mate.academy.internet.shop.model.Item;
import mate.academy.internet.shop.service.BucketServuce;

@Service
public class BucketServiceImpl implements BucketServuce {
    @Inject
    private BucketDao bucketDao;
    @Inject
    private ItemDao itemDao;

    @Override
    public Bucket addItem(Long bucketId, Long itemId) {
        Bucket bucket = bucketDao.get(bucketId);
        Item item = itemDao.get(itemId).get();
        bucket.getItems().add(item);
        return bucketDao.update(bucket);
    }
}
