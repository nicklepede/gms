package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.zlw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class VerificationToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zlw();
    public long a;
    public String b;

    public VerificationToken() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerificationToken) {
            VerificationToken verificationToken = (VerificationToken) obj;
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(verificationToken.a)) && arwb.b(this.b, verificationToken.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public VerificationToken(long j, String str) {
        this.a = j;
        this.b = str;
    }
}
