package com.google.android.gms.credential.manager.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.PowerManager;
import android.util.AttributeSet;
import com.google.android.gms.chimera.modules.credential.manager.AppContextProvider;
import com.google.android.gms.credential.manager.util.LottieView;
import defpackage.asmb;
import defpackage.asmf;
import defpackage.aurd;
import defpackage.aurf;
import defpackage.aurn;
import defpackage.awyn;
import defpackage.dfak;
import defpackage.rpq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class LottieView extends awyn {
    public aurn h;

    public LottieView(Context context) {
        super(context);
    }

    private final void y(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rpq.j);
        String string = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getString(0) : obtainStyledAttributes.getString(1);
        boolean isPowerSaveMode = ((PowerManager) AppContextProvider.b().getSystemService("power")).isPowerSaveMode();
        int i = AppContextProvider.b().getResources().getConfiguration().uiMode & 48;
        if (Build.VERSION.SDK_INT < 26 || (i != 32 && !isPowerSaveMode)) {
            string = obtainStyledAttributes.getString(1);
        }
        if (string != null) {
            this.h.a.a(new asmb(1, 9), new asmf(Integer.MAX_VALUE, 10), aurf.a(string), new aurd() { // from class: aurm
                @Override // defpackage.aurd
                public final Object a(byte[] bArr, int i2) {
                    return new String(bArr);
                }
            }).z(new dfak() { // from class: awyh
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    LottieView.this.v((String) ((aure) obj).a);
                }
            });
        }
        obtainStyledAttributes.recycle();
    }

    public LottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y(attributeSet);
    }

    public LottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y(attributeSet);
    }
}
