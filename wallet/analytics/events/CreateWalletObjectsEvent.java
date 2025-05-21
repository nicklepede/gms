package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.difh;
import defpackage.disk;
import defpackage.divi;
import defpackage.efdk;
import defpackage.emdf;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CreateWalletObjectsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new difh();
    public final BuyFlowConfig c;
    public final emdf d;

    public CreateWalletObjectsEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(CreateWalletObjectsEvent.class.getClassLoader());
        this.d = (emdf) efdk.f(parcel, (feen) emdf.a.iB(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, emdf emdfVar) {
        divi.a(context, new CreateWalletObjectsEvent(buyFlowConfig, emdfVar));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        efdk.o(this.d, parcel);
    }

    public CreateWalletObjectsEvent(BuyFlowConfig buyFlowConfig, emdf emdfVar) {
        ApplicationParameters applicationParameters;
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.d = emdfVar;
        if (buyFlowConfig != null && (applicationParameters = buyFlowConfig.b) != null) {
            Account account = applicationParameters.b;
            this.a = account != null ? account.name : null;
        }
        this.b = a(buyFlowConfig, this.a);
    }
}
