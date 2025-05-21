package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cwzy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RecaptchaAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwzy();
    public final RecaptchaActionType a;
    public final String b;
    public final Bundle c;
    public final String d;

    public RecaptchaAction(RecaptchaActionType recaptchaActionType, String str, Bundle bundle, String str2) {
        this.a = recaptchaActionType;
        this.b = str;
        this.c = bundle;
        this.d = str2;
    }

    public final String toString() {
        String str = this.a.a;
        if ("other".equals(str)) {
            String str2 = this.b;
            if (!str2.isEmpty()) {
                return str2;
            }
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RecaptchaActionType recaptchaActionType = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, recaptchaActionType, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.g(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
