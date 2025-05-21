package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.gms.R;
import defpackage.arsr;
import defpackage.ashg;
import defpackage.assc;
import defpackage.yxl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AccountChipView extends LinearLayout {
    private static ImageLoader a;
    private static arsr b;

    public AccountChipView(Context context) {
        super(context);
        f(context);
    }

    private final LinearLayout d() {
        return (LinearLayout) findViewById(R.id.default_credential_avatar);
    }

    private static ImageLoader e() {
        if (a == null) {
            b = new arsr();
            a = new ImageLoader(ashg.b(), b);
        }
        return a;
    }

    private final void f(Context context) {
        View.inflate(context, R.layout.account_chip_view, this);
    }

    final assc a() {
        return (assc) findViewById(R.id.credential_avatar);
    }

    public final void b(yxl yxlVar) {
        TextView textView = (TextView) findViewById(R.id.credential_primary_label);
        String str = yxlVar.d;
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        c(yxlVar.e);
        String str2 = yxlVar.c;
        if (!TextUtils.isEmpty(str2)) {
            d().setVisibility(8);
            a().setVisibility(0);
            a().setImageUrl(str2, e());
        } else if (yxlVar.b) {
            int i = yxlVar.a;
            d().setVisibility(8);
            a().setVisibility(0);
            a().setDefaultImageResId(i);
            a().setImageUrl(null, e());
        } else {
            int i2 = yxlVar.a;
            a().setVisibility(8);
            d().setVisibility(0);
            ((ImageView) findViewById(R.id.default_credential_avatar_icon)).setBackgroundResource(i2);
        }
        setContentDescription(str);
    }

    @Deprecated
    public final void c(String str) {
        TextView textView = (TextView) findViewById(R.id.credential_secondary_label);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public AccountChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(context);
    }

    public AccountChipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f(context);
    }
}
