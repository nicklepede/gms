package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digb;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.edml;
import defpackage.emfu;
import defpackage.emfv;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OrchestrationViewEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new digb();
    private final int a;
    private final int b;

    public OrchestrationViewEvent(String str, int i, int i2) {
        this.m = str;
        this.a = i;
        this.b = i2;
    }

    public static void a(Context context, String str, edml edmlVar) {
        e(context, str, edmlVar, 2);
    }

    public static void c(Context context, String str, edml edmlVar) {
        e(context, str, edmlVar, 3);
    }

    public static void d(Context context, String str, edml edmlVar) {
        e(context, str, edmlVar, 1);
    }

    public static void e(Context context, String str, edml edmlVar, int i) {
        if (edmlVar == null) {
            return;
        }
        divi.a(context, new OrchestrationViewEvent(str, edmlVar.a, i));
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emfv.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        fecp fecpVar = v.b;
        emfv emfvVar = (emfv) fecpVar;
        emfvVar.b |= 1;
        emfvVar.c = i;
        if (!fecpVar.L()) {
            v.U();
        }
        int i2 = this.b;
        emfv emfvVar2 = (emfv) v.b;
        emfvVar2.d = i2;
        emfvVar2.b |= 2;
        divtVar.c.add((emfv) v.Q());
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
        int a = emfu.a(parcel.readInt());
        this.b = a == 0 ? 1 : a;
    }
}
