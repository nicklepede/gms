package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrm;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.efzh;
import defpackage.eoti;
import defpackage.eotj;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationViewEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrm();
    private final int a;
    private final int b;

    public OrchestrationViewEvent(String str, int i, int i2) {
        this.m = str;
        this.a = i;
        this.b = i2;
    }

    public static void a(Context context, String str, efzh efzhVar) {
        e(context, str, efzhVar, 2);
    }

    public static void c(Context context, String str, efzh efzhVar) {
        e(context, str, efzhVar, 3);
    }

    public static void d(Context context, String str, efzh efzhVar) {
        e(context, str, efzhVar, 1);
    }

    public static void e(Context context, String str, efzh efzhVar, int i) {
        if (efzhVar == null) {
            return;
        }
        dlgt.a(context, new OrchestrationViewEvent(str, efzhVar.a, i));
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eotj.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        fgri fgriVar = v.b;
        eotj eotjVar = (eotj) fgriVar;
        eotjVar.b |= 1;
        eotjVar.c = i;
        if (!fgriVar.L()) {
            v.U();
        }
        int i2 = this.b;
        eotj eotjVar2 = (eotj) v.b;
        eotjVar2.d = i2;
        eotjVar2.b |= 2;
        dlheVar.c.add((eotj) v.Q());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public OrchestrationViewEvent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        int a = eoti.a(parcel.readInt());
        this.b = a == 0 ? 1 : a;
    }
}
