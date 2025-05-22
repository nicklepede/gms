package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bsjk;
import defpackage.eulk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LanguagePreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bsjk();
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
            if (atyq.b(this.c, languagePreference.c) && atyq.b(Float.valueOf(this.a), Float.valueOf(languagePreference.a)) && atyq.b(Float.valueOf(this.b), Float.valueOf(languagePreference.b))) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, eulk.b(locale, true), false);
        atzr.l(parcel, 2, this.a);
        atzr.l(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
