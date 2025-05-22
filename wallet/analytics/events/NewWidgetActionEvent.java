package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrd;
import defpackage.dkwd;
import defpackage.dlgt;
import defpackage.dlhd;
import defpackage.dlhe;
import defpackage.eorw;
import defpackage.eorx;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class NewWidgetActionEvent extends WalletAnalyticsEvent implements dlhd {
    public static final Parcelable.Creator CREATOR = new dkrd();
    final int a;
    final int b;
    final int c;
    final int d;

    public NewWidgetActionEvent(String str, int i, int i2, int i3, int i4) {
        this.m = str;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.b = i4;
    }

    public static void a(Context context, String str, int i, int i2, int i3, int i4) {
        dlgt.a(context, new NewWidgetActionEvent(str, i, i2, i3, i4));
    }

    public static void c(Context context, String str, int i) {
        a(context, str, i, 2, 1, -1);
    }

    @Override // defpackage.dlhd
    public final void b(Context context, dlhe dlheVar, fgrc fgrcVar) {
        fgrc v = eorx.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        fgri fgriVar = v.b;
        eorx eorxVar = (eorx) fgriVar;
        eorxVar.b |= 1;
        eorxVar.c = i;
        int i2 = this.c;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        eorx eorxVar2 = (eorx) fgriVar2;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        eorxVar2.d = i3;
        eorxVar2.b |= 2;
        int i4 = this.d;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        eorx eorxVar3 = (eorx) fgriVar3;
        eorxVar3.e = i4 - 1;
        eorxVar3.b |= 4;
        int i5 = this.b;
        if (!fgriVar3.L()) {
            v.U();
        }
        eorx eorxVar4 = (eorx) v.b;
        eorxVar4.b |= 8;
        eorxVar4.f = i5;
        dlheVar.f.add((eorx) v.Q());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        parcel.writeInt(this.d - 1);
        parcel.writeInt(this.b);
    }

    public NewWidgetActionEvent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.c = eorw.a(parcel.readInt());
        this.d = dkwd.a(parcel.readInt());
        this.b = parcel.readInt();
    }
}
