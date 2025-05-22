package com.google.android.gms.mdocstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cfnw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MakeCryptoSchemeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfnw();
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
            if (atyq.b(this.a, makeCryptoSchemeRequest.a) && atyq.b(this.b, makeCryptoSchemeRequest.b) && Arrays.equals(this.c, makeCryptoSchemeRequest.c)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public MakeCryptoSchemeRequest(Account account, ProvisioningId provisioningId, byte[] bArr) {
        this.a = account;
        this.b = provisioningId;
        this.c = bArr;
    }
}
