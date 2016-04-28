/*
 * Copyright Fobid. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tfc.webviewer.presenter;

import android.net.Uri;
import android.support.v4.widget.SwipeRefreshLayout;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;

/**
 * author @Fobid
 */
public interface IWebViewPresenter {
    void validateUrl(String url);

    void onBackPressed(PopupWindow menu, WebView webView);

    void onReceivedTitle(String title, String url);

    void onClick(int resId, String url, PopupWindow popupWindow);

    void setEnabledGoBackAndGoFoward(boolean enabledGoBack, boolean enabledGoFoward);

    void onLongClick(WebView.HitTestResult result);

    void onProgressChanged(SwipeRefreshLayout swipeRefreshLayout, int progress);
}