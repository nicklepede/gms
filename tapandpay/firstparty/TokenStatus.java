package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dexx();
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
            if (arwb.b(this.a, tokenStatus.a) && this.b == tokenStatus.b && this.c == tokenStatus.c && arwb.b(this.d, tokenStatus.d)) {
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
        arwa.b("tokenReference", this.a, arrayList);
        arwa.b("tokenState", Integer.valueOf(this.b), arrayList);
        arwa.b("isSelected", Boolean.valueOf(this.c), arrayList);
        arwa.b("auxiliaryTokenReference", this.d, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.o(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }
}
