package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrz;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eosk;
import defpackage.eosl;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ReauthApiEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrz();
    public long a;
    public int b;
    public int c;

    public ReauthApiEvent(String str) {
        this.c = 1;
        this.m = str;
    }

    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 20 : 26;
        }
        return 25;
    }

    public static int c(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 4;
    }

    public static void d(Context context, int i, long j, int i2, String str) {
        ReauthApiEvent reauthApiEvent = new ReauthApiEvent(str);
        reauthApiEvent.c = i;
        reauthApiEvent.a = j;
        reauthApiEvent.b = i2;
        dlgt.a(context, reauthApiEvent);
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eosl.a.v();
        int i = this.c;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eosl eoslVar = (eosl) fgriVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        eoslVar.c = i2;
        eoslVar.b |= 1;
        long j = this.a;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eosl eoslVar2 = (eosl) fgriVar2;
        eoslVar2.b |= 2;
        eoslVar2.d = j;
        int i3 = this.b;
        if (!fgriVar2.L()) {
            v.U();
        }
        eosl eoslVar3 = (eosl) v.b;
        eoslVar3.b |= 4;
        eoslVar3.e = i3;
        dlheVar.b.add((eosl) v.Q());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }

    public ReauthApiEvent(Parcel parcel) {
        super(parcel);
        this.c = 1;
        int a = eosk.a(parcel.readInt());
        this.c = a;
        if (a == 0) {
            this.c = 1;
        }
        this.a = parcel.readLong();
        this.b = parcel.readInt();
    }
}
