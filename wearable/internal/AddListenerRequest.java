package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkgl;
import defpackage.dkki;
import defpackage.dkkk;
import defpackage.dknx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgl();
    public final dkkk a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public AddListenerRequest(dknx dknxVar) {
        this.a = dknxVar;
        this.b = dknxVar.f;
        this.c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dkkk dkkkVar = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 2, dkkkVar == null ? null : dkkkVar.asBinder());
        arxc.J(parcel, 3, this.b, i);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        dkkk dkkkVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            dkkkVar = queryLocalInterface instanceof dkkk ? (dkkk) queryLocalInterface : new dkki(iBinder);
        } else {
            dkkkVar = null;
        }
        this.a = dkkkVar;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }
}
