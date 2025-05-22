package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import defpackage.atzr;
import defpackage.avtm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FenceStateImpl extends FenceState {
    public static final Parcelable.Creator CREATOR = new avtm();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final ArrayList e;

    public FenceStateImpl(int i, long j, String str, int i2, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = i2;
        this.e = arrayList;
    }

    @Override // com.google.android.gms.awareness.fence.FenceState
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.gms.awareness.fence.FenceState
    public final String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.q(parcel, 3, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.o(parcel, 5, this.d);
        atzr.y(parcel, 6, this.e, false);
        atzr.c(parcel, a);
    }

    public FenceStateImpl(int i, long j, String str, int i2) {
        this(i, j, str, i2, null);
    }
}
