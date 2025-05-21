package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import defpackage.arxc;
import defpackage.cxbk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class InitResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxbk();
    public final RecaptchaHandle a;

    public InitResults(RecaptchaHandle recaptchaHandle) {
        this.a = recaptchaHandle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RecaptchaHandle recaptchaHandle = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, recaptchaHandle, i, false);
        arxc.c(parcel, a);
    }
}
