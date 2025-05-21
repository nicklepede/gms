package com.google.android.gms.mdocstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdocstore.types.CryptoSchemeId;
import com.google.android.gms.mdocstore.types.UnencryptedData;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdev;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class EncryptDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdev();
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
            if (arwb.b(this.a, encryptDataRequest.a) && arwb.b(this.b, encryptDataRequest.b) && Arrays.equals(this.c, encryptDataRequest.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(encryptDataRequest.d))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.J(parcel, 3, this.c, i);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public EncryptDataRequest(Account account, CryptoSchemeId cryptoSchemeId, UnencryptedData[] unencryptedDataArr, boolean z) {
        this.a = account;
        this.b = cryptoSchemeId;
        this.c = unencryptedDataArr;
        this.d = z;
    }
}
