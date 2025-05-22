package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.av;
import com.google.android.gms.ads.internal.client.ax;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new g();
    public final boolean a;
    public final IBinder b;
    private final ax c;

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        ax axVar;
        this.a = z;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            axVar = queryLocalInterface instanceof ax ? (ax) queryLocalInterface : new av(iBinder);
        } else {
            axVar = null;
        }
        this.c = axVar;
        this.b = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        ax axVar = this.c;
        atzr.D(parcel, 2, axVar == null ? null : axVar.asBinder());
        atzr.D(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
