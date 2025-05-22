package com.google.android.gms.credential.manager.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.PowerManager;
import android.util.AttributeSet;
import com.google.android.gms.chimera.modules.credential.manager.AppContextProvider;
import com.google.android.gms.credential.manager.util.LottieView;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.awvd;
import defpackage.awvf;
import defpackage.awvn;
import defpackage.azcn;
import defpackage.dhlq;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LottieView extends azcn {
    public awvn h;

    public LottieView(Context context) {
        super(context);
    }

    private final void y(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tiy.j);
        String string = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getString(0) : obtainStyledAttributes.getString(1);
        boolean isPowerSaveMode = ((PowerManager) AppContextProvider.b().getSystemService("power")).isPowerSaveMode();
        int i = AppContextProvider.b().getResources().getConfiguration().uiMode & 48;
        if (Build.VERSION.SDK_INT < 26 || (i != 32 && !isPowerSaveMode)) {
            string = obtainStyledAttributes.getString(1);
        }
        if (string != null) {
            this.h.a.a(new aupv(1, 9), new aupz(Integer.MAX_VALUE, 10), awvf.a(string), new awvd() { // from class: awvm
                @Override // defpackage.awvd
                public final Object a(byte[] bArr, int i2) {
                    return new String(bArr);
                }
            }).z(new dhlq() { // from class: azch
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    LottieView.this.v((String) ((awve) obj).a);
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
