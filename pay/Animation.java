package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class Animation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbn();
    public int a;
    public String b;
    public boolean c;
    public String d;

    private Animation() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Animation) {
            Animation animation = (Animation) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(animation.a)) && arwb.b(this.b, animation.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(animation.c)) && arwb.b(this.d, animation.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public Animation(int i, String str, boolean z, String str2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
    }
}
