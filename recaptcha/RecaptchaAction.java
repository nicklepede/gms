package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czjw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RecaptchaAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czjw();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, recaptchaActionType, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
