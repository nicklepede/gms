package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrn;
import defpackage.dkwd;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eore;
import defpackage.eosc;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OverlayActivityActionEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrn();
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
        dlgt.a(context, new OverlayActivityActionEvent(str, i, i2, i3));
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eosc.a.v();
        int i = this.b;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eosc eoscVar = (eosc) fgriVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        eoscVar.d = i2;
        eoscVar.b |= 2;
        int i3 = this.c;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eosc eoscVar2 = (eosc) fgriVar2;
        eoscVar2.c = i3 - 1;
        eoscVar2.b |= 1;
        int i4 = this.a;
        if (!fgriVar2.L()) {
            v.U();
        }
        eosc eoscVar3 = (eosc) v.b;
        eoscVar3.b |= 4;
        eoscVar3.e = i4;
        dlheVar.e.add((eosc) v.Q());
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
        this.b = eore.a(parcel.readInt());
        this.c = dkwd.a(parcel.readInt());
        this.a = parcel.readInt();
    }
}
