package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.beye;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SyncOwnerKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new beye();
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
            if (atyq.b(this.a, syncOwnerKeyRequest.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(syncOwnerKeyRequest.b))) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 5, this.b);
        atzr.c(parcel, a);
    }

    public SyncOwnerKeyRequest(Account account, int i) {
        this.a = account;
        this.b = i;
    }
}
