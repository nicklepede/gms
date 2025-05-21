package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.difw;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.ehmk;
import defpackage.ehmp;
import defpackage.emdb;
import defpackage.emdc;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OrchestrationApiEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new difw();
    public int a;
    private String b;
    private long c;
    private byte[] d;

    public OrchestrationApiEvent(String str) {
        this.a = 1;
        this.m = str;
    }

    public static void a(Context context, int i, ehmk ehmkVar, ehmp ehmpVar, String str) {
        OrchestrationApiEvent orchestrationApiEvent = new OrchestrationApiEvent(str);
        orchestrationApiEvent.a = i;
        if (ehmkVar != null) {
            orchestrationApiEvent.c = ehmkVar.e;
            orchestrationApiEvent.d = ehmkVar.g.M();
        }
        if (ehmpVar != null) {
            orchestrationApiEvent.b = ehmpVar.h;
        }
        divi.a(context, orchestrationApiEvent);
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emdc.a.v();
        int i = this.a;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        emdc emdcVar = (emdc) fecpVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        emdcVar.c = i2;
        emdcVar.b |= 1;
        long j = this.c;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emdc emdcVar2 = (emdc) fecpVar2;
        emdcVar2.b |= 4;
        emdcVar2.e = j;
        String str = this.b;
        if (str != null) {
            if (!fecpVar2.L()) {
                v.U();
            }
            emdc emdcVar3 = (emdc) v.b;
            emdcVar3.b |= 2;
            emdcVar3.d = str;
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            feay w = feay.w(bArr);
            if (!v.b.L()) {
                v.U();
            }
            emdc emdcVar4 = (emdc) v.b;
            emdcVar4.b |= 8;
            emdcVar4.f = w;
        }
        divtVar.a.add((emdc) v.Q());
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
        this.a = emdb.a(parcel.readInt());
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.createByteArray();
    }
}
