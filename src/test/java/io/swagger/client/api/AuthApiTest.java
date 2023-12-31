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
import io.swagger.client.model.RequestToken;
import io.swagger.client.model.TokenSuccess;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AuthApi
 */
//@Ignore
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    /**
     * トークン発行
     *
     * APIトークンを発行します。&lt;br&gt; 発行したトークンは有効である限り使用することができ、リクエストごとに発行する必要はありません。&lt;br&gt; 発行されたAPIトークンは以下のタイミングで無効となります。&lt;br&gt; ・kabuステーションを終了した時&lt;br&gt; ・kabuステーションからログアウトした時&lt;br&gt; ・別のトークンが新たに発行された時&lt;br&gt; ※kabuステーションは早朝、強制的にログアウトいたしますのでご留意ください。&lt;br&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tokenPostTest() throws Exception {
        RequestToken body = new RequestToken();
        body.apIPassword("xxxxxx");
        TokenSuccess response = api.tokenPost(body);

        // TODO: test validations
    }
}
