package com.google.android.gms.apperrors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.vrt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PackageNameAndVersion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vrt();
    public final String a;
    public final int b;

    public PackageNameAndVersion(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PackageNameAndVersion) {
            PackageNameAndVersion packageNameAndVersion = (PackageNameAndVersion) obj;
            if (atyq.b(this.a, packageNameAndVersion.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(packageNameAndVersion.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
