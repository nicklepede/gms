package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bqbu;
import defpackage.ervx;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LanguagePreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqbu();
    public final float a;
    public final float b;
    private final Locale c;

    public LanguagePreference(Locale locale, float f, float f2) {
        this.c = locale;
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreference) {
            LanguagePreference languagePreference = (LanguagePreference) obj;
            if (arwb.b(this.c, languagePreference.c) && arwb.b(Float.valueOf(this.a), Float.valueOf(languagePreference.a)) && arwb.b(Float.valueOf(this.b), Float.valueOf(languagePreference.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Locale locale = this.c;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, ervx.b(locale, true), false);
        arxc.l(parcel, 2, this.a);
        arxc.l(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
