package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.difx;
import defpackage.digs;
import defpackage.diks;
import defpackage.divs;
import defpackage.divt;
import defpackage.emcz;
import defpackage.emdq;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OrchestrationClosedEvent extends AnalyticsSessionStartEndEvent implements divs, digs {
    public static final Parcelable.Creator CREATOR = new difx();
    private final int c;
    private final int d;
    private final int e;

    public OrchestrationClosedEvent(int i, int i2, int i3, String str, String str2) {
        this.m = str2;
        this.a = str;
        this.d = i;
        this.c = i2;
        this.e = i3;
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        int i = this.d;
        emcz emczVar = (emcz) fecjVar.b;
        emcz emczVar2 = emcz.a;
        emczVar.c = i - 1;
        emczVar.b |= 1;
        int i2 = this.c;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fecp fecpVar = fecjVar.b;
        emcz emczVar3 = (emcz) fecpVar;
        emczVar3.b |= 2;
        emczVar3.d = i2;
        int i3 = this.e;
        if (!fecpVar.L()) {
            fecjVar.U();
        }
        emcz emczVar4 = (emcz) fecjVar.b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        emczVar4.k = i4;
        emczVar4.b |= 64;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.d - 1);
        parcel.writeInt(this.c);
        int i2 = this.e;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
    }

    public OrchestrationClosedEvent(Parcel parcel) {
        super(parcel);
        this.d = diks.a(parcel.readInt());
        this.c = parcel.readInt();
        this.e = emdq.a(parcel.readInt());
    }
}
