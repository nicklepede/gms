package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkry;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eosh;
import defpackage.eosi;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentMethodsActionEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkry();
    final int a;
    final int b;
    final int c;

    public PaymentMethodsActionEvent(String str, int i, int i2, int i3) {
        this.m = str;
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static void a(Context context, String str, int i, int i2) {
        dlgt.a(context, new PaymentMethodsActionEvent(str, i, i2, -1));
    }

    public static void c(Context context, String str, int i, int i2) {
        dlgt.a(context, new PaymentMethodsActionEvent(str, i, 5, i2));
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eosi.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        fgri fgriVar = v.b;
        eosi eosiVar = (eosi) fgriVar;
        eosiVar.b |= 1;
        eosiVar.c = i;
        int i2 = this.c;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eosi eosiVar2 = (eosi) fgriVar2;
        eosiVar2.d = i2 - 1;
        eosiVar2.b |= 2;
        int i3 = this.b;
        if (!fgriVar2.L()) {
            v.U();
        }
        eosi eosiVar3 = (eosi) v.b;
        eosiVar3.b |= 4;
        eosiVar3.e = i3;
        dlheVar.d.add((eosi) v.Q());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.c - 1);
        parcel.writeInt(this.b);
    }

    public PaymentMethodsActionEvent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        int a = eosh.a(parcel.readInt());
        this.c = a == 0 ? 1 : a;
        this.b = parcel.readInt();
    }
}
