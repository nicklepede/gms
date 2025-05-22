package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abcf;
import defpackage.atzb;
import defpackage.atzr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CallerVerificationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abcf();
    public final String a;
    public final String b;
    public final int c;

    public CallerVerificationRequest(String str, String str2, int i) {
        atzb.c(i != 0, "Page name must be resolve to an existing PageNumber and be non-null");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CallerVerificationRequest) {
            CallerVerificationRequest callerVerificationRequest = (CallerVerificationRequest) obj;
            if (Objects.equals(this.a, callerVerificationRequest.a) && Objects.equals(this.b, callerVerificationRequest.b) && this.c == callerVerificationRequest.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        atzr.o(parcel, 4, i2 - 1);
        atzr.c(parcel, a);
    }
}
