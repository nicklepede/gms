package com.google.android.gms.auth.api.phone;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqxi;
import defpackage.arxc;
import defpackage.fvbo;
import defpackage.ziu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class IncomingCallRetrieverResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ziu();
    public final String a;
    public final String b;
    public final String c;

    public IncomingCallRetrieverResponse(String str, String str2, String str3) {
        fvbo.f(str2, "incomingCallVerificationStatusCode");
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str != null && !fvbo.n(str2, aqxi.l(0))) {
            throw new IllegalArgumentException("incomingCallVerificationStatusCode should be SUCCESS when phone number is set.");
        }
        if (str == null && fvbo.n(str2, aqxi.l(0))) {
            throw new IllegalArgumentException("Phone number must not be null when verificationStatus is SUCCESS.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
