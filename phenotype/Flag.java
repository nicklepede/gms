package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cvze;
import defpackage.cvzf;
import defpackage.cwam;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new cvzf();
    public static final Comparator a = new cvze();
    public final String b;
    final long c;
    final boolean d;
    final double e;
    final String f;
    final byte[] g;
    public final int h;
    public final int i;
    public final int j;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = d;
        this.f = str2;
        this.g = bArr;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    private static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final double a() {
        if (this.h == 3) {
            return this.e;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.h == 1) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        int i = this.h;
        if (i == 1) {
            return Long.toString(this.c);
        }
        if (i == 2) {
            return true != this.d ? "false" : "true";
        }
        if (i == 3) {
            return Double.toString(this.e);
        }
        if (i == 4) {
            return String.valueOf(this.f);
        }
        if (i != 5) {
            throw new AssertionError(a.j(i, "Invalid enum value: "));
        }
        byte[] bArr = this.g;
        arwm.s(bArr);
        return Base64.encodeToString(bArr, 3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Flag flag = (Flag) obj;
        int compareTo = this.b.compareTo(flag.b);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = this.h;
        int h = h(i, flag.h);
        if (h != 0) {
            return h;
        }
        int i2 = 0;
        if (i == 1) {
            long j = this.c;
            long j2 = flag.c;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.d;
            if (z == flag.d) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.e, flag.e);
        }
        if (i == 4) {
            String str = this.f;
            String str2 = flag.f;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(a.j(i, "Invalid enum value: "));
        }
        byte[] bArr = this.g;
        byte[] bArr2 = flag.g;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i2 >= Math.min(length2, length)) {
                return h(length2, length);
            }
            int i3 = bArr[i2] - bArr2[i2];
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
    }

    public final String d() {
        if (this.h != 4) {
            throw new IllegalArgumentException("Not a String type");
        }
        String str = this.f;
        arwm.s(str);
        return str;
    }

    final void e(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.b;
        sb.append(str);
        sb.append(", ");
        int i = this.h;
        if (i == 1) {
            sb.append(this.c);
        } else if (i == 2) {
            sb.append(this.d);
        } else if (i == 3) {
            sb.append(this.e);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.f;
            arwm.s(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError(a.n(i, str, "Invalid type: ", ", "));
            }
            sb.append("'");
            byte[] bArr = this.g;
            arwm.s(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.j);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (cwam.a(this.b, flag.b) && (i = this.h) == flag.h && this.i == flag.i && this.j == flag.j) {
                if (i != 1) {
                    if (i == 2) {
                        return this.d == flag.d;
                    }
                    if (i == 3) {
                        return this.e == flag.e;
                    }
                    if (i == 4) {
                        return cwam.a(this.f, flag.f);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.g, flag.g);
                    }
                    throw new AssertionError(a.j(i, "Invalid enum value: "));
                }
                if (this.c == flag.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.h == 2) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final byte[] g() {
        if (this.h != 5) {
            throw new IllegalArgumentException("Not a bytes type");
        }
        byte[] bArr = this.g;
        arwm.s(bArr);
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = arxc.a(parcel);
        if (!cvzf.b(str)) {
            arxc.v(parcel, 2, str, false);
        }
        long j = this.c;
        if (j != 0) {
            arxc.q(parcel, 3, j);
        }
        if (this.d) {
            arxc.e(parcel, 4, true);
        }
        double d = this.e;
        if (d != 0.0d) {
            arxc.j(parcel, 5, d);
        }
        String str2 = this.f;
        if (!cvzf.b(str2)) {
            arxc.v(parcel, 6, str2, false);
        }
        byte[] bArr = this.g;
        if (!cvzf.b(bArr)) {
            arxc.i(parcel, 7, bArr, false);
        }
        int i2 = this.h;
        if (!cvzf.a(i2)) {
            arxc.o(parcel, 8, i2);
        }
        int i3 = this.i;
        if (!cvzf.a(i3)) {
            arxc.o(parcel, 9, i3);
        }
        int i4 = this.j;
        if (!cvzf.a(i4)) {
            arxc.o(parcel, 10, i4);
        }
        arxc.c(parcel, a2);
    }

    public Flag(String str, double d, int i) {
        this(str, 0L, false, d, null, null, 3, i, 0);
    }

    public Flag(String str, String str2, int i) {
        this(str, 0L, false, 0.0d, str2, null, 4, i, 0);
    }

    public Flag(String str, long j, int i) {
        this(str, j, false, 0.0d, null, null, 1, i, 0);
    }

    public Flag(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, 0);
    }

    public Flag(String str, String str2, int i, int i2, int i3) {
        this.b = str;
        this.h = i;
        this.i = i2;
        this.j = i3;
        if (i == 1) {
            this.c = Long.parseLong(str2);
            this.d = false;
            this.e = 0.0d;
            this.f = null;
            this.g = null;
            return;
        }
        if (i == 2) {
            if (str2.equalsIgnoreCase("true")) {
                this.d = true;
            } else {
                if (!str2.equalsIgnoreCase("false")) {
                    throw new IllegalArgumentException("Unrecognized boolean value: ".concat(String.valueOf(str2)));
                }
                this.d = false;
            }
            this.c = 0L;
            this.e = 0.0d;
            this.f = null;
            this.g = null;
            return;
        }
        if (i == 3) {
            this.e = Double.parseDouble(str2);
            this.c = 0L;
            this.d = false;
            this.f = null;
            this.g = null;
            return;
        }
        if (i == 4) {
            this.f = str2;
            this.c = 0L;
            this.d = false;
            this.e = 0.0d;
            this.g = null;
            return;
        }
        if (i != 5) {
            throw new IllegalArgumentException(a.j(i, "Unrecognized flag type: "));
        }
        this.g = Base64.decode(str2, 3);
        this.c = 0L;
        this.d = false;
        this.e = 0.0d;
        this.f = null;
    }

    public Flag(String str, boolean z, int i) {
        this(str, 0L, z, 0.0d, null, null, 2, i, 0);
    }

    public Flag(String str, byte[] bArr, int i) {
        this(str, 0L, false, 0.0d, null, bArr, 5, i, 0);
    }
}
