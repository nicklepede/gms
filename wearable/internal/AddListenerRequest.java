package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmse;
import defpackage.dmwb;
import defpackage.dmwd;
import defpackage.dmzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmse();
    public final dmwd a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public AddListenerRequest(dmzq dmzqVar) {
        this.a = dmzqVar;
        this.b = dmzqVar.f;
        this.c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dmwd dmwdVar = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 2, dmwdVar == null ? null : dmwdVar.asBinder());
        atzr.J(parcel, 3, this.b, i);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        dmwd dmwdVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            dmwdVar = queryLocalInterface instanceof dmwd ? (dmwd) queryLocalInterface : new dmwb(iBinder);
        } else {
            dmwdVar = null;
        }
        this.a = dmwdVar;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }
}
