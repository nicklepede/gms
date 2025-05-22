package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SyncTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnr();
    public boolean a;
    public byte[] b;

    private SyncTransactionsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SyncTransactionsResponse) {
            SyncTransactionsResponse syncTransactionsResponse = (SyncTransactionsResponse) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(syncTransactionsResponse.a)) && Arrays.equals(this.b, syncTransactionsResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public SyncTransactionsResponse(boolean z, byte[] bArr) {
        this.a = z;
        this.b = bArr;
    }
}
