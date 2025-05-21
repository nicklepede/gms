package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bmgb;
import defpackage.zck;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CallerVerificationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zck();
    public final String a;
    public final String b;
    public final int c;

    public CallerVerificationRequest(String str, String str2, int i) {
        int a = bmgb.a(i);
        arwm.c(a != 0, "Page name must be resolve to an existing PageNumber and be non-null");
        this.a = str;
        this.b = str2;
        this.c = a;
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        arxc.o(parcel, 4, i2 - 1);
        arxc.c(parcel, a);
    }
}
