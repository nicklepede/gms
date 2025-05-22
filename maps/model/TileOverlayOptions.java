package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ceno;
import defpackage.ceoo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceno();
    public boolean a;
    public float b;
    public boolean c;
    public float d;
    private ceoo e;

    public TileOverlayOptions() {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        ceoo ceooVar = this.e;
        atzr.D(parcel, 2, ceooVar == null ? null : ceooVar.a);
        atzr.e(parcel, 3, this.a);
        atzr.l(parcel, 4, this.b);
        atzr.e(parcel, 5, this.c);
        atzr.l(parcel, 6, this.d);
        atzr.c(parcel, a);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        ceoo ceooVar;
        this.a = true;
        this.c = true;
        this.d = 0.0f;
        if (iBinder == null) {
            ceooVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            ceooVar = queryLocalInterface instanceof ceoo ? (ceoo) queryLocalInterface : new ceoo(iBinder);
        }
        this.e = ceooVar;
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }
}
