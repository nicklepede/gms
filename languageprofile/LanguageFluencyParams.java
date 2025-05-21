package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bqbt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LanguageFluencyParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqbt();
    public final float a;
    public final int b;
    public final int c;

    public LanguageFluencyParams(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageFluencyParams) {
            LanguageFluencyParams languageFluencyParams = (LanguageFluencyParams) obj;
            if (arwb.b(Float.valueOf(this.a), Float.valueOf(languageFluencyParams.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(languageFluencyParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 1, f);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
