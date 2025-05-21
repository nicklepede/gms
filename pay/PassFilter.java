package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PassFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdg();
    public PassType[] a;
    public String[] b;
    public String[] c;
    public String[] d;
    public String[] e;
    public String[] f;
    public boolean g;
    public int h;
    public PassSaveTypeFilter i;

    private PassFilter() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassFilter) {
            PassFilter passFilter = (PassFilter) obj;
            if (Arrays.equals(this.a, passFilter.a) && Arrays.equals(this.b, passFilter.b) && Arrays.equals(this.c, passFilter.c) && Arrays.equals(this.d, passFilter.d) && Arrays.equals(this.e, passFilter.e) && Arrays.equals(this.f, passFilter.f) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(passFilter.g)) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(passFilter.h)) && arwb.b(this.i, passFilter.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.w(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.w(parcel, 4, this.d, false);
        arxc.w(parcel, 5, this.e, false);
        arxc.w(parcel, 6, this.f, false);
        arxc.e(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }

    public PassFilter(PassType[] passTypeArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, boolean z, int i, PassSaveTypeFilter passSaveTypeFilter) {
        this.a = passTypeArr;
        this.b = strArr;
        this.c = strArr2;
        this.d = strArr3;
        this.e = strArr4;
        this.f = strArr5;
        this.g = z;
        this.h = i;
        this.i = passSaveTypeFilter;
    }
}
