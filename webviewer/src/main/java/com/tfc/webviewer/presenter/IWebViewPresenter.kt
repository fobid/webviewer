/*
 * Copyright fobidlim. All Rights Reserved.
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
package com.tfc.webviewer.presenter

import android.support.v4.widget.SwipeRefreshLayout
import android.webkit.WebView
import android.webkit.WebView.HitTestResult
import android.widget.PopupWindow

/**
 * author @fobidlim
 */
interface IWebViewPresenter {

    fun validateUrl(url: String)
    fun onBackPressed(menu: PopupWindow, webView: WebView)
    fun onReceivedTitle(title: String, url: String)
    fun onClick(resId: Int, url: String, popupWindow: PopupWindow)
    fun setEnabledGoBackAndGoForward(enabledGoBack: Boolean, enabledGoForward: Boolean)
    fun onLongClick(result: HitTestResult)
    fun onProgressChanged(swipeRefreshLayout: SwipeRefreshLayout, progress: Int)
}