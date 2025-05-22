package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dfhl;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BootstrapCompletionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfhl();
    public final int a;
    public final String b;
    public final ArrayList c;
    public final BootstrapAccount d;
    public final ArrayList e;
    public final int f;
    public final long g;
    public final boolean h;

    @Deprecated
    public final int i;

    @Deprecated
    public final BootstrapAccount j;
    public final ArrayList k;
    public final ArrayList l;

    public BootstrapCompletionResult(int i, String str, ArrayList arrayList, BootstrapAccount bootstrapAccount, ArrayList arrayList2, int i2, long j, boolean z, int i3, BootstrapAccount bootstrapAccount2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = bootstrapAccount;
        this.e = arrayList2;
        this.f = i2;
        this.g = j;
        this.h = z;
        this.i = i3;
        this.j = bootstrapAccount2;
        this.k = arrayList3;
        this.l = arrayList4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.v(parcel, 3, this.b, false);
        atzr.y(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.y(parcel, 6, this.e, false);
        atzr.o(parcel, 7, this.f);
        atzr.q(parcel, 8, this.g);
        atzr.e(parcel, 9, this.h);
        atzr.o(parcel, 10, this.i);
        atzr.t(parcel, 11, this.j, i, false);
        atzr.y(parcel, 12, this.k, false);
        atzr.y(parcel, 13, this.l, false);
        atzr.c(parcel, a);
    }
}
