package mate.academy.internet.shop.dao.impl;

import java.util.NoSuchElementException;
import mate.academy.internet.shop.dao.BucketDao;
import mate.academy.internet.shop.db.Storage;
import mate.academy.internet.shop.lib.Dao;
import mate.academy.internet.shop.model.Bucket;

@Dao
public class BucketDaoImpl implements BucketDao {
    @Override
    public Bucket create(Bucket bucket) {
        return null;
    }

    @Override
    public Bucket get(Long bucketId) {
        return Storage.buckets
                .stream()
                .filter(b -> b.getId().equals(bucketId))
                .findFirst()
                .orElseThrow(() ->
                        new NoSuchElementException("Can't bucket with id:" + bucketId));
    }

    @Override
    public Bucket update(Bucket bucket) {
        return null;
    }
}
