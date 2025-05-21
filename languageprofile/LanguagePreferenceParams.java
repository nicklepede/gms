package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bqbv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LanguagePreferenceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqbv();
    public final float a;
    public final int b;
    public final int c;
    public final Integer d;

    public LanguagePreferenceParams(float f, int i, int i2, Integer num) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreferenceParams) {
            LanguagePreferenceParams languagePreferenceParams = (LanguagePreferenceParams) obj;
            if (arwb.b(Float.valueOf(this.a), Float.valueOf(languagePreferenceParams.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(languagePreferenceParams.b)) && arwb.b(this.d, languagePreferenceParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 1, f);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.F(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
