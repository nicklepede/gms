package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbny;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class KeyCreationRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbny();
    public final String a;
    public final boolean b;
    public final int c;
    public final int[] d;
    public final byte[] e;
    public final String f;
    public final String g;
    public final Account h;
    public final boolean i;
    public final boolean j;

    public KeyCreationRequestOptions(String str, boolean z, int i, int[] iArr, byte[] bArr, String str2, String str3, Account account, boolean z2, boolean z3) {
        boolean z4 = false;
        if (str != null && str.length() > 0) {
            z4 = true;
        }
        arwm.c(z4, "rpId cannot be empty");
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = iArr;
        this.e = bArr;
        this.f = str2;
        this.g = str3;
        this.h = account;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KeyCreationRequestOptions)) {
            return false;
        }
        KeyCreationRequestOptions keyCreationRequestOptions = (KeyCreationRequestOptions) obj;
        return arwb.b(this.a, keyCreationRequestOptions.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(keyCreationRequestOptions.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(keyCreationRequestOptions.c)) && arwb.b(this.d, keyCreationRequestOptions.d) && Arrays.equals(this.e, keyCreationRequestOptions.e) && arwb.b(this.f, keyCreationRequestOptions.f) && arwb.b(this.g, keyCreationRequestOptions.g) && arwb.b(this.h, keyCreationRequestOptions.h) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(keyCreationRequestOptions.i)) && arwb.b(Boolean.valueOf(this.j), Boolean.valueOf(keyCreationRequestOptions.j));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.p(parcel, 4, this.d, false);
        arxc.i(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.e(parcel, 9, this.i);
        arxc.e(parcel, 10, this.j);
        arxc.c(parcel, a);
    }
}
