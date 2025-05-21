package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digc;
import defpackage.diks;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.emdq;
import defpackage.emeo;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OverlayActivityActionEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new digc();
    final int a;
    int b;
    final int c;

    public OverlayActivityActionEvent(String str, int i, int i2, int i3) {
        this.m = str;
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public static void a(Context context, String str, int i, int i2, int i3) {
        divi.a(context, new OverlayActivityActionEvent(str, i, i2, i3));
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emeo.a.v();
        int i = this.b;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        emeo emeoVar = (emeo) fecpVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        emeoVar.d = i2;
        emeoVar.b |= 2;
        int i3 = this.c;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emeo emeoVar2 = (emeo) fecpVar2;
        emeoVar2.c = i3 - 1;
        emeoVar2.b |= 1;
        int i4 = this.a;
        if (!fecpVar2.L()) {
            v.U();
        }
        emeo emeoVar3 = (emeo) v.b;
        emeoVar3.b |= 4;
        emeoVar3.e = i4;
        divtVar.e.add((emeo) v.Q());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
        parcel.writeInt(this.c - 1);
        parcel.writeInt(this.a);
    }

    public OverlayActivityActionEvent(Parcel parcel) {
        super(parcel);
        this.b = 1;
        this.b = emdq.a(parcel.readInt());
        this.c = diks.a(parcel.readInt());
        this.a = parcel.readInt();
    }
}
