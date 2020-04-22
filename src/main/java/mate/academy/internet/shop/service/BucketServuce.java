package mate.academy.internet.shop.service;

import mate.academy.internet.shop.model.Bucket;

public interface BucketServuce {
    Bucket addItem(Long bucketId, Long itemId);
}
