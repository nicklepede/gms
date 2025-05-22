package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments.spot.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cjtg;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.favb;
import java.util.Random;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SpotPairingSessionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cjtg();
    public final byte[] a;
    public final Account b;
    public final int c;
    public final int d;
    public final String e;

    public SpotPairingSessionData(byte[] bArr, Account account, int i, int i2, String str) {
        ekvl.y(bArr);
        ekvl.y(account);
        this.a = bArr;
        this.b = account;
        this.c = i;
        this.d = i2;
        this.e = ekvk.b(str);
    }

    public static int a() {
        return new Random().nextInt(2147483646) + 1;
    }

    public static SpotPairingSessionData b(byte[] bArr, Account account, favb favbVar, int i, String str) {
        return new SpotPairingSessionData(bArr, account, favbVar.g, i, ekvk.b(str));
    }

    public final favb c() {
        favb b = favb.b(this.c);
        ekvl.y(b);
        return b;
    }

    public final boolean d() {
        int ordinal = c().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return false;
        }
        throw new AssertionError("unreachable");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public SpotPairingSessionData(byte[] bArr, Account account, favb favbVar) {
        this(bArr, account, favbVar.g, a(), "");
    }
}
