package com.google.android.gms.auth.api.phone;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abiu;
import defpackage.aszx;
import defpackage.atzr;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class IncomingCallRetrieverResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abiu();
    public final String a;
    public final String b;
    public final String c;

    public IncomingCallRetrieverResponse(String str, String str2, String str3) {
        fxxm.f(str2, "incomingCallVerificationStatusCode");
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str != null && !fxxm.n(str2, aszx.l(0))) {
            throw new IllegalArgumentException("incomingCallVerificationStatusCode should be SUCCESS when phone number is set.");
        }
        if (str == null && fxxm.n(str2, aszx.l(0))) {
            throw new IllegalArgumentException("Phone number must not be null when verificationStatus is SUCCESS.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
