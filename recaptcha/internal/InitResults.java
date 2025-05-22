package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import defpackage.atzr;
import defpackage.czli;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class InitResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czli();
    public final RecaptchaHandle a;

    public InitResults(RecaptchaHandle recaptchaHandle) {
        this.a = recaptchaHandle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RecaptchaHandle recaptchaHandle = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, recaptchaHandle, i, false);
        atzr.c(parcel, a);
    }
}
