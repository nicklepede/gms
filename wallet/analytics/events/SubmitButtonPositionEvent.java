package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dksb;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eoqm;
import defpackage.eoqn;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SubmitButtonPositionEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dksb();
    public final boolean a;
    public final int b;

    public SubmitButtonPositionEvent(int i, boolean z, String str) {
        this.b = i;
        this.a = z;
        this.m = str;
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        int i = this.b;
        eoqn eoqnVar = (eoqn) fgrcVar.b;
        eoqn eoqnVar2 = eoqn.a;
        eoqnVar.i = i - 1;
        eoqnVar.b |= 16;
        boolean z = this.a;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        eoqn eoqnVar3 = (eoqn) fgrcVar.b;
        eoqnVar3.b |= 32;
        eoqnVar3.j = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b - 1);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public SubmitButtonPositionEvent(Parcel parcel) {
        super(parcel);
        int a = eoqm.a(parcel.readInt());
        this.b = a == 0 ? 1 : a;
        this.a = parcel.readInt() == 1;
    }
}
