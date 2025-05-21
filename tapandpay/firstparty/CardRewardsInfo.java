package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dewq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class CardRewardsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dewq();
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
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(cardRewardsInfo.a)) && arwb.b(this.b, cardRewardsInfo.b) && arwb.b(this.c, cardRewardsInfo.c) && arwb.b(this.d, cardRewardsInfo.d) && arwb.b(this.e, cardRewardsInfo.e)) {
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
        arwa.b("expirationTimestamp", Long.valueOf(this.a), arrayList);
        arwa.b("websiteUrl", this.b, arrayList);
        arwa.b("websiteRedirectText", this.c, arrayList);
        arwa.b("legalDisclaimer", this.d, arrayList);
        arwa.b("summary", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
