package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import defpackage.atzr;
import defpackage.czky;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExecuteResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czky();
    public final RecaptchaResultData a;

    public ExecuteResults(RecaptchaResultData recaptchaResultData) {
        this.a = recaptchaResultData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RecaptchaResultData recaptchaResultData = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, recaptchaResultData, i, false);
        atzr.c(parcel, a);
    }
}
