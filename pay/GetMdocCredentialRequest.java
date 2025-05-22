package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvll;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetMdocCredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvll();
    public String a;
    public byte[] b;
    public byte[] c;

    public GetMdocCredentialRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMdocCredentialRequest) {
            GetMdocCredentialRequest getMdocCredentialRequest = (GetMdocCredentialRequest) obj;
            if (atyq.b(this.a, getMdocCredentialRequest.a) && Arrays.equals(this.b, getMdocCredentialRequest.b) && Arrays.equals(this.c, getMdocCredentialRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 5, this.c, false);
        atzr.c(parcel, a);
    }

    public GetMdocCredentialRequest(String str, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
    }
}
