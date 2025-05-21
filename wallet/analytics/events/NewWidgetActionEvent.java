package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.difs;
import defpackage.diks;
import defpackage.divi;
import defpackage.divs;
import defpackage.divt;
import defpackage.emei;
import defpackage.emej;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class NewWidgetActionEvent extends WalletAnalyticsEvent implements divs {
    public static final Parcelable.Creator CREATOR = new difs();
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
        divi.a(context, new NewWidgetActionEvent(str, i, i2, i3, i4));
    }

    public static void c(Context context, String str, int i) {
        a(context, str, i, 2, 1, -1);
    }

    @Override // defpackage.divs
    public final void b(Context context, divt divtVar, fecj fecjVar) {
        fecj v = emej.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i = this.a;
        fecp fecpVar = v.b;
        emej emejVar = (emej) fecpVar;
        emejVar.b |= 1;
        emejVar.c = i;
        int i2 = this.c;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        emej emejVar2 = (emej) fecpVar2;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        emejVar2.d = i3;
        emejVar2.b |= 2;
        int i4 = this.d;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        emej emejVar3 = (emej) fecpVar3;
        emejVar3.e = i4 - 1;
        emejVar3.b |= 4;
        int i5 = this.b;
        if (!fecpVar3.L()) {
            v.U();
        }
        emej emejVar4 = (emej) v.b;
        emejVar4.b |= 8;
        emejVar4.f = i5;
        divtVar.f.add((emej) v.Q());
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
        this.c = emei.a(parcel.readInt());
        this.d = diks.a(parcel.readInt());
        this.b = parcel.readInt();
    }
}
