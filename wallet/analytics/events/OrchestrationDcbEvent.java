package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dify;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.emcz;
import defpackage.emdk;
import defpackage.emdl;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OrchestrationDcbEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new dify();
    private final int a;

    public OrchestrationDcbEvent(String str, int i) {
        this.m = str;
        this.a = i;
    }

    public static void a(Context context, String str, int i) {
        divi.a(context, new OrchestrationDcbEvent(str, i));
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emdl.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        emdl emdlVar = (emdl) v.b;
        emdlVar.c = i - 1;
        emdlVar.b |= 1;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        emcz emczVar = (emcz) fecjVar.b;
        emdl emdlVar2 = (emdl) v.Q();
        emcz emczVar2 = emcz.a;
        emdlVar2.getClass();
        emczVar.g = emdlVar2;
        emczVar.b |= 4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a - 1);
    }

    public OrchestrationDcbEvent(Parcel parcel) {
        super(parcel);
        int a = emdk.a(parcel.readInt());
        if (a == 0) {
            this.a = 1;
        } else {
            this.a = a;
        }
    }
}
