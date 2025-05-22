package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhhu;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CardRewardsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhhu();
    final long a;
    final String b;
    final String c;
    final String d;
    final String e;

    public CardRewardsInfo(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardRewardsInfo) {
            CardRewardsInfo cardRewardsInfo = (CardRewardsInfo) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(cardRewardsInfo.a)) && atyq.b(this.b, cardRewardsInfo.b) && atyq.b(this.c, cardRewardsInfo.c) && atyq.b(this.d, cardRewardsInfo.d) && atyq.b(this.e, cardRewardsInfo.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("expirationTimestamp", Long.valueOf(this.a), arrayList);
        atyp.b("websiteUrl", this.b, arrayList);
        atyp.b("websiteRedirectText", this.c, arrayList);
        atyp.b("legalDisclaimer", this.d, arrayList);
        atyp.b("summary", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
