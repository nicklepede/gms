package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.ding;
import defpackage.djeo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LineItemSubValueView extends TextView implements djeo {
    public LineItemSubValueView(Context context) {
        super(context, null, R.attr.styleLineItemSubValueText);
    }

    @Override // defpackage.djeo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        setText(ding.k((String) obj));
    }

    @Override // defpackage.djeo
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return !TextUtils.isEmpty((String) obj);
    }
}
