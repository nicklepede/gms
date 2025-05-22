package com.google.android.gms.dynamiteloader;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbnf;
import defpackage.bbng;
import defpackage.elgo;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.rhy;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DynamiteFlags extends AbstractSafeParcelable implements rhy {
    public static final Parcelable.Creator CREATOR = new bbng();
    public static final DynamiteFlags a = r(new bbnf());
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
        this.h = elgo.i(list);
        this.e = z4;
        this.i = elgo.i(list2);
        this.f = z5;
        this.g = z6;
        this.j = elgo.i(list3);
    }

    public static DynamiteFlags r(rhy rhyVar) {
        return new DynamiteFlags(rhyVar.m(), rhyVar.k(), rhyVar.i(), rhyVar.b(), rhyVar.j(), rhyVar.a(), rhyVar.p(), rhyVar.n(), rhyVar.c());
    }

    @Override // defpackage.rhy
    public final elgo a() {
        return elgo.i(this.i);
    }

    @Override // defpackage.rhy
    public final elgo b() {
        return elgo.i(this.h);
    }

    @Override // defpackage.rhy
    public final elgo c() {
        return elgo.i(this.j);
    }

    @Override // defpackage.rhy
    public final /* synthetic */ elhz d() {
        return elpp.a;
    }

    @Override // defpackage.rhy
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

    @Override // defpackage.rhy
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ boolean g() {
        throw null;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ boolean h() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.h, Boolean.valueOf(this.e), this.i, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.j});
    }

    @Override // defpackage.rhy
    public final boolean i() {
        return this.d;
    }

    @Override // defpackage.rhy
    public final boolean j() {
        return this.e;
    }

    @Override // defpackage.rhy
    public final boolean k() {
        return this.c;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.rhy
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.rhy
    public final boolean n() {
        return this.g;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.rhy
    public final boolean p() {
        return this.f;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int a2 = atzr.a(parcel);
        atzr.e(parcel, 4, z);
        atzr.e(parcel, 7, this.c);
        atzr.e(parcel, 9, this.d);
        atzr.x(parcel, 10, b(), false);
        atzr.e(parcel, 11, this.e);
        atzr.x(parcel, 12, a(), false);
        atzr.e(parcel, 15, this.f);
        atzr.e(parcel, 17, this.g);
        atzr.x(parcel, 18, c(), false);
        atzr.c(parcel, a2);
    }
}
