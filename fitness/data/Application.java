package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgcu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Application extends AbstractSafeParcelable {
    public final String b;
    public static final Application a = new Application("com.google.android.gms");
    public static final Parcelable.Creator CREATOR = new bgcu();

    public Application(String str) {
        arwm.s(str);
        this.b = str;
    }

    public static Application a(String str) {
        return "com.google.android.gms".equals(str) ? a : new Application(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Application) {
            return this.b.equals(((Application) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return String.format("Application{%s}", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a2);
    }
}
