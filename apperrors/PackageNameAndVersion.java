package com.google.android.gms.apperrors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.tvt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PackageNameAndVersion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tvt();
    public final String a;
    public final int b;

    public PackageNameAndVersion(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PackageNameAndVersion) {
            PackageNameAndVersion packageNameAndVersion = (PackageNameAndVersion) obj;
            if (arwb.b(this.a, packageNameAndVersion.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(packageNameAndVersion.b))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
