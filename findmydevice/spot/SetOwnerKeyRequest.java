package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcwm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SetOwnerKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcwm();
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
            if (arwb.b(this.a, setOwnerKeyRequest.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(setOwnerKeyRequest.b)) && Arrays.equals(this.c, setOwnerKeyRequest.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public SetOwnerKeyRequest(Account account, int i, byte[] bArr) {
        this.a = account;
        this.b = i;
        this.c = bArr;
    }
}
