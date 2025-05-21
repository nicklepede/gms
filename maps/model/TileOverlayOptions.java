package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cceu;
import defpackage.ccfu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cceu();
    public boolean a;
    public float b;
    public boolean c;
    public float d;
    private ccfu e;

    public TileOverlayOptions() {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        ccfu ccfuVar = this.e;
        arxc.D(parcel, 2, ccfuVar == null ? null : ccfuVar.a);
        arxc.e(parcel, 3, this.a);
        arxc.l(parcel, 4, this.b);
        arxc.e(parcel, 5, this.c);
        arxc.l(parcel, 6, this.d);
        arxc.c(parcel, a);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        ccfu ccfuVar;
        this.a = true;
        this.c = true;
        this.d = 0.0f;
        if (iBinder == null) {
            ccfuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            ccfuVar = queryLocalInterface instanceof ccfu ? (ccfu) queryLocalInterface : new ccfu(iBinder);
        }
        this.e = ccfuVar;
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = f2;
    }
}
