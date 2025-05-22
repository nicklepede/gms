package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvkr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Animation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvkr();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(animation.a)) && atyq.b(this.b, animation.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(animation.c)) && atyq.b(this.d, animation.d)) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public Animation(int i, String str, boolean z, String str2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
    }
}
