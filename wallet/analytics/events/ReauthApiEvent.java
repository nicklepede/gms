package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digo;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.emew;
import defpackage.emex;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ReauthApiEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new digo();
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
        divi.a(context, reauthApiEvent);
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emex.a.v();
        int i = this.c;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        emex emexVar = (emex) fecpVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        emexVar.c = i2;
        emexVar.b |= 1;
        long j = this.a;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emex emexVar2 = (emex) fecpVar2;
        emexVar2.b |= 2;
        emexVar2.d = j;
        int i3 = this.b;
        if (!fecpVar2.L()) {
            v.U();
        }
        emex emexVar3 = (emex) v.b;
        emexVar3.b |= 4;
        emexVar3.e = i3;
        divtVar.b.add((emex) v.Q());
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
        int a = emew.a(parcel.readInt());
        this.c = a;
        if (a == 0) {
            this.c = 1;
        }
        this.a = parcel.readLong();
        this.b = parcel.readInt();
    }
}
