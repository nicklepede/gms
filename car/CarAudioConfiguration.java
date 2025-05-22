package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amox;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarAudioConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amox();
    public final int a;
    public final int b;
    public final int c;

    public CarAudioConfiguration(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final String toString() {
        return getClass().getName() + "[sampleRate=" + this.a + ",channelConfig=" + this.b + ",audioFormat=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
