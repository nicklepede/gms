package com.google.android.gms.nearby.discovery.fastpair.halfsheet.fragments.spot.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.chlf;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.eygp;
import java.util.Random;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SpotPairingSessionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new chlf();
    public final byte[] a;
    public final Account b;
    public final int c;
    public final int d;
    public final String e;

    public SpotPairingSessionData(byte[] bArr, Account account, int i, int i2, String str) {
        eiig.x(bArr);
        eiig.x(account);
        this.a = bArr;
        this.b = account;
        this.c = i;
        this.d = i2;
        this.e = eiif.b(str);
    }

    public static int a() {
        return new Random().nextInt(2147483646) + 1;
    }

    public static SpotPairingSessionData b(byte[] bArr, Account account, eygp eygpVar, int i, String str) {
        return new SpotPairingSessionData(bArr, account, eygpVar.g, i, eiif.b(str));
    }

    public final eygp c() {
        eygp b = eygp.b(this.c);
        eiig.x(b);
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public SpotPairingSessionData(byte[] bArr, Account account, eygp eygpVar) {
        this(bArr, account, eygpVar.g, a(), "");
    }
}
