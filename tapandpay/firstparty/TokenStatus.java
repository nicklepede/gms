package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhjb;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dhjb();
    public final TokenReference a;
    public final int b;
    public final boolean c;
    final TokenReference d;

    public TokenStatus(TokenReference tokenReference, int i, boolean z, TokenReference tokenReference2) {
        this.a = tokenReference;
        this.b = i;
        this.c = z;
        this.d = tokenReference2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (atyq.b(this.a, tokenStatus.a) && this.b == tokenStatus.b && this.c == tokenStatus.c && atyq.b(this.d, tokenStatus.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("tokenReference", this.a, arrayList);
        atyp.b("tokenState", Integer.valueOf(this.b), arrayList);
        atyp.b("isSelected", Boolean.valueOf(this.c), arrayList);
        atyp.b("auxiliaryTokenReference", this.d, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.o(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }
}
