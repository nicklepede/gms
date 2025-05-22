package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvml;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PassFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvml();
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
            if (Arrays.equals(this.a, passFilter.a) && Arrays.equals(this.b, passFilter.b) && Arrays.equals(this.c, passFilter.c) && Arrays.equals(this.d, passFilter.d) && Arrays.equals(this.e, passFilter.e) && Arrays.equals(this.f, passFilter.f) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(passFilter.g)) && atyq.b(Integer.valueOf(this.h), Integer.valueOf(passFilter.h)) && atyq.b(this.i, passFilter.i)) {
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.w(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.w(parcel, 4, this.d, false);
        atzr.w(parcel, 5, this.e, false);
        atzr.w(parcel, 6, this.f, false);
        atzr.e(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.c(parcel, a);
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
