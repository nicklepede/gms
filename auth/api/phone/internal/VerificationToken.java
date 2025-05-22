package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ablw;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class VerificationToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ablw();
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
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(verificationToken.a)) && atyq.b(this.b, verificationToken.b)) {
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public VerificationToken(long j, String str) {
        this.a = j;
        this.b = str;
    }
}
