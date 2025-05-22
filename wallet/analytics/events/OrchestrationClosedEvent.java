package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkri;
import defpackage.dksd;
import defpackage.dkwd;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eoqn;
import defpackage.eore;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationClosedEvent extends AnalyticsSessionStartEndEvent implements dlhd, dksd {
    public static final Parcelable.Creator CREATOR = new dkri();
    private final int c;
    private final int d;
    private final int e;

    public OrchestrationClosedEvent(int i, int i2, int i3, String str, String str2) {
        this.m = str2;
        this.a = str;
        this.d = i;
        this.c = i2;
        this.e = i3;
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        int i = this.d;
        eoqn eoqnVar = (eoqn) fgrcVar.b;
        eoqn eoqnVar2 = eoqn.a;
        eoqnVar.c = i - 1;
        eoqnVar.b |= 1;
        int i2 = this.c;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        fgri fgriVar = fgrcVar.b;
        eoqn eoqnVar3 = (eoqn) fgriVar;
        eoqnVar3.b |= 2;
        eoqnVar3.d = i2;
        int i3 = this.e;
        if (!fgriVar.L()) {
            fgrcVar.U();
        }
        eoqn eoqnVar4 = (eoqn) fgrcVar.b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        eoqnVar4.k = i4;
        eoqnVar4.b |= 64;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.d - 1);
        parcel.writeInt(this.c);
        int i2 = this.e;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
    }

    public OrchestrationClosedEvent(Parcel parcel) {
        super(parcel);
        this.d = dkwd.a(parcel.readInt());
        this.c = parcel.readInt();
        this.e = eore.a(parcel.readInt());
    }
}
