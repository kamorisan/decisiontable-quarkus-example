/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.queries;

public class BreadData {

    private String メッセージ;

    private String 商品名;

    private int 経過日数;

    private int 価格;

    public BreadData() {
    }

    public BreadData(String メッセージ, String 商品名, int 経過日数, int 価格) {
        this.メッセージ = メッセージ;
        this.商品名 = 商品名;
        this.経過日数 = 経過日数;
        this.価格 = 価格;
    }

    public String getメッセージ() {
        return メッセージ;
    }

    public void setメッセージ(String メッセージ) {
        this.メッセージ = メッセージ;
    }

    public String get商品名() {
        return 商品名;
    }

    public void set商品名(String 商品名) {
        this.商品名 = 商品名;
    }

    public int get価格() {
        return 価格;
    }

    public void set価格(int 価格) {
        this.価格 = 価格;
    }

    public int get経過日数() {
        return 経過日数;
    }

    public void set経過日数(int 経過日数) {
        this.経過日数 = 経過日数;
    }

}
