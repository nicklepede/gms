package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.diga;
import defpackage.disk;
import defpackage.divs;
import defpackage.divt;
import defpackage.djdi;
import defpackage.emcz;
import defpackage.emen;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OrchestrationLaunchedEvent extends AnalyticsSessionStartEndEvent implements divs {
    public static final Parcelable.Creator CREATOR = new diga();
    private final BuyFlowConfig c;
    private final emen d;

    public OrchestrationLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.d = emen.b(parcel.readInt());
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        divtVar.g(this.c, context);
        divtVar.l = this.b;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        emen emenVar = this.d;
        emcz emczVar = (emcz) fecjVar.b;
        emcz emczVar2 = emcz.a;
        emczVar.h = emenVar.s;
        emczVar.b |= 8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        djdi.a(this.c, parcel, i);
        parcel.writeInt(this.d.s);
    }

    public OrchestrationLaunchedEvent(BuyFlowConfig buyFlowConfig, String str, emen emenVar) {
        this.m = disk.a();
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
        this.c = buyFlowConfig;
        this.d = emenVar;
    }
}
