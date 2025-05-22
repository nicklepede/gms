package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgka;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class WalletBalanceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgka();
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
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(walletBalanceInfo.a)) && atyq.b(this.b, walletBalanceInfo.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(walletBalanceInfo.c)) && atyq.b(this.d, walletBalanceInfo.d) && atyq.b(this.e, walletBalanceInfo.e) && atyq.b(this.f, walletBalanceInfo.f) && atyq.b(this.g, walletBalanceInfo.g) && atyq.b(this.h, walletBalanceInfo.h) && atyq.b(this.i, walletBalanceInfo.i) && atyq.b(this.j, walletBalanceInfo.j)) {
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.I(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.I(parcel, 7, this.g);
        atzr.I(parcel, 8, this.h);
        atzr.I(parcel, 9, this.i);
        atzr.v(parcel, 10, this.j, false);
        atzr.c(parcel, a);
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
