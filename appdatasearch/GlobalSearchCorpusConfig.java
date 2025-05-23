package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vnm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GlobalSearchCorpusConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnm();
    public final int[] a;
    public final Feature[] b;

    public GlobalSearchCorpusConfig(int[] iArr, Feature[] featureArr) {
        this.a = iArr;
        this.b = featureArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalSearchCorpusConfig) {
            GlobalSearchCorpusConfig globalSearchCorpusConfig = (GlobalSearchCorpusConfig) obj;
            if (Arrays.equals(this.b, globalSearchCorpusConfig.b) && Arrays.equals(this.a, globalSearchCorpusConfig.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, iArr, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.c(parcel, a);
    }
}
