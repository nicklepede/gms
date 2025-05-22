package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrj;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eoqn;
import defpackage.eoqy;
import defpackage.eoqz;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationDcbEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrj();
    private final int a;

    public OrchestrationDcbEvent(String str, int i) {
        this.m = str;
        this.a = i;
    }

    public static void a(Context context, String str, int i) {
        dlgt.a(context, new OrchestrationDcbEvent(str, i));
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eoqz.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        eoqz eoqzVar = (eoqz) v.b;
        eoqzVar.c = i - 1;
        eoqzVar.b |= 1;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        eoqn eoqnVar = (eoqn) fgrcVar.b;
        eoqz eoqzVar2 = (eoqz) v.Q();
        eoqn eoqnVar2 = eoqn.a;
        eoqzVar2.getClass();
        eoqnVar.g = eoqzVar2;
        eoqnVar.b |= 4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a - 1);
    }

    public OrchestrationDcbEvent(Parcel parcel) {
        super(parcel);
        int a = eoqy.a(parcel.readInt());
        if (a == 0) {
            this.a = 1;
        } else {
            this.a = a;
        }
    }
}
