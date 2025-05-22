package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SetOwnerKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexy();
    public Account a;
    public int b;
    public byte[] c;

    private SetOwnerKeyRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetOwnerKeyRequest) {
            SetOwnerKeyRequest setOwnerKeyRequest = (SetOwnerKeyRequest) obj;
            if (atyq.b(this.a, setOwnerKeyRequest.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(setOwnerKeyRequest.b)) && Arrays.equals(this.c, setOwnerKeyRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public SetOwnerKeyRequest(Account account, int i, byte[] bArr) {
        this.a = account;
        this.b = i;
        this.c = bArr;
    }
}
