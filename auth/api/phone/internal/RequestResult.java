package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abli;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abli();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(requestResult.a)) && atyq.b(this.b, requestResult.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(requestResult.c)) && atyq.b(Long.valueOf(this.d), Long.valueOf(requestResult.d))) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public RequestResult(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }
}
