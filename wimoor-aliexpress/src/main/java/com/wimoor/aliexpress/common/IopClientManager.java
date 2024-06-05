package com.wimoor.aliexpress.common;

import com.global.iop.api.IopClient;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class IopClientManager {
    private GenericObjectPool<IopClient> pool;

    public IopClientManager(String url, String appKey, String appSecret) {
        IopClientFactory factory = new IopClientFactory(url, appKey, appSecret);
        GenericObjectPoolConfig<IopClient> config = new GenericObjectPoolConfig<>();
        config.setMaxTotal(50);  // 设置最大实例数
        config.setMaxIdle(10);   // 设置最大空闲实例数
        config.setMinIdle(5);    // 设置最小空闲实例数
        pool = new GenericObjectPool<>(factory, config);
    }

    public IopClient borrowClient() throws Exception {
        return pool.borrowObject();
    }

    public void returnClient(IopClient client) {
        pool.returnObject(client);
    }
}
