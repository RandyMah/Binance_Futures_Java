package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.*;

public class PostOrder {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.postOrder("BTCUSDT", OrderSide.BUY, PositionSide.BOTH, OrderType.STOP, TimeInForce.GTC,
                "0.01", "11688", "true", null, null, WorkingType.CONTRACT_PRICE, NewOrderRespType.RESULT));
    }
}