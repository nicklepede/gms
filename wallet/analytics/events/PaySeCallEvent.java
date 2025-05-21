package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digm;
import defpackage.disk;
import defpackage.efdk;
import defpackage.emer;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PaySeCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digm();
    public final emer c;

    public PaySeCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (emer) efdk.f(parcel, (feen) emer.a.iB(7, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        efdk.o(this.c, parcel);
    }

    public PaySeCallEvent(String str, emer emerVar, String str2, String str3) {
        this.m = disk.a();
        this.c = emerVar;
        this.a = str;
        this.b = str2 + this.a + str3;
    }
}
