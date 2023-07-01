/*
 * kabuステーションAPI
 * # 定義情報   REST APIのコード一覧、エンドポイントは下記リンク参照     - [REST APIコード一覧](../ptal/error.html)
 *
 * OpenAPI spec version: 1.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.OrderSuccess;
import io.swagger.client.model.RequestCancelOrder;
import io.swagger.client.model.RequestSendOrder;
import io.swagger.client.model.RequestSendOrderDerivFuture;
import io.swagger.client.model.RequestSendOrderDerivOption;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OrderApi
 */
//@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();

    /**
     * 注文取消
     *
     * 注文を取消します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelorderPutTest() throws Exception {
        RequestCancelOrder body = new RequestCancelOrder();
        body.orderId("orderId").password("xxxxxx");
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.cancelorderPut(body, X_API_KEY);

        // TODO: test validations
    }
    /**
     * 注文発注（先物）
     *
     * 先物銘柄の注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendoderFuturePostTest() throws Exception {
        RequestSendOrderDerivFuture body = new RequestSendOrderDerivFuture();
        body.password("xxxxxx").symbol("symbol").exchange(0).tradeType(0).timeInForce(0);
        body.side("").qty(0).frontOrderType(0).price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendoderFuturePost(body, X_API_KEY);

        // TODO: test validations
    }
    /**
     * 注文発注（オプション）
     *
     * オプション銘柄の注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendorderOptionPostTest() throws Exception {
        RequestSendOrderDerivOption body = new RequestSendOrderDerivOption();
        body.password("xxxxxx").symbol("symbol").exchange(0).tradeType(0).timeInForce(0);
        body.side("").qty(0).frontOrderType(0).price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendorderOptionPost(body, X_API_KEY);

        // TODO: test validations
    }
    /**
     * 注文発注（現物・信用）
     *
     * 注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendorderPostTest() throws Exception {
        RequestSendOrder body = new RequestSendOrder();
        body.password("xxxxxx").symbol("symbol").exchange(0).securityType(0).side("side");
        body.cashMargin(0).delivType(0).accountType(0).qty(0).frontOrderType(0);
        body.price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendorderPost(body, X_API_KEY);

        // TODO: test validations
    }
}
