package com.google.android.gms.mdocstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.UnencryptedData;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cfnu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class EncryptDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfnu();
    public Account a;
    public CryptoSchemeId b;
    public UnencryptedData[] c;
    public boolean d;

    public EncryptDataRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EncryptDataRequest) {
            EncryptDataRequest encryptDataRequest = (EncryptDataRequest) obj;
            if (atyq.b(this.a, encryptDataRequest.a) && atyq.b(this.b, encryptDataRequest.b) && Arrays.equals(this.c, encryptDataRequest.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(encryptDataRequest.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.J(parcel, 3, this.c, i);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public EncryptDataRequest(Account account, CryptoSchemeId cryptoSchemeId, UnencryptedData[] unencryptedDataArr, boolean z) {
        this.a = account;
        this.b = cryptoSchemeId;
        this.c = unencryptedDataArr;
        this.d = z;
    }
}
