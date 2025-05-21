package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dcwg;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BootstrapCompletionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcwg();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.v(parcel, 3, this.b, false);
        arxc.y(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.y(parcel, 6, this.e, false);
        arxc.o(parcel, 7, this.f);
        arxc.q(parcel, 8, this.g);
        arxc.e(parcel, 9, this.h);
        arxc.o(parcel, 10, this.i);
        arxc.t(parcel, 11, this.j, i, false);
        arxc.y(parcel, 12, this.k, false);
        arxc.y(parcel, 13, this.l, false);
        arxc.c(parcel, a);
    }
}
