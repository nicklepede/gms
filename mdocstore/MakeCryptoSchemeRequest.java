package com.google.android.gms.mdocstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdex;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class MakeCryptoSchemeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdex();
    public Account a;
    public ProvisioningId b;
    public byte[] c;

    public MakeCryptoSchemeRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MakeCryptoSchemeRequest) {
            MakeCryptoSchemeRequest makeCryptoSchemeRequest = (MakeCryptoSchemeRequest) obj;
            if (arwb.b(this.a, makeCryptoSchemeRequest.a) && arwb.b(this.b, makeCryptoSchemeRequest.b) && Arrays.equals(this.c, makeCryptoSchemeRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public MakeCryptoSchemeRequest(Account account, ProvisioningId provisioningId, byte[] bArr) {
        this.a = account;
        this.b = provisioningId;
        this.c = bArr;
    }
}
