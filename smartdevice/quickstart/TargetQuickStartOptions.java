package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dgjc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetQuickStartOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgjc();
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.q(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public TargetQuickStartOptions() {
        this(false, false, null, -1L, null);
    }
}
