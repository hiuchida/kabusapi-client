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
import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegister;
import io.swagger.client.model.RequestUnregister;
import io.swagger.client.model.UnregisterAllSuccess;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RegisterApi
 */
//@Ignore
public class RegisterApiTest {

    private final RegisterApi api = new RegisterApi();

    /**
     * 銘柄登録
     *
     * PUSH配信する銘柄を登録します。&lt;br&gt; API登録銘柄リストを開くには、kabuステーションAPIインジケーターを右クリックし「API登録銘柄リスト」を選択してください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerPutTest() throws Exception {
        RequestRegister body = new RequestRegister();
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        RegistSuccess response = api.registerPut(body, X_API_KEY);

        // TODO: test validations
    }
    /**
     * 銘柄登録全解除
     *
     * API登録銘柄リストに登録されている銘柄をすべて解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterAllPutTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        UnregisterAllSuccess response = api.unregisterAllPut(X_API_KEY);

        // TODO: test validations
    }
    /**
     * 銘柄登録解除
     *
     * API登録銘柄リストに登録されている銘柄を解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterPutTest() throws Exception {
        RequestUnregister body = new RequestUnregister();
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        RegistSuccess response = api.unregisterPut(body, X_API_KEY);

        // TODO: test validations
    }
}
