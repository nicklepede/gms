package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dewo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class BadgeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dewo();
    final String a;
    final byte[] b;
    final int c;
    final TokenStatus d;
    final String e;
    final TransactionInfo f;

    public BadgeInfo(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, TransactionInfo transactionInfo) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = tokenStatus;
        this.e = str2;
        this.f = transactionInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BadgeInfo) {
            BadgeInfo badgeInfo = (BadgeInfo) obj;
            if (this.c == badgeInfo.c && arwb.b(this.a, badgeInfo.a) && Arrays.equals(this.b, badgeInfo.b) && arwb.b(this.d, badgeInfo.d) && arwb.b(this.e, badgeInfo.e) && arwb.b(this.f, badgeInfo.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("clientTokenId", this.a, arrayList);
        byte[] bArr = this.b;
        arwa.b("serverToken", bArr == null ? null : Arrays.toString(bArr), arrayList);
        arwa.b("cardNetwork", Integer.valueOf(this.c), arrayList);
        arwa.b("tokenStatus", this.d, arrayList);
        arwa.b("tokenLastDigits", this.e, arrayList);
        arwa.b("transactionInfo", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }
}
