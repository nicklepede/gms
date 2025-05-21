package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.zli;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zli();
    public int a;
    public String b;
    public int c;
    public long d;

    public RequestResult() {
        this.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestResult) {
            RequestResult requestResult = (RequestResult) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(requestResult.a)) && arwb.b(this.b, requestResult.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(requestResult.c)) && arwb.b(Long.valueOf(this.d), Long.valueOf(requestResult.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), str, Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public RequestResult(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }
}
