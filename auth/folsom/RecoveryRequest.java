package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abbn;
import defpackage.arwb;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RecoveryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abbn();
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
            if (arwb.b(this.a, recoveryRequest.a) && arwb.b(this.b, recoveryRequest.b) && Arrays.equals(this.c, recoveryRequest.c) && Arrays.equals(this.d, recoveryRequest.d) && Arrays.equals(this.e, recoveryRequest.e) && Arrays.equals(this.f, recoveryRequest.f)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.i(parcel, 5, this.e, false);
        arxc.i(parcel, 6, this.f, false);
        arxc.c(parcel, a);
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
