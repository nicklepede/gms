package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dexc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetLastAttestationResultResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexc();
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
        arwa.b("result", Integer.valueOf(this.a), arrayList);
        arwa.b("timeMillis", Long.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
