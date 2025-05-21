package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ddxy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetQuickStartOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddxy();
    public boolean a;
    public boolean b;
    public String c;
    public long d;
    public String e;

    public TargetQuickStartOptions(boolean z, boolean z2, String str, long j, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = j;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public TargetQuickStartOptions() {
        this(false, false, null, -1L, null);
    }
}
