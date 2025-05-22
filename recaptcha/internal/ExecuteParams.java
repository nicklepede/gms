package com.google.android.gms.recaptcha.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import defpackage.atzr;
import defpackage.czkx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExecuteParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czkx();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, recaptchaHandle, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
