package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dhig;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetLastAttestationResultResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhig();
    final int a;
    final long b;

    public GetLastAttestationResultResponse(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetLastAttestationResultResponse) {
            GetLastAttestationResultResponse getLastAttestationResultResponse = (GetLastAttestationResultResponse) obj;
            if (this.a == getLastAttestationResultResponse.a && this.b == getLastAttestationResultResponse.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("result", Integer.valueOf(this.a), arrayList);
        atyp.b("timeMillis", Long.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
