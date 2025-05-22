package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adbn;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RecoveryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adbn();
    public String a;
    public String b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;

    public RecoveryRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecoveryRequest) {
            RecoveryRequest recoveryRequest = (RecoveryRequest) obj;
            if (atyq.b(this.a, recoveryRequest.a) && atyq.b(this.b, recoveryRequest.b) && Arrays.equals(this.c, recoveryRequest.c) && Arrays.equals(this.d, recoveryRequest.d) && Arrays.equals(this.e, recoveryRequest.e) && Arrays.equals(this.f, recoveryRequest.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.i(parcel, 5, this.e, false);
        atzr.i(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public RecoveryRequest(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
    }
}
