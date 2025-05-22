package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ClickAttestationTokenRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new e();
    public final String a;
    public final MotionEvent b;
    public final MotionEvent c;
    public final Integer d;
    public final String e;

    public ClickAttestationTokenRequestParcel(String str, MotionEvent motionEvent, MotionEvent motionEvent2, Integer num, String str2) {
        this.a = str;
        this.b = motionEvent;
        this.c = motionEvent2;
        this.d = num;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.F(parcel, 5, this.d);
        atzr.v(parcel, 6, this.e, false);
        atzr.c(parcel, a);
    }
}
