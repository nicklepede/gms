package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.difq;
import defpackage.disk;
import defpackage.divi;
import defpackage.efdk;
import defpackage.emeb;
import defpackage.emfa;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoadPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new difq();
    public final BuyFlowConfig c;
    public final emeb d;
    public final emfa e;

    public LoadPaymentDataCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(LoadPaymentDataCallEvent.class.getClassLoader());
        this.d = (emeb) efdk.f(parcel, (feen) emeb.a.iB(7, null));
        this.e = (emfa) efdk.f(parcel, (feen) emfa.a.iB(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, emeb emebVar, emfa emfaVar) {
        divi.a(context, new LoadPaymentDataCallEvent(buyFlowConfig, emebVar, emfaVar));
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
        efdk.o(this.e, parcel);
    }

    public LoadPaymentDataCallEvent(BuyFlowConfig buyFlowConfig, emeb emebVar, emfa emfaVar) {
        ApplicationParameters applicationParameters;
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.d = emebVar;
        this.e = emfaVar;
        if (buyFlowConfig != null && (applicationParameters = buyFlowConfig.b) != null) {
            Account account = applicationParameters.b;
            this.a = account != null ? account.name : null;
        }
        this.b = a(buyFlowConfig, this.a);
    }
}
