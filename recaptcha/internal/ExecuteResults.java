package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import defpackage.arxc;
import defpackage.cxba;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ExecuteResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxba();
    public final RecaptchaResultData a;

    public ExecuteResults(RecaptchaResultData recaptchaResultData) {
        this.a = recaptchaResultData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RecaptchaResultData recaptchaResultData = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, recaptchaResultData, i, false);
        arxc.c(parcel, a);
    }
}
