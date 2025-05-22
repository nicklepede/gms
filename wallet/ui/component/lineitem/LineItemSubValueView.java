package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.dkyr;
import defpackage.dlqh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LineItemSubValueView extends TextView implements dlqh {
    public LineItemSubValueView(Context context) {
        super(context, null, R.attr.styleLineItemSubValueText);
    }

    @Override // defpackage.dlqh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        setText(dkyr.k((String) obj));
    }

    @Override // defpackage.dlqh
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return !TextUtils.isEmpty((String) obj);
    }
}
