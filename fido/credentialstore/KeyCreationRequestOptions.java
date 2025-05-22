package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdrp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class KeyCreationRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdrp();
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
        atzb.c(z4, "rpId cannot be empty");
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
        return atyq.b(this.a, keyCreationRequestOptions.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(keyCreationRequestOptions.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(keyCreationRequestOptions.c)) && atyq.b(this.d, keyCreationRequestOptions.d) && Arrays.equals(this.e, keyCreationRequestOptions.e) && atyq.b(this.f, keyCreationRequestOptions.f) && atyq.b(this.g, keyCreationRequestOptions.g) && atyq.b(this.h, keyCreationRequestOptions.h) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(keyCreationRequestOptions.i)) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(keyCreationRequestOptions.j));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.p(parcel, 4, this.d, false);
        atzr.i(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.e(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.c(parcel, a);
    }
}
