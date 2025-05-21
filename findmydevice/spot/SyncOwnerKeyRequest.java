package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcws;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SyncOwnerKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcws();
    public Account a;
    public int b;

    private SyncOwnerKeyRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SyncOwnerKeyRequest) {
            SyncOwnerKeyRequest syncOwnerKeyRequest = (SyncOwnerKeyRequest) obj;
            if (arwb.b(this.a, syncOwnerKeyRequest.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(syncOwnerKeyRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 5, this.b);
        arxc.c(parcel, a);
    }

    public SyncOwnerKeyRequest(Account account, int i) {
        this.a = account;
        this.b = i;
    }
}
