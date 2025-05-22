package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bsjl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LanguagePreferenceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bsjl();
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
            if (atyq.b(Float.valueOf(this.a), Float.valueOf(languagePreferenceParams.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(languagePreferenceParams.b)) && atyq.b(this.d, languagePreferenceParams.d)) {
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
        int a = atzr.a(parcel);
        atzr.l(parcel, 1, f);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.F(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
