package com.wimoor.aliexpress.common;

import com.global.iop.api.IopClient;
import com.global.iop.api.IopClientImpl;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

public class IopClientFactory implements PooledObjectFactory<IopClient> {
    private String url;
    private String appKey;
    private String appSecret;

    public IopClientFactory(String url, String appKey, String appSecret) {
        this.url = url;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }


    @Override
    public PooledObject<IopClient> makeObject() throws Exception {
        IopClient iopClient =new IopClientImpl(url, appKey, appSecret);
        return new DefaultPooledObject<>(iopClient);
    }

    @Override
    public void destroyObject(PooledObject<IopClient> p) throws Exception {
        // 如果IopClient有关闭或销毁的操作，可以在这里实现
    }

    @Override
    public boolean validateObject(PooledObject<IopClient> p) {
        // 可以在这里实现IopClient的验证逻辑
        return true;
    }

    @Override
    public void activateObject(PooledObject<IopClient> p) throws Exception {
        // 如果有需要激活的操作可以在这里实现
    }

    @Override
    public void passivateObject(PooledObject<IopClient> p) throws Exception {
        // 如果有需要钝化的操作可以在这里实现
    }
}
