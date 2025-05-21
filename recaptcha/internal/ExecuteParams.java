package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import defpackage.arxc;
import defpackage.cxaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ExecuteParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxaz();
    public final RecaptchaHandle a;
    public final RecaptchaAction b;
    public final String c;

    public ExecuteParams(RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction, String str) {
        this.a = recaptchaHandle;
        this.b = recaptchaAction;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RecaptchaHandle recaptchaHandle = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, recaptchaHandle, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
