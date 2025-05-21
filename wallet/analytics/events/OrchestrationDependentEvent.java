package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.difz;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OrchestrationDependentEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new difz();
    private final String a;
    private final int b;

    public OrchestrationDependentEvent(String str, String str2) {
        this.m = str;
        this.a = str2;
        this.b = 1;
    }

    public static void a(Context context, String str, String str2) {
        divi.a(context, new OrchestrationDependentEvent(str, str2));
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        divtVar.g = this.b;
        divtVar.h = this.a;
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
