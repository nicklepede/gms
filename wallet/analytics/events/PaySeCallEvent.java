package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrx;
import defpackage.dldv;
import defpackage.ehqn;
import defpackage.eosf;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PaySeCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkrx();
    public final eosf c;

    public PaySeCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (eosf) ehqn.f(parcel, (fgtg) eosf.a.iQ(7, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ehqn.o(this.c, parcel);
    }

    public PaySeCallEvent(String str, eosf eosfVar, String str2, String str3) {
        this.m = dldv.a();
        this.c = eosfVar;
        this.a = str;
        this.b = str2 + this.a + str3;
    }
}
