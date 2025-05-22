package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkrl;
import defpackage.dldv;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.dlpb;
import defpackage.eoqn;
import defpackage.eosb;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationLaunchedEvent extends AnalyticsSessionStartEndEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrl();
    private final BuyFlowConfig c;
    private final eosb d;

    public OrchestrationLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.d = eosb.b(parcel.readInt());
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        dlheVar.g(this.c, context);
        dlheVar.l = this.b;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        eosb eosbVar = this.d;
        eoqn eoqnVar = (eoqn) fgrcVar.b;
        eoqn eoqnVar2 = eoqn.a;
        eoqnVar.h = eosbVar.s;
        eoqnVar.b |= 8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        dlpb.a(this.c, parcel, i);
        parcel.writeInt(this.d.s);
    }

    public OrchestrationLaunchedEvent(BuyFlowConfig buyFlowConfig, String str, eosb eosbVar) {
        this.m = dldv.a();
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
        this.c = buyFlowConfig;
        this.d = eosbVar;
    }
}
