package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrh;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.ejzq;
import defpackage.ejzv;
import defpackage.eoqp;
import defpackage.eoqq;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationApiEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrh();
    public int a;
    private String b;
    private long c;
    private byte[] d;

    public OrchestrationApiEvent(String str) {
        this.a = 1;
        this.m = str;
    }

    public static void a(Context context, int i, ejzq ejzqVar, ejzv ejzvVar, String str) {
        OrchestrationApiEvent orchestrationApiEvent = new OrchestrationApiEvent(str);
        orchestrationApiEvent.a = i;
        if (ejzqVar != null) {
            orchestrationApiEvent.c = ejzqVar.e;
            orchestrationApiEvent.d = ejzqVar.g.M();
        }
        if (ejzvVar != null) {
            orchestrationApiEvent.b = ejzvVar.h;
        }
        dlgt.a(context, orchestrationApiEvent);
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eoqq.a.v();
        int i = this.a;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eoqq eoqqVar = (eoqq) fgriVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        eoqqVar.c = i2;
        eoqqVar.b |= 1;
        long j = this.c;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eoqq eoqqVar2 = (eoqq) fgriVar2;
        eoqqVar2.b |= 4;
        eoqqVar2.e = j;
        String str = this.b;
        if (str != null) {
            if (!fgriVar2.L()) {
                v.U();
            }
            eoqq eoqqVar3 = (eoqq) v.b;
            eoqqVar3.b |= 2;
            eoqqVar3.d = str;
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            fgpr w = fgpr.w(bArr);
            if (!v.b.L()) {
                v.U();
            }
            eoqq eoqqVar4 = (eoqq) v.b;
            eoqqVar4.b |= 8;
            eoqqVar4.f = w;
        }
        dlheVar.a.add((eoqq) v.Q());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
        String str = this.b;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeLong(this.c);
        byte[] bArr = this.d;
        if (bArr == null) {
            bArr = new byte[0];
        }
        parcel.writeByteArray(bArr);
    }

    public OrchestrationApiEvent(Parcel parcel) {
        super(parcel);
        this.a = 1;
        this.a = eoqp.a(parcel.readInt());
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.createByteArray();
    }
}
