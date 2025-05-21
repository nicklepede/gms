package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digq;
import defpackage.divs;
import defpackage.divt;
import defpackage.emcy;
import defpackage.emcz;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SubmitButtonPositionEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new digq();
    public final boolean a;
    public final int b;

    public SubmitButtonPositionEvent(int i, boolean z, String str) {
        this.b = i;
        this.a = z;
        this.m = str;
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        int i = this.b;
        emcz emczVar = (emcz) fecjVar.b;
        emcz emczVar2 = emcz.a;
        emczVar.i = i - 1;
        emczVar.b |= 16;
        boolean z = this.a;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        emcz emczVar3 = (emcz) fecjVar.b;
        emczVar3.b |= 32;
        emczVar3.j = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b - 1);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public SubmitButtonPositionEvent(Parcel parcel) {
        super(parcel);
        int a = emcy.a(parcel.readInt());
        this.b = a == 0 ? 1 : a;
        this.a = parcel.readInt() == 1;
    }
}
