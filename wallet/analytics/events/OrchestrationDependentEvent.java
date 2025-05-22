package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrk;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationDependentEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrk();
    private final String a;
    private final int b;

    public OrchestrationDependentEvent(String str, String str2) {
        this.m = str;
        this.a = str2;
        this.b = 1;
    }

    public static void a(Context context, String str, String str2) {
        dlgt.a(context, new OrchestrationDependentEvent(str, str2));
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        dlheVar.g = this.b;
        dlheVar.h = this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public OrchestrationDependentEvent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }
}
