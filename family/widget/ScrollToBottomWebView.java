package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.R;
import defpackage.atzb;
import defpackage.bcgp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ScrollToBottomWebView extends WebView {
    public bcgp a;

    public ScrollToBottomWebView(Context context) {
        super(context);
    }

    private final void a() {
        if (this.a == null || getContentHeight() <= 0) {
            return;
        }
        float contentHeight = getContentHeight();
        bcgp bcgpVar = this.a;
        atzb.s(bcgpVar);
        atzb.s(bcgpVar.getContext());
        if (((int) Math.floor(contentHeight * r1.getResources().getDisplayMetrics().density)) - (getHeight() + getScrollY()) < 10) {
            bcgp bcgpVar2 = this.a;
            atzb.s(bcgpVar2);
            View view = bcgpVar2.d;
            if (view == null) {
                return;
            }
            view.findViewById(R.id.fm_tos_layout_more_button).setVisibility(8);
            bcgpVar2.d.findViewById(R.id.fm_tos_layout_continue_button).setVisibility(0);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public ScrollToBottomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollToBottomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
