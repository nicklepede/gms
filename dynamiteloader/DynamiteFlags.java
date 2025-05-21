package com.google.android.gms.dynamiteloader;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.azjj;
import defpackage.azjk;
import defpackage.eitj;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.pou;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DynamiteFlags extends AbstractSafeParcelable implements pou {
    public static final Parcelable.Creator CREATOR = new azjk();
    public static final DynamiteFlags a = r(new azjj());
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final List h;
    private final List i;
    private final List j;

    public DynamiteFlags(boolean z, boolean z2, boolean z3, List list, boolean z4, List list2, boolean z5, boolean z6, List list3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.h = eitj.i(list);
        this.e = z4;
        this.i = eitj.i(list2);
        this.f = z5;
        this.g = z6;
        this.j = eitj.i(list3);
    }

    public static DynamiteFlags r(pou pouVar) {
        return new DynamiteFlags(pouVar.m(), pouVar.k(), pouVar.i(), pouVar.b(), pouVar.j(), pouVar.a(), pouVar.p(), pouVar.n(), pouVar.c());
    }

    @Override // defpackage.pou
    public final eitj a() {
        return eitj.i(this.i);
    }

    @Override // defpackage.pou
    public final eitj b() {
        return eitj.i(this.h);
    }

    @Override // defpackage.pou
    public final eitj c() {
        return eitj.i(this.j);
    }

    @Override // defpackage.pou
    public final /* synthetic */ eiuu d() {
        return ejck.a;
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamiteFlags)) {
            return false;
        }
        DynamiteFlags dynamiteFlags = (DynamiteFlags) obj;
        return this.b == dynamiteFlags.b && this.c == dynamiteFlags.c && this.d == dynamiteFlags.d && this.h.equals(dynamiteFlags.h) && this.e == dynamiteFlags.e && this.i.equals(dynamiteFlags.i) && this.f == dynamiteFlags.f && this.g == dynamiteFlags.g && this.j.equals(dynamiteFlags.j);
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean g() {
        throw null;
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean h() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.h, Boolean.valueOf(this.e), this.i, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.j});
    }

    @Override // defpackage.pou
    public final boolean i() {
        return this.d;
    }

    @Override // defpackage.pou
    public final boolean j() {
        return this.e;
    }

    @Override // defpackage.pou
    public final boolean k() {
        return this.c;
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.pou
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.pou
    public final boolean n() {
        return this.g;
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.pou
    public final boolean p() {
        return this.f;
    }

    @Override // defpackage.pou
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int a2 = arxc.a(parcel);
        arxc.e(parcel, 4, z);
        arxc.e(parcel, 7, this.c);
        arxc.e(parcel, 9, this.d);
        arxc.x(parcel, 10, b(), false);
        arxc.e(parcel, 11, this.e);
        arxc.x(parcel, 12, a(), false);
        arxc.e(parcel, 15, this.f);
        arxc.e(parcel, 17, this.g);
        arxc.x(parcel, 18, c(), false);
        arxc.c(parcel, a2);
    }
}
