package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ceat;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class WalletBalanceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceat();
    public long a;
    public String b;
    public int c;
    public Long d;
    public String e;
    public String f;
    public Long g;
    public Long h;
    public Long i;
    public String j;

    public WalletBalanceInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletBalanceInfo) {
            WalletBalanceInfo walletBalanceInfo = (WalletBalanceInfo) obj;
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(walletBalanceInfo.a)) && arwb.b(this.b, walletBalanceInfo.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(walletBalanceInfo.c)) && arwb.b(this.d, walletBalanceInfo.d) && arwb.b(this.e, walletBalanceInfo.e) && arwb.b(this.f, walletBalanceInfo.f) && arwb.b(this.g, walletBalanceInfo.g) && arwb.b(this.h, walletBalanceInfo.h) && arwb.b(this.i, walletBalanceInfo.i) && arwb.b(this.j, walletBalanceInfo.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.I(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.I(parcel, 7, this.g);
        arxc.I(parcel, 8, this.h);
        arxc.I(parcel, 9, this.i);
        arxc.v(parcel, 10, this.j, false);
        arxc.c(parcel, a);
    }

    public WalletBalanceInfo(long j, String str, int i, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = str4;
    }
}
