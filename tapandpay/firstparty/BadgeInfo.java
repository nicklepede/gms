package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhhs;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class BadgeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhhs();
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
            if (this.c == badgeInfo.c && atyq.b(this.a, badgeInfo.a) && Arrays.equals(this.b, badgeInfo.b) && atyq.b(this.d, badgeInfo.d) && atyq.b(this.e, badgeInfo.e) && atyq.b(this.f, badgeInfo.f)) {
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
        atyp.b("clientTokenId", this.a, arrayList);
        byte[] bArr = this.b;
        atyp.b("serverToken", bArr == null ? null : Arrays.toString(bArr), arrayList);
        atyp.b("cardNetwork", Integer.valueOf(this.c), arrayList);
        atyp.b("tokenStatus", this.d, arrayList);
        atyp.b("tokenLastDigits", this.e, arrayList);
        atyp.b("transactionInfo", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }
}
