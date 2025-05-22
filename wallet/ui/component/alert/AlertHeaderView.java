package com.google.android.gms.wallet.ui.component.alert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.eijr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AlertHeaderView extends LinearLayout {
    ImageWithCaptionView a;
    InfoMessageView b;
    ImageView c;
    ImageView d;

    public AlertHeaderView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageWithCaptionView) findViewById(R.id.icon);
        this.b = (InfoMessageView) findViewById(R.id.description);
        this.c = (ImageView) findViewById(R.id.expand_icon);
        this.d = (ImageView) findViewById(R.id.collapse_icon);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        eijr.N(this, z);
    }

    public AlertHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlertHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
