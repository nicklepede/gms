package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkqs;
import defpackage.dldv;
import defpackage.dlgt;
import defpackage.ehqn;
import defpackage.eoqt;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CreateWalletObjectsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkqs();
    public final BuyFlowConfig c;
    public final eoqt d;

    public CreateWalletObjectsEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(CreateWalletObjectsEvent.class.getClassLoader());
        this.d = (eoqt) ehqn.f(parcel, (fgtg) eoqt.a.iQ(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, eoqt eoqtVar) {
        dlgt.a(context, new CreateWalletObjectsEvent(buyFlowConfig, eoqtVar));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        ehqn.o(this.d, parcel);
    }

    public CreateWalletObjectsEvent(BuyFlowConfig buyFlowConfig, eoqt eoqtVar) {
        ApplicationParameters applicationParameters;
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.d = eoqtVar;
        if (buyFlowConfig != null && (applicationParameters = buyFlowConfig.b) != null) {
            Account account = applicationParameters.b;
            this.a = account != null ? account.name : null;
        }
        this.b = a(buyFlowConfig, this.a);
    }
}
