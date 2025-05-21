package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dign;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.emet;
import defpackage.emeu;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentMethodsActionEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new dign();
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
        divi.a(context, new PaymentMethodsActionEvent(str, i, i2, -1));
    }

    public static void c(Context context, String str, int i, int i2) {
        divi.a(context, new PaymentMethodsActionEvent(str, i, 5, i2));
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emeu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        fecp fecpVar = v.b;
        emeu emeuVar = (emeu) fecpVar;
        emeuVar.b |= 1;
        emeuVar.c = i;
        int i2 = this.c;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emeu emeuVar2 = (emeu) fecpVar2;
        emeuVar2.d = i2 - 1;
        emeuVar2.b |= 2;
        int i3 = this.b;
        if (!fecpVar2.L()) {
            v.U();
        }
        emeu emeuVar3 = (emeu) v.b;
        emeuVar3.b |= 4;
        emeuVar3.e = i3;
        divtVar.d.add((emeu) v.Q());
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
        int a = emet.a(parcel.readInt());
        this.c = a == 0 ? 1 : a;
        this.b = parcel.readInt();
    }
}
