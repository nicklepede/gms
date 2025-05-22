package com.google.android.gms.car;

import android.media.AudioAttributes;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amnz;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AudioFocusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amnz();
    public final AudioAttributes a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public AudioFocusInfo(AudioAttributes audioAttributes, int i, String str, String str2, int i2, int i3, int i4) {
        this.a = audioAttributes;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AudioAttributes audioAttributes = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, audioAttributes, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
