package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aehu;
import defpackage.atzr;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Role extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new aehu();
    public final int a;
    public final String b;
    public final int c;

    public Role(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public static boolean b(int i) {
        return (i & 4) > 0 || (i & 8) > 0 || (i & 256) > 0;
    }

    public static boolean c(int i) {
        return (i & 8) > 0;
    }

    public static boolean d(int i) {
        return (i & 4) > 0;
    }

    public static boolean e(int i) {
        return (i & 512) > 0;
    }

    public static boolean f(int i) {
        return i > 0 && i < 1024;
    }

    public static boolean g(int i, int i2) {
        if (i2 == 1) {
            return b(i);
        }
        if (i2 != 5) {
            return false;
        }
        return e(i);
    }

    public final int a() {
        int i = this.c;
        if (Long.bitCount(i) != 1) {
            return 0;
        }
        if (i == 4 || i == 8 || i == 256) {
            return 1;
        }
        return i != 512 ? 0 : 5;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Role role = (Role) obj;
        int compareTo = this.b.compareTo(role.b);
        return compareTo != 0 ? compareTo : this.c - role.c;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                Role role = (Role) obj;
                if (role.a == this.a && role.b.equals(this.b) && role.c == this.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "Role{featureName=%s, connectionMode=%d}", this.b, Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.c);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }

    public Role(String str, int i) {
        this(2, str, i);
    }
}
