package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aknm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarAudioConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aknm();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
